/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//AnalysisEngine
//haohanw

package analysisengine;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

import genemention.type;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

/**
 * @author Haohan Wang
 *  This is the part of analysis engine, get the sentence form reader and process it to extract the lineID
 *  and get the entity offset. 
 *  The offset is with space and processed later.  
 */
public class GeneAE extends JCasAnnotator_ImplBase {

  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    int MAX_N_BEST_CHUNKS = 5; // the number of most similar words
    JCas jcas = aJCas;
    String Str = jcas.getDocumentText();
    String line = Str.substring(0, 14); // extrate the lineID
    char cha[] = Str.toCharArray();
    ConfidenceChunker chunker = null; // lingpipe unit
    double confidence = 0; // confidence for whether a word/phrase is the target

    Str = Str.substring(15, Str.length());// extrate the file part
    cha = Str.toCharArray();
    URL base = ClassLoader.getSystemClassLoader().getResource("");
    File modelFile = new File(base+"\ne-en-bio-genetag.HmmChunker");
    InputStream in = this.getClass().getResourceAsStream(modelFile.toString());
    try {
      // from lingpipe
      // import the trained data, biogenetag data
      chunker = (ConfidenceChunker) AbstractExternalizable.readObject(new File(
              "ne-en-bio-genetag.HmmChunker"));
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    // from lingpipe
    // for each input string, generate the five words most likely to be the target words.
    Iterator<Chunk> it = (Iterator) chunker.nBestChunks(cha, 0, cha.length, MAX_N_BEST_CHUNKS);
    while (it.hasNext()) {
      Chunk c = it.next();
      // organize the confidence for the words
      confidence = Math.pow(2.0, c.score());
      type annotation = new type(aJCas);
      // only generate the words with the confidence greater than the threshold, i.e. 0.6
      if (confidence > 0.6) {
        annotation.setGeneDoc(Str);
        annotation.setLineID(line);
        annotation.setStartOffSet(c.start());
        annotation.setEndOffSet(c.end());
        annotation.addToIndexes();
      }
    }
  }
  // }

}

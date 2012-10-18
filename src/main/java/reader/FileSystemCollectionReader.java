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
//FileCollection
//haohanw

package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * @author Haohan Wang
 * This class is modified from the original UIMA template class, used for write the line ID, offset and the word. 
 */
public class FileSystemCollectionReader extends CollectionReader_ImplBase {

  public static final String PARAM_INPUTDIR = "InputDirectory";

  private ArrayList<String> StringList;

  private int mCurrentIndex;

  public void initialize() throws ResourceInitializationException {
    File directory = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());
    mCurrentIndex = 0;
    StringList = new ArrayList<String>(); // For each string, generate a CAS for analyzing
    addStringFromDir(directory);
  }

  // Read from file, line by line
  private void addStringFromDir(File dir) {
    System.out.println("addString");
    File file = dir;
    BufferedReader fin = null;
    try {
      fin = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException e1) {
      e1.printStackTrace();
    }
    String str = null;
    try {
      str = fin.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    while (str != null) {
      StringList.add(str);
      try {
        str = fin.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  // has next CAS
  public boolean hasNext() {
    return mCurrentIndex < StringList.size();
  }

  // get next CAS
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }
    String Str = (String) StringList.get(mCurrentIndex++);
    jcas.setDocumentText(Str);
  }

  public void close() throws IOException {
  }

  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(mCurrentIndex, StringList.size(), Progress.ENTITIES) };
  }

}

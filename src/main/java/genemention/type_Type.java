
/* First created by JCasGen Mon Oct 15 00:39:15 PDT 2012 */
package genemention;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 16 17:05:41 PDT 2012
 * @generated */
public class type_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (type_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = type_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new type(addr, type_Type.this);
  			   type_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new type(addr, type_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = type.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("genemention.type");
 
  /** @generated */
  final Feature casFeat_GeneDoc;
  /** @generated */
  final int     casFeatCode_GeneDoc;
  /** @generated */ 
  public String getGeneDoc(int addr) {
        if (featOkTst && casFeat_GeneDoc == null)
      jcas.throwFeatMissing("GeneDoc", "genemention.type");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneDoc);
  }
  /** @generated */    
  public void setGeneDoc(int addr, String v) {
        if (featOkTst && casFeat_GeneDoc == null)
      jcas.throwFeatMissing("GeneDoc", "genemention.type");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneDoc, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lineID;
  /** @generated */
  final int     casFeatCode_lineID;
  /** @generated */ 
  public String getLineID(int addr) {
        if (featOkTst && casFeat_lineID == null)
      jcas.throwFeatMissing("lineID", "genemention.type");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lineID);
  }
  /** @generated */    
  public void setLineID(int addr, String v) {
        if (featOkTst && casFeat_lineID == null)
      jcas.throwFeatMissing("lineID", "genemention.type");
    ll_cas.ll_setStringValue(addr, casFeatCode_lineID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StartOffSet;
  /** @generated */
  final int     casFeatCode_StartOffSet;
  /** @generated */ 
  public int getStartOffSet(int addr) {
        if (featOkTst && casFeat_StartOffSet == null)
      jcas.throwFeatMissing("StartOffSet", "genemention.type");
    return ll_cas.ll_getIntValue(addr, casFeatCode_StartOffSet);
  }
  /** @generated */    
  public void setStartOffSet(int addr, int v) {
        if (featOkTst && casFeat_StartOffSet == null)
      jcas.throwFeatMissing("StartOffSet", "genemention.type");
    ll_cas.ll_setIntValue(addr, casFeatCode_StartOffSet, v);}
    
  
 
  /** @generated */
  final Feature casFeat_EndOffSet;
  /** @generated */
  final int     casFeatCode_EndOffSet;
  /** @generated */ 
  public int getEndOffSet(int addr) {
        if (featOkTst && casFeat_EndOffSet == null)
      jcas.throwFeatMissing("EndOffSet", "genemention.type");
    return ll_cas.ll_getIntValue(addr, casFeatCode_EndOffSet);
  }
  /** @generated */    
  public void setEndOffSet(int addr, int v) {
        if (featOkTst && casFeat_EndOffSet == null)
      jcas.throwFeatMissing("EndOffSet", "genemention.type");
    ll_cas.ll_setIntValue(addr, casFeatCode_EndOffSet, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public type_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GeneDoc = jcas.getRequiredFeatureDE(casType, "GeneDoc", "uima.cas.String", featOkTst);
    casFeatCode_GeneDoc  = (null == casFeat_GeneDoc) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneDoc).getCode();

 
    casFeat_lineID = jcas.getRequiredFeatureDE(casType, "lineID", "uima.cas.String", featOkTst);
    casFeatCode_lineID  = (null == casFeat_lineID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lineID).getCode();

 
    casFeat_StartOffSet = jcas.getRequiredFeatureDE(casType, "StartOffSet", "uima.cas.Integer", featOkTst);
    casFeatCode_StartOffSet  = (null == casFeat_StartOffSet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StartOffSet).getCode();

 
    casFeat_EndOffSet = jcas.getRequiredFeatureDE(casType, "EndOffSet", "uima.cas.Integer", featOkTst);
    casFeatCode_EndOffSet  = (null == casFeat_EndOffSet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_EndOffSet).getCode();

  }
}



    
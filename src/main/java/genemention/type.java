

/* First created by JCasGen Mon Oct 15 00:39:15 PDT 2012 */
package genemention;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 16 17:05:41 PDT 2012
 * XML source: D:/Projects/Eclipse/hw1-haohanw/src/main/resources/descriptors/GeneMentionTypeSystem.xml
 * @generated */
public class type extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(type.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected type() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public type(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public type(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public type(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: GeneDoc

  /** getter for GeneDoc - gets 
   * @generated */
  public String getGeneDoc() {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_GeneDoc == null)
      jcasType.jcas.throwFeatMissing("GeneDoc", "genemention.type");
    return jcasType.ll_cas.ll_getStringValue(addr, ((type_Type)jcasType).casFeatCode_GeneDoc);}
    
  /** setter for GeneDoc - sets  
   * @generated */
  public void setGeneDoc(String v) {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_GeneDoc == null)
      jcasType.jcas.throwFeatMissing("GeneDoc", "genemention.type");
    jcasType.ll_cas.ll_setStringValue(addr, ((type_Type)jcasType).casFeatCode_GeneDoc, v);}    
   
    
  //*--------------*
  //* Feature: lineID

  /** getter for lineID - gets 
   * @generated */
  public String getLineID() {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_lineID == null)
      jcasType.jcas.throwFeatMissing("lineID", "genemention.type");
    return jcasType.ll_cas.ll_getStringValue(addr, ((type_Type)jcasType).casFeatCode_lineID);}
    
  /** setter for lineID - sets  
   * @generated */
  public void setLineID(String v) {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_lineID == null)
      jcasType.jcas.throwFeatMissing("lineID", "genemention.type");
    jcasType.ll_cas.ll_setStringValue(addr, ((type_Type)jcasType).casFeatCode_lineID, v);}    
   
    
  //*--------------*
  //* Feature: StartOffSet

  /** getter for StartOffSet - gets 
   * @generated */
  public int getStartOffSet() {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_StartOffSet == null)
      jcasType.jcas.throwFeatMissing("StartOffSet", "genemention.type");
    return jcasType.ll_cas.ll_getIntValue(addr, ((type_Type)jcasType).casFeatCode_StartOffSet);}
    
  /** setter for StartOffSet - sets  
   * @generated */
  public void setStartOffSet(int v) {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_StartOffSet == null)
      jcasType.jcas.throwFeatMissing("StartOffSet", "genemention.type");
    jcasType.ll_cas.ll_setIntValue(addr, ((type_Type)jcasType).casFeatCode_StartOffSet, v);}    
   
    
  //*--------------*
  //* Feature: EndOffSet

  /** getter for EndOffSet - gets 
   * @generated */
  public int getEndOffSet() {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_EndOffSet == null)
      jcasType.jcas.throwFeatMissing("EndOffSet", "genemention.type");
    return jcasType.ll_cas.ll_getIntValue(addr, ((type_Type)jcasType).casFeatCode_EndOffSet);}
    
  /** setter for EndOffSet - sets  
   * @generated */
  public void setEndOffSet(int v) {
    if (type_Type.featOkTst && ((type_Type)jcasType).casFeat_EndOffSet == null)
      jcasType.jcas.throwFeatMissing("EndOffSet", "genemention.type");
    jcasType.ll_cas.ll_setIntValue(addr, ((type_Type)jcasType).casFeatCode_EndOffSet, v);}    
  }

    
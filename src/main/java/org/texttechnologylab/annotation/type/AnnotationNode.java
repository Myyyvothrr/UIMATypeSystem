

/* First created by JCasGen Thu Nov 05 17:32:11 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Nov 05 17:34:04 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyArgAnno.xml
 * @generated */
public class AnnotationNode extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationNode.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.AnnotationNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotationNode_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.AnnotationNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnnotationNode_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.AnnotationNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotationNode_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.AnnotationNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnnotationNode_Type)jcasType).casFeatCode_end, v);}    
  }

    
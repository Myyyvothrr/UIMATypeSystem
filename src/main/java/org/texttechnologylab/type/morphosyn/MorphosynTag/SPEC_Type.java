
/* First created by JCasGen Mon Feb 26 11:41:31 CET 2024 */
package org.texttechnologylab.type.morphosyn.MorphosynTag;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.MorphosynTag_Type;

/** 
 * Updated by JCasGen Mon Feb 26 11:41:31 CET 2024
 * @generated */
public class SPEC_Type extends MorphosynTag_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SPEC.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.MorphosynTag.SPEC");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SPEC_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    
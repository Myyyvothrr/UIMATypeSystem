
/* First created by JCasGen Mon Feb 26 11:41:31 CET 2024 */
package org.texttechnologylab.type.morphosyn.MorphosynTag.CONV;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.MorphosynTag.CONV_Type;

/** 
 * Updated by JCasGen Mon Feb 26 11:41:31 CET 2024
 * @generated */
public class CONVSIM_Type extends CONV_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CONVSIM.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.MorphosynTag.CONV.CONVSIM");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CONVSIM_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    
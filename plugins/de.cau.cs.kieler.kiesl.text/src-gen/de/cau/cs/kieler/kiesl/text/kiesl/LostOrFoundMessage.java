/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kiesl.text.kiesl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lost Or Found Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLostOrFound <em>Lost Or Found</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getCaption <em>Caption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartEndExec <em>Start End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartExec <em>Start Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isEndExec <em>End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getEndExecCount <em>End Exec Count</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage()
 * @model
 * @generated
 */
public interface LostOrFoundMessage extends Element
{
  /**
   * Returns the value of the '<em><b>Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifeline</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifeline</em>' reference.
   * @see #setLifeline(Lifeline)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_Lifeline()
   * @model
   * @generated
   */
  Lifeline getLifeline();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLifeline <em>Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lifeline</em>' reference.
   * @see #getLifeline()
   * @generated
   */
  void setLifeline(Lifeline value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType
   * @see #setType(OneParticipantMessageType)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_Type()
   * @model
   * @generated
   */
  OneParticipantMessageType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType
   * @see #getType()
   * @generated
   */
  void setType(OneParticipantMessageType value);

  /**
   * Returns the value of the '<em><b>Lost Or Found</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lost Or Found</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lost Or Found</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound
   * @see #setLostOrFound(LostOrFound)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_LostOrFound()
   * @model
   * @generated
   */
  LostOrFound getLostOrFound();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLostOrFound <em>Lost Or Found</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lost Or Found</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound
   * @see #getLostOrFound()
   * @generated
   */
  void setLostOrFound(LostOrFound value);

  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caption</em>' attribute.
   * @see #setCaption(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_Caption()
   * @model
   * @generated
   */
  String getCaption();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getCaption <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caption</em>' attribute.
   * @see #getCaption()
   * @generated
   */
  void setCaption(String value);

  /**
   * Returns the value of the '<em><b>Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start End Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start End Exec</em>' attribute.
   * @see #setStartEndExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_StartEndExec()
   * @model
   * @generated
   */
  boolean isStartEndExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartEndExec <em>Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start End Exec</em>' attribute.
   * @see #isStartEndExec()
   * @generated
   */
  void setStartEndExec(boolean value);

  /**
   * Returns the value of the '<em><b>Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Exec</em>' attribute.
   * @see #setStartExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_StartExec()
   * @model
   * @generated
   */
  boolean isStartExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartExec <em>Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Exec</em>' attribute.
   * @see #isStartExec()
   * @generated
   */
  void setStartExec(boolean value);

  /**
   * Returns the value of the '<em><b>End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Exec</em>' attribute.
   * @see #setEndExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_EndExec()
   * @model
   * @generated
   */
  boolean isEndExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isEndExec <em>End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Exec</em>' attribute.
   * @see #isEndExec()
   * @generated
   */
  void setEndExec(boolean value);

  /**
   * Returns the value of the '<em><b>End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Exec Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Exec Count</em>' attribute.
   * @see #setEndExecCount(int)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_EndExecCount()
   * @model
   * @generated
   */
  int getEndExecCount();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getEndExecCount <em>End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Exec Count</em>' attribute.
   * @see #getEndExecCount()
   * @generated
   */
  void setEndExecCount(int value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getLostOrFoundMessage_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

} // LostOrFoundMessage

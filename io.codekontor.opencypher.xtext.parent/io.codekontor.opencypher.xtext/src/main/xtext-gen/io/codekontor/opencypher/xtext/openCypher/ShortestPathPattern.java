/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortest Path Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.ShortestPathPattern#getPatternElement <em>Pattern Element</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getShortestPathPattern()
 * @model
 * @generated
 */
public interface ShortestPathPattern extends AnonymousPatternPart, Expression
{
  /**
   * Returns the value of the '<em><b>Pattern Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Element</em>' containment reference.
   * @see #setPatternElement(PatternElement)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getShortestPathPattern_PatternElement()
   * @model containment="true"
   * @generated
   */
  PatternElement getPatternElement();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.ShortestPathPattern#getPatternElement <em>Pattern Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Element</em>' containment reference.
   * @see #getPatternElement()
   * @generated
   */
  void setPatternElement(PatternElement value);

} // ShortestPathPattern
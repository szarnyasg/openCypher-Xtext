/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPattern#isIncoming <em>Incoming</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPattern#getDetail <em>Detail</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPattern#isOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPattern()
 * @model
 * @generated
 */
public interface RelationshipPattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' attribute.
   * @see #setIncoming(boolean)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPattern_Incoming()
   * @model
   * @generated
   */
  boolean isIncoming();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPattern#isIncoming <em>Incoming</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Incoming</em>' attribute.
   * @see #isIncoming()
   * @generated
   */
  void setIncoming(boolean value);

  /**
   * Returns the value of the '<em><b>Detail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail</em>' containment reference.
   * @see #setDetail(RelationshipDetail)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPattern_Detail()
   * @model containment="true"
   * @generated
   */
  RelationshipDetail getDetail();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPattern#getDetail <em>Detail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detail</em>' containment reference.
   * @see #getDetail()
   * @generated
   */
  void setDetail(RelationshipDetail value);

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' attribute.
   * @see #setOutgoing(boolean)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getRelationshipPattern_Outgoing()
   * @model
   * @generated
   */
  boolean isOutgoing();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.RelationshipPattern#isOutgoing <em>Outgoing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outgoing</em>' attribute.
   * @see #isOutgoing()
   * @generated
   */
  void setOutgoing(boolean value);

} // RelationshipPattern
/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher.impl;

import io.codekontor.opencypher.xtext.openCypher.NodePattern;
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;
import io.codekontor.opencypher.xtext.openCypher.PatternElement;
import io.codekontor.opencypher.xtext.openCypher.PatternElementChain;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.PatternElementImpl#getNodepattern <em>Nodepattern</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.PatternElementImpl#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternElementImpl extends AnonymousPatternPartImpl implements PatternElement
{
  /**
   * The cached value of the '{@link #getNodepattern() <em>Nodepattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodepattern()
   * @generated
   * @ordered
   */
  protected NodePattern nodepattern;

  /**
   * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChain()
   * @generated
   * @ordered
   */
  protected EList<PatternElementChain> chain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenCypherPackage.Literals.PATTERN_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern getNodepattern()
  {
    return nodepattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodepattern(NodePattern newNodepattern, NotificationChain msgs)
  {
    NodePattern oldNodepattern = nodepattern;
    nodepattern = newNodepattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN, oldNodepattern, newNodepattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodepattern(NodePattern newNodepattern)
  {
    if (newNodepattern != nodepattern)
    {
      NotificationChain msgs = null;
      if (nodepattern != null)
        msgs = ((InternalEObject)nodepattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN, null, msgs);
      if (newNodepattern != null)
        msgs = ((InternalEObject)newNodepattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN, null, msgs);
      msgs = basicSetNodepattern(newNodepattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN, newNodepattern, newNodepattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PatternElementChain> getChain()
  {
    if (chain == null)
    {
      chain = new EObjectContainmentEList<PatternElementChain>(PatternElementChain.class, this, OpenCypherPackage.PATTERN_ELEMENT__CHAIN);
    }
    return chain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN:
        return basicSetNodepattern(null, msgs);
      case OpenCypherPackage.PATTERN_ELEMENT__CHAIN:
        return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN:
        return getNodepattern();
      case OpenCypherPackage.PATTERN_ELEMENT__CHAIN:
        return getChain();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN:
        setNodepattern((NodePattern)newValue);
        return;
      case OpenCypherPackage.PATTERN_ELEMENT__CHAIN:
        getChain().clear();
        getChain().addAll((Collection<? extends PatternElementChain>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN:
        setNodepattern((NodePattern)null);
        return;
      case OpenCypherPackage.PATTERN_ELEMENT__CHAIN:
        getChain().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.PATTERN_ELEMENT__NODEPATTERN:
        return nodepattern != null;
      case OpenCypherPackage.PATTERN_ELEMENT__CHAIN:
        return chain != null && !chain.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PatternElementImpl
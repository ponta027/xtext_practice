/**
 */
package com.ponta027.xtext.statemachine.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.State#getName <em>Name</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.State#getActions <em>Actions</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.State#getSubState <em>Sub State</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ponta027.xtext.statemachine.dsl.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getState_Actions()
   * @model
   * @generated
   */
  EList<Command> getActions();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

  /**
   * Returns the value of the '<em><b>Sub State</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub State</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub State</em>' containment reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getState_SubState()
   * @model containment="true"
   * @generated
   */
  EList<State> getSubState();

} // State

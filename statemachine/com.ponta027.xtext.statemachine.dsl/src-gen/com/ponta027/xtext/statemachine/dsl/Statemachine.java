/**
 */
package com.ponta027.xtext.statemachine.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getEvents <em>Events</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getResetEvents <em>Reset Events</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getCommands <em>Commands</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getStatemachine_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Reset Events</b></em>' reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reset Events</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reset Events</em>' reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getStatemachine_ResetEvents()
   * @model
   * @generated
   */
  EList<Event> getResetEvents();

  /**
   * Returns the value of the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial State</em>' reference.
   * @see #setInitialState(State)
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getStatemachine_InitialState()
   * @model
   * @generated
   */
  State getInitialState();

  /**
   * Sets the value of the '{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getInitialState <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial State</em>' reference.
   * @see #getInitialState()
   * @generated
   */
  void setInitialState(State value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getStatemachine_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.xtext.statemachine.dsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see com.ponta027.xtext.statemachine.dsl.DslPackage#getStatemachine_State()
   * @model containment="true"
   * @generated
   */
  EList<State> getState();

} // Statemachine

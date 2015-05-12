/**
 */
package com.ponta027.xtext.statemachine.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ponta027.xtext.statemachine.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ponta027.com/xtext/statemachine/Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl
   * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__EVENTS = 0;

  /**
   * The feature id for the '<em><b>Reset Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__RESET_EVENTS = 1;

  /**
   * The feature id for the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__INITIAL_STATE = 2;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__COMMANDS = 3;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATE = 4;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.ponta027.xtext.statemachine.dsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.xtext.statemachine.dsl.impl.EventImpl
   * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CODE = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ponta027.xtext.statemachine.dsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.xtext.statemachine.dsl.impl.CommandImpl
   * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CODE = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ponta027.xtext.statemachine.dsl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.xtext.statemachine.dsl.impl.StateImpl
   * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 2;

  /**
   * The feature id for the '<em><b>Sub State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SUB_STATE = 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.ponta027.xtext.statemachine.dsl.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.xtext.statemachine.dsl.impl.TransitionImpl
   * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.ponta027.xtext.statemachine.dsl.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the reference list '{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getResetEvents <em>Reset Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Reset Events</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Statemachine#getResetEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_ResetEvents();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getInitialState <em>Initial State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initial State</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Statemachine#getInitialState()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_InitialState();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Statemachine#getCommands()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.xtext.statemachine.dsl.Statemachine#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Statemachine#getState()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_State();

  /**
   * Returns the meta object for class '{@link com.ponta027.xtext.statemachine.dsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.xtext.statemachine.dsl.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.xtext.statemachine.dsl.Event#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Event#getCode()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Code();

  /**
   * Returns the meta object for class '{@link com.ponta027.xtext.statemachine.dsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.xtext.statemachine.dsl.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.xtext.statemachine.dsl.Command#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Command#getCode()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Code();

  /**
   * Returns the meta object for class '{@link com.ponta027.xtext.statemachine.dsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.xtext.statemachine.dsl.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the reference list '{@link com.ponta027.xtext.statemachine.dsl.State#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.State#getActions()
   * @see #getState()
   * @generated
   */
  EReference getState_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.xtext.statemachine.dsl.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.xtext.statemachine.dsl.State#getSubState <em>Sub State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub State</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.State#getSubState()
   * @see #getState()
   * @generated
   */
  EReference getState_SubState();

  /**
   * Returns the meta object for class '{@link com.ponta027.xtext.statemachine.dsl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.xtext.statemachine.dsl.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.xtext.statemachine.dsl.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see com.ponta027.xtext.statemachine.dsl.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl
     * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__EVENTS = eINSTANCE.getStatemachine_Events();

    /**
     * The meta object literal for the '<em><b>Reset Events</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__RESET_EVENTS = eINSTANCE.getStatemachine_ResetEvents();

    /**
     * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__INITIAL_STATE = eINSTANCE.getStatemachine_InitialState();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__COMMANDS = eINSTANCE.getStatemachine_Commands();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATE = eINSTANCE.getStatemachine_State();

    /**
     * The meta object literal for the '{@link com.ponta027.xtext.statemachine.dsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.xtext.statemachine.dsl.impl.EventImpl
     * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__CODE = eINSTANCE.getEvent_Code();

    /**
     * The meta object literal for the '{@link com.ponta027.xtext.statemachine.dsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.xtext.statemachine.dsl.impl.CommandImpl
     * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__CODE = eINSTANCE.getCommand_Code();

    /**
     * The meta object literal for the '{@link com.ponta027.xtext.statemachine.dsl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.xtext.statemachine.dsl.impl.StateImpl
     * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '<em><b>Sub State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SUB_STATE = eINSTANCE.getState_SubState();

    /**
     * The meta object literal for the '{@link com.ponta027.xtext.statemachine.dsl.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.xtext.statemachine.dsl.impl.TransitionImpl
     * @see com.ponta027.xtext.statemachine.dsl.impl.DslPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

  }

} //DslPackage

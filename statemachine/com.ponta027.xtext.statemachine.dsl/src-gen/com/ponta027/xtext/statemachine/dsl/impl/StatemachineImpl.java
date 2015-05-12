/**
 */
package com.ponta027.xtext.statemachine.dsl.impl;

import com.ponta027.xtext.statemachine.dsl.Command;
import com.ponta027.xtext.statemachine.dsl.DslPackage;
import com.ponta027.xtext.statemachine.dsl.Event;
import com.ponta027.xtext.statemachine.dsl.State;
import com.ponta027.xtext.statemachine.dsl.Statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl#getResetEvents <em>Reset Events</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link com.ponta027.xtext.statemachine.dsl.impl.StatemachineImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
{
  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The cached value of the '{@link #getResetEvents() <em>Reset Events</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResetEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> resetEvents;

  /**
   * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialState()
   * @generated
   * @ordered
   */
  protected State initialState;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<State> state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
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
    return DslPackage.Literals.STATEMACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, DslPackage.STATEMACHINE__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getResetEvents()
  {
    if (resetEvents == null)
    {
      resetEvents = new EObjectResolvingEList<Event>(Event.class, this, DslPackage.STATEMACHINE__RESET_EVENTS);
    }
    return resetEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitialState()
  {
    if (initialState != null && initialState.eIsProxy())
    {
      InternalEObject oldInitialState = (InternalEObject)initialState;
      initialState = (State)eResolveProxy(oldInitialState);
      if (initialState != oldInitialState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.STATEMACHINE__INITIAL_STATE, oldInitialState, initialState));
      }
    }
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitialState()
  {
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialState(State newInitialState)
  {
    State oldInitialState = initialState;
    initialState = newInitialState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STATEMACHINE__INITIAL_STATE, oldInitialState, initialState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, DslPackage.STATEMACHINE__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getState()
  {
    if (state == null)
    {
      state = new EObjectContainmentEList<State>(State.class, this, DslPackage.STATEMACHINE__STATE);
    }
    return state;
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
      case DslPackage.STATEMACHINE__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case DslPackage.STATEMACHINE__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case DslPackage.STATEMACHINE__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
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
      case DslPackage.STATEMACHINE__EVENTS:
        return getEvents();
      case DslPackage.STATEMACHINE__RESET_EVENTS:
        return getResetEvents();
      case DslPackage.STATEMACHINE__INITIAL_STATE:
        if (resolve) return getInitialState();
        return basicGetInitialState();
      case DslPackage.STATEMACHINE__COMMANDS:
        return getCommands();
      case DslPackage.STATEMACHINE__STATE:
        return getState();
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
      case DslPackage.STATEMACHINE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case DslPackage.STATEMACHINE__RESET_EVENTS:
        getResetEvents().clear();
        getResetEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case DslPackage.STATEMACHINE__INITIAL_STATE:
        setInitialState((State)newValue);
        return;
      case DslPackage.STATEMACHINE__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case DslPackage.STATEMACHINE__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>)newValue);
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
      case DslPackage.STATEMACHINE__EVENTS:
        getEvents().clear();
        return;
      case DslPackage.STATEMACHINE__RESET_EVENTS:
        getResetEvents().clear();
        return;
      case DslPackage.STATEMACHINE__INITIAL_STATE:
        setInitialState((State)null);
        return;
      case DslPackage.STATEMACHINE__COMMANDS:
        getCommands().clear();
        return;
      case DslPackage.STATEMACHINE__STATE:
        getState().clear();
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
      case DslPackage.STATEMACHINE__EVENTS:
        return events != null && !events.isEmpty();
      case DslPackage.STATEMACHINE__RESET_EVENTS:
        return resetEvents != null && !resetEvents.isEmpty();
      case DslPackage.STATEMACHINE__INITIAL_STATE:
        return initialState != null;
      case DslPackage.STATEMACHINE__COMMANDS:
        return commands != null && !commands.isEmpty();
      case DslPackage.STATEMACHINE__STATE:
        return state != null && !state.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatemachineImpl

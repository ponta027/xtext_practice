package com.ponta027.xtext.statemachine.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ponta027.xtext.statemachine.dsl.Command;
import com.ponta027.xtext.statemachine.dsl.DslPackage;
import com.ponta027.xtext.statemachine.dsl.Event;
import com.ponta027.xtext.statemachine.dsl.State;
import com.ponta027.xtext.statemachine.dsl.Statemachine;
import com.ponta027.xtext.statemachine.dsl.Transition;
import com.ponta027.xtext.statemachine.services.DslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DslPackage.COMMAND:
				if(context == grammarAccess.getCommandRule()) {
					sequence_Command(context, (Command) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.STATEMACHINE:
				if(context == grammarAccess.getStatemachineRule()) {
					sequence_Statemachine(context, (Statemachine) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID code=ID)
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.COMMAND__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.COMMAND__CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID code=ID)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.EVENT__NAME));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.EVENT__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.EVENT__CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID actions+=[Command|ID]* transitions+=Transition* subState+=State*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (events+=Event* resetEvents+=[Event|ID]* initialState=[State|ID]? commands+=Command* state+=State*)
	 */
	protected void sequence_Statemachine(EObject context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=[Event|ID] state=[State|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.TRANSITION__EVENT));
			if(transientValues.isValueTransient(semanticObject, DslPackage.Literals.TRANSITION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.TRANSITION__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1(), semanticObject.getState());
		feeder.finish();
	}
}

package com.ponta027.xtext.statemachine.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.ponta027.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'resetEvents'", "'initialState'", "'commands'", "'state'", "'actions {'", "'}'", "'=>'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStatemachine"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleStatemachine EOF )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine61);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__Statemachine__Group__0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleEvent EOF )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent121);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Event__Group__0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Event__Group__0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__Event__Group__0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent154);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleCommand EOF )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand181);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Command__Group__0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Command__Group__0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__Command__Group__0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand214);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:144:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:145:1: ( ruleState EOF )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:146:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState241);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:153:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:157:2: ( ( ( rule__State__Group__0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__State__Group__0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__State__Group__0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( rule__State__Group__0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState274);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:172:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:173:1: ( ruleTransition EOF )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:174:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition301);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:181:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:185:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__Transition__Group__0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ( rule__Transition__Group__0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:188:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition334);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:202:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:206:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:207:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0368);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0371);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:214:1: rule__Statemachine__Group__0__Impl : ( () ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:218:1: ( ( () ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:219:1: ( () )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:219:1: ( () )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:220:1: ()
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:221:1: ()
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:223:1: 
            {
            }

             after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:233:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:237:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:238:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1429);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1432);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:245:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__Group_1__0 )? ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:249:1: ( ( ( rule__Statemachine__Group_1__0 )? ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:250:1: ( ( rule__Statemachine__Group_1__0 )? )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:250:1: ( ( rule__Statemachine__Group_1__0 )? )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:251:1: ( rule__Statemachine__Group_1__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:252:1: ( rule__Statemachine__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:252:2: rule__Statemachine__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_1__0_in_rule__Statemachine__Group__1__Impl459);
                    rule__Statemachine__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:262:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:266:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:267:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2490);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__2493);
            rule__Statemachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:274:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__Group_2__0 )? ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:278:1: ( ( ( rule__Statemachine__Group_2__0 )? ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:279:1: ( ( rule__Statemachine__Group_2__0 )? )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:279:1: ( ( rule__Statemachine__Group_2__0 )? )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:280:1: ( rule__Statemachine__Group_2__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_2()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:281:1: ( rule__Statemachine__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:281:2: rule__Statemachine__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl520);
                    rule__Statemachine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:291:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:295:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:296:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__3551);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__3554);
            rule__Statemachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:303:1: rule__Statemachine__Group__3__Impl : ( ( rule__Statemachine__Group_3__0 )? ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:307:1: ( ( ( rule__Statemachine__Group_3__0 )? ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:308:1: ( ( rule__Statemachine__Group_3__0 )? )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:308:1: ( ( rule__Statemachine__Group_3__0 )? )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:309:1: ( rule__Statemachine__Group_3__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_3()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:310:1: ( rule__Statemachine__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:310:2: rule__Statemachine__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl581);
                    rule__Statemachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group__4"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:320:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:324:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:325:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__4612);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__4615);
            rule__Statemachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4"


    // $ANTLR start "rule__Statemachine__Group__4__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:332:1: rule__Statemachine__Group__4__Impl : ( ( rule__Statemachine__Group_4__0 )? ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:336:1: ( ( ( rule__Statemachine__Group_4__0 )? ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:337:1: ( ( rule__Statemachine__Group_4__0 )? )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:337:1: ( ( rule__Statemachine__Group_4__0 )? )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:338:1: ( rule__Statemachine__Group_4__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_4()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:339:1: ( rule__Statemachine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:339:2: rule__Statemachine__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl642);
                    rule__Statemachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__Group__5"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:349:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:353:1: ( rule__Statemachine__Group__5__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:354:2: rule__Statemachine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__5673);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5"


    // $ANTLR start "rule__Statemachine__Group__5__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:360:1: rule__Statemachine__Group__5__Impl : ( ( rule__Statemachine__StateAssignment_5 )* ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:364:1: ( ( ( rule__Statemachine__StateAssignment_5 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:365:1: ( ( rule__Statemachine__StateAssignment_5 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:365:1: ( ( rule__Statemachine__StateAssignment_5 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:366:1: ( rule__Statemachine__StateAssignment_5 )*
            {
             before(grammarAccess.getStatemachineAccess().getStateAssignment_5()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:367:1: ( rule__Statemachine__StateAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:367:2: rule__Statemachine__StateAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StateAssignment_5_in_rule__Statemachine__Group__5__Impl700);
            	    rule__Statemachine__StateAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getStateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:389:1: rule__Statemachine__Group_1__0 : rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1 ;
    public final void rule__Statemachine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:393:1: ( rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:394:2: rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__0__Impl_in_rule__Statemachine__Group_1__0743);
            rule__Statemachine__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_1__1_in_rule__Statemachine__Group_1__0746);
            rule__Statemachine__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__0"


    // $ANTLR start "rule__Statemachine__Group_1__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:401:1: rule__Statemachine__Group_1__0__Impl : ( 'events' ) ;
    public final void rule__Statemachine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:405:1: ( ( 'events' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:406:1: ( 'events' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:406:1: ( 'events' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:407:1: 'events'
            {
             before(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Statemachine__Group_1__0__Impl774); 
             after(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:420:1: rule__Statemachine__Group_1__1 : rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2 ;
    public final void rule__Statemachine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:424:1: ( rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:425:2: rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__1__Impl_in_rule__Statemachine__Group_1__1805);
            rule__Statemachine__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_1__2_in_rule__Statemachine__Group_1__1808);
            rule__Statemachine__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__1"


    // $ANTLR start "rule__Statemachine__Group_1__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:432:1: rule__Statemachine__Group_1__1__Impl : ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) ) ;
    public final void rule__Statemachine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:436:1: ( ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:437:1: ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:437:1: ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:438:1: ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:438:1: ( ( rule__Statemachine__EventsAssignment_1_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:439:1: ( rule__Statemachine__EventsAssignment_1_1 )
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:440:1: ( rule__Statemachine__EventsAssignment_1_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:440:2: rule__Statemachine__EventsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl837);
            rule__Statemachine__EventsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 

            }

            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:443:1: ( ( rule__Statemachine__EventsAssignment_1_1 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:444:1: ( rule__Statemachine__EventsAssignment_1_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:445:1: ( rule__Statemachine__EventsAssignment_1_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:445:2: rule__Statemachine__EventsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl849);
            	    rule__Statemachine__EventsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:456:1: rule__Statemachine__Group_1__2 : rule__Statemachine__Group_1__2__Impl ;
    public final void rule__Statemachine__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:460:1: ( rule__Statemachine__Group_1__2__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:461:2: rule__Statemachine__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__2__Impl_in_rule__Statemachine__Group_1__2882);
            rule__Statemachine__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__2"


    // $ANTLR start "rule__Statemachine__Group_1__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:467:1: rule__Statemachine__Group_1__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:471:1: ( ( 'end' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:472:1: ( 'end' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:472:1: ( 'end' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:473:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group_1__2__Impl910); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:492:1: rule__Statemachine__Group_2__0 : rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 ;
    public final void rule__Statemachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:496:1: ( rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:497:2: rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__0947);
            rule__Statemachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__0950);
            rule__Statemachine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0"


    // $ANTLR start "rule__Statemachine__Group_2__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:504:1: rule__Statemachine__Group_2__0__Impl : ( 'resetEvents' ) ;
    public final void rule__Statemachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:508:1: ( ( 'resetEvents' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:509:1: ( 'resetEvents' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:509:1: ( 'resetEvents' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:510:1: 'resetEvents'
            {
             before(grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Statemachine__Group_2__0__Impl978); 
             after(grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:523:1: rule__Statemachine__Group_2__1 : rule__Statemachine__Group_2__1__Impl rule__Statemachine__Group_2__2 ;
    public final void rule__Statemachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:527:1: ( rule__Statemachine__Group_2__1__Impl rule__Statemachine__Group_2__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:528:2: rule__Statemachine__Group_2__1__Impl rule__Statemachine__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11009);
            rule__Statemachine__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_2__2_in_rule__Statemachine__Group_2__11012);
            rule__Statemachine__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1"


    // $ANTLR start "rule__Statemachine__Group_2__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:535:1: rule__Statemachine__Group_2__1__Impl : ( ( ( rule__Statemachine__ResetEventsAssignment_2_1 ) ) ( ( rule__Statemachine__ResetEventsAssignment_2_1 )* ) ) ;
    public final void rule__Statemachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:539:1: ( ( ( ( rule__Statemachine__ResetEventsAssignment_2_1 ) ) ( ( rule__Statemachine__ResetEventsAssignment_2_1 )* ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:540:1: ( ( ( rule__Statemachine__ResetEventsAssignment_2_1 ) ) ( ( rule__Statemachine__ResetEventsAssignment_2_1 )* ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:540:1: ( ( ( rule__Statemachine__ResetEventsAssignment_2_1 ) ) ( ( rule__Statemachine__ResetEventsAssignment_2_1 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:541:1: ( ( rule__Statemachine__ResetEventsAssignment_2_1 ) ) ( ( rule__Statemachine__ResetEventsAssignment_2_1 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:541:1: ( ( rule__Statemachine__ResetEventsAssignment_2_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:542:1: ( rule__Statemachine__ResetEventsAssignment_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getResetEventsAssignment_2_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:543:1: ( rule__Statemachine__ResetEventsAssignment_2_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:543:2: rule__Statemachine__ResetEventsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Statemachine__ResetEventsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1041);
            rule__Statemachine__ResetEventsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getResetEventsAssignment_2_1()); 

            }

            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:546:1: ( ( rule__Statemachine__ResetEventsAssignment_2_1 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:547:1: ( rule__Statemachine__ResetEventsAssignment_2_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getResetEventsAssignment_2_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:548:1: ( rule__Statemachine__ResetEventsAssignment_2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:548:2: rule__Statemachine__ResetEventsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__ResetEventsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1053);
            	    rule__Statemachine__ResetEventsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getResetEventsAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:559:1: rule__Statemachine__Group_2__2 : rule__Statemachine__Group_2__2__Impl ;
    public final void rule__Statemachine__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:563:1: ( rule__Statemachine__Group_2__2__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:564:2: rule__Statemachine__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__2__Impl_in_rule__Statemachine__Group_2__21086);
            rule__Statemachine__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__2"


    // $ANTLR start "rule__Statemachine__Group_2__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:570:1: rule__Statemachine__Group_2__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:574:1: ( ( 'end' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:575:1: ( 'end' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:575:1: ( 'end' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:576:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_2_2()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group_2__2__Impl1114); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_3__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:595:1: rule__Statemachine__Group_3__0 : rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 ;
    public final void rule__Statemachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:599:1: ( rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:600:2: rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01151);
            rule__Statemachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01154);
            rule__Statemachine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__0"


    // $ANTLR start "rule__Statemachine__Group_3__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:607:1: rule__Statemachine__Group_3__0__Impl : ( 'initialState' ) ;
    public final void rule__Statemachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:611:1: ( ( 'initialState' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:612:1: ( 'initialState' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:612:1: ( 'initialState' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:613:1: 'initialState'
            {
             before(grammarAccess.getStatemachineAccess().getInitialStateKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Statemachine__Group_3__0__Impl1182); 
             after(grammarAccess.getStatemachineAccess().getInitialStateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_3__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:626:1: rule__Statemachine__Group_3__1 : rule__Statemachine__Group_3__1__Impl rule__Statemachine__Group_3__2 ;
    public final void rule__Statemachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:630:1: ( rule__Statemachine__Group_3__1__Impl rule__Statemachine__Group_3__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:631:2: rule__Statemachine__Group_3__1__Impl rule__Statemachine__Group_3__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__11213);
            rule__Statemachine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_3__2_in_rule__Statemachine__Group_3__11216);
            rule__Statemachine__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__1"


    // $ANTLR start "rule__Statemachine__Group_3__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:638:1: rule__Statemachine__Group_3__1__Impl : ( ( rule__Statemachine__InitialStateAssignment_3_1 ) ) ;
    public final void rule__Statemachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:642:1: ( ( ( rule__Statemachine__InitialStateAssignment_3_1 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:643:1: ( ( rule__Statemachine__InitialStateAssignment_3_1 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:643:1: ( ( rule__Statemachine__InitialStateAssignment_3_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:644:1: ( rule__Statemachine__InitialStateAssignment_3_1 )
            {
             before(grammarAccess.getStatemachineAccess().getInitialStateAssignment_3_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:645:1: ( rule__Statemachine__InitialStateAssignment_3_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:645:2: rule__Statemachine__InitialStateAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Statemachine__InitialStateAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl1243);
            rule__Statemachine__InitialStateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getInitialStateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_3__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:655:1: rule__Statemachine__Group_3__2 : rule__Statemachine__Group_3__2__Impl ;
    public final void rule__Statemachine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:659:1: ( rule__Statemachine__Group_3__2__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:660:2: rule__Statemachine__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_3__2__Impl_in_rule__Statemachine__Group_3__21273);
            rule__Statemachine__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__2"


    // $ANTLR start "rule__Statemachine__Group_3__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:666:1: rule__Statemachine__Group_3__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:670:1: ( ( 'end' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:671:1: ( 'end' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:671:1: ( 'end' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:672:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_3_2()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group_3__2__Impl1301); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:691:1: rule__Statemachine__Group_4__0 : rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 ;
    public final void rule__Statemachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:695:1: ( rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:696:2: rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__01338);
            rule__Statemachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__01341);
            rule__Statemachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__0"


    // $ANTLR start "rule__Statemachine__Group_4__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:703:1: rule__Statemachine__Group_4__0__Impl : ( 'commands' ) ;
    public final void rule__Statemachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:707:1: ( ( 'commands' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:708:1: ( 'commands' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:708:1: ( 'commands' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:709:1: 'commands'
            {
             before(grammarAccess.getStatemachineAccess().getCommandsKeyword_4_0()); 
            match(input,15,FOLLOW_15_in_rule__Statemachine__Group_4__0__Impl1369); 
             after(grammarAccess.getStatemachineAccess().getCommandsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:722:1: rule__Statemachine__Group_4__1 : rule__Statemachine__Group_4__1__Impl rule__Statemachine__Group_4__2 ;
    public final void rule__Statemachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:726:1: ( rule__Statemachine__Group_4__1__Impl rule__Statemachine__Group_4__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:727:2: rule__Statemachine__Group_4__1__Impl rule__Statemachine__Group_4__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__11400);
            rule__Statemachine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_4__2_in_rule__Statemachine__Group_4__11403);
            rule__Statemachine__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__1"


    // $ANTLR start "rule__Statemachine__Group_4__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:734:1: rule__Statemachine__Group_4__1__Impl : ( ( ( rule__Statemachine__CommandsAssignment_4_1 ) ) ( ( rule__Statemachine__CommandsAssignment_4_1 )* ) ) ;
    public final void rule__Statemachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:738:1: ( ( ( ( rule__Statemachine__CommandsAssignment_4_1 ) ) ( ( rule__Statemachine__CommandsAssignment_4_1 )* ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( ( ( rule__Statemachine__CommandsAssignment_4_1 ) ) ( ( rule__Statemachine__CommandsAssignment_4_1 )* ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( ( ( rule__Statemachine__CommandsAssignment_4_1 ) ) ( ( rule__Statemachine__CommandsAssignment_4_1 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( rule__Statemachine__CommandsAssignment_4_1 ) ) ( ( rule__Statemachine__CommandsAssignment_4_1 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( rule__Statemachine__CommandsAssignment_4_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( rule__Statemachine__CommandsAssignment_4_1 )
            {
             before(grammarAccess.getStatemachineAccess().getCommandsAssignment_4_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:742:1: ( rule__Statemachine__CommandsAssignment_4_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:742:2: rule__Statemachine__CommandsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Statemachine__CommandsAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1432);
            rule__Statemachine__CommandsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getCommandsAssignment_4_1()); 

            }

            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:745:1: ( ( rule__Statemachine__CommandsAssignment_4_1 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:746:1: ( rule__Statemachine__CommandsAssignment_4_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getCommandsAssignment_4_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:747:1: ( rule__Statemachine__CommandsAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:747:2: rule__Statemachine__CommandsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__CommandsAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1444);
            	    rule__Statemachine__CommandsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getCommandsAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:758:1: rule__Statemachine__Group_4__2 : rule__Statemachine__Group_4__2__Impl ;
    public final void rule__Statemachine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:762:1: ( rule__Statemachine__Group_4__2__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:763:2: rule__Statemachine__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_4__2__Impl_in_rule__Statemachine__Group_4__21477);
            rule__Statemachine__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__2"


    // $ANTLR start "rule__Statemachine__Group_4__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:769:1: rule__Statemachine__Group_4__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:773:1: ( ( 'end' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:774:1: ( 'end' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:774:1: ( 'end' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:775:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_4_2()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group_4__2__Impl1505); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:794:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:798:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:799:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__01542);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__01545);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:806:1: rule__Event__Group__0__Impl : ( ( rule__Event__NameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:810:1: ( ( ( rule__Event__NameAssignment_0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:811:1: ( ( rule__Event__NameAssignment_0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:811:1: ( ( rule__Event__NameAssignment_0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:812:1: ( rule__Event__NameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:813:1: ( rule__Event__NameAssignment_0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:813:2: rule__Event__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Group__0__Impl1572);
            rule__Event__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:823:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:827:1: ( rule__Event__Group__1__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:828:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__11602);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:834:1: rule__Event__Group__1__Impl : ( ( rule__Event__CodeAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:838:1: ( ( ( rule__Event__CodeAssignment_1 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:839:1: ( ( rule__Event__CodeAssignment_1 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:839:1: ( ( rule__Event__CodeAssignment_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:840:1: ( rule__Event__CodeAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getCodeAssignment_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:841:1: ( rule__Event__CodeAssignment_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:841:2: rule__Event__CodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__CodeAssignment_1_in_rule__Event__Group__1__Impl1629);
            rule__Event__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:855:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:859:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:860:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__01663);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__01666);
            rule__Command__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:867:1: rule__Command__Group__0__Impl : ( ( rule__Command__NameAssignment_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:871:1: ( ( ( rule__Command__NameAssignment_0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:872:1: ( ( rule__Command__NameAssignment_0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:872:1: ( ( rule__Command__NameAssignment_0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:873:1: ( rule__Command__NameAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:874:1: ( rule__Command__NameAssignment_0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:874:2: rule__Command__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__0__Impl1693);
            rule__Command__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:884:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:888:1: ( rule__Command__Group__1__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:889:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__11723);
            rule__Command__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:895:1: rule__Command__Group__1__Impl : ( ( rule__Command__CodeAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:899:1: ( ( ( rule__Command__CodeAssignment_1 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:900:1: ( ( rule__Command__CodeAssignment_1 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:900:1: ( ( rule__Command__CodeAssignment_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:901:1: ( rule__Command__CodeAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getCodeAssignment_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:902:1: ( rule__Command__CodeAssignment_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:902:2: rule__Command__CodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__CodeAssignment_1_in_rule__Command__Group__1__Impl1750);
            rule__Command__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:916:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:920:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:921:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01784);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01787);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:928:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:932:1: ( ( 'state' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:933:1: ( 'state' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:933:1: ( 'state' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:934:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__State__Group__0__Impl1815); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:947:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:951:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:952:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11846);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11849);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:959:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:963:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ( ( rule__State__NameAssignment_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:965:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:966:1: ( rule__State__NameAssignment_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:966:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1876);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:976:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:980:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:981:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21906);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21909);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:988:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:992:1: ( ( ( rule__State__Group_2__0 )? ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:993:1: ( ( rule__State__Group_2__0 )? )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:993:1: ( ( rule__State__Group_2__0 )? )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:994:1: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:995:1: ( rule__State__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:995:2: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl1936);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1005:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1009:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1010:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31967);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31970);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1017:1: rule__State__Group__3__Impl : ( ( rule__State__TransitionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1021:1: ( ( ( rule__State__TransitionsAssignment_3 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1022:1: ( ( rule__State__TransitionsAssignment_3 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1022:1: ( ( rule__State__TransitionsAssignment_3 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1023:1: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1024:1: ( rule__State__TransitionsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1024:2: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__3__Impl1997);
            	    rule__State__TransitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1034:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1038:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1039:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42028);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__42031);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1046:1: rule__State__Group__4__Impl : ( ( rule__State__SubStateAssignment_4 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1050:1: ( ( ( rule__State__SubStateAssignment_4 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: ( ( rule__State__SubStateAssignment_4 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: ( ( rule__State__SubStateAssignment_4 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1052:1: ( rule__State__SubStateAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getSubStateAssignment_4()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1053:1: ( rule__State__SubStateAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1053:2: rule__State__SubStateAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__State__SubStateAssignment_4_in_rule__State__Group__4__Impl2058);
            	    rule__State__SubStateAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getSubStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1063:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1067:1: ( rule__State__Group__5__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1068:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__52089);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1074:1: rule__State__Group__5__Impl : ( 'end' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1078:1: ( ( 'end' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1079:1: ( 'end' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1079:1: ( 'end' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: 'end'
            {
             before(grammarAccess.getStateAccess().getEndKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__State__Group__5__Impl2117); 
             after(grammarAccess.getStateAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1105:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1109:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1110:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__02160);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__02163);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1117:1: rule__State__Group_2__0__Impl : ( 'actions {' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1121:1: ( ( 'actions {' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1122:1: ( 'actions {' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1122:1: ( 'actions {' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: 'actions {'
            {
             before(grammarAccess.getStateAccess().getActionsKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__State__Group_2__0__Impl2191); 
             after(grammarAccess.getStateAccess().getActionsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1136:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1140:1: ( rule__State__Group_2__1__Impl rule__State__Group_2__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1141:2: rule__State__Group_2__1__Impl rule__State__Group_2__2
            {
            pushFollow(FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__12222);
            rule__State__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__2_in_rule__State__Group_2__12225);
            rule__State__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1148:1: rule__State__Group_2__1__Impl : ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1152:1: ( ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1153:1: ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1153:1: ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( ( rule__State__ActionsAssignment_2_1 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1155:1: ( rule__State__ActionsAssignment_2_1 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1156:1: ( rule__State__ActionsAssignment_2_1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1156:2: rule__State__ActionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl2254);
            rule__State__ActionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 

            }

            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1159:1: ( ( rule__State__ActionsAssignment_2_1 )* )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1160:1: ( rule__State__ActionsAssignment_2_1 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1161:1: ( rule__State__ActionsAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1161:2: rule__State__ActionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl2266);
            	    rule__State__ActionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_2__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1172:1: rule__State__Group_2__2 : rule__State__Group_2__2__Impl ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1176:1: ( rule__State__Group_2__2__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1177:2: rule__State__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2__2__Impl_in_rule__State__Group_2__22299);
            rule__State__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2"


    // $ANTLR start "rule__State__Group_2__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1183:1: rule__State__Group_2__2__Impl : ( '}' ) ;
    public final void rule__State__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1187:1: ( ( '}' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1188:1: ( '}' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1188:1: ( '}' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1189:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__State__Group_2__2__Impl2327); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1208:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1212:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1213:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02364);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02367);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1220:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__EventAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1224:1: ( ( ( rule__Transition__EventAssignment_0 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1225:1: ( ( rule__Transition__EventAssignment_0 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1225:1: ( ( rule__Transition__EventAssignment_0 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1226:1: ( rule__Transition__EventAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1227:1: ( rule__Transition__EventAssignment_0 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1227:2: rule__Transition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl2394);
            rule__Transition__EventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1237:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1241:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1242:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12424);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12427);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1249:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1253:1: ( ( '=>' ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1254:1: ( '=>' )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1254:1: ( '=>' )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1255:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Transition__Group__1__Impl2455); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1268:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1272:1: ( rule__Transition__Group__2__Impl )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1273:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22486);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1279:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__StateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1283:1: ( ( ( rule__Transition__StateAssignment_2 ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1284:1: ( ( rule__Transition__StateAssignment_2 ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1284:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1285:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1286:1: ( rule__Transition__StateAssignment_2 )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1286:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl2513);
            rule__Transition__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__EventsAssignment_1_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1303:1: rule__Statemachine__EventsAssignment_1_1 : ( ruleEvent ) ;
    public final void rule__Statemachine__EventsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1307:1: ( ( ruleEvent ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1308:1: ( ruleEvent )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1308:1: ( ruleEvent )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1309:1: ruleEvent
            {
             before(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_1_12554);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__EventsAssignment_1_1"


    // $ANTLR start "rule__Statemachine__ResetEventsAssignment_2_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1318:1: rule__Statemachine__ResetEventsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Statemachine__ResetEventsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1322:1: ( ( ( RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: ( ( RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1324:1: ( RULE_ID )
            {
             before(grammarAccess.getStatemachineAccess().getResetEventsEventCrossReference_2_1_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1325:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: RULE_ID
            {
             before(grammarAccess.getStatemachineAccess().getResetEventsEventIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statemachine__ResetEventsAssignment_2_12589); 
             after(grammarAccess.getStatemachineAccess().getResetEventsEventIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getResetEventsEventCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__ResetEventsAssignment_2_1"


    // $ANTLR start "rule__Statemachine__InitialStateAssignment_3_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1337:1: rule__Statemachine__InitialStateAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Statemachine__InitialStateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1341:1: ( ( ( RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1342:1: ( ( RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1342:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1343:1: ( RULE_ID )
            {
             before(grammarAccess.getStatemachineAccess().getInitialStateStateCrossReference_3_1_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1344:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1345:1: RULE_ID
            {
             before(grammarAccess.getStatemachineAccess().getInitialStateStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statemachine__InitialStateAssignment_3_12628); 
             after(grammarAccess.getStatemachineAccess().getInitialStateStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getInitialStateStateCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__InitialStateAssignment_3_1"


    // $ANTLR start "rule__Statemachine__CommandsAssignment_4_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1356:1: rule__Statemachine__CommandsAssignment_4_1 : ( ruleCommand ) ;
    public final void rule__Statemachine__CommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1360:1: ( ( ruleCommand ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1361:1: ( ruleCommand )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1361:1: ( ruleCommand )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1362:1: ruleCommand
            {
             before(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Statemachine__CommandsAssignment_4_12663);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__CommandsAssignment_4_1"


    // $ANTLR start "rule__Statemachine__StateAssignment_5"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1371:1: rule__Statemachine__StateAssignment_5 : ( ruleState ) ;
    public final void rule__Statemachine__StateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1375:1: ( ( ruleState ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1376:1: ( ruleState )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1376:1: ( ruleState )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1377:1: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_52694);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StateAssignment_5"


    // $ANTLR start "rule__Event__NameAssignment_0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1386:1: rule__Event__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1390:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1391:1: ( RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1391:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1392:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_02725); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_0"


    // $ANTLR start "rule__Event__CodeAssignment_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1401:1: rule__Event__CodeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1405:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1406:1: ( RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1406:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1407:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__CodeAssignment_12756); 
             after(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CodeAssignment_1"


    // $ANTLR start "rule__Command__NameAssignment_0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1416:1: rule__Command__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1420:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1421:1: ( RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1421:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1422:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_02787); 
             after(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NameAssignment_0"


    // $ANTLR start "rule__Command__CodeAssignment_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1431:1: rule__Command__CodeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Command__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1435:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1436:1: ( RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1436:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1437:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__CodeAssignment_12818); 
             after(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CodeAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1446:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1450:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1451:1: ( RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1451:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1452:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_12849); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ActionsAssignment_2_1"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1461:1: rule__State__ActionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__State__ActionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1465:1: ( ( ( RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1466:1: ( ( RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1466:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1467:1: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getActionsCommandCrossReference_2_1_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1469:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getActionsCommandIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__ActionsAssignment_2_12884); 
             after(grammarAccess.getStateAccess().getActionsCommandIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getActionsCommandCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_2_1"


    // $ANTLR start "rule__State__TransitionsAssignment_3"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1480:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1484:1: ( ( ruleTransition ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1485:1: ( ruleTransition )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1485:1: ( ruleTransition )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1486:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_32919);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_3"


    // $ANTLR start "rule__State__SubStateAssignment_4"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1495:1: rule__State__SubStateAssignment_4 : ( ruleState ) ;
    public final void rule__State__SubStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1499:1: ( ( ruleState ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1500:1: ( ruleState )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1500:1: ( ruleState )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1501:1: ruleState
            {
             before(grammarAccess.getStateAccess().getSubStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__State__SubStateAssignment_42950);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateAccess().getSubStateStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__SubStateAssignment_4"


    // $ANTLR start "rule__Transition__EventAssignment_0"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1510:1: rule__Transition__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1514:1: ( ( ( RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1515:1: ( ( RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1515:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1516:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1517:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1518:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_02985); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_0"


    // $ANTLR start "rule__Transition__StateAssignment_2"
    // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1529:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1533:1: ( ( ( RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1534:1: ( ( RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1534:1: ( ( RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1535:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1536:1: ( RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl.ui/src-gen/com/ponta027/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1537:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23024); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0368 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1429 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__0_in_rule__Statemachine__Group__1__Impl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2490 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__3551 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__4612 = new BitSet(new long[]{0x000000000001E800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StateAssignment_5_in_rule__Statemachine__Group__5__Impl700 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__0__Impl_in_rule__Statemachine__Group_1__0743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__1_in_rule__Statemachine__Group_1__0746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statemachine__Group_1__0__Impl774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__1__Impl_in_rule__Statemachine__Group_1__1805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__2_in_rule__Statemachine__Group_1__1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl837 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl849 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__2__Impl_in_rule__Statemachine__Group_1__2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_1__2__Impl910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__0947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__0950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Statemachine__Group_2__0__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11009 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__2_in_rule__Statemachine__Group_2__11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__ResetEventsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1041 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__ResetEventsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1053 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__2__Impl_in_rule__Statemachine__Group_2__21086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_2__2__Impl1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statemachine__Group_3__0__Impl1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__11213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_3__2_in_rule__Statemachine__Group_3__11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__InitialStateAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_3__2__Impl_in_rule__Statemachine__Group_3__21273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_3__2__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__01338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__01341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Statemachine__Group_4__0__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__11400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_4__2_in_rule__Statemachine__Group_4__11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__CommandsAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1432 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__CommandsAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1444 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_4__2__Impl_in_rule__Statemachine__Group_4__21477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_4__2__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__01542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__01545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Group__0__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CodeAssignment_1_in_rule__Event__Group__1__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__01663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__01666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__0__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CodeAssignment_1_in_rule__Command__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group__0__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11846 = new BitSet(new long[]{0x0000000000031010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21906 = new BitSet(new long[]{0x0000000000031010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31967 = new BitSet(new long[]{0x0000000000031010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__3__Impl1997 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42028 = new BitSet(new long[]{0x0000000000031010L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__42031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__SubStateAssignment_4_in_rule__State__Group__4__Impl2058 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__52089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__State__Group__5__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__02160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__02163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__Group_2__0__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__12222 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__State__Group_2__2_in_rule__State__Group_2__12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl2254 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl2266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group_2__2__Impl_in_rule__State__Group_2__22299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group_2__2__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Transition__Group__1__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_1_12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statemachine__ResetEventsAssignment_2_12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statemachine__InitialStateAssignment_3_12628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Statemachine__CommandsAssignment_4_12663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_52694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_02725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__CodeAssignment_12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_02787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__CodeAssignment_12818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_12849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__ActionsAssignment_2_12884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_32919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__State__SubStateAssignment_42950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_02985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23024 = new BitSet(new long[]{0x0000000000000002L});

}
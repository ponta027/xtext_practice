package com.ponta027.xtext.statemachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ponta027.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine75);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:76:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end' )? (otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end' )? ( (lv_state_13_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_events_2_0 = null;

        EObject lv_commands_11_0 = null;

        EObject lv_state_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end' )? (otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end' )? ( (lv_state_13_0= ruleState ) )* ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end' )? (otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end' )? ( (lv_state_13_0= ruleState ) )* )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end' )? (otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end' )? ( (lv_state_13_0= ruleState ) )* )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end' )? (otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end' )? ( (lv_state_13_0= ruleState ) )*
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleStatemachine132); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:90:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:91:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:91:1: (lv_events_2_0= ruleEvent )
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:92:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine153);
                    	    lv_events_2_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_2_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine166); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:112:3: (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:112:5: otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStatemachine181); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0());
                        
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:116:1: ( (otherlv_5= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:117:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:117:1: (otherlv_5= RULE_ID )
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:118:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatemachine201); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getStatemachineAccess().getResetEventsEventCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine214); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:133:3: (otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:133:5: otherlv_7= 'initialState' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'end'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine229); 

                        	newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getInitialStateKeyword_3_0());
                        
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:137:1: ( (otherlv_8= RULE_ID ) )
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:138:1: (otherlv_8= RULE_ID )
                    {
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:138:1: (otherlv_8= RULE_ID )
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:139:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatemachine249); 

                    		newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getInitialStateStateCrossReference_3_1_0()); 
                    	

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine261); 

                        	newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getEndKeyword_3_2());
                        

                    }
                    break;

            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:154:3: (otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:154:5: otherlv_10= 'commands' ( (lv_commands_11_0= ruleCommand ) )+ otherlv_12= 'end'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleStatemachine276); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getCommandsKeyword_4_0());
                        
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:158:1: ( (lv_commands_11_0= ruleCommand ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:159:1: (lv_commands_11_0= ruleCommand )
                    	    {
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:159:1: (lv_commands_11_0= ruleCommand )
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:160:3: lv_commands_11_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine297);
                    	    lv_commands_11_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_11_0, 
                    	            		"Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine310); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getEndKeyword_4_2());
                        

                    }
                    break;

            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:180:3: ( (lv_state_13_0= ruleState ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:181:1: (lv_state_13_0= ruleState )
            	    {
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:181:1: (lv_state_13_0= ruleState )
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:182:3: lv_state_13_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine333);
            	    lv_state_13_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"state",
            	            		lv_state_13_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:206:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:207:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:208:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent370);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:215:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:218:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:219:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:219:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:219:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:219:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:220:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:220:1: (lv_name_0_0= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:221:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent422); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:237:2: ( (lv_code_1_0= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:238:1: (lv_code_1_0= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:238:1: (lv_code_1_0= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:239:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent444); 

            			newLeafNode(lv_code_1_0, grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:263:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:264:2: (iv_ruleCommand= ruleCommand EOF )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:265:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand485);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:272:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:275:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:276:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:276:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:276:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:276:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:277:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:277:1: (lv_name_0_0= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:278:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand537); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:294:2: ( (lv_code_1_0= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:295:1: (lv_code_1_0= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:295:1: (lv_code_1_0= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:296:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand559); 

            			newLeafNode(lv_code_1_0, grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:320:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:321:2: (iv_ruleState= ruleState EOF )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:322:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState600);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:329:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )? ( (lv_transitions_5_0= ruleTransition ) )* ( (lv_subState_6_0= ruleState ) )* otherlv_7= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_transitions_5_0 = null;

        EObject lv_subState_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:332:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )? ( (lv_transitions_5_0= ruleTransition ) )* ( (lv_subState_6_0= ruleState ) )* otherlv_7= 'end' ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:333:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )? ( (lv_transitions_5_0= ruleTransition ) )* ( (lv_subState_6_0= ruleState ) )* otherlv_7= 'end' )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:333:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )? ( (lv_transitions_5_0= ruleTransition ) )* ( (lv_subState_6_0= ruleState ) )* otherlv_7= 'end' )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:333:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )? ( (lv_transitions_5_0= ruleTransition ) )* ( (lv_subState_6_0= ruleState ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleState647); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:337:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:338:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:338:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:339:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState664); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:355:2: (otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:355:4: otherlv_2= 'actions {' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleState682); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:359:1: ( (otherlv_3= RULE_ID ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:360:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:360:1: (otherlv_3= RULE_ID )
                    	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:361:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState702); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleState715); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:376:3: ( (lv_transitions_5_0= ruleTransition ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:377:1: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:377:1: (lv_transitions_5_0= ruleTransition )
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:378:3: lv_transitions_5_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState738);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_5_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:394:3: ( (lv_subState_6_0= ruleState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:395:1: (lv_subState_6_0= ruleState )
            	    {
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:395:1: (lv_subState_6_0= ruleState )
            	    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:396:3: lv_subState_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSubStateStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleState760);
            	    lv_subState_6_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subState",
            	            		lv_subState_6_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleState773); 

                	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getEndKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:424:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:425:2: (iv_ruleTransition= ruleTransition EOF )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:426:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition809);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:433:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:436:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:437:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:437:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:437:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:437:2: ( (otherlv_0= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:438:1: (otherlv_0= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:438:1: (otherlv_0= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:439:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition864); 

            		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTransition876); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:454:1: ( (otherlv_2= RULE_ID ) )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:455:1: (otherlv_2= RULE_ID )
            {
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:455:1: (otherlv_2= RULE_ID )
            // ../com.ponta027.xtext.statemachine.dsl/src-gen/com/ponta027/xtext/statemachine/parser/antlr/internal/InternalDsl.g:456:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition896); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatemachine132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine153 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine166 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatemachine201 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine214 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatemachine249 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine261 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_ruleStatemachine276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine297 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine310 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine333 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleState647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState664 = new BitSet(new long[]{0x0000000000031010L});
    public static final BitSet FOLLOW_17_in_ruleState682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState702 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState715 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState738 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_ruleState_in_ruleState760 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleState773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition864 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransition876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition896 = new BitSet(new long[]{0x0000000000000002L});

}
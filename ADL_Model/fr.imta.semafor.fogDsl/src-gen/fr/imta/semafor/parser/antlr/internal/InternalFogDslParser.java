package fr.imta.semafor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.semafor.services.FogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFogDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ApiVersion'", "':'", "'v.0.1'", "'resourceType'", "'FogArea'", "'FogSystem'", "'PhysicalNode'", "'VirtualNode'", "'Network'", "'Service'", "'Application'", "'Attribute'", "'metadata'", "'id'", "'tags'", "'-'", "'instanceOf'", "'status'", "'hostedOn'", "'hosts'", "'name'", "'fogSystem'", "'type'", "'unitOfMeasurment'", "'fogArea'", "'Spec'", "'services'", "'connectors'", "'sourceServices'", "'targetServices'", "'constraints'", "'networkPorts'", "'virtualNodes'", "'softwarePacakge'", "'command'", "'networkPort'", "'protocol'", "'portNumber'", "'hostPort'", "'networks'", "'sourceNetworks'", "'targetNetworks'", "'sourceNode'", "'targetNode'", "'networkClass'", "'bandwidth'", "'['", "','", "']'", "'ipRange'", "'image'", "'imageRegistry'", "'.'", "'physicalResources'", "'hostingNode'", "'networkLinks'", "'downloadLink'", "'uploadLink'", "'replicas'", "'runtimes'", "'diskStorage'", "'memory'", "'CpuCores'", "'allOf'", "'anyOf'", "'exclusivelyOneOf'", "'TCP'", "'UDP'", "'Ethernet'", "'Wifi'", "'Bluetooth'", "'Lesser'", "'Greater'", "'Equal'", "'LesserOrEqual'", "'GreaterOrEqual'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFogDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFogDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFogDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFogDsl.g"; }



     	private FogDslGrammarAccess grammarAccess;

        public InternalFogDslParser(TokenStream input, FogDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FogResource";
       	}

       	@Override
       	protected FogDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFogResource"
    // InternalFogDsl.g:65:1: entryRuleFogResource returns [EObject current=null] : iv_ruleFogResource= ruleFogResource EOF ;
    public final EObject entryRuleFogResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFogResource = null;


        try {
            // InternalFogDsl.g:65:52: (iv_ruleFogResource= ruleFogResource EOF )
            // InternalFogDsl.g:66:2: iv_ruleFogResource= ruleFogResource EOF
            {
             newCompositeNode(grammarAccess.getFogResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFogResource=ruleFogResource();

            state._fsp--;

             current =iv_ruleFogResource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFogResource"


    // $ANTLR start "ruleFogResource"
    // InternalFogDsl.g:72:1: ruleFogResource returns [EObject current=null] : (otherlv_0= 'ApiVersion' otherlv_1= ':' otherlv_2= 'v.0.1' ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) ) ) ;
    public final EObject ruleFogResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        EObject this_fogArea_6 = null;

        EObject this_fogSystem_10 = null;

        EObject this_PhysicalNodeType_14 = null;

        EObject this_PhysicalNode_15 = null;

        EObject this_VirtualNodeType_19 = null;

        EObject this_VirtualNode_20 = null;

        EObject this_NetworkType_24 = null;

        EObject this_SerivceType_28 = null;

        EObject this_Application_32 = null;

        EObject this_AttributeType_36 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:78:2: ( (otherlv_0= 'ApiVersion' otherlv_1= ':' otherlv_2= 'v.0.1' ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) ) ) )
            // InternalFogDsl.g:79:2: (otherlv_0= 'ApiVersion' otherlv_1= ':' otherlv_2= 'v.0.1' ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) ) )
            {
            // InternalFogDsl.g:79:2: (otherlv_0= 'ApiVersion' otherlv_1= ':' otherlv_2= 'v.0.1' ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) ) )
            // InternalFogDsl.g:80:3: otherlv_0= 'ApiVersion' otherlv_1= ':' otherlv_2= 'v.0.1' ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFogResourceAccess().getApiVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFogResourceAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFogResourceAccess().getV01Keyword_2());
            		
            // InternalFogDsl.g:92:3: ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalFogDsl.g:93:4: (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea )
                    {
                    // InternalFogDsl.g:93:4: (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea )
                    // InternalFogDsl.g:94:5: otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getFogResourceAccess().getColonKeyword_3_0_1());
                    				
                    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getFogResourceAccess().getFogAreaKeyword_3_0_2());
                    				

                    					newCompositeNode(grammarAccess.getFogResourceAccess().getFogAreaParserRuleCall_3_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    this_fogArea_6=rulefogArea();

                    state._fsp--;


                    					current = this_fogArea_6;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:116:4: (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem )
                    {
                    // InternalFogDsl.g:116:4: (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem )
                    // InternalFogDsl.g:117:5: otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_1_0());
                    				
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getFogResourceAccess().getColonKeyword_3_1_1());
                    				
                    otherlv_9=(Token)match(input,16,FOLLOW_7); 

                    					newLeafNode(otherlv_9, grammarAccess.getFogResourceAccess().getFogSystemKeyword_3_1_2());
                    				

                    					newCompositeNode(grammarAccess.getFogResourceAccess().getFogSystemParserRuleCall_3_1_3());
                    				
                    pushFollow(FOLLOW_2);
                    this_fogSystem_10=rulefogSystem();

                    state._fsp--;


                    					current = this_fogSystem_10;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalFogDsl.g:139:4: (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) )
                    {
                    // InternalFogDsl.g:139:4: (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) )
                    // InternalFogDsl.g:140:5: otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode )
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_2_0());
                    				
                    otherlv_12=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_12, grammarAccess.getFogResourceAccess().getColonKeyword_3_2_1());
                    				
                    otherlv_13=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(otherlv_13, grammarAccess.getFogResourceAccess().getPhysicalNodeKeyword_3_2_2());
                    				
                    // InternalFogDsl.g:152:5: (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==23) ) {
                        int LA1_1 = input.LA(2);

                        if ( (LA1_1==12) ) {
                            switch ( input.LA(3) ) {
                            case 24:
                                {
                                int LA1_4 = input.LA(4);

                                if ( (LA1_4==12) ) {
                                    int LA1_6 = input.LA(5);

                                    if ( (LA1_6==RULE_ID) ) {
                                        int LA1_7 = input.LA(6);

                                        if ( (LA1_7==25) ) {
                                            alt1=1;
                                        }
                                        else if ( (LA1_7==35) ) {
                                            alt1=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 1, 7, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA1_6==RULE_STRING) ) {
                                        alt1=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 1, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 4, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 25:
                                {
                                alt1=1;
                                }
                                break;
                            case 35:
                                {
                                alt1=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 3, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_0==36) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalFogDsl.g:153:6: this_PhysicalNodeType_14= rulePhysicalNodeType
                            {

                            						newCompositeNode(grammarAccess.getFogResourceAccess().getPhysicalNodeTypeParserRuleCall_3_2_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            this_PhysicalNodeType_14=rulePhysicalNodeType();

                            state._fsp--;


                            						current = this_PhysicalNodeType_14;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalFogDsl.g:162:6: this_PhysicalNode_15= rulePhysicalNode
                            {

                            						newCompositeNode(grammarAccess.getFogResourceAccess().getPhysicalNodeParserRuleCall_3_2_3_1());
                            					
                            pushFollow(FOLLOW_2);
                            this_PhysicalNode_15=rulePhysicalNode();

                            state._fsp--;


                            						current = this_PhysicalNode_15;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFogDsl.g:173:4: (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) )
                    {
                    // InternalFogDsl.g:173:4: (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) )
                    // InternalFogDsl.g:174:5: otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode )
                    {
                    otherlv_16=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_16, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_3_0());
                    				
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    					newLeafNode(otherlv_17, grammarAccess.getFogResourceAccess().getColonKeyword_3_3_1());
                    				
                    otherlv_18=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(otherlv_18, grammarAccess.getFogResourceAccess().getVirtualNodeKeyword_3_3_2());
                    				
                    // InternalFogDsl.g:186:5: (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode )
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // InternalFogDsl.g:187:6: this_VirtualNodeType_19= ruleVirtualNodeType
                            {

                            						newCompositeNode(grammarAccess.getFogResourceAccess().getVirtualNodeTypeParserRuleCall_3_3_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            this_VirtualNodeType_19=ruleVirtualNodeType();

                            state._fsp--;


                            						current = this_VirtualNodeType_19;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalFogDsl.g:196:6: this_VirtualNode_20= ruleVirtualNode
                            {

                            						newCompositeNode(grammarAccess.getFogResourceAccess().getVirtualNodeParserRuleCall_3_3_3_1());
                            					
                            pushFollow(FOLLOW_2);
                            this_VirtualNode_20=ruleVirtualNode();

                            state._fsp--;


                            						current = this_VirtualNode_20;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFogDsl.g:207:4: (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType )
                    {
                    // InternalFogDsl.g:207:4: (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType )
                    // InternalFogDsl.g:208:5: otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType
                    {
                    otherlv_21=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_21, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_4_0());
                    				
                    otherlv_22=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(otherlv_22, grammarAccess.getFogResourceAccess().getColonKeyword_3_4_1());
                    				
                    otherlv_23=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(otherlv_23, grammarAccess.getFogResourceAccess().getNetworkKeyword_3_4_2());
                    				

                    					newCompositeNode(grammarAccess.getFogResourceAccess().getNetworkTypeParserRuleCall_3_4_3());
                    				
                    pushFollow(FOLLOW_2);
                    this_NetworkType_24=ruleNetworkType();

                    state._fsp--;


                    					current = this_NetworkType_24;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalFogDsl.g:230:4: (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType )
                    {
                    // InternalFogDsl.g:230:4: (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType )
                    // InternalFogDsl.g:231:5: otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType
                    {
                    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_25, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_5_0());
                    				
                    otherlv_26=(Token)match(input,12,FOLLOW_14); 

                    					newLeafNode(otherlv_26, grammarAccess.getFogResourceAccess().getColonKeyword_3_5_1());
                    				
                    otherlv_27=(Token)match(input,20,FOLLOW_12); 

                    					newLeafNode(otherlv_27, grammarAccess.getFogResourceAccess().getServiceKeyword_3_5_2());
                    				

                    					newCompositeNode(grammarAccess.getFogResourceAccess().getSerivceTypeParserRuleCall_3_5_3());
                    				
                    pushFollow(FOLLOW_2);
                    this_SerivceType_28=ruleSerivceType();

                    state._fsp--;


                    					current = this_SerivceType_28;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 7 :
                    // InternalFogDsl.g:253:4: (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication )
                    {
                    // InternalFogDsl.g:253:4: (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication )
                    // InternalFogDsl.g:254:5: otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication
                    {
                    otherlv_29=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_29, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_6_0());
                    				
                    otherlv_30=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(otherlv_30, grammarAccess.getFogResourceAccess().getColonKeyword_3_6_1());
                    				
                    otherlv_31=(Token)match(input,21,FOLLOW_12); 

                    					newLeafNode(otherlv_31, grammarAccess.getFogResourceAccess().getApplicationKeyword_3_6_2());
                    				

                    					newCompositeNode(grammarAccess.getFogResourceAccess().getApplicationParserRuleCall_3_6_3());
                    				
                    pushFollow(FOLLOW_2);
                    this_Application_32=ruleApplication();

                    state._fsp--;


                    					current = this_Application_32;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 8 :
                    // InternalFogDsl.g:276:4: (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType )
                    {
                    // InternalFogDsl.g:276:4: (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType )
                    // InternalFogDsl.g:277:5: otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType
                    {
                    otherlv_33=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_33, grammarAccess.getFogResourceAccess().getResourceTypeKeyword_3_7_0());
                    				
                    otherlv_34=(Token)match(input,12,FOLLOW_16); 

                    					newLeafNode(otherlv_34, grammarAccess.getFogResourceAccess().getColonKeyword_3_7_1());
                    				
                    otherlv_35=(Token)match(input,22,FOLLOW_7); 

                    					newLeafNode(otherlv_35, grammarAccess.getFogResourceAccess().getAttributeKeyword_3_7_2());
                    				

                    					newCompositeNode(grammarAccess.getFogResourceAccess().getAttributeTypeParserRuleCall_3_7_3());
                    				
                    pushFollow(FOLLOW_2);
                    this_AttributeType_36=ruleAttributeType();

                    state._fsp--;


                    					current = this_AttributeType_36;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFogResource"


    // $ANTLR start "entryRuleVirtualNode"
    // InternalFogDsl.g:303:1: entryRuleVirtualNode returns [EObject current=null] : iv_ruleVirtualNode= ruleVirtualNode EOF ;
    public final EObject entryRuleVirtualNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualNode = null;


        try {
            // InternalFogDsl.g:303:52: (iv_ruleVirtualNode= ruleVirtualNode EOF )
            // InternalFogDsl.g:304:2: iv_ruleVirtualNode= ruleVirtualNode EOF
            {
             newCompositeNode(grammarAccess.getVirtualNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVirtualNode=ruleVirtualNode();

            state._fsp--;

             current =iv_ruleVirtualNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVirtualNode"


    // $ANTLR start "ruleVirtualNode"
    // InternalFogDsl.g:310:1: ruleVirtualNode returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'instanceOf' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'status' otherlv_13= ':' otherlv_14= 'hostedOn' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* ) ;
    public final EObject ruleVirtualNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_tags_8_0 = null;

        EObject lv_attributes_21_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:316:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'instanceOf' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'status' otherlv_13= ':' otherlv_14= 'hostedOn' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* ) )
            // InternalFogDsl.g:317:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'instanceOf' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'status' otherlv_13= ':' otherlv_14= 'hostedOn' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* )
            {
            // InternalFogDsl.g:317:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'instanceOf' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'status' otherlv_13= ':' otherlv_14= 'hostedOn' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* )
            // InternalFogDsl.g:318:3: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'instanceOf' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'status' otherlv_13= ':' otherlv_14= 'hostedOn' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVirtualNodeAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getVirtualNodeAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:326:3: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFogDsl.g:327:4: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getVirtualNodeAccess().getIdKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getVirtualNodeAccess().getColonKeyword_2_1());
                    			
                    // InternalFogDsl.g:335:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFogDsl.g:336:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFogDsl.g:336:5: (lv_name_4_0= RULE_ID )
                    // InternalFogDsl.g:337:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getVirtualNodeAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVirtualNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getVirtualNodeAccess().getTagsKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getVirtualNodeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:362:3: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFogDsl.g:363:4: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getVirtualNodeAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalFogDsl.g:367:4: ( (lv_tags_8_0= ruleTag ) )
            	    // InternalFogDsl.g:368:5: (lv_tags_8_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:368:5: (lv_tags_8_0= ruleTag )
            	    // InternalFogDsl.g:369:6: lv_tags_8_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getVirtualNodeAccess().getTagsTagParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_tags_8_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVirtualNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_8_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getVirtualNodeAccess().getInstanceOfKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getVirtualNodeAccess().getColonKeyword_7());
            		
            // InternalFogDsl.g:395:3: ( (otherlv_11= RULE_ID ) )
            // InternalFogDsl.g:396:4: (otherlv_11= RULE_ID )
            {
            // InternalFogDsl.g:396:4: (otherlv_11= RULE_ID )
            // InternalFogDsl.g:397:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVirtualNodeRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_11, grammarAccess.getVirtualNodeAccess().getIsInstanceOfVirtualNodeSpecificationCrossReference_8_0());
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getVirtualNodeAccess().getStatusKeyword_9());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getVirtualNodeAccess().getColonKeyword_10());
            		
            otherlv_14=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getVirtualNodeAccess().getHostedOnKeyword_11());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getVirtualNodeAccess().getColonKeyword_12());
            		
            // InternalFogDsl.g:424:3: ( (otherlv_16= RULE_ID ) )
            // InternalFogDsl.g:425:4: (otherlv_16= RULE_ID )
            {
            // InternalFogDsl.g:425:4: (otherlv_16= RULE_ID )
            // InternalFogDsl.g:426:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVirtualNodeRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_16, grammarAccess.getVirtualNodeAccess().getHostingNodeNodeCrossReference_13_0());
            				

            }


            }

            otherlv_17=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getVirtualNodeAccess().getHostsKeyword_14());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_18, grammarAccess.getVirtualNodeAccess().getColonKeyword_15());
            		
            // InternalFogDsl.g:445:3: (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFogDsl.g:446:4: otherlv_19= '-' ( (otherlv_20= RULE_ID ) )
            	    {
            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_19, grammarAccess.getVirtualNodeAccess().getHyphenMinusKeyword_16_0());
            	    			
            	    // InternalFogDsl.g:450:4: ( (otherlv_20= RULE_ID ) )
            	    // InternalFogDsl.g:451:5: (otherlv_20= RULE_ID )
            	    {
            	    // InternalFogDsl.g:451:5: (otherlv_20= RULE_ID )
            	    // InternalFogDsl.g:452:6: otherlv_20= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVirtualNodeRule());
            	    						}
            	    					
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_20, grammarAccess.getVirtualNodeAccess().getHostedVirtualNodesVirtualNodeCrossReference_16_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalFogDsl.g:464:3: ( (lv_attributes_21_0= ruleAttributeValueUnit ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFogDsl.g:465:4: (lv_attributes_21_0= ruleAttributeValueUnit )
            	    {
            	    // InternalFogDsl.g:465:4: (lv_attributes_21_0= ruleAttributeValueUnit )
            	    // InternalFogDsl.g:466:5: lv_attributes_21_0= ruleAttributeValueUnit
            	    {

            	    					newCompositeNode(grammarAccess.getVirtualNodeAccess().getAttributesAttributeValueUnitParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_attributes_21_0=ruleAttributeValueUnit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVirtualNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_21_0,
            	    						"fr.imta.semafor.FogDsl.AttributeValueUnit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleVirtualNode"


    // $ANTLR start "entryRulefogSystem"
    // InternalFogDsl.g:487:1: entryRulefogSystem returns [EObject current=null] : iv_rulefogSystem= rulefogSystem EOF ;
    public final EObject entryRulefogSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefogSystem = null;


        try {
            // InternalFogDsl.g:487:50: (iv_rulefogSystem= rulefogSystem EOF )
            // InternalFogDsl.g:488:2: iv_rulefogSystem= rulefogSystem EOF
            {
             newCompositeNode(grammarAccess.getFogSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefogSystem=rulefogSystem();

            state._fsp--;

             current =iv_rulefogSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefogSystem"


    // $ANTLR start "rulefogSystem"
    // InternalFogDsl.g:494:1: rulefogSystem returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulefogSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:500:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalFogDsl.g:501:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalFogDsl.g:501:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            // InternalFogDsl.g:502:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFogSystemAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFogSystemAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:510:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFogDsl.g:511:4: (lv_name_2_0= ruleEString )
            {
            // InternalFogDsl.g:511:4: (lv_name_2_0= ruleEString )
            // InternalFogDsl.g:512:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFogSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFogSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.imta.semafor.FogDsl.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulefogSystem"


    // $ANTLR start "entryRulefogArea"
    // InternalFogDsl.g:533:1: entryRulefogArea returns [EObject current=null] : iv_rulefogArea= rulefogArea EOF ;
    public final EObject entryRulefogArea() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefogArea = null;


        try {
            // InternalFogDsl.g:533:48: (iv_rulefogArea= rulefogArea EOF )
            // InternalFogDsl.g:534:2: iv_rulefogArea= rulefogArea EOF
            {
             newCompositeNode(grammarAccess.getFogAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefogArea=rulefogArea();

            state._fsp--;

             current =iv_rulefogArea; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefogArea"


    // $ANTLR start "rulefogArea"
    // InternalFogDsl.g:540:1: rulefogArea returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'fogSystem' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject rulefogArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:546:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'fogSystem' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalFogDsl.g:547:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'fogSystem' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalFogDsl.g:547:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'fogSystem' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalFogDsl.g:548:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'fogSystem' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFogAreaAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFogAreaAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:556:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFogDsl.g:557:4: (lv_name_2_0= ruleEString )
            {
            // InternalFogDsl.g:557:4: (lv_name_2_0= ruleEString )
            // InternalFogDsl.g:558:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFogAreaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFogAreaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.imta.semafor.FogDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFogAreaAccess().getFogSystemKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getFogAreaAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:583:3: ( (otherlv_5= RULE_ID ) )
            // InternalFogDsl.g:584:4: (otherlv_5= RULE_ID )
            {
            // InternalFogDsl.g:584:4: (otherlv_5= RULE_ID )
            // InternalFogDsl.g:585:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFogAreaRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getFogAreaAccess().getFogsystemFogSystemCrossReference_5_0());
            				

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
    // $ANTLR end "rulefogArea"


    // $ANTLR start "entryRuleAttributeType"
    // InternalFogDsl.g:600:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalFogDsl.g:600:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalFogDsl.g:601:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalFogDsl.g:607:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_valueType_5_0= ruleEString ) ) (otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* )? ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_valueType_5_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:613:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_valueType_5_0= ruleEString ) ) (otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* )? ) )
            // InternalFogDsl.g:614:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_valueType_5_0= ruleEString ) ) (otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* )? )
            {
            // InternalFogDsl.g:614:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_valueType_5_0= ruleEString ) ) (otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* )? )
            // InternalFogDsl.g:615:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_valueType_5_0= ruleEString ) ) (otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:623:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFogDsl.g:624:4: (lv_name_2_0= ruleEString )
            {
            // InternalFogDsl.g:624:4: (lv_name_2_0= ruleEString )
            // InternalFogDsl.g:625:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.imta.semafor.FogDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeTypeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:650:3: ( (lv_valueType_5_0= ruleEString ) )
            // InternalFogDsl.g:651:4: (lv_valueType_5_0= ruleEString )
            {
            // InternalFogDsl.g:651:4: (lv_valueType_5_0= ruleEString )
            // InternalFogDsl.g:652:5: lv_valueType_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getValueTypeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_valueType_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"valueType",
            						lv_valueType_5_0,
            						"fr.imta.semafor.FogDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFogDsl.g:669:3: (otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFogDsl.g:670:4: otherlv_6= 'unitOfMeasurment' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeTypeAccess().getUnitOfMeasurmentKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeTypeAccess().getColonKeyword_6_1());
                    			
                    // InternalFogDsl.g:678:4: (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==26) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFogDsl.g:679:5: otherlv_8= '-' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_18); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAttributeTypeAccess().getHyphenMinusKeyword_6_2_0());
                    	    				
                    	    // InternalFogDsl.g:683:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalFogDsl.g:684:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalFogDsl.g:684:6: (otherlv_9= RULE_ID )
                    	    // InternalFogDsl.g:685:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAttributeTypeRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getAttributeTypeAccess().getUnitofmeasurmentUnitOfMeasurmentCrossReference_6_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePhysicalNode"
    // InternalFogDsl.g:702:1: entryRulePhysicalNode returns [EObject current=null] : iv_rulePhysicalNode= rulePhysicalNode EOF ;
    public final EObject entryRulePhysicalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalNode = null;


        try {
            // InternalFogDsl.g:702:53: (iv_rulePhysicalNode= rulePhysicalNode EOF )
            // InternalFogDsl.g:703:2: iv_rulePhysicalNode= rulePhysicalNode EOF
            {
             newCompositeNode(grammarAccess.getPhysicalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicalNode=rulePhysicalNode();

            state._fsp--;

             current =iv_rulePhysicalNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhysicalNode"


    // $ANTLR start "rulePhysicalNode"
    // InternalFogDsl.g:709:1: rulePhysicalNode returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'fogArea' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'tags' otherlv_9= ':' (otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) ) )* otherlv_12= 'instanceOf' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'status' otherlv_16= ':' otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* ) ;
    public final EObject rulePhysicalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_tags_11_0 = null;

        EObject lv_attributes_21_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:715:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'fogArea' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'tags' otherlv_9= ':' (otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) ) )* otherlv_12= 'instanceOf' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'status' otherlv_16= ':' otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* ) )
            // InternalFogDsl.g:716:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'fogArea' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'tags' otherlv_9= ':' (otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) ) )* otherlv_12= 'instanceOf' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'status' otherlv_16= ':' otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* )
            {
            // InternalFogDsl.g:716:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'fogArea' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'tags' otherlv_9= ':' (otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) ) )* otherlv_12= 'instanceOf' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'status' otherlv_16= ':' otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )* )
            // InternalFogDsl.g:717:3: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'fogArea' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'tags' otherlv_9= ':' (otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) ) )* otherlv_12= 'instanceOf' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'status' otherlv_16= ':' otherlv_17= 'hosts' otherlv_18= ':' (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )* ( (lv_attributes_21_0= ruleAttributeValueUnit ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicalNodeAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPhysicalNodeAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:725:3: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFogDsl.g:726:4: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhysicalNodeAccess().getIdKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getPhysicalNodeAccess().getColonKeyword_2_1());
                    			
                    // InternalFogDsl.g:734:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFogDsl.g:735:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFogDsl.g:735:5: (lv_name_4_0= RULE_ID )
                    // InternalFogDsl.g:736:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getPhysicalNodeAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPhysicalNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPhysicalNodeAccess().getFogAreaKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getPhysicalNodeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:761:3: ( (otherlv_7= RULE_ID ) )
            // InternalFogDsl.g:762:4: (otherlv_7= RULE_ID )
            {
            // InternalFogDsl.g:762:4: (otherlv_7= RULE_ID )
            // InternalFogDsl.g:763:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicalNodeRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_7, grammarAccess.getPhysicalNodeAccess().getFogareaFogAreaCrossReference_5_0());
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getPhysicalNodeAccess().getTagsKeyword_6());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getPhysicalNodeAccess().getColonKeyword_7());
            		
            // InternalFogDsl.g:782:3: (otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFogDsl.g:783:4: otherlv_10= '-' ( (lv_tags_11_0= ruleTag ) )
            	    {
            	    otherlv_10=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_10, grammarAccess.getPhysicalNodeAccess().getHyphenMinusKeyword_8_0());
            	    			
            	    // InternalFogDsl.g:787:4: ( (lv_tags_11_0= ruleTag ) )
            	    // InternalFogDsl.g:788:5: (lv_tags_11_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:788:5: (lv_tags_11_0= ruleTag )
            	    // InternalFogDsl.g:789:6: lv_tags_11_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getPhysicalNodeAccess().getTagsTagParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_tags_11_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhysicalNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_11_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicalNodeAccess().getInstanceOfKeyword_9());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getPhysicalNodeAccess().getColonKeyword_10());
            		
            // InternalFogDsl.g:815:3: ( (otherlv_14= RULE_ID ) )
            // InternalFogDsl.g:816:4: (otherlv_14= RULE_ID )
            {
            // InternalFogDsl.g:816:4: (otherlv_14= RULE_ID )
            // InternalFogDsl.g:817:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicalNodeRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_14, grammarAccess.getPhysicalNodeAccess().getIsInstanceOfPhysicalNodeSpecificationCrossReference_11_0());
            				

            }


            }

            otherlv_15=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getPhysicalNodeAccess().getStatusKeyword_12());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_16, grammarAccess.getPhysicalNodeAccess().getColonKeyword_13());
            		
            otherlv_17=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getPhysicalNodeAccess().getHostsKeyword_14());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_18, grammarAccess.getPhysicalNodeAccess().getColonKeyword_15());
            		
            // InternalFogDsl.g:844:3: (otherlv_19= '-' ( (otherlv_20= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFogDsl.g:845:4: otherlv_19= '-' ( (otherlv_20= RULE_ID ) )
            	    {
            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_19, grammarAccess.getPhysicalNodeAccess().getHyphenMinusKeyword_16_0());
            	    			
            	    // InternalFogDsl.g:849:4: ( (otherlv_20= RULE_ID ) )
            	    // InternalFogDsl.g:850:5: (otherlv_20= RULE_ID )
            	    {
            	    // InternalFogDsl.g:850:5: (otherlv_20= RULE_ID )
            	    // InternalFogDsl.g:851:6: otherlv_20= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPhysicalNodeRule());
            	    						}
            	    					
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_20, grammarAccess.getPhysicalNodeAccess().getHostedVirtualNodesVirtualNodeCrossReference_16_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalFogDsl.g:863:3: ( (lv_attributes_21_0= ruleAttributeValueUnit ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFogDsl.g:864:4: (lv_attributes_21_0= ruleAttributeValueUnit )
            	    {
            	    // InternalFogDsl.g:864:4: (lv_attributes_21_0= ruleAttributeValueUnit )
            	    // InternalFogDsl.g:865:5: lv_attributes_21_0= ruleAttributeValueUnit
            	    {

            	    					newCompositeNode(grammarAccess.getPhysicalNodeAccess().getAttributesAttributeValueUnitParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_attributes_21_0=ruleAttributeValueUnit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhysicalNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_21_0,
            	    						"fr.imta.semafor.FogDsl.AttributeValueUnit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "rulePhysicalNode"


    // $ANTLR start "entryRuleAttributeValueUnit"
    // InternalFogDsl.g:886:1: entryRuleAttributeValueUnit returns [EObject current=null] : iv_ruleAttributeValueUnit= ruleAttributeValueUnit EOF ;
    public final EObject entryRuleAttributeValueUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueUnit = null;


        try {
            // InternalFogDsl.g:886:59: (iv_ruleAttributeValueUnit= ruleAttributeValueUnit EOF )
            // InternalFogDsl.g:887:2: iv_ruleAttributeValueUnit= ruleAttributeValueUnit EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValueUnit=ruleAttributeValueUnit();

            state._fsp--;

             current =iv_ruleAttributeValueUnit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeValueUnit"


    // $ANTLR start "ruleAttributeValueUnit"
    // InternalFogDsl.g:893:1: ruleAttributeValueUnit returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAttributeValueUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:899:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalFogDsl.g:900:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalFogDsl.g:900:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalFogDsl.g:901:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalFogDsl.g:901:3: ( (otherlv_0= RULE_ID ) )
            // InternalFogDsl.g:902:4: (otherlv_0= RULE_ID )
            {
            // InternalFogDsl.g:902:4: (otherlv_0= RULE_ID )
            // InternalFogDsl.g:903:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeValueUnitRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeValueUnitAccess().getInstanceOfAttributeTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueUnitAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:918:3: ( (lv_value_2_0= ruleValue ) )
            // InternalFogDsl.g:919:4: (lv_value_2_0= ruleValue )
            {
            // InternalFogDsl.g:919:4: (lv_value_2_0= ruleValue )
            // InternalFogDsl.g:920:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAttributeValueUnitAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueUnitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"fr.imta.semafor.FogDsl.Value");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAttributeValueUnit"


    // $ANTLR start "entryRuleApplication"
    // InternalFogDsl.g:941:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalFogDsl.g:941:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalFogDsl.g:942:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalFogDsl.g:948:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'services' otherlv_12= ':' (otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )? )* otherlv_17= 'connectors' otherlv_18= ':' (otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) ) )* ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_tags_8_0 = null;

        EObject lv_serviceTypes_16_0 = null;

        EObject lv_connectortypes_20_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:954:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'services' otherlv_12= ':' (otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )? )* otherlv_17= 'connectors' otherlv_18= ':' (otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) ) )* ) )
            // InternalFogDsl.g:955:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'services' otherlv_12= ':' (otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )? )* otherlv_17= 'connectors' otherlv_18= ':' (otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) ) )* )
            {
            // InternalFogDsl.g:955:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'services' otherlv_12= ':' (otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )? )* otherlv_17= 'connectors' otherlv_18= ':' (otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) ) )* )
            // InternalFogDsl.g:956:3: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'services' otherlv_12= ':' (otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )? )* otherlv_17= 'connectors' otherlv_18= ':' (otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:964:3: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFogDsl.g:965:4: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getIdKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getColonKeyword_2_1());
                    			
                    // InternalFogDsl.g:973:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFogDsl.g:974:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFogDsl.g:974:5: (lv_name_4_0= RULE_ID )
                    // InternalFogDsl.g:975:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getTagsKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:1000:3: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFogDsl.g:1001:4: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalFogDsl.g:1005:4: ( (lv_tags_8_0= ruleTag ) )
            	    // InternalFogDsl.g:1006:5: (lv_tags_8_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:1006:5: (lv_tags_8_0= ruleTag )
            	    // InternalFogDsl.g:1007:6: lv_tags_8_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationAccess().getTagsTagParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_tags_8_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_8_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getApplicationAccess().getSpecKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getColonKeyword_7());
            		
            otherlv_11=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getApplicationAccess().getServicesKeyword_8());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getColonKeyword_9());
            		
            // InternalFogDsl.g:1041:3: (otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFogDsl.g:1042:4: otherlv_13= '-' ruleEString otherlv_15= ':' ( (lv_serviceTypes_16_0= ruleSerivceType ) )?
            	    {
            	    otherlv_13=(Token)match(input,26,FOLLOW_26); 

            	    				newLeafNode(otherlv_13, grammarAccess.getApplicationAccess().getHyphenMinusKeyword_10_0());
            	    			

            	    				newCompositeNode(grammarAccess.getApplicationAccess().getEStringParserRuleCall_10_1());
            	    			
            	    pushFollow(FOLLOW_3);
            	    ruleEString();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_15=(Token)match(input,12,FOLLOW_37); 

            	    				newLeafNode(otherlv_15, grammarAccess.getApplicationAccess().getColonKeyword_10_2());
            	    			
            	    // InternalFogDsl.g:1057:4: ( (lv_serviceTypes_16_0= ruleSerivceType ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==23) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalFogDsl.g:1058:5: (lv_serviceTypes_16_0= ruleSerivceType )
            	            {
            	            // InternalFogDsl.g:1058:5: (lv_serviceTypes_16_0= ruleSerivceType )
            	            // InternalFogDsl.g:1059:6: lv_serviceTypes_16_0= ruleSerivceType
            	            {

            	            						newCompositeNode(grammarAccess.getApplicationAccess().getServiceTypesSerivceTypeParserRuleCall_10_3_0());
            	            					
            	            pushFollow(FOLLOW_36);
            	            lv_serviceTypes_16_0=ruleSerivceType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getApplicationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"serviceTypes",
            	            							lv_serviceTypes_16_0,
            	            							"fr.imta.semafor.FogDsl.SerivceType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_17=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getApplicationAccess().getConnectorsKeyword_11());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getColonKeyword_12());
            		
            // InternalFogDsl.g:1085:3: (otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFogDsl.g:1086:4: otherlv_19= '-' ( (lv_connectortypes_20_0= ruleConnectorType ) )
            	    {
            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_19, grammarAccess.getApplicationAccess().getHyphenMinusKeyword_13_0());
            	    			
            	    // InternalFogDsl.g:1090:4: ( (lv_connectortypes_20_0= ruleConnectorType ) )
            	    // InternalFogDsl.g:1091:5: (lv_connectortypes_20_0= ruleConnectorType )
            	    {
            	    // InternalFogDsl.g:1091:5: (lv_connectortypes_20_0= ruleConnectorType )
            	    // InternalFogDsl.g:1092:6: lv_connectortypes_20_0= ruleConnectorType
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationAccess().getConnectortypesConnectorTypeParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_connectortypes_20_0=ruleConnectorType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectortypes",
            	    							lv_connectortypes_20_0,
            	    							"fr.imta.semafor.FogDsl.ConnectorType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleConnectorType"
    // InternalFogDsl.g:1114:1: entryRuleConnectorType returns [EObject current=null] : iv_ruleConnectorType= ruleConnectorType EOF ;
    public final EObject entryRuleConnectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorType = null;


        try {
            // InternalFogDsl.g:1114:54: (iv_ruleConnectorType= ruleConnectorType EOF )
            // InternalFogDsl.g:1115:2: iv_ruleConnectorType= ruleConnectorType EOF
            {
             newCompositeNode(grammarAccess.getConnectorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorType=ruleConnectorType();

            state._fsp--;

             current =iv_ruleConnectorType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectorType"


    // $ANTLR start "ruleConnectorType"
    // InternalFogDsl.g:1121:1: ruleConnectorType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'sourceServices' otherlv_3= ':' (otherlv_4= '-' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'targetServices' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'constraints' otherlv_11= ':' (otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) ) )* ) ;
    public final EObject ruleConnectorType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1127:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'sourceServices' otherlv_3= ':' (otherlv_4= '-' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'targetServices' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'constraints' otherlv_11= ':' (otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) ) )* ) )
            // InternalFogDsl.g:1128:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'sourceServices' otherlv_3= ':' (otherlv_4= '-' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'targetServices' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'constraints' otherlv_11= ':' (otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) ) )* )
            {
            // InternalFogDsl.g:1128:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'sourceServices' otherlv_3= ':' (otherlv_4= '-' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'targetServices' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'constraints' otherlv_11= ':' (otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) ) )* )
            // InternalFogDsl.g:1129:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'sourceServices' otherlv_3= ':' (otherlv_4= '-' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'targetServices' otherlv_7= ':' (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'constraints' otherlv_11= ':' (otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) ) )*
            {
            // InternalFogDsl.g:1129:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFogDsl.g:1130:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFogDsl.g:1130:4: (lv_name_0_0= RULE_ID )
            // InternalFogDsl.g:1131:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConnectorTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorTypeAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorTypeAccess().getSourceServicesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorTypeAccess().getColonKeyword_3());
            		
            // InternalFogDsl.g:1159:3: (otherlv_4= '-' ( (otherlv_5= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFogDsl.g:1160:4: otherlv_4= '-' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConnectorTypeAccess().getHyphenMinusKeyword_4_0());
            	    			
            	    // InternalFogDsl.g:1164:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalFogDsl.g:1165:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalFogDsl.g:1165:5: (otherlv_5= RULE_ID )
            	    // InternalFogDsl.g:1166:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConnectorTypeRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_39); 

            	    						newLeafNode(otherlv_5, grammarAccess.getConnectorTypeAccess().getSourceServicesServiceTypeCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getConnectorTypeAccess().getTargetServicesKeyword_5());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorTypeAccess().getColonKeyword_6());
            		
            // InternalFogDsl.g:1186:3: (otherlv_8= '-' ( (otherlv_9= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFogDsl.g:1187:4: otherlv_8= '-' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_8, grammarAccess.getConnectorTypeAccess().getHyphenMinusKeyword_7_0());
            	    			
            	    // InternalFogDsl.g:1191:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalFogDsl.g:1192:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalFogDsl.g:1192:5: (otherlv_9= RULE_ID )
            	    // InternalFogDsl.g:1193:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConnectorTypeRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    						newLeafNode(otherlv_9, grammarAccess.getConnectorTypeAccess().getTargetServicesServiceTypeCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getConnectorTypeAccess().getConstraintsKeyword_8());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectorTypeAccess().getColonKeyword_9());
            		
            // InternalFogDsl.g:1213:3: (otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_STRING) ) {
                        alt21=1;
                    }
                    else if ( (LA21_2==RULE_ID) ) {
                        int LA21_4 = input.LA(3);

                        if ( (LA21_4==12) ) {
                            int LA21_5 = input.LA(4);

                            if ( ((LA21_5>=RULE_ID && LA21_5<=RULE_INT)||(LA21_5>=82 && LA21_5<=86)) ) {
                                alt21=1;
                            }


                        }


                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalFogDsl.g:1214:4: otherlv_12= '-' ( (lv_constraints_13_0= ruleConstraint ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_26); 

            	    				newLeafNode(otherlv_12, grammarAccess.getConnectorTypeAccess().getHyphenMinusKeyword_10_0());
            	    			
            	    // InternalFogDsl.g:1218:4: ( (lv_constraints_13_0= ruleConstraint ) )
            	    // InternalFogDsl.g:1219:5: (lv_constraints_13_0= ruleConstraint )
            	    {
            	    // InternalFogDsl.g:1219:5: (lv_constraints_13_0= ruleConstraint )
            	    // InternalFogDsl.g:1220:6: lv_constraints_13_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getConnectorTypeAccess().getConstraintsConstraintParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_constraints_13_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConnectorTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_13_0,
            	    							"fr.imta.semafor.FogDsl.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleConnectorType"


    // $ANTLR start "entryRuleSerivceType"
    // InternalFogDsl.g:1242:1: entryRuleSerivceType returns [EObject current=null] : iv_ruleSerivceType= ruleSerivceType EOF ;
    public final EObject entryRuleSerivceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerivceType = null;


        try {
            // InternalFogDsl.g:1242:52: (iv_ruleSerivceType= ruleSerivceType EOF )
            // InternalFogDsl.g:1243:2: iv_ruleSerivceType= ruleSerivceType EOF
            {
             newCompositeNode(grammarAccess.getSerivceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSerivceType=ruleSerivceType();

            state._fsp--;

             current =iv_ruleSerivceType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSerivceType"


    // $ANTLR start "ruleSerivceType"
    // InternalFogDsl.g:1249:1: ruleSerivceType returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' ( ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* ) | (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* ) ) otherlv_18= 'hostedOn' otherlv_19= ':' (otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )* )? (otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )* )? (otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) ) )* ) ;
    public final EObject ruleSerivceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        EObject lv_tags_8_0 = null;

        EObject lv_constraints_11_0 = null;

        EObject lv_networkPorts_13_0 = null;

        EObject lv_networkPorts_17_0 = null;

        EObject lv_implementedBy_29_0 = null;

        EObject lv_implementedBy_31_0 = null;

        EObject lv_constraints_34_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1255:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' ( ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* ) | (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* ) ) otherlv_18= 'hostedOn' otherlv_19= ':' (otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )* )? (otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )* )? (otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) ) )* ) )
            // InternalFogDsl.g:1256:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' ( ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* ) | (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* ) ) otherlv_18= 'hostedOn' otherlv_19= ':' (otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )* )? (otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )* )? (otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) ) )* )
            {
            // InternalFogDsl.g:1256:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' ( ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* ) | (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* ) ) otherlv_18= 'hostedOn' otherlv_19= ':' (otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )* )? (otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )* )? (otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) ) )* )
            // InternalFogDsl.g:1257:3: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' ( ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* ) | (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* ) ) otherlv_18= 'hostedOn' otherlv_19= ':' (otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )* )? (otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )* )? (otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSerivceTypeAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSerivceTypeAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:1265:3: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFogDsl.g:1266:4: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSerivceTypeAccess().getIdKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getSerivceTypeAccess().getColonKeyword_2_1());
                    			
                    // InternalFogDsl.g:1274:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFogDsl.g:1275:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFogDsl.g:1275:5: (lv_name_4_0= RULE_ID )
                    // InternalFogDsl.g:1276:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getSerivceTypeAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSerivceTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSerivceTypeAccess().getTagsKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getSerivceTypeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:1301:3: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFogDsl.g:1302:4: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalFogDsl.g:1306:4: ( (lv_tags_8_0= ruleTag ) )
            	    // InternalFogDsl.g:1307:5: (lv_tags_8_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:1307:5: (lv_tags_8_0= ruleTag )
            	    // InternalFogDsl.g:1308:6: lv_tags_8_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getSerivceTypeAccess().getTagsTagParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_tags_8_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_8_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSerivceTypeAccess().getSpecKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_10, grammarAccess.getSerivceTypeAccess().getColonKeyword_7());
            		
            // InternalFogDsl.g:1334:3: ( ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* ) | (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            else if ( (LA26_0==42) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFogDsl.g:1335:4: ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* )
                    {
                    // InternalFogDsl.g:1335:4: ( ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )* )
                    // InternalFogDsl.g:1336:5: ( (lv_constraints_11_0= rulePortsConstraint ) ) (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )*
                    {
                    // InternalFogDsl.g:1336:5: ( (lv_constraints_11_0= rulePortsConstraint ) )
                    // InternalFogDsl.g:1337:6: (lv_constraints_11_0= rulePortsConstraint )
                    {
                    // InternalFogDsl.g:1337:6: (lv_constraints_11_0= rulePortsConstraint )
                    // InternalFogDsl.g:1338:7: lv_constraints_11_0= rulePortsConstraint
                    {

                    							newCompositeNode(grammarAccess.getSerivceTypeAccess().getConstraintsPortsConstraintParserRuleCall_8_0_0_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_constraints_11_0=rulePortsConstraint();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
                    							}
                    							add(
                    								current,
                    								"constraints",
                    								lv_constraints_11_0,
                    								"fr.imta.semafor.FogDsl.PortsConstraint");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalFogDsl.g:1355:5: (otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==26) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalFogDsl.g:1356:6: otherlv_12= '-' ( (lv_networkPorts_13_0= ruleNetworkPort ) )
                    	    {
                    	    otherlv_12=(Token)match(input,26,FOLLOW_43); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_8_0_1_0());
                    	    					
                    	    // InternalFogDsl.g:1360:6: ( (lv_networkPorts_13_0= ruleNetworkPort ) )
                    	    // InternalFogDsl.g:1361:7: (lv_networkPorts_13_0= ruleNetworkPort )
                    	    {
                    	    // InternalFogDsl.g:1361:7: (lv_networkPorts_13_0= ruleNetworkPort )
                    	    // InternalFogDsl.g:1362:8: lv_networkPorts_13_0= ruleNetworkPort
                    	    {

                    	    								newCompositeNode(grammarAccess.getSerivceTypeAccess().getNetworkPortsNetworkPortParserRuleCall_8_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_42);
                    	    lv_networkPorts_13_0=ruleNetworkPort();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"networkPorts",
                    	    									lv_networkPorts_13_0,
                    	    									"fr.imta.semafor.FogDsl.NetworkPort");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:1382:4: (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* )
                    {
                    // InternalFogDsl.g:1382:4: (otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )* )
                    // InternalFogDsl.g:1383:5: otherlv_14= 'networkPorts' otherlv_15= ':' (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )*
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_3); 

                    					newLeafNode(otherlv_14, grammarAccess.getSerivceTypeAccess().getNetworkPortsKeyword_8_1_0());
                    				
                    otherlv_15=(Token)match(input,12,FOLLOW_42); 

                    					newLeafNode(otherlv_15, grammarAccess.getSerivceTypeAccess().getColonKeyword_8_1_1());
                    				
                    // InternalFogDsl.g:1391:5: (otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==26) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalFogDsl.g:1392:6: otherlv_16= '-' ( (lv_networkPorts_17_0= ruleNetworkPort ) )
                    	    {
                    	    otherlv_16=(Token)match(input,26,FOLLOW_43); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_8_1_2_0());
                    	    					
                    	    // InternalFogDsl.g:1396:6: ( (lv_networkPorts_17_0= ruleNetworkPort ) )
                    	    // InternalFogDsl.g:1397:7: (lv_networkPorts_17_0= ruleNetworkPort )
                    	    {
                    	    // InternalFogDsl.g:1397:7: (lv_networkPorts_17_0= ruleNetworkPort )
                    	    // InternalFogDsl.g:1398:8: lv_networkPorts_17_0= ruleNetworkPort
                    	    {

                    	    								newCompositeNode(grammarAccess.getSerivceTypeAccess().getNetworkPortsNetworkPortParserRuleCall_8_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_42);
                    	    lv_networkPorts_17_0=ruleNetworkPort();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"networkPorts",
                    	    									lv_networkPorts_17_0,
                    	    									"fr.imta.semafor.FogDsl.NetworkPort");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getSerivceTypeAccess().getHostedOnKeyword_9());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_19, grammarAccess.getSerivceTypeAccess().getColonKeyword_10());
            		
            // InternalFogDsl.g:1426:3: (otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFogDsl.g:1427:4: otherlv_20= 'virtualNodes' otherlv_21= ':' (otherlv_22= '-' ruleEString ) (otherlv_24= '-' ruleEString )*
                    {
                    otherlv_20=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getSerivceTypeAccess().getVirtualNodesKeyword_11_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_21, grammarAccess.getSerivceTypeAccess().getColonKeyword_11_1());
                    			
                    // InternalFogDsl.g:1435:4: (otherlv_22= '-' ruleEString )
                    // InternalFogDsl.g:1436:5: otherlv_22= '-' ruleEString
                    {
                    otherlv_22=(Token)match(input,26,FOLLOW_26); 

                    					newLeafNode(otherlv_22, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_11_2_0());
                    				

                    					newCompositeNode(grammarAccess.getSerivceTypeAccess().getEStringParserRuleCall_11_2_1());
                    				
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }

                    // InternalFogDsl.g:1448:4: (otherlv_24= '-' ruleEString )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==26) ) {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==RULE_STRING) ) {
                                int LA27_3 = input.LA(3);

                                if ( (LA27_3==EOF||LA27_3==26||LA27_3==38||LA27_3==41||LA27_3==44) ) {
                                    alt27=1;
                                }


                            }
                            else if ( (LA27_2==RULE_ID) ) {
                                int LA27_4 = input.LA(3);

                                if ( (LA27_4==EOF||LA27_4==26||LA27_4==38||LA27_4==41||LA27_4==44) ) {
                                    alt27=1;
                                }


                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalFogDsl.g:1449:5: otherlv_24= '-' ruleEString
                    	    {
                    	    otherlv_24=(Token)match(input,26,FOLLOW_26); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_11_3_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getSerivceTypeAccess().getEStringParserRuleCall_11_3_1());
                    	    				
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFogDsl.g:1462:3: (otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFogDsl.g:1463:4: otherlv_26= 'softwarePacakge' otherlv_27= ':' otherlv_28= '-' ( (lv_implementedBy_29_0= ruleSoftwarePackage ) ) (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )*
                    {
                    otherlv_26=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getSerivceTypeAccess().getSoftwarePacakgeKeyword_12_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_27, grammarAccess.getSerivceTypeAccess().getColonKeyword_12_1());
                    			
                    otherlv_28=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_28, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_12_2());
                    			
                    // InternalFogDsl.g:1475:4: ( (lv_implementedBy_29_0= ruleSoftwarePackage ) )
                    // InternalFogDsl.g:1476:5: (lv_implementedBy_29_0= ruleSoftwarePackage )
                    {
                    // InternalFogDsl.g:1476:5: (lv_implementedBy_29_0= ruleSoftwarePackage )
                    // InternalFogDsl.g:1477:6: lv_implementedBy_29_0= ruleSoftwarePackage
                    {

                    						newCompositeNode(grammarAccess.getSerivceTypeAccess().getImplementedBySoftwarePackageParserRuleCall_12_3_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_implementedBy_29_0=ruleSoftwarePackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
                    						}
                    						add(
                    							current,
                    							"implementedBy",
                    							lv_implementedBy_29_0,
                    							"fr.imta.semafor.FogDsl.SoftwarePackage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFogDsl.g:1494:4: (otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==26) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==RULE_ID) ) {
                                int LA29_3 = input.LA(3);

                                if ( (LA29_3==12) ) {
                                    int LA29_4 = input.LA(4);

                                    if ( (LA29_4==45) ) {
                                        alt29=1;
                                    }


                                }


                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalFogDsl.g:1495:5: otherlv_30= '-' ( (lv_implementedBy_31_0= ruleSoftwarePackage ) )
                    	    {
                    	    otherlv_30=(Token)match(input,26,FOLLOW_18); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getSerivceTypeAccess().getHyphenMinusKeyword_12_4_0());
                    	    				
                    	    // InternalFogDsl.g:1499:5: ( (lv_implementedBy_31_0= ruleSoftwarePackage ) )
                    	    // InternalFogDsl.g:1500:6: (lv_implementedBy_31_0= ruleSoftwarePackage )
                    	    {
                    	    // InternalFogDsl.g:1500:6: (lv_implementedBy_31_0= ruleSoftwarePackage )
                    	    // InternalFogDsl.g:1501:7: lv_implementedBy_31_0= ruleSoftwarePackage
                    	    {

                    	    							newCompositeNode(grammarAccess.getSerivceTypeAccess().getImplementedBySoftwarePackageParserRuleCall_12_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_implementedBy_31_0=ruleSoftwarePackage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"implementedBy",
                    	    								lv_implementedBy_31_0,
                    	    								"fr.imta.semafor.FogDsl.SoftwarePackage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFogDsl.g:1520:3: (otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFogDsl.g:1521:4: otherlv_32= 'constraints' otherlv_33= ':' ( (lv_constraints_34_0= ruleConstraint ) )
            	    {
            	    otherlv_32=(Token)match(input,41,FOLLOW_3); 

            	    				newLeafNode(otherlv_32, grammarAccess.getSerivceTypeAccess().getConstraintsKeyword_13_0());
            	    			
            	    otherlv_33=(Token)match(input,12,FOLLOW_26); 

            	    				newLeafNode(otherlv_33, grammarAccess.getSerivceTypeAccess().getColonKeyword_13_1());
            	    			
            	    // InternalFogDsl.g:1529:4: ( (lv_constraints_34_0= ruleConstraint ) )
            	    // InternalFogDsl.g:1530:5: (lv_constraints_34_0= ruleConstraint )
            	    {
            	    // InternalFogDsl.g:1530:5: (lv_constraints_34_0= ruleConstraint )
            	    // InternalFogDsl.g:1531:6: lv_constraints_34_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getSerivceTypeAccess().getConstraintsConstraintParserRuleCall_13_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_constraints_34_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSerivceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_34_0,
            	    							"fr.imta.semafor.FogDsl.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleSerivceType"


    // $ANTLR start "entryRuleSoftwarePackage"
    // InternalFogDsl.g:1553:1: entryRuleSoftwarePackage returns [EObject current=null] : iv_ruleSoftwarePackage= ruleSoftwarePackage EOF ;
    public final EObject entryRuleSoftwarePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwarePackage = null;


        try {
            // InternalFogDsl.g:1553:56: (iv_ruleSoftwarePackage= ruleSoftwarePackage EOF )
            // InternalFogDsl.g:1554:2: iv_ruleSoftwarePackage= ruleSoftwarePackage EOF
            {
             newCompositeNode(grammarAccess.getSoftwarePackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoftwarePackage=ruleSoftwarePackage();

            state._fsp--;

             current =iv_ruleSoftwarePackage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSoftwarePackage"


    // $ANTLR start "ruleSoftwarePackage"
    // InternalFogDsl.g:1560:1: ruleSoftwarePackage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'command' otherlv_3= ':' ( (lv_installStartScript_4_0= ruleEString ) ) otherlv_5= 'constraints' otherlv_6= ':' (otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) ) )* ) ;
    public final EObject ruleSoftwarePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_installStartScript_4_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1566:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'command' otherlv_3= ':' ( (lv_installStartScript_4_0= ruleEString ) ) otherlv_5= 'constraints' otherlv_6= ':' (otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) ) )* ) )
            // InternalFogDsl.g:1567:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'command' otherlv_3= ':' ( (lv_installStartScript_4_0= ruleEString ) ) otherlv_5= 'constraints' otherlv_6= ':' (otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) ) )* )
            {
            // InternalFogDsl.g:1567:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'command' otherlv_3= ':' ( (lv_installStartScript_4_0= ruleEString ) ) otherlv_5= 'constraints' otherlv_6= ':' (otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) ) )* )
            // InternalFogDsl.g:1568:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'command' otherlv_3= ':' ( (lv_installStartScript_4_0= ruleEString ) ) otherlv_5= 'constraints' otherlv_6= ':' (otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) ) )*
            {
            // InternalFogDsl.g:1568:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFogDsl.g:1569:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFogDsl.g:1569:4: (lv_name_0_0= RULE_ID )
            // InternalFogDsl.g:1570:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSoftwarePackageAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoftwarePackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getSoftwarePackageAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSoftwarePackageAccess().getCommandKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getSoftwarePackageAccess().getColonKeyword_3());
            		
            // InternalFogDsl.g:1598:3: ( (lv_installStartScript_4_0= ruleEString ) )
            // InternalFogDsl.g:1599:4: (lv_installStartScript_4_0= ruleEString )
            {
            // InternalFogDsl.g:1599:4: (lv_installStartScript_4_0= ruleEString )
            // InternalFogDsl.g:1600:5: lv_installStartScript_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSoftwarePackageAccess().getInstallStartScriptEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
            lv_installStartScript_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoftwarePackageRule());
            					}
            					set(
            						current,
            						"installStartScript",
            						lv_installStartScript_4_0,
            						"fr.imta.semafor.FogDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSoftwarePackageAccess().getConstraintsKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getSoftwarePackageAccess().getColonKeyword_6());
            		
            // InternalFogDsl.g:1625:3: (otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==69) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalFogDsl.g:1626:4: otherlv_7= '-' ( (lv_constraints_8_0= ruleReplicasConstraint ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_51); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSoftwarePackageAccess().getHyphenMinusKeyword_7_0());
            	    			
            	    // InternalFogDsl.g:1630:4: ( (lv_constraints_8_0= ruleReplicasConstraint ) )
            	    // InternalFogDsl.g:1631:5: (lv_constraints_8_0= ruleReplicasConstraint )
            	    {
            	    // InternalFogDsl.g:1631:5: (lv_constraints_8_0= ruleReplicasConstraint )
            	    // InternalFogDsl.g:1632:6: lv_constraints_8_0= ruleReplicasConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getSoftwarePackageAccess().getConstraintsReplicasConstraintParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_constraints_8_0=ruleReplicasConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoftwarePackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_8_0,
            	    							"fr.imta.semafor.FogDsl.ReplicasConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleSoftwarePackage"


    // $ANTLR start "entryRulePortsConstraint"
    // InternalFogDsl.g:1654:1: entryRulePortsConstraint returns [EObject current=null] : iv_rulePortsConstraint= rulePortsConstraint EOF ;
    public final EObject entryRulePortsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortsConstraint = null;


        try {
            // InternalFogDsl.g:1654:56: (iv_rulePortsConstraint= rulePortsConstraint EOF )
            // InternalFogDsl.g:1655:2: iv_rulePortsConstraint= rulePortsConstraint EOF
            {
             newCompositeNode(grammarAccess.getPortsConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortsConstraint=rulePortsConstraint();

            state._fsp--;

             current =iv_rulePortsConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortsConstraint"


    // $ANTLR start "rulePortsConstraint"
    // InternalFogDsl.g:1661:1: rulePortsConstraint returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleportsExpression ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleMultiplicityExpression ) ) otherlv_4= ':' ) ;
    public final EObject rulePortsConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1667:2: ( ( () ( (lv_expression_1_0= ruleportsExpression ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleMultiplicityExpression ) ) otherlv_4= ':' ) )
            // InternalFogDsl.g:1668:2: ( () ( (lv_expression_1_0= ruleportsExpression ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleMultiplicityExpression ) ) otherlv_4= ':' )
            {
            // InternalFogDsl.g:1668:2: ( () ( (lv_expression_1_0= ruleportsExpression ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleMultiplicityExpression ) ) otherlv_4= ':' )
            // InternalFogDsl.g:1669:3: () ( (lv_expression_1_0= ruleportsExpression ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleMultiplicityExpression ) ) otherlv_4= ':'
            {
            // InternalFogDsl.g:1669:3: ()
            // InternalFogDsl.g:1670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortsConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalFogDsl.g:1676:3: ( (lv_expression_1_0= ruleportsExpression ) )
            // InternalFogDsl.g:1677:4: (lv_expression_1_0= ruleportsExpression )
            {
            // InternalFogDsl.g:1677:4: (lv_expression_1_0= ruleportsExpression )
            // InternalFogDsl.g:1678:5: lv_expression_1_0= ruleportsExpression
            {

            					newCompositeNode(grammarAccess.getPortsConstraintAccess().getExpressionPortsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_1_0=ruleportsExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortsConstraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"fr.imta.semafor.FogDsl.portsExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getPortsConstraintAccess().getColonKeyword_2());
            		
            // InternalFogDsl.g:1699:3: ( (lv_expression_3_0= ruleMultiplicityExpression ) )
            // InternalFogDsl.g:1700:4: (lv_expression_3_0= ruleMultiplicityExpression )
            {
            // InternalFogDsl.g:1700:4: (lv_expression_3_0= ruleMultiplicityExpression )
            // InternalFogDsl.g:1701:5: lv_expression_3_0= ruleMultiplicityExpression
            {

            					newCompositeNode(grammarAccess.getPortsConstraintAccess().getExpressionMultiplicityExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_3_0=ruleMultiplicityExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortsConstraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"fr.imta.semafor.FogDsl.MultiplicityExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortsConstraintAccess().getColonKeyword_4());
            		

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
    // $ANTLR end "rulePortsConstraint"


    // $ANTLR start "entryRuleMultiplicityExpression"
    // InternalFogDsl.g:1726:1: entryRuleMultiplicityExpression returns [EObject current=null] : iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF ;
    public final EObject entryRuleMultiplicityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityExpression = null;


        try {
            // InternalFogDsl.g:1726:63: (iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF )
            // InternalFogDsl.g:1727:2: iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityExpression=ruleMultiplicityExpression();

            state._fsp--;

             current =iv_ruleMultiplicityExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicityExpression"


    // $ANTLR start "ruleMultiplicityExpression"
    // InternalFogDsl.g:1733:1: ruleMultiplicityExpression returns [EObject current=null] : ( (lv_multiplicityOperator_0_0= ruleMultiplicityOperator ) ) ;
    public final EObject ruleMultiplicityExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_multiplicityOperator_0_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1739:2: ( ( (lv_multiplicityOperator_0_0= ruleMultiplicityOperator ) ) )
            // InternalFogDsl.g:1740:2: ( (lv_multiplicityOperator_0_0= ruleMultiplicityOperator ) )
            {
            // InternalFogDsl.g:1740:2: ( (lv_multiplicityOperator_0_0= ruleMultiplicityOperator ) )
            // InternalFogDsl.g:1741:3: (lv_multiplicityOperator_0_0= ruleMultiplicityOperator )
            {
            // InternalFogDsl.g:1741:3: (lv_multiplicityOperator_0_0= ruleMultiplicityOperator )
            // InternalFogDsl.g:1742:4: lv_multiplicityOperator_0_0= ruleMultiplicityOperator
            {

            				newCompositeNode(grammarAccess.getMultiplicityExpressionAccess().getMultiplicityOperatorMultiplicityOperatorEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_multiplicityOperator_0_0=ruleMultiplicityOperator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMultiplicityExpressionRule());
            				}
            				set(
            					current,
            					"multiplicityOperator",
            					lv_multiplicityOperator_0_0,
            					"fr.imta.semafor.FogDsl.MultiplicityOperator");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleMultiplicityExpression"


    // $ANTLR start "entryRuleportsExpression"
    // InternalFogDsl.g:1762:1: entryRuleportsExpression returns [EObject current=null] : iv_ruleportsExpression= ruleportsExpression EOF ;
    public final EObject entryRuleportsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleportsExpression = null;


        try {
            // InternalFogDsl.g:1762:56: (iv_ruleportsExpression= ruleportsExpression EOF )
            // InternalFogDsl.g:1763:2: iv_ruleportsExpression= ruleportsExpression EOF
            {
             newCompositeNode(grammarAccess.getPortsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleportsExpression=ruleportsExpression();

            state._fsp--;

             current =iv_ruleportsExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleportsExpression"


    // $ANTLR start "ruleportsExpression"
    // InternalFogDsl.g:1769:1: ruleportsExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'networkPort' ) ) ;
    public final EObject ruleportsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:1775:2: ( ( (lv_attributeName_0_0= 'networkPort' ) ) )
            // InternalFogDsl.g:1776:2: ( (lv_attributeName_0_0= 'networkPort' ) )
            {
            // InternalFogDsl.g:1776:2: ( (lv_attributeName_0_0= 'networkPort' ) )
            // InternalFogDsl.g:1777:3: (lv_attributeName_0_0= 'networkPort' )
            {
            // InternalFogDsl.g:1777:3: (lv_attributeName_0_0= 'networkPort' )
            // InternalFogDsl.g:1778:4: lv_attributeName_0_0= 'networkPort'
            {
            lv_attributeName_0_0=(Token)match(input,46,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getPortsExpressionAccess().getAttributeNameNetworkPortKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPortsExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "networkPort");
            			

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
    // $ANTLR end "ruleportsExpression"


    // $ANTLR start "entryRuleNetworkPort"
    // InternalFogDsl.g:1793:1: entryRuleNetworkPort returns [EObject current=null] : iv_ruleNetworkPort= ruleNetworkPort EOF ;
    public final EObject entryRuleNetworkPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkPort = null;


        try {
            // InternalFogDsl.g:1793:52: (iv_ruleNetworkPort= ruleNetworkPort EOF )
            // InternalFogDsl.g:1794:2: iv_ruleNetworkPort= ruleNetworkPort EOF
            {
             newCompositeNode(grammarAccess.getNetworkPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkPort=ruleNetworkPort();

            state._fsp--;

             current =iv_ruleNetworkPort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNetworkPort"


    // $ANTLR start "ruleNetworkPort"
    // InternalFogDsl.g:1800:1: ruleNetworkPort returns [EObject current=null] : ( ( (lv_portName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= 'protocol' otherlv_3= ':' ( (lv_protocol_4_0= ruleTransportProtocol ) ) otherlv_5= 'portNumber' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) otherlv_8= 'hostPort' otherlv_9= ':' ( (lv_hostPort_10_0= RULE_INT ) ) ) ;
    public final EObject ruleNetworkPort() throws RecognitionException {
        EObject current = null;

        Token lv_portName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_portNumber_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_hostPort_10_0=null;
        Enumerator lv_protocol_4_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1806:2: ( ( ( (lv_portName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= 'protocol' otherlv_3= ':' ( (lv_protocol_4_0= ruleTransportProtocol ) ) otherlv_5= 'portNumber' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) otherlv_8= 'hostPort' otherlv_9= ':' ( (lv_hostPort_10_0= RULE_INT ) ) ) )
            // InternalFogDsl.g:1807:2: ( ( (lv_portName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= 'protocol' otherlv_3= ':' ( (lv_protocol_4_0= ruleTransportProtocol ) ) otherlv_5= 'portNumber' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) otherlv_8= 'hostPort' otherlv_9= ':' ( (lv_hostPort_10_0= RULE_INT ) ) )
            {
            // InternalFogDsl.g:1807:2: ( ( (lv_portName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= 'protocol' otherlv_3= ':' ( (lv_protocol_4_0= ruleTransportProtocol ) ) otherlv_5= 'portNumber' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) otherlv_8= 'hostPort' otherlv_9= ':' ( (lv_hostPort_10_0= RULE_INT ) ) )
            // InternalFogDsl.g:1808:3: ( (lv_portName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= 'protocol' otherlv_3= ':' ( (lv_protocol_4_0= ruleTransportProtocol ) ) otherlv_5= 'portNumber' otherlv_6= ':' ( (lv_portNumber_7_0= RULE_INT ) ) otherlv_8= 'hostPort' otherlv_9= ':' ( (lv_hostPort_10_0= RULE_INT ) )
            {
            // InternalFogDsl.g:1808:3: ( (lv_portName_0_0= RULE_STRING ) )
            // InternalFogDsl.g:1809:4: (lv_portName_0_0= RULE_STRING )
            {
            // InternalFogDsl.g:1809:4: (lv_portName_0_0= RULE_STRING )
            // InternalFogDsl.g:1810:5: lv_portName_0_0= RULE_STRING
            {
            lv_portName_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_portName_0_0, grammarAccess.getNetworkPortAccess().getPortNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portName",
            						lv_portName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkPortAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkPortAccess().getProtocolKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkPortAccess().getColonKeyword_3());
            		
            // InternalFogDsl.g:1838:3: ( (lv_protocol_4_0= ruleTransportProtocol ) )
            // InternalFogDsl.g:1839:4: (lv_protocol_4_0= ruleTransportProtocol )
            {
            // InternalFogDsl.g:1839:4: (lv_protocol_4_0= ruleTransportProtocol )
            // InternalFogDsl.g:1840:5: lv_protocol_4_0= ruleTransportProtocol
            {

            					newCompositeNode(grammarAccess.getNetworkPortAccess().getProtocolTransportProtocolEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_55);
            lv_protocol_4_0=ruleTransportProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkPortRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_4_0,
            						"fr.imta.semafor.FogDsl.TransportProtocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkPortAccess().getPortNumberKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_6, grammarAccess.getNetworkPortAccess().getColonKeyword_6());
            		
            // InternalFogDsl.g:1865:3: ( (lv_portNumber_7_0= RULE_INT ) )
            // InternalFogDsl.g:1866:4: (lv_portNumber_7_0= RULE_INT )
            {
            // InternalFogDsl.g:1866:4: (lv_portNumber_7_0= RULE_INT )
            // InternalFogDsl.g:1867:5: lv_portNumber_7_0= RULE_INT
            {
            lv_portNumber_7_0=(Token)match(input,RULE_INT,FOLLOW_57); 

            					newLeafNode(lv_portNumber_7_0, grammarAccess.getNetworkPortAccess().getPortNumberINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portNumber",
            						lv_portNumber_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getNetworkPortAccess().getHostPortKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_9, grammarAccess.getNetworkPortAccess().getColonKeyword_9());
            		
            // InternalFogDsl.g:1891:3: ( (lv_hostPort_10_0= RULE_INT ) )
            // InternalFogDsl.g:1892:4: (lv_hostPort_10_0= RULE_INT )
            {
            // InternalFogDsl.g:1892:4: (lv_hostPort_10_0= RULE_INT )
            // InternalFogDsl.g:1893:5: lv_hostPort_10_0= RULE_INT
            {
            lv_hostPort_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_hostPort_10_0, grammarAccess.getNetworkPortAccess().getHostPortINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hostPort",
            						lv_hostPort_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNetworkPort"


    // $ANTLR start "entryRuleNetworkType"
    // InternalFogDsl.g:1913:1: entryRuleNetworkType returns [EObject current=null] : iv_ruleNetworkType= ruleNetworkType EOF ;
    public final EObject entryRuleNetworkType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkType = null;


        try {
            // InternalFogDsl.g:1913:52: (iv_ruleNetworkType= ruleNetworkType EOF )
            // InternalFogDsl.g:1914:2: iv_ruleNetworkType= ruleNetworkType EOF
            {
             newCompositeNode(grammarAccess.getNetworkTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkType=ruleNetworkType();

            state._fsp--;

             current =iv_ruleNetworkType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNetworkType"


    // $ANTLR start "ruleNetworkType"
    // InternalFogDsl.g:1920:1: ruleNetworkType returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* ) ;
    public final EObject ruleNetworkType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_tags_8_0 = null;

        EObject lv_constraints_14_1 = null;

        EObject lv_constraints_14_2 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:1926:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* ) )
            // InternalFogDsl.g:1927:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* )
            {
            // InternalFogDsl.g:1927:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* )
            // InternalFogDsl.g:1928:3: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkTypeAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkTypeAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:1936:3: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFogDsl.g:1937:4: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNetworkTypeAccess().getIdKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getNetworkTypeAccess().getColonKeyword_2_1());
                    			
                    // InternalFogDsl.g:1945:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFogDsl.g:1946:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFogDsl.g:1946:5: (lv_name_4_0= RULE_ID )
                    // InternalFogDsl.g:1947:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getNetworkTypeAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNetworkTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkTypeAccess().getTagsKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getNetworkTypeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:1972:3: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFogDsl.g:1973:4: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNetworkTypeAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalFogDsl.g:1977:4: ( (lv_tags_8_0= ruleTag ) )
            	    // InternalFogDsl.g:1978:5: (lv_tags_8_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:1978:5: (lv_tags_8_0= ruleTag )
            	    // InternalFogDsl.g:1979:6: lv_tags_8_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkTypeAccess().getTagsTagParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_tags_8_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_8_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getNetworkTypeAccess().getSpecKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_10, grammarAccess.getNetworkTypeAccess().getColonKeyword_7());
            		
            otherlv_11=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getNetworkTypeAccess().getConstraintsKeyword_8());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getNetworkTypeAccess().getColonKeyword_9());
            		
            // InternalFogDsl.g:2013:3: (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFogDsl.g:2014:4: otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) )
            	    {
            	    otherlv_13=(Token)match(input,26,FOLLOW_58); 

            	    				newLeafNode(otherlv_13, grammarAccess.getNetworkTypeAccess().getHyphenMinusKeyword_10_0());
            	    			
            	    // InternalFogDsl.g:2018:4: ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) )
            	    // InternalFogDsl.g:2019:5: ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) )
            	    {
            	    // InternalFogDsl.g:2019:5: ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) )
            	    // InternalFogDsl.g:2020:6: (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint )
            	    {
            	    // InternalFogDsl.g:2020:6: (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==55||(LA35_0>=82 && LA35_0<=86)) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalFogDsl.g:2021:7: lv_constraints_14_1= ruleConstraint
            	            {

            	            							newCompositeNode(grammarAccess.getNetworkTypeAccess().getConstraintsConstraintParserRuleCall_10_1_0_0());
            	            						
            	            pushFollow(FOLLOW_30);
            	            lv_constraints_14_1=ruleConstraint();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getNetworkTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"constraints",
            	            								lv_constraints_14_1,
            	            								"fr.imta.semafor.FogDsl.Constraint");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFogDsl.g:2037:7: lv_constraints_14_2= rulenetworkClassConstraint
            	            {

            	            							newCompositeNode(grammarAccess.getNetworkTypeAccess().getConstraintsNetworkClassConstraintParserRuleCall_10_1_0_1());
            	            						
            	            pushFollow(FOLLOW_30);
            	            lv_constraints_14_2=rulenetworkClassConstraint();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getNetworkTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"constraints",
            	            								lv_constraints_14_2,
            	            								"fr.imta.semafor.FogDsl.networkClassConstraint");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleNetworkType"


    // $ANTLR start "entryRuleConstraint"
    // InternalFogDsl.g:2060:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalFogDsl.g:2060:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalFogDsl.g:2061:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalFogDsl.g:2067:1: ruleConstraint returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleAttributeExpression ) ) otherlv_2= ':' ( ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_1 = null;

        EObject lv_expression_3_2 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_expression_6_1 = null;

        EObject lv_expression_6_2 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:2073:2: ( ( () ( (lv_expression_1_0= ruleAttributeExpression ) ) otherlv_2= ':' ( ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) ) ) ) )
            // InternalFogDsl.g:2074:2: ( () ( (lv_expression_1_0= ruleAttributeExpression ) ) otherlv_2= ':' ( ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) ) ) )
            {
            // InternalFogDsl.g:2074:2: ( () ( (lv_expression_1_0= ruleAttributeExpression ) ) otherlv_2= ':' ( ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) ) ) )
            // InternalFogDsl.g:2075:3: () ( (lv_expression_1_0= ruleAttributeExpression ) ) otherlv_2= ':' ( ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) ) )
            {
            // InternalFogDsl.g:2075:3: ()
            // InternalFogDsl.g:2076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalFogDsl.g:2082:3: ( (lv_expression_1_0= ruleAttributeExpression ) )
            // InternalFogDsl.g:2083:4: (lv_expression_1_0= ruleAttributeExpression )
            {
            // InternalFogDsl.g:2083:4: (lv_expression_1_0= ruleAttributeExpression )
            // InternalFogDsl.g:2084:5: lv_expression_1_0= ruleAttributeExpression
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpressionAttributeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_1_0=ruleAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"fr.imta.semafor.FogDsl.AttributeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
            		
            // InternalFogDsl.g:2105:3: ( ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=82 && LA39_0<=86)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalFogDsl.g:2106:4: ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) )
                    {
                    // InternalFogDsl.g:2106:4: ( ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) ) )
                    // InternalFogDsl.g:2107:5: ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) )
                    {
                    // InternalFogDsl.g:2107:5: ( (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression ) )
                    // InternalFogDsl.g:2108:6: (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression )
                    {
                    // InternalFogDsl.g:2108:6: (lv_expression_3_1= ruleIntegerValueExpression | lv_expression_3_2= ruleAttributeExpression )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_STRING)) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalFogDsl.g:2109:7: lv_expression_3_1= ruleIntegerValueExpression
                            {

                            							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_0_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expression_3_1=ruleIntegerValueExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstraintRule());
                            							}
                            							add(
                            								current,
                            								"expression",
                            								lv_expression_3_1,
                            								"fr.imta.semafor.FogDsl.IntegerValueExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalFogDsl.g:2125:7: lv_expression_3_2= ruleAttributeExpression
                            {

                            							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionAttributeExpressionParserRuleCall_3_0_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_expression_3_2=ruleAttributeExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstraintRule());
                            							}
                            							add(
                            								current,
                            								"expression",
                            								lv_expression_3_2,
                            								"fr.imta.semafor.FogDsl.AttributeExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:2144:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) )
                    {
                    // InternalFogDsl.g:2144:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) ) )
                    // InternalFogDsl.g:2145:5: ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) )
                    {
                    // InternalFogDsl.g:2145:5: ( (lv_operator_4_0= ruleComparaisonOperator ) )
                    // InternalFogDsl.g:2146:6: (lv_operator_4_0= ruleComparaisonOperator )
                    {
                    // InternalFogDsl.g:2146:6: (lv_operator_4_0= ruleComparaisonOperator )
                    // InternalFogDsl.g:2147:7: lv_operator_4_0= ruleComparaisonOperator
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getOperatorComparaisonOperatorEnumRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_operator_4_0=ruleComparaisonOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_4_0,
                    								"fr.imta.semafor.FogDsl.ComparaisonOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_60); 

                    					newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColonKeyword_3_1_1());
                    				
                    // InternalFogDsl.g:2168:5: ( ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) ) )
                    // InternalFogDsl.g:2169:6: ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) )
                    {
                    // InternalFogDsl.g:2169:6: ( (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression ) )
                    // InternalFogDsl.g:2170:7: (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression )
                    {
                    // InternalFogDsl.g:2170:7: (lv_expression_6_1= ruleIntegerValueExpression | lv_expression_6_2= ruleAttributeExpression )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_INT) ) {
                        alt38=1;
                    }
                    else if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalFogDsl.g:2171:8: lv_expression_6_1= ruleIntegerValueExpression
                            {

                            								newCompositeNode(grammarAccess.getConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_1_2_0_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_expression_6_1=ruleIntegerValueExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getConstraintRule());
                            								}
                            								add(
                            									current,
                            									"expression",
                            									lv_expression_6_1,
                            									"fr.imta.semafor.FogDsl.IntegerValueExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;
                        case 2 :
                            // InternalFogDsl.g:2187:8: lv_expression_6_2= ruleAttributeExpression
                            {

                            								newCompositeNode(grammarAccess.getConstraintAccess().getExpressionAttributeExpressionParserRuleCall_3_1_2_0_1());
                            							
                            pushFollow(FOLLOW_2);
                            lv_expression_6_2=ruleAttributeExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getConstraintRule());
                            								}
                            								add(
                            									current,
                            									"expression",
                            									lv_expression_6_2,
                            									"fr.imta.semafor.FogDsl.AttributeExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleAttributeExpression"
    // InternalFogDsl.g:2211:1: entryRuleAttributeExpression returns [EObject current=null] : iv_ruleAttributeExpression= ruleAttributeExpression EOF ;
    public final EObject entryRuleAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExpression = null;


        try {
            // InternalFogDsl.g:2211:60: (iv_ruleAttributeExpression= ruleAttributeExpression EOF )
            // InternalFogDsl.g:2212:2: iv_ruleAttributeExpression= ruleAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeExpression=ruleAttributeExpression();

            state._fsp--;

             current =iv_ruleAttributeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeExpression"


    // $ANTLR start "ruleAttributeExpression"
    // InternalFogDsl.g:2218:1: ruleAttributeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= ruleEString ) ) ;
    public final EObject ruleAttributeExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_attributeName_0_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:2224:2: ( ( (lv_attributeName_0_0= ruleEString ) ) )
            // InternalFogDsl.g:2225:2: ( (lv_attributeName_0_0= ruleEString ) )
            {
            // InternalFogDsl.g:2225:2: ( (lv_attributeName_0_0= ruleEString ) )
            // InternalFogDsl.g:2226:3: (lv_attributeName_0_0= ruleEString )
            {
            // InternalFogDsl.g:2226:3: (lv_attributeName_0_0= ruleEString )
            // InternalFogDsl.g:2227:4: lv_attributeName_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getAttributeExpressionAccess().getAttributeNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_attributeName_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAttributeExpressionRule());
            				}
            				set(
            					current,
            					"attributeName",
            					lv_attributeName_0_0,
            					"fr.imta.semafor.FogDsl.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAttributeExpression"


    // $ANTLR start "entryRuleNetworkLinksType"
    // InternalFogDsl.g:2247:1: entryRuleNetworkLinksType returns [EObject current=null] : iv_ruleNetworkLinksType= ruleNetworkLinksType EOF ;
    public final EObject entryRuleNetworkLinksType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLinksType = null;


        try {
            // InternalFogDsl.g:2247:57: (iv_ruleNetworkLinksType= ruleNetworkLinksType EOF )
            // InternalFogDsl.g:2248:2: iv_ruleNetworkLinksType= ruleNetworkLinksType EOF
            {
             newCompositeNode(grammarAccess.getNetworkLinksTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkLinksType=ruleNetworkLinksType();

            state._fsp--;

             current =iv_ruleNetworkLinksType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNetworkLinksType"


    // $ANTLR start "ruleNetworkLinksType"
    // InternalFogDsl.g:2254:1: ruleNetworkLinksType returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* otherlv_15= 'networks' otherlv_16= ':' (otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )* )? (otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )* )? (otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString )? (otherlv_28= 'targetNode' otherlv_29= ':' ruleEString )? ) ;
    public final EObject ruleNetworkLinksType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_tags_8_0 = null;

        EObject lv_constraints_14_1 = null;

        EObject lv_constraints_14_2 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:2260:2: ( (otherlv_0= 'metadata' otherlv_1= ':' otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* otherlv_15= 'networks' otherlv_16= ':' (otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )* )? (otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )* )? (otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString )? (otherlv_28= 'targetNode' otherlv_29= ':' ruleEString )? ) )
            // InternalFogDsl.g:2261:2: (otherlv_0= 'metadata' otherlv_1= ':' otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* otherlv_15= 'networks' otherlv_16= ':' (otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )* )? (otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )* )? (otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString )? (otherlv_28= 'targetNode' otherlv_29= ':' ruleEString )? )
            {
            // InternalFogDsl.g:2261:2: (otherlv_0= 'metadata' otherlv_1= ':' otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* otherlv_15= 'networks' otherlv_16= ':' (otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )* )? (otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )* )? (otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString )? (otherlv_28= 'targetNode' otherlv_29= ':' ruleEString )? )
            // InternalFogDsl.g:2262:3: otherlv_0= 'metadata' otherlv_1= ':' otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'constraints' otherlv_12= ':' (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )* otherlv_15= 'networks' otherlv_16= ':' (otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )* )? (otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )* )? (otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString )? (otherlv_28= 'targetNode' otherlv_29= ':' ruleEString )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkLinksTypeAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkLinksTypeAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_3());
            		
            // InternalFogDsl.g:2278:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFogDsl.g:2279:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFogDsl.g:2279:4: (lv_name_4_0= RULE_ID )
            // InternalFogDsl.g:2280:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_4_0, grammarAccess.getNetworkLinksTypeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkLinksTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkLinksTypeAccess().getTagsKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_6());
            		
            // InternalFogDsl.g:2304:3: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==26) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalFogDsl.g:2305:4: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNetworkLinksTypeAccess().getHyphenMinusKeyword_7_0());
            	    			
            	    // InternalFogDsl.g:2309:4: ( (lv_tags_8_0= ruleTag ) )
            	    // InternalFogDsl.g:2310:5: (lv_tags_8_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:2310:5: (lv_tags_8_0= ruleTag )
            	    // InternalFogDsl.g:2311:6: lv_tags_8_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getTagsTagParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_tags_8_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkLinksTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_8_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getNetworkLinksTypeAccess().getSpecKeyword_8());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_10, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_9());
            		
            otherlv_11=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getNetworkLinksTypeAccess().getConstraintsKeyword_10());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_12, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_11());
            		
            // InternalFogDsl.g:2345:3: (otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalFogDsl.g:2346:4: otherlv_13= '-' ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) )
            	    {
            	    otherlv_13=(Token)match(input,26,FOLLOW_58); 

            	    				newLeafNode(otherlv_13, grammarAccess.getNetworkLinksTypeAccess().getHyphenMinusKeyword_12_0());
            	    			
            	    // InternalFogDsl.g:2350:4: ( ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) ) )
            	    // InternalFogDsl.g:2351:5: ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) )
            	    {
            	    // InternalFogDsl.g:2351:5: ( (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint ) )
            	    // InternalFogDsl.g:2352:6: (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint )
            	    {
            	    // InternalFogDsl.g:2352:6: (lv_constraints_14_1= ruleConstraint | lv_constraints_14_2= rulenetworkClassConstraint )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==55||(LA41_0>=82 && LA41_0<=86)) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalFogDsl.g:2353:7: lv_constraints_14_1= ruleConstraint
            	            {

            	            							newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getConstraintsConstraintParserRuleCall_12_1_0_0());
            	            						
            	            pushFollow(FOLLOW_62);
            	            lv_constraints_14_1=ruleConstraint();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getNetworkLinksTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"constraints",
            	            								lv_constraints_14_1,
            	            								"fr.imta.semafor.FogDsl.Constraint");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFogDsl.g:2369:7: lv_constraints_14_2= rulenetworkClassConstraint
            	            {

            	            							newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getConstraintsNetworkClassConstraintParserRuleCall_12_1_0_1());
            	            						
            	            pushFollow(FOLLOW_62);
            	            lv_constraints_14_2=rulenetworkClassConstraint();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getNetworkLinksTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"constraints",
            	            								lv_constraints_14_2,
            	            								"fr.imta.semafor.FogDsl.networkClassConstraint");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_15=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getNetworkLinksTypeAccess().getNetworksKeyword_13());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_16, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_14());
            		
            // InternalFogDsl.g:2396:3: (otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalFogDsl.g:2397:4: otherlv_17= 'sourceNetworks' otherlv_18= ':' (otherlv_19= '-' ruleEString )*
                    {
                    otherlv_17=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getNetworkLinksTypeAccess().getSourceNetworksKeyword_15_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_18, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_15_1());
                    			
                    // InternalFogDsl.g:2405:4: (otherlv_19= '-' ruleEString )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==26) ) {
                            int LA43_2 = input.LA(2);

                            if ( ((LA43_2>=RULE_ID && LA43_2<=RULE_STRING)) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalFogDsl.g:2406:5: otherlv_19= '-' ruleEString
                    	    {
                    	    otherlv_19=(Token)match(input,26,FOLLOW_26); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNetworkLinksTypeAccess().getHyphenMinusKeyword_15_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getEStringParserRuleCall_15_2_1());
                    	    				
                    	    pushFollow(FOLLOW_64);
                    	    ruleEString();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFogDsl.g:2419:3: (otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalFogDsl.g:2420:4: otherlv_21= 'targetNetworks' otherlv_22= ':' (otherlv_23= '-' ruleEString )*
                    {
                    otherlv_21=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getNetworkLinksTypeAccess().getTargetNetworksKeyword_16_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_22, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_16_1());
                    			
                    // InternalFogDsl.g:2428:4: (otherlv_23= '-' ruleEString )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==26) ) {
                            int LA45_2 = input.LA(2);

                            if ( ((LA45_2>=RULE_ID && LA45_2<=RULE_STRING)) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalFogDsl.g:2429:5: otherlv_23= '-' ruleEString
                    	    {
                    	    otherlv_23=(Token)match(input,26,FOLLOW_26); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getNetworkLinksTypeAccess().getHyphenMinusKeyword_16_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getEStringParserRuleCall_16_2_1());
                    	    				
                    	    pushFollow(FOLLOW_65);
                    	    ruleEString();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFogDsl.g:2442:3: (otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalFogDsl.g:2443:4: otherlv_25= 'sourceNode' otherlv_26= ':' ruleEString
                    {
                    otherlv_25=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getNetworkLinksTypeAccess().getSourceNodeKeyword_17_0());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_26, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_17_1());
                    			

                    				newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getEStringParserRuleCall_17_2());
                    			
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalFogDsl.g:2459:3: (otherlv_28= 'targetNode' otherlv_29= ':' ruleEString )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalFogDsl.g:2460:4: otherlv_28= 'targetNode' otherlv_29= ':' ruleEString
                    {
                    otherlv_28=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getNetworkLinksTypeAccess().getTargetNodeKeyword_18_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_29, grammarAccess.getNetworkLinksTypeAccess().getColonKeyword_18_1());
                    			

                    				newCompositeNode(grammarAccess.getNetworkLinksTypeAccess().getEStringParserRuleCall_18_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleNetworkLinksType"


    // $ANTLR start "entryRulenetworkClassConstraint"
    // InternalFogDsl.g:2480:1: entryRulenetworkClassConstraint returns [EObject current=null] : iv_rulenetworkClassConstraint= rulenetworkClassConstraint EOF ;
    public final EObject entryRulenetworkClassConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenetworkClassConstraint = null;


        try {
            // InternalFogDsl.g:2480:63: (iv_rulenetworkClassConstraint= rulenetworkClassConstraint EOF )
            // InternalFogDsl.g:2481:2: iv_rulenetworkClassConstraint= rulenetworkClassConstraint EOF
            {
             newCompositeNode(grammarAccess.getNetworkClassConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenetworkClassConstraint=rulenetworkClassConstraint();

            state._fsp--;

             current =iv_rulenetworkClassConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulenetworkClassConstraint"


    // $ANTLR start "rulenetworkClassConstraint"
    // InternalFogDsl.g:2487:1: rulenetworkClassConstraint returns [EObject current=null] : ( ( ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) ) ) | ( ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) ) ) ) ;
    public final EObject rulenetworkClassConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:2493:2: ( ( ( ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) ) ) | ( ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) ) ) ) )
            // InternalFogDsl.g:2494:2: ( ( ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) ) ) | ( ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) ) ) )
            {
            // InternalFogDsl.g:2494:2: ( ( ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) ) ) | ( ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=82 && LA49_0<=86)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalFogDsl.g:2495:3: ( ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) ) )
                    {
                    // InternalFogDsl.g:2495:3: ( ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) ) )
                    // InternalFogDsl.g:2496:4: ( (lv_expression_0_0= ruleNetworkClassExpression ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) )
                    {
                    // InternalFogDsl.g:2496:4: ( (lv_expression_0_0= ruleNetworkClassExpression ) )
                    // InternalFogDsl.g:2497:5: (lv_expression_0_0= ruleNetworkClassExpression )
                    {
                    // InternalFogDsl.g:2497:5: (lv_expression_0_0= ruleNetworkClassExpression )
                    // InternalFogDsl.g:2498:6: lv_expression_0_0= ruleNetworkClassExpression
                    {

                    						newCompositeNode(grammarAccess.getNetworkClassConstraintAccess().getExpressionNetworkClassExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_expression_0_0=ruleNetworkClassExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkClassConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_0_0,
                    							"fr.imta.semafor.FogDsl.NetworkClassExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_67); 

                    				newLeafNode(otherlv_1, grammarAccess.getNetworkClassConstraintAccess().getColonKeyword_0_1());
                    			
                    // InternalFogDsl.g:2519:4: ( (lv_expression_2_0= ruleNetworkClassEnumExpression ) )
                    // InternalFogDsl.g:2520:5: (lv_expression_2_0= ruleNetworkClassEnumExpression )
                    {
                    // InternalFogDsl.g:2520:5: (lv_expression_2_0= ruleNetworkClassEnumExpression )
                    // InternalFogDsl.g:2521:6: lv_expression_2_0= ruleNetworkClassEnumExpression
                    {

                    						newCompositeNode(grammarAccess.getNetworkClassConstraintAccess().getExpressionNetworkClassEnumExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleNetworkClassEnumExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkClassConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"fr.imta.semafor.FogDsl.NetworkClassEnumExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:2540:3: ( ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) ) )
                    {
                    // InternalFogDsl.g:2540:3: ( ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) ) )
                    // InternalFogDsl.g:2541:4: ( (lv_operator_3_0= ruleComparaisonOperator ) ) otherlv_4= ':' ( (lv_expression_5_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:2541:4: ( (lv_operator_3_0= ruleComparaisonOperator ) )
                    // InternalFogDsl.g:2542:5: (lv_operator_3_0= ruleComparaisonOperator )
                    {
                    // InternalFogDsl.g:2542:5: (lv_operator_3_0= ruleComparaisonOperator )
                    // InternalFogDsl.g:2543:6: lv_operator_3_0= ruleComparaisonOperator
                    {

                    						newCompositeNode(grammarAccess.getNetworkClassConstraintAccess().getOperatorComparaisonOperatorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_operator_3_0=ruleComparaisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkClassConstraintRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_3_0,
                    							"fr.imta.semafor.FogDsl.ComparaisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getNetworkClassConstraintAccess().getColonKeyword_1_1());
                    			
                    // InternalFogDsl.g:2564:4: ( (lv_expression_5_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:2565:5: (lv_expression_5_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:2565:5: (lv_expression_5_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:2566:6: lv_expression_5_0= ruleIntegerValueExpression
                    {

                    						newCompositeNode(grammarAccess.getNetworkClassConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleIntegerValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkClassConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulenetworkClassConstraint"


    // $ANTLR start "entryRuleNetworkClassEnumExpression"
    // InternalFogDsl.g:2588:1: entryRuleNetworkClassEnumExpression returns [EObject current=null] : iv_ruleNetworkClassEnumExpression= ruleNetworkClassEnumExpression EOF ;
    public final EObject entryRuleNetworkClassEnumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkClassEnumExpression = null;


        try {
            // InternalFogDsl.g:2588:67: (iv_ruleNetworkClassEnumExpression= ruleNetworkClassEnumExpression EOF )
            // InternalFogDsl.g:2589:2: iv_ruleNetworkClassEnumExpression= ruleNetworkClassEnumExpression EOF
            {
             newCompositeNode(grammarAccess.getNetworkClassEnumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkClassEnumExpression=ruleNetworkClassEnumExpression();

            state._fsp--;

             current =iv_ruleNetworkClassEnumExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNetworkClassEnumExpression"


    // $ANTLR start "ruleNetworkClassEnumExpression"
    // InternalFogDsl.g:2595:1: ruleNetworkClassEnumExpression returns [EObject current=null] : ( (lv_value_0_0= ruleNetworkClassEnum ) ) ;
    public final EObject ruleNetworkClassEnumExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:2601:2: ( ( (lv_value_0_0= ruleNetworkClassEnum ) ) )
            // InternalFogDsl.g:2602:2: ( (lv_value_0_0= ruleNetworkClassEnum ) )
            {
            // InternalFogDsl.g:2602:2: ( (lv_value_0_0= ruleNetworkClassEnum ) )
            // InternalFogDsl.g:2603:3: (lv_value_0_0= ruleNetworkClassEnum )
            {
            // InternalFogDsl.g:2603:3: (lv_value_0_0= ruleNetworkClassEnum )
            // InternalFogDsl.g:2604:4: lv_value_0_0= ruleNetworkClassEnum
            {

            				newCompositeNode(grammarAccess.getNetworkClassEnumExpressionAccess().getValueNetworkClassEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNetworkClassEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNetworkClassEnumExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"fr.imta.semafor.FogDsl.NetworkClassEnum");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleNetworkClassEnumExpression"


    // $ANTLR start "entryRuleNetworkClassExpression"
    // InternalFogDsl.g:2624:1: entryRuleNetworkClassExpression returns [EObject current=null] : iv_ruleNetworkClassExpression= ruleNetworkClassExpression EOF ;
    public final EObject entryRuleNetworkClassExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkClassExpression = null;


        try {
            // InternalFogDsl.g:2624:63: (iv_ruleNetworkClassExpression= ruleNetworkClassExpression EOF )
            // InternalFogDsl.g:2625:2: iv_ruleNetworkClassExpression= ruleNetworkClassExpression EOF
            {
             newCompositeNode(grammarAccess.getNetworkClassExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkClassExpression=ruleNetworkClassExpression();

            state._fsp--;

             current =iv_ruleNetworkClassExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNetworkClassExpression"


    // $ANTLR start "ruleNetworkClassExpression"
    // InternalFogDsl.g:2631:1: ruleNetworkClassExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'networkClass' ) ) ;
    public final EObject ruleNetworkClassExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:2637:2: ( ( (lv_attributeName_0_0= 'networkClass' ) ) )
            // InternalFogDsl.g:2638:2: ( (lv_attributeName_0_0= 'networkClass' ) )
            {
            // InternalFogDsl.g:2638:2: ( (lv_attributeName_0_0= 'networkClass' ) )
            // InternalFogDsl.g:2639:3: (lv_attributeName_0_0= 'networkClass' )
            {
            // InternalFogDsl.g:2639:3: (lv_attributeName_0_0= 'networkClass' )
            // InternalFogDsl.g:2640:4: lv_attributeName_0_0= 'networkClass'
            {
            lv_attributeName_0_0=(Token)match(input,55,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getNetworkClassExpressionAccess().getAttributeNameNetworkClassKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNetworkClassExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "networkClass");
            			

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
    // $ANTLR end "ruleNetworkClassExpression"


    // $ANTLR start "entryRulebandwidthExpression"
    // InternalFogDsl.g:2655:1: entryRulebandwidthExpression returns [EObject current=null] : iv_rulebandwidthExpression= rulebandwidthExpression EOF ;
    public final EObject entryRulebandwidthExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebandwidthExpression = null;


        try {
            // InternalFogDsl.g:2655:60: (iv_rulebandwidthExpression= rulebandwidthExpression EOF )
            // InternalFogDsl.g:2656:2: iv_rulebandwidthExpression= rulebandwidthExpression EOF
            {
             newCompositeNode(grammarAccess.getBandwidthExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebandwidthExpression=rulebandwidthExpression();

            state._fsp--;

             current =iv_rulebandwidthExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebandwidthExpression"


    // $ANTLR start "rulebandwidthExpression"
    // InternalFogDsl.g:2662:1: rulebandwidthExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'bandwidth' ) ) ;
    public final EObject rulebandwidthExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:2668:2: ( ( (lv_attributeName_0_0= 'bandwidth' ) ) )
            // InternalFogDsl.g:2669:2: ( (lv_attributeName_0_0= 'bandwidth' ) )
            {
            // InternalFogDsl.g:2669:2: ( (lv_attributeName_0_0= 'bandwidth' ) )
            // InternalFogDsl.g:2670:3: (lv_attributeName_0_0= 'bandwidth' )
            {
            // InternalFogDsl.g:2670:3: (lv_attributeName_0_0= 'bandwidth' )
            // InternalFogDsl.g:2671:4: lv_attributeName_0_0= 'bandwidth'
            {
            lv_attributeName_0_0=(Token)match(input,56,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getBandwidthExpressionAccess().getAttributeNameBandwidthKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBandwidthExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "bandwidth");
            			

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
    // $ANTLR end "rulebandwidthExpression"


    // $ANTLR start "entryRulerangeExpression"
    // InternalFogDsl.g:2686:1: entryRulerangeExpression returns [EObject current=null] : iv_rulerangeExpression= rulerangeExpression EOF ;
    public final EObject entryRulerangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerangeExpression = null;


        try {
            // InternalFogDsl.g:2686:56: (iv_rulerangeExpression= rulerangeExpression EOF )
            // InternalFogDsl.g:2687:2: iv_rulerangeExpression= rulerangeExpression EOF
            {
             newCompositeNode(grammarAccess.getRangeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerangeExpression=rulerangeExpression();

            state._fsp--;

             current =iv_rulerangeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerangeExpression"


    // $ANTLR start "rulerangeExpression"
    // InternalFogDsl.g:2693:1: rulerangeExpression returns [EObject current=null] : (otherlv_0= ':' ( (lv_expression_1_0= '[' ) ) ruleEString otherlv_3= ',' ruleEString otherlv_5= ']' ) ;
    public final EObject rulerangeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expression_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFogDsl.g:2699:2: ( (otherlv_0= ':' ( (lv_expression_1_0= '[' ) ) ruleEString otherlv_3= ',' ruleEString otherlv_5= ']' ) )
            // InternalFogDsl.g:2700:2: (otherlv_0= ':' ( (lv_expression_1_0= '[' ) ) ruleEString otherlv_3= ',' ruleEString otherlv_5= ']' )
            {
            // InternalFogDsl.g:2700:2: (otherlv_0= ':' ( (lv_expression_1_0= '[' ) ) ruleEString otherlv_3= ',' ruleEString otherlv_5= ']' )
            // InternalFogDsl.g:2701:3: otherlv_0= ':' ( (lv_expression_1_0= '[' ) ) ruleEString otherlv_3= ',' ruleEString otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeExpressionAccess().getColonKeyword_0());
            		
            // InternalFogDsl.g:2705:3: ( (lv_expression_1_0= '[' ) )
            // InternalFogDsl.g:2706:4: (lv_expression_1_0= '[' )
            {
            // InternalFogDsl.g:2706:4: (lv_expression_1_0= '[' )
            // InternalFogDsl.g:2707:5: lv_expression_1_0= '['
            {
            lv_expression_1_0=(Token)match(input,57,FOLLOW_26); 

            					newLeafNode(lv_expression_1_0, grammarAccess.getRangeExpressionAccess().getExpressionLeftSquareBracketKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeExpressionRule());
            					}
            					setWithLastConsumed(current, "expression", lv_expression_1_0, "[");
            				

            }


            }


            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getEStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRangeExpressionAccess().getCommaKeyword_3());
            		

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getEStringParserRuleCall_4());
            		
            pushFollow(FOLLOW_70);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRangeExpressionAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "rulerangeExpression"


    // $ANTLR start "entryRuleipRangeExpression"
    // InternalFogDsl.g:2745:1: entryRuleipRangeExpression returns [EObject current=null] : iv_ruleipRangeExpression= ruleipRangeExpression EOF ;
    public final EObject entryRuleipRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleipRangeExpression = null;


        try {
            // InternalFogDsl.g:2745:58: (iv_ruleipRangeExpression= ruleipRangeExpression EOF )
            // InternalFogDsl.g:2746:2: iv_ruleipRangeExpression= ruleipRangeExpression EOF
            {
             newCompositeNode(grammarAccess.getIpRangeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleipRangeExpression=ruleipRangeExpression();

            state._fsp--;

             current =iv_ruleipRangeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleipRangeExpression"


    // $ANTLR start "ruleipRangeExpression"
    // InternalFogDsl.g:2752:1: ruleipRangeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'ipRange' ) ) ;
    public final EObject ruleipRangeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:2758:2: ( ( (lv_attributeName_0_0= 'ipRange' ) ) )
            // InternalFogDsl.g:2759:2: ( (lv_attributeName_0_0= 'ipRange' ) )
            {
            // InternalFogDsl.g:2759:2: ( (lv_attributeName_0_0= 'ipRange' ) )
            // InternalFogDsl.g:2760:3: (lv_attributeName_0_0= 'ipRange' )
            {
            // InternalFogDsl.g:2760:3: (lv_attributeName_0_0= 'ipRange' )
            // InternalFogDsl.g:2761:4: lv_attributeName_0_0= 'ipRange'
            {
            lv_attributeName_0_0=(Token)match(input,60,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getIpRangeExpressionAccess().getAttributeNameIpRangeKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIpRangeExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "ipRange");
            			

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
    // $ANTLR end "ruleipRangeExpression"


    // $ANTLR start "entryRuleVirtualNodeType"
    // InternalFogDsl.g:2776:1: entryRuleVirtualNodeType returns [EObject current=null] : iv_ruleVirtualNodeType= ruleVirtualNodeType EOF ;
    public final EObject entryRuleVirtualNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualNodeType = null;


        try {
            // InternalFogDsl.g:2776:56: (iv_ruleVirtualNodeType= ruleVirtualNodeType EOF )
            // InternalFogDsl.g:2777:2: iv_ruleVirtualNodeType= ruleVirtualNodeType EOF
            {
             newCompositeNode(grammarAccess.getVirtualNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVirtualNodeType=ruleVirtualNodeType();

            state._fsp--;

             current =iv_ruleVirtualNodeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVirtualNodeType"


    // $ANTLR start "ruleVirtualNodeType"
    // InternalFogDsl.g:2783:1: ruleVirtualNodeType returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' (otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) ) ) (otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )* ) ( (lv_replicas_19_0= ruleReplicasConstraint ) )* otherlv_20= 'physicalResources' otherlv_21= ':' ( (lv_constraints_22_0= ruleCpuConstraint ) )* ( (lv_constraints_23_0= ruleMemoryConsraint ) )* ( (lv_constraints_24_0= rulediskConstraint ) )* ( (lv_constraints_25_0= ruleConstraint ) )* (otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) ) )? otherlv_29= 'networkLinks' otherlv_30= ':' otherlv_31= 'downloadLink' otherlv_32= ':' (otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) ) )* otherlv_35= 'uploadLink' otherlv_36= ':' (otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) ) )* ) ;
    public final EObject ruleVirtualNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_imageName_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_imageRegistry_16_0=null;
        Token otherlv_17=null;
        Token this_ID_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_tags_8_0 = null;

        EObject lv_replicas_19_0 = null;

        EObject lv_constraints_22_0 = null;

        EObject lv_constraints_23_0 = null;

        EObject lv_constraints_24_0 = null;

        EObject lv_constraints_25_0 = null;

        EObject lv_hostingNode_28_0 = null;

        EObject lv_downloadLink_34_0 = null;

        EObject lv_uploadLink_38_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:2789:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' (otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) ) ) (otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )* ) ( (lv_replicas_19_0= ruleReplicasConstraint ) )* otherlv_20= 'physicalResources' otherlv_21= ':' ( (lv_constraints_22_0= ruleCpuConstraint ) )* ( (lv_constraints_23_0= ruleMemoryConsraint ) )* ( (lv_constraints_24_0= rulediskConstraint ) )* ( (lv_constraints_25_0= ruleConstraint ) )* (otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) ) )? otherlv_29= 'networkLinks' otherlv_30= ':' otherlv_31= 'downloadLink' otherlv_32= ':' (otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) ) )* otherlv_35= 'uploadLink' otherlv_36= ':' (otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) ) )* ) )
            // InternalFogDsl.g:2790:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' (otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) ) ) (otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )* ) ( (lv_replicas_19_0= ruleReplicasConstraint ) )* otherlv_20= 'physicalResources' otherlv_21= ':' ( (lv_constraints_22_0= ruleCpuConstraint ) )* ( (lv_constraints_23_0= ruleMemoryConsraint ) )* ( (lv_constraints_24_0= rulediskConstraint ) )* ( (lv_constraints_25_0= ruleConstraint ) )* (otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) ) )? otherlv_29= 'networkLinks' otherlv_30= ':' otherlv_31= 'downloadLink' otherlv_32= ':' (otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) ) )* otherlv_35= 'uploadLink' otherlv_36= ':' (otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) ) )* )
            {
            // InternalFogDsl.g:2790:2: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' (otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) ) ) (otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )* ) ( (lv_replicas_19_0= ruleReplicasConstraint ) )* otherlv_20= 'physicalResources' otherlv_21= ':' ( (lv_constraints_22_0= ruleCpuConstraint ) )* ( (lv_constraints_23_0= ruleMemoryConsraint ) )* ( (lv_constraints_24_0= rulediskConstraint ) )* ( (lv_constraints_25_0= ruleConstraint ) )* (otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) ) )? otherlv_29= 'networkLinks' otherlv_30= ':' otherlv_31= 'downloadLink' otherlv_32= ':' (otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) ) )* otherlv_35= 'uploadLink' otherlv_36= ':' (otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) ) )* )
            // InternalFogDsl.g:2791:3: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* otherlv_9= 'Spec' otherlv_10= ':' (otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) ) ) (otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )* ) ( (lv_replicas_19_0= ruleReplicasConstraint ) )* otherlv_20= 'physicalResources' otherlv_21= ':' ( (lv_constraints_22_0= ruleCpuConstraint ) )* ( (lv_constraints_23_0= ruleMemoryConsraint ) )* ( (lv_constraints_24_0= rulediskConstraint ) )* ( (lv_constraints_25_0= ruleConstraint ) )* (otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) ) )? otherlv_29= 'networkLinks' otherlv_30= ':' otherlv_31= 'downloadLink' otherlv_32= ':' (otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) ) )* otherlv_35= 'uploadLink' otherlv_36= ':' (otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVirtualNodeTypeAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:2799:3: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalFogDsl.g:2800:4: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getVirtualNodeTypeAccess().getIdKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_2_1());
                    			
                    // InternalFogDsl.g:2808:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalFogDsl.g:2809:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalFogDsl.g:2809:5: (lv_name_4_0= ruleEString )
                    // InternalFogDsl.g:2810:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getNameEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"fr.imta.semafor.FogDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getVirtualNodeTypeAccess().getTagsKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:2836:3: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==26) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalFogDsl.g:2837:4: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getVirtualNodeTypeAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalFogDsl.g:2841:4: ( (lv_tags_8_0= ruleTag ) )
            	    // InternalFogDsl.g:2842:5: (lv_tags_8_0= ruleTag )
            	    {
            	    // InternalFogDsl.g:2842:5: (lv_tags_8_0= ruleTag )
            	    // InternalFogDsl.g:2843:6: lv_tags_8_0= ruleTag
            	    {

            	    						newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getTagsTagParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_tags_8_0=ruleTag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tags",
            	    							lv_tags_8_0,
            	    							"fr.imta.semafor.FogDsl.Tag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getVirtualNodeTypeAccess().getSpecKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_10, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_7());
            		
            // InternalFogDsl.g:2869:3: (otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) ) )
            // InternalFogDsl.g:2870:4: otherlv_11= 'image' otherlv_12= ':' ( (lv_imageName_13_0= RULE_ID ) )
            {
            otherlv_11=(Token)match(input,61,FOLLOW_3); 

            				newLeafNode(otherlv_11, grammarAccess.getVirtualNodeTypeAccess().getImageKeyword_8_0());
            			
            otherlv_12=(Token)match(input,12,FOLLOW_18); 

            				newLeafNode(otherlv_12, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_8_1());
            			
            // InternalFogDsl.g:2878:4: ( (lv_imageName_13_0= RULE_ID ) )
            // InternalFogDsl.g:2879:5: (lv_imageName_13_0= RULE_ID )
            {
            // InternalFogDsl.g:2879:5: (lv_imageName_13_0= RULE_ID )
            // InternalFogDsl.g:2880:6: lv_imageName_13_0= RULE_ID
            {
            lv_imageName_13_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            						newLeafNode(lv_imageName_13_0, grammarAccess.getVirtualNodeTypeAccess().getImageNameIDTerminalRuleCall_8_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getVirtualNodeTypeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"imageName",
            							lv_imageName_13_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            }

            // InternalFogDsl.g:2897:3: (otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )* )
            // InternalFogDsl.g:2898:4: otherlv_14= 'imageRegistry' otherlv_15= ':' ( (lv_imageRegistry_16_0= RULE_ID ) ) (otherlv_17= '.' this_ID_18= RULE_ID )*
            {
            otherlv_14=(Token)match(input,62,FOLLOW_3); 

            				newLeafNode(otherlv_14, grammarAccess.getVirtualNodeTypeAccess().getImageRegistryKeyword_9_0());
            			
            otherlv_15=(Token)match(input,12,FOLLOW_18); 

            				newLeafNode(otherlv_15, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_9_1());
            			
            // InternalFogDsl.g:2906:4: ( (lv_imageRegistry_16_0= RULE_ID ) )
            // InternalFogDsl.g:2907:5: (lv_imageRegistry_16_0= RULE_ID )
            {
            // InternalFogDsl.g:2907:5: (lv_imageRegistry_16_0= RULE_ID )
            // InternalFogDsl.g:2908:6: lv_imageRegistry_16_0= RULE_ID
            {
            lv_imageRegistry_16_0=(Token)match(input,RULE_ID,FOLLOW_73); 

            						newLeafNode(lv_imageRegistry_16_0, grammarAccess.getVirtualNodeTypeAccess().getImageRegistryIDTerminalRuleCall_9_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getVirtualNodeTypeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"imageRegistry",
            							lv_imageRegistry_16_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            // InternalFogDsl.g:2924:4: (otherlv_17= '.' this_ID_18= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==63) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalFogDsl.g:2925:5: otherlv_17= '.' this_ID_18= RULE_ID
            	    {
            	    otherlv_17=(Token)match(input,63,FOLLOW_18); 

            	    					newLeafNode(otherlv_17, grammarAccess.getVirtualNodeTypeAccess().getFullStopKeyword_9_3_0());
            	    				
            	    this_ID_18=(Token)match(input,RULE_ID,FOLLOW_73); 

            	    					newLeafNode(this_ID_18, grammarAccess.getVirtualNodeTypeAccess().getIDTerminalRuleCall_9_3_1());
            	    				

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            // InternalFogDsl.g:2935:3: ( (lv_replicas_19_0= ruleReplicasConstraint ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==69) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalFogDsl.g:2936:4: (lv_replicas_19_0= ruleReplicasConstraint )
            	    {
            	    // InternalFogDsl.g:2936:4: (lv_replicas_19_0= ruleReplicasConstraint )
            	    // InternalFogDsl.g:2937:5: lv_replicas_19_0= ruleReplicasConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getReplicasReplicasConstraintParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_74);
            	    lv_replicas_19_0=ruleReplicasConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"replicas",
            	    						lv_replicas_19_0,
            	    						"fr.imta.semafor.FogDsl.ReplicasConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_20=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_20, grammarAccess.getVirtualNodeTypeAccess().getPhysicalResourcesKeyword_11());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_21, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_12());
            		
            // InternalFogDsl.g:2962:3: ( (lv_constraints_22_0= ruleCpuConstraint ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==73) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalFogDsl.g:2963:4: (lv_constraints_22_0= ruleCpuConstraint )
            	    {
            	    // InternalFogDsl.g:2963:4: (lv_constraints_22_0= ruleCpuConstraint )
            	    // InternalFogDsl.g:2964:5: lv_constraints_22_0= ruleCpuConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getConstraintsCpuConstraintParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_75);
            	    lv_constraints_22_0=ruleCpuConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_22_0,
            	    						"fr.imta.semafor.FogDsl.CpuConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalFogDsl.g:2981:3: ( (lv_constraints_23_0= ruleMemoryConsraint ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==72) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalFogDsl.g:2982:4: (lv_constraints_23_0= ruleMemoryConsraint )
            	    {
            	    // InternalFogDsl.g:2982:4: (lv_constraints_23_0= ruleMemoryConsraint )
            	    // InternalFogDsl.g:2983:5: lv_constraints_23_0= ruleMemoryConsraint
            	    {

            	    					newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getConstraintsMemoryConsraintParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_76);
            	    lv_constraints_23_0=ruleMemoryConsraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_23_0,
            	    						"fr.imta.semafor.FogDsl.MemoryConsraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalFogDsl.g:3000:3: ( (lv_constraints_24_0= rulediskConstraint ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==71) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalFogDsl.g:3001:4: (lv_constraints_24_0= rulediskConstraint )
            	    {
            	    // InternalFogDsl.g:3001:4: (lv_constraints_24_0= rulediskConstraint )
            	    // InternalFogDsl.g:3002:5: lv_constraints_24_0= rulediskConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getConstraintsDiskConstraintParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_77);
            	    lv_constraints_24_0=rulediskConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_24_0,
            	    						"fr.imta.semafor.FogDsl.diskConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalFogDsl.g:3019:3: ( (lv_constraints_25_0= ruleConstraint ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalFogDsl.g:3020:4: (lv_constraints_25_0= ruleConstraint )
            	    {
            	    // InternalFogDsl.g:3020:4: (lv_constraints_25_0= ruleConstraint )
            	    // InternalFogDsl.g:3021:5: lv_constraints_25_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getConstraintsConstraintParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_78);
            	    lv_constraints_25_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_25_0,
            	    						"fr.imta.semafor.FogDsl.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalFogDsl.g:3038:3: (otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalFogDsl.g:3039:4: otherlv_26= 'hostingNode' otherlv_27= ':' ( (lv_hostingNode_28_0= ruleVirtualNodeType ) )
                    {
                    otherlv_26=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getVirtualNodeTypeAccess().getHostingNodeKeyword_17_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_17_1());
                    			
                    // InternalFogDsl.g:3047:4: ( (lv_hostingNode_28_0= ruleVirtualNodeType ) )
                    // InternalFogDsl.g:3048:5: (lv_hostingNode_28_0= ruleVirtualNodeType )
                    {
                    // InternalFogDsl.g:3048:5: (lv_hostingNode_28_0= ruleVirtualNodeType )
                    // InternalFogDsl.g:3049:6: lv_hostingNode_28_0= ruleVirtualNodeType
                    {

                    						newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getHostingNodeVirtualNodeTypeParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_hostingNode_28_0=ruleVirtualNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"hostingNode",
                    							lv_hostingNode_28_0,
                    							"fr.imta.semafor.FogDsl.VirtualNodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getVirtualNodeTypeAccess().getNetworkLinksKeyword_18());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_30, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_19());
            		
            otherlv_31=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_31, grammarAccess.getVirtualNodeTypeAccess().getDownloadLinkKeyword_20());
            		
            otherlv_32=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_32, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_21());
            		
            // InternalFogDsl.g:3083:3: (otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==26) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalFogDsl.g:3084:4: otherlv_33= '-' ( (lv_downloadLink_34_0= ruleNetworkLinksType ) )
            	    {
            	    otherlv_33=(Token)match(input,26,FOLLOW_12); 

            	    				newLeafNode(otherlv_33, grammarAccess.getVirtualNodeTypeAccess().getHyphenMinusKeyword_22_0());
            	    			
            	    // InternalFogDsl.g:3088:4: ( (lv_downloadLink_34_0= ruleNetworkLinksType ) )
            	    // InternalFogDsl.g:3089:5: (lv_downloadLink_34_0= ruleNetworkLinksType )
            	    {
            	    // InternalFogDsl.g:3089:5: (lv_downloadLink_34_0= ruleNetworkLinksType )
            	    // InternalFogDsl.g:3090:6: lv_downloadLink_34_0= ruleNetworkLinksType
            	    {

            	    						newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getDownloadLinkNetworkLinksTypeParserRuleCall_22_1_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_downloadLink_34_0=ruleNetworkLinksType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"downloadLink",
            	    							lv_downloadLink_34_0,
            	    							"fr.imta.semafor.FogDsl.NetworkLinksType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_35=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_35, grammarAccess.getVirtualNodeTypeAccess().getUploadLinkKeyword_23());
            		
            otherlv_36=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_36, grammarAccess.getVirtualNodeTypeAccess().getColonKeyword_24());
            		
            // InternalFogDsl.g:3116:3: (otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==26) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalFogDsl.g:3117:4: otherlv_37= '-' ( (lv_uploadLink_38_0= ruleNetworkLinksType ) )
            	    {
            	    otherlv_37=(Token)match(input,26,FOLLOW_12); 

            	    				newLeafNode(otherlv_37, grammarAccess.getVirtualNodeTypeAccess().getHyphenMinusKeyword_25_0());
            	    			
            	    // InternalFogDsl.g:3121:4: ( (lv_uploadLink_38_0= ruleNetworkLinksType ) )
            	    // InternalFogDsl.g:3122:5: (lv_uploadLink_38_0= ruleNetworkLinksType )
            	    {
            	    // InternalFogDsl.g:3122:5: (lv_uploadLink_38_0= ruleNetworkLinksType )
            	    // InternalFogDsl.g:3123:6: lv_uploadLink_38_0= ruleNetworkLinksType
            	    {

            	    						newCompositeNode(grammarAccess.getVirtualNodeTypeAccess().getUploadLinkNetworkLinksTypeParserRuleCall_25_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_uploadLink_38_0=ruleNetworkLinksType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVirtualNodeTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"uploadLink",
            	    							lv_uploadLink_38_0,
            	    							"fr.imta.semafor.FogDsl.NetworkLinksType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruleVirtualNodeType"


    // $ANTLR start "entryRulePhysicalNodeType"
    // InternalFogDsl.g:3145:1: entryRulePhysicalNodeType returns [EObject current=null] : iv_rulePhysicalNodeType= rulePhysicalNodeType EOF ;
    public final EObject entryRulePhysicalNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalNodeType = null;


        try {
            // InternalFogDsl.g:3145:57: (iv_rulePhysicalNodeType= rulePhysicalNodeType EOF )
            // InternalFogDsl.g:3146:2: iv_rulePhysicalNodeType= rulePhysicalNodeType EOF
            {
             newCompositeNode(grammarAccess.getPhysicalNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicalNodeType=rulePhysicalNodeType();

            state._fsp--;

             current =iv_rulePhysicalNodeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhysicalNodeType"


    // $ANTLR start "rulePhysicalNodeType"
    // InternalFogDsl.g:3152:1: rulePhysicalNodeType returns [EObject current=null] : ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* )? otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'physicalResources' otherlv_12= ':' ( (lv_constraints_13_0= ruleCpuConstraint ) )* ( (lv_constraints_14_0= ruleMemoryConsraint ) )* ( (lv_constraints_15_0= rulediskConstraint ) )* ( (lv_constraints_16_0= ruleConstraint ) )* otherlv_17= 'networkLinks' otherlv_18= ':' otherlv_19= 'downloadLink' otherlv_20= ':' (otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) ) )* otherlv_23= 'uploadLink' otherlv_24= ':' (otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) ) )* ) ;
    public final EObject rulePhysicalNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_tags_8_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_constraints_14_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_constraints_16_0 = null;

        EObject lv_downloadLink_22_0 = null;

        EObject lv_uploadLink_26_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:3158:2: ( ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* )? otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'physicalResources' otherlv_12= ':' ( (lv_constraints_13_0= ruleCpuConstraint ) )* ( (lv_constraints_14_0= ruleMemoryConsraint ) )* ( (lv_constraints_15_0= rulediskConstraint ) )* ( (lv_constraints_16_0= ruleConstraint ) )* otherlv_17= 'networkLinks' otherlv_18= ':' otherlv_19= 'downloadLink' otherlv_20= ':' (otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) ) )* otherlv_23= 'uploadLink' otherlv_24= ':' (otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) ) )* ) )
            // InternalFogDsl.g:3159:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* )? otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'physicalResources' otherlv_12= ':' ( (lv_constraints_13_0= ruleCpuConstraint ) )* ( (lv_constraints_14_0= ruleMemoryConsraint ) )* ( (lv_constraints_15_0= rulediskConstraint ) )* ( (lv_constraints_16_0= ruleConstraint ) )* otherlv_17= 'networkLinks' otherlv_18= ':' otherlv_19= 'downloadLink' otherlv_20= ':' (otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) ) )* otherlv_23= 'uploadLink' otherlv_24= ':' (otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) ) )* )
            {
            // InternalFogDsl.g:3159:2: ( (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* )? otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'physicalResources' otherlv_12= ':' ( (lv_constraints_13_0= ruleCpuConstraint ) )* ( (lv_constraints_14_0= ruleMemoryConsraint ) )* ( (lv_constraints_15_0= rulediskConstraint ) )* ( (lv_constraints_16_0= ruleConstraint ) )* otherlv_17= 'networkLinks' otherlv_18= ':' otherlv_19= 'downloadLink' otherlv_20= ':' (otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) ) )* otherlv_23= 'uploadLink' otherlv_24= ':' (otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) ) )* )
            // InternalFogDsl.g:3160:3: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* )? otherlv_9= 'Spec' otherlv_10= ':' otherlv_11= 'physicalResources' otherlv_12= ':' ( (lv_constraints_13_0= ruleCpuConstraint ) )* ( (lv_constraints_14_0= ruleMemoryConsraint ) )* ( (lv_constraints_15_0= rulediskConstraint ) )* ( (lv_constraints_16_0= ruleConstraint ) )* otherlv_17= 'networkLinks' otherlv_18= ':' otherlv_19= 'downloadLink' otherlv_20= ':' (otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) ) )* otherlv_23= 'uploadLink' otherlv_24= ':' (otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) ) )*
            {
            // InternalFogDsl.g:3160:3: (otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==23) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalFogDsl.g:3161:4: otherlv_0= 'metadata' otherlv_1= ':' (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'tags' otherlv_6= ':' (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPhysicalNodeTypeAccess().getMetadataKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_0_1());
                    			
                    // InternalFogDsl.g:3169:4: (otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==24) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalFogDsl.g:3170:5: otherlv_2= 'id' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getPhysicalNodeTypeAccess().getIdKeyword_0_2_0());
                            				
                            otherlv_3=(Token)match(input,12,FOLLOW_26); 

                            					newLeafNode(otherlv_3, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_0_2_1());
                            				
                            // InternalFogDsl.g:3178:5: ( (lv_name_4_0= ruleEString ) )
                            // InternalFogDsl.g:3179:6: (lv_name_4_0= ruleEString )
                            {
                            // InternalFogDsl.g:3179:6: (lv_name_4_0= ruleEString )
                            // InternalFogDsl.g:3180:7: lv_name_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getNameEStringParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_name_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_4_0,
                            								"fr.imta.semafor.FogDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPhysicalNodeTypeAccess().getTagsKeyword_0_3());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_0_4());
                    			
                    // InternalFogDsl.g:3206:4: (otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==26) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalFogDsl.g:3207:5: otherlv_7= '-' ( (lv_tags_8_0= ruleTag ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FOLLOW_18); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPhysicalNodeTypeAccess().getHyphenMinusKeyword_0_5_0());
                    	    				
                    	    // InternalFogDsl.g:3211:5: ( (lv_tags_8_0= ruleTag ) )
                    	    // InternalFogDsl.g:3212:6: (lv_tags_8_0= ruleTag )
                    	    {
                    	    // InternalFogDsl.g:3212:6: (lv_tags_8_0= ruleTag )
                    	    // InternalFogDsl.g:3213:7: lv_tags_8_0= ruleTag
                    	    {

                    	    							newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getTagsTagParserRuleCall_0_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_tags_8_0=ruleTag();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tags",
                    	    								lv_tags_8_0,
                    	    								"fr.imta.semafor.FogDsl.Tag");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getPhysicalNodeTypeAccess().getSpecKeyword_1());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_82); 

            			newLeafNode(otherlv_10, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_2());
            		
            otherlv_11=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getPhysicalNodeTypeAccess().getPhysicalResourcesKeyword_3());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_4());
            		
            // InternalFogDsl.g:3248:3: ( (lv_constraints_13_0= ruleCpuConstraint ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==73) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalFogDsl.g:3249:4: (lv_constraints_13_0= ruleCpuConstraint )
            	    {
            	    // InternalFogDsl.g:3249:4: (lv_constraints_13_0= ruleCpuConstraint )
            	    // InternalFogDsl.g:3250:5: lv_constraints_13_0= ruleCpuConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getConstraintsCpuConstraintParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_83);
            	    lv_constraints_13_0=ruleCpuConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_13_0,
            	    						"fr.imta.semafor.FogDsl.CpuConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalFogDsl.g:3267:3: ( (lv_constraints_14_0= ruleMemoryConsraint ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==72) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalFogDsl.g:3268:4: (lv_constraints_14_0= ruleMemoryConsraint )
            	    {
            	    // InternalFogDsl.g:3268:4: (lv_constraints_14_0= ruleMemoryConsraint )
            	    // InternalFogDsl.g:3269:5: lv_constraints_14_0= ruleMemoryConsraint
            	    {

            	    					newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getConstraintsMemoryConsraintParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_84);
            	    lv_constraints_14_0=ruleMemoryConsraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_14_0,
            	    						"fr.imta.semafor.FogDsl.MemoryConsraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalFogDsl.g:3286:3: ( (lv_constraints_15_0= rulediskConstraint ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==71) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalFogDsl.g:3287:4: (lv_constraints_15_0= rulediskConstraint )
            	    {
            	    // InternalFogDsl.g:3287:4: (lv_constraints_15_0= rulediskConstraint )
            	    // InternalFogDsl.g:3288:5: lv_constraints_15_0= rulediskConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getConstraintsDiskConstraintParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_85);
            	    lv_constraints_15_0=rulediskConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_15_0,
            	    						"fr.imta.semafor.FogDsl.diskConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalFogDsl.g:3305:3: ( (lv_constraints_16_0= ruleConstraint ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_STRING)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalFogDsl.g:3306:4: (lv_constraints_16_0= ruleConstraint )
            	    {
            	    // InternalFogDsl.g:3306:4: (lv_constraints_16_0= ruleConstraint )
            	    // InternalFogDsl.g:3307:5: lv_constraints_16_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getConstraintsConstraintParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_86);
            	    lv_constraints_16_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_16_0,
            	    						"fr.imta.semafor.FogDsl.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_17=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getPhysicalNodeTypeAccess().getNetworkLinksKeyword_9());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_18, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_10());
            		
            otherlv_19=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getPhysicalNodeTypeAccess().getDownloadLinkKeyword_11());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_20, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_12());
            		
            // InternalFogDsl.g:3340:3: (otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==26) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalFogDsl.g:3341:4: otherlv_21= '-' ( (lv_downloadLink_22_0= ruleNetworkLinksType ) )
            	    {
            	    otherlv_21=(Token)match(input,26,FOLLOW_12); 

            	    				newLeafNode(otherlv_21, grammarAccess.getPhysicalNodeTypeAccess().getHyphenMinusKeyword_13_0());
            	    			
            	    // InternalFogDsl.g:3345:4: ( (lv_downloadLink_22_0= ruleNetworkLinksType ) )
            	    // InternalFogDsl.g:3346:5: (lv_downloadLink_22_0= ruleNetworkLinksType )
            	    {
            	    // InternalFogDsl.g:3346:5: (lv_downloadLink_22_0= ruleNetworkLinksType )
            	    // InternalFogDsl.g:3347:6: lv_downloadLink_22_0= ruleNetworkLinksType
            	    {

            	    						newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getDownloadLinkNetworkLinksTypeParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_downloadLink_22_0=ruleNetworkLinksType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"downloadLink",
            	    							lv_downloadLink_22_0,
            	    							"fr.imta.semafor.FogDsl.NetworkLinksType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_23=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getPhysicalNodeTypeAccess().getUploadLinkKeyword_14());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_24, grammarAccess.getPhysicalNodeTypeAccess().getColonKeyword_15());
            		
            // InternalFogDsl.g:3373:3: (otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==26) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalFogDsl.g:3374:4: otherlv_25= '-' ( (lv_uploadLink_26_0= ruleNetworkLinksType ) )
            	    {
            	    otherlv_25=(Token)match(input,26,FOLLOW_12); 

            	    				newLeafNode(otherlv_25, grammarAccess.getPhysicalNodeTypeAccess().getHyphenMinusKeyword_16_0());
            	    			
            	    // InternalFogDsl.g:3378:4: ( (lv_uploadLink_26_0= ruleNetworkLinksType ) )
            	    // InternalFogDsl.g:3379:5: (lv_uploadLink_26_0= ruleNetworkLinksType )
            	    {
            	    // InternalFogDsl.g:3379:5: (lv_uploadLink_26_0= ruleNetworkLinksType )
            	    // InternalFogDsl.g:3380:6: lv_uploadLink_26_0= ruleNetworkLinksType
            	    {

            	    						newCompositeNode(grammarAccess.getPhysicalNodeTypeAccess().getUploadLinkNetworkLinksTypeParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_uploadLink_26_0=ruleNetworkLinksType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhysicalNodeTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"uploadLink",
            	    							lv_uploadLink_26_0,
            	    							"fr.imta.semafor.FogDsl.NetworkLinksType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // $ANTLR end "rulePhysicalNodeType"


    // $ANTLR start "entryRuleReplicasConstraint"
    // InternalFogDsl.g:3402:1: entryRuleReplicasConstraint returns [EObject current=null] : iv_ruleReplicasConstraint= ruleReplicasConstraint EOF ;
    public final EObject entryRuleReplicasConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplicasConstraint = null;


        try {
            // InternalFogDsl.g:3402:59: (iv_ruleReplicasConstraint= ruleReplicasConstraint EOF )
            // InternalFogDsl.g:3403:2: iv_ruleReplicasConstraint= ruleReplicasConstraint EOF
            {
             newCompositeNode(grammarAccess.getReplicasConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReplicasConstraint=ruleReplicasConstraint();

            state._fsp--;

             current =iv_ruleReplicasConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReplicasConstraint"


    // $ANTLR start "ruleReplicasConstraint"
    // InternalFogDsl.g:3409:1: ruleReplicasConstraint returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleReplicasAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) ;
    public final EObject ruleReplicasConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:3415:2: ( ( () ( (lv_expression_1_0= ruleReplicasAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) )
            // InternalFogDsl.g:3416:2: ( () ( (lv_expression_1_0= ruleReplicasAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            {
            // InternalFogDsl.g:3416:2: ( () ( (lv_expression_1_0= ruleReplicasAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            // InternalFogDsl.g:3417:3: () ( (lv_expression_1_0= ruleReplicasAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            {
            // InternalFogDsl.g:3417:3: ()
            // InternalFogDsl.g:3418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReplicasConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalFogDsl.g:3424:3: ( (lv_expression_1_0= ruleReplicasAttributeExpression ) )
            // InternalFogDsl.g:3425:4: (lv_expression_1_0= ruleReplicasAttributeExpression )
            {
            // InternalFogDsl.g:3425:4: (lv_expression_1_0= ruleReplicasAttributeExpression )
            // InternalFogDsl.g:3426:5: lv_expression_1_0= ruleReplicasAttributeExpression
            {

            					newCompositeNode(grammarAccess.getReplicasConstraintAccess().getExpressionReplicasAttributeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_1_0=ruleReplicasAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplicasConstraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"fr.imta.semafor.FogDsl.ReplicasAttributeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getReplicasConstraintAccess().getColonKeyword_2());
            		
            // InternalFogDsl.g:3447:3: ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_INT) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=82 && LA70_0<=86)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalFogDsl.g:3448:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3448:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3449:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3449:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3450:6: lv_expression_3_0= ruleIntegerValueExpression
                    {

                    						newCompositeNode(grammarAccess.getReplicasConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleIntegerValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReplicasConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:3468:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    {
                    // InternalFogDsl.g:3468:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    // InternalFogDsl.g:3469:5: ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3469:5: ( (lv_operator_4_0= ruleComparaisonOperator ) )
                    // InternalFogDsl.g:3470:6: (lv_operator_4_0= ruleComparaisonOperator )
                    {
                    // InternalFogDsl.g:3470:6: (lv_operator_4_0= ruleComparaisonOperator )
                    // InternalFogDsl.g:3471:7: lv_operator_4_0= ruleComparaisonOperator
                    {

                    							newCompositeNode(grammarAccess.getReplicasConstraintAccess().getOperatorComparaisonOperatorEnumRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_operator_4_0=ruleComparaisonOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getReplicasConstraintRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_4_0,
                    								"fr.imta.semafor.FogDsl.ComparaisonOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_56); 

                    					newLeafNode(otherlv_5, grammarAccess.getReplicasConstraintAccess().getColonKeyword_3_1_1());
                    				
                    // InternalFogDsl.g:3492:5: ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3493:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3493:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3494:7: lv_expression_6_0= ruleIntegerValueExpression
                    {

                    							newCompositeNode(grammarAccess.getReplicasConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleIntegerValueExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getReplicasConstraintRule());
                    							}
                    							add(
                    								current,
                    								"expression",
                    								lv_expression_6_0,
                    								"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleReplicasConstraint"


    // $ANTLR start "entryRuleCustomExpression"
    // InternalFogDsl.g:3517:1: entryRuleCustomExpression returns [EObject current=null] : iv_ruleCustomExpression= ruleCustomExpression EOF ;
    public final EObject entryRuleCustomExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomExpression = null;


        try {
            // InternalFogDsl.g:3517:57: (iv_ruleCustomExpression= ruleCustomExpression EOF )
            // InternalFogDsl.g:3518:2: iv_ruleCustomExpression= ruleCustomExpression EOF
            {
             newCompositeNode(grammarAccess.getCustomExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomExpression=ruleCustomExpression();

            state._fsp--;

             current =iv_ruleCustomExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomExpression"


    // $ANTLR start "ruleCustomExpression"
    // InternalFogDsl.g:3524:1: ruleCustomExpression returns [EObject current=null] : ( (lv_expression_0_0= RULE_STRING ) ) ;
    public final EObject ruleCustomExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:3530:2: ( ( (lv_expression_0_0= RULE_STRING ) ) )
            // InternalFogDsl.g:3531:2: ( (lv_expression_0_0= RULE_STRING ) )
            {
            // InternalFogDsl.g:3531:2: ( (lv_expression_0_0= RULE_STRING ) )
            // InternalFogDsl.g:3532:3: (lv_expression_0_0= RULE_STRING )
            {
            // InternalFogDsl.g:3532:3: (lv_expression_0_0= RULE_STRING )
            // InternalFogDsl.g:3533:4: lv_expression_0_0= RULE_STRING
            {
            lv_expression_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_expression_0_0, grammarAccess.getCustomExpressionAccess().getExpressionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCustomExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleCustomExpression"


    // $ANTLR start "entryRulediskConstraint"
    // InternalFogDsl.g:3552:1: entryRulediskConstraint returns [EObject current=null] : iv_rulediskConstraint= rulediskConstraint EOF ;
    public final EObject entryRulediskConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulediskConstraint = null;


        try {
            // InternalFogDsl.g:3552:55: (iv_rulediskConstraint= rulediskConstraint EOF )
            // InternalFogDsl.g:3553:2: iv_rulediskConstraint= rulediskConstraint EOF
            {
             newCompositeNode(grammarAccess.getDiskConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulediskConstraint=rulediskConstraint();

            state._fsp--;

             current =iv_rulediskConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulediskConstraint"


    // $ANTLR start "rulediskConstraint"
    // InternalFogDsl.g:3559:1: rulediskConstraint returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleDiskAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) ;
    public final EObject rulediskConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:3565:2: ( ( () ( (lv_expression_1_0= ruleDiskAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) )
            // InternalFogDsl.g:3566:2: ( () ( (lv_expression_1_0= ruleDiskAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            {
            // InternalFogDsl.g:3566:2: ( () ( (lv_expression_1_0= ruleDiskAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            // InternalFogDsl.g:3567:3: () ( (lv_expression_1_0= ruleDiskAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            {
            // InternalFogDsl.g:3567:3: ()
            // InternalFogDsl.g:3568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalFogDsl.g:3574:3: ( (lv_expression_1_0= ruleDiskAttributeExpression ) )
            // InternalFogDsl.g:3575:4: (lv_expression_1_0= ruleDiskAttributeExpression )
            {
            // InternalFogDsl.g:3575:4: (lv_expression_1_0= ruleDiskAttributeExpression )
            // InternalFogDsl.g:3576:5: lv_expression_1_0= ruleDiskAttributeExpression
            {

            					newCompositeNode(grammarAccess.getDiskConstraintAccess().getExpressionDiskAttributeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_1_0=ruleDiskAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiskConstraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"fr.imta.semafor.FogDsl.DiskAttributeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskConstraintAccess().getColonKeyword_2());
            		
            // InternalFogDsl.g:3597:3: ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_INT) ) {
                alt71=1;
            }
            else if ( ((LA71_0>=82 && LA71_0<=86)) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalFogDsl.g:3598:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3598:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3599:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3599:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3600:6: lv_expression_3_0= ruleIntegerValueExpression
                    {

                    						newCompositeNode(grammarAccess.getDiskConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleIntegerValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiskConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:3618:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    {
                    // InternalFogDsl.g:3618:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    // InternalFogDsl.g:3619:5: ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3619:5: ( (lv_operator_4_0= ruleComparaisonOperator ) )
                    // InternalFogDsl.g:3620:6: (lv_operator_4_0= ruleComparaisonOperator )
                    {
                    // InternalFogDsl.g:3620:6: (lv_operator_4_0= ruleComparaisonOperator )
                    // InternalFogDsl.g:3621:7: lv_operator_4_0= ruleComparaisonOperator
                    {

                    							newCompositeNode(grammarAccess.getDiskConstraintAccess().getOperatorComparaisonOperatorEnumRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_operator_4_0=ruleComparaisonOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDiskConstraintRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_4_0,
                    								"fr.imta.semafor.FogDsl.ComparaisonOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_56); 

                    					newLeafNode(otherlv_5, grammarAccess.getDiskConstraintAccess().getColonKeyword_3_1_1());
                    				
                    // InternalFogDsl.g:3642:5: ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3643:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3643:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3644:7: lv_expression_6_0= ruleIntegerValueExpression
                    {

                    							newCompositeNode(grammarAccess.getDiskConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleIntegerValueExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDiskConstraintRule());
                    							}
                    							add(
                    								current,
                    								"expression",
                    								lv_expression_6_0,
                    								"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulediskConstraint"


    // $ANTLR start "entryRuleMemoryConsraint"
    // InternalFogDsl.g:3667:1: entryRuleMemoryConsraint returns [EObject current=null] : iv_ruleMemoryConsraint= ruleMemoryConsraint EOF ;
    public final EObject entryRuleMemoryConsraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryConsraint = null;


        try {
            // InternalFogDsl.g:3667:56: (iv_ruleMemoryConsraint= ruleMemoryConsraint EOF )
            // InternalFogDsl.g:3668:2: iv_ruleMemoryConsraint= ruleMemoryConsraint EOF
            {
             newCompositeNode(grammarAccess.getMemoryConsraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryConsraint=ruleMemoryConsraint();

            state._fsp--;

             current =iv_ruleMemoryConsraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMemoryConsraint"


    // $ANTLR start "ruleMemoryConsraint"
    // InternalFogDsl.g:3674:1: ruleMemoryConsraint returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleMemoryAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) ;
    public final EObject ruleMemoryConsraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:3680:2: ( ( () ( (lv_expression_1_0= ruleMemoryAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) )
            // InternalFogDsl.g:3681:2: ( () ( (lv_expression_1_0= ruleMemoryAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            {
            // InternalFogDsl.g:3681:2: ( () ( (lv_expression_1_0= ruleMemoryAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            // InternalFogDsl.g:3682:3: () ( (lv_expression_1_0= ruleMemoryAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            {
            // InternalFogDsl.g:3682:3: ()
            // InternalFogDsl.g:3683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryConsraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalFogDsl.g:3689:3: ( (lv_expression_1_0= ruleMemoryAttributeExpression ) )
            // InternalFogDsl.g:3690:4: (lv_expression_1_0= ruleMemoryAttributeExpression )
            {
            // InternalFogDsl.g:3690:4: (lv_expression_1_0= ruleMemoryAttributeExpression )
            // InternalFogDsl.g:3691:5: lv_expression_1_0= ruleMemoryAttributeExpression
            {

            					newCompositeNode(grammarAccess.getMemoryConsraintAccess().getExpressionMemoryAttributeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_1_0=ruleMemoryAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemoryConsraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"fr.imta.semafor.FogDsl.MemoryAttributeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getMemoryConsraintAccess().getColonKeyword_2());
            		
            // InternalFogDsl.g:3712:3: ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_INT) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=82 && LA72_0<=86)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalFogDsl.g:3713:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3713:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3714:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3714:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3715:6: lv_expression_3_0= ruleIntegerValueExpression
                    {

                    						newCompositeNode(grammarAccess.getMemoryConsraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleIntegerValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemoryConsraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:3733:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    {
                    // InternalFogDsl.g:3733:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    // InternalFogDsl.g:3734:5: ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3734:5: ( (lv_operator_4_0= ruleComparaisonOperator ) )
                    // InternalFogDsl.g:3735:6: (lv_operator_4_0= ruleComparaisonOperator )
                    {
                    // InternalFogDsl.g:3735:6: (lv_operator_4_0= ruleComparaisonOperator )
                    // InternalFogDsl.g:3736:7: lv_operator_4_0= ruleComparaisonOperator
                    {

                    							newCompositeNode(grammarAccess.getMemoryConsraintAccess().getOperatorComparaisonOperatorEnumRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_operator_4_0=ruleComparaisonOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMemoryConsraintRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_4_0,
                    								"fr.imta.semafor.FogDsl.ComparaisonOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_56); 

                    					newLeafNode(otherlv_5, grammarAccess.getMemoryConsraintAccess().getColonKeyword_3_1_1());
                    				
                    // InternalFogDsl.g:3757:5: ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3758:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3758:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3759:7: lv_expression_6_0= ruleIntegerValueExpression
                    {

                    							newCompositeNode(grammarAccess.getMemoryConsraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleIntegerValueExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMemoryConsraintRule());
                    							}
                    							add(
                    								current,
                    								"expression",
                    								lv_expression_6_0,
                    								"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMemoryConsraint"


    // $ANTLR start "entryRuleCpuConstraint"
    // InternalFogDsl.g:3782:1: entryRuleCpuConstraint returns [EObject current=null] : iv_ruleCpuConstraint= ruleCpuConstraint EOF ;
    public final EObject entryRuleCpuConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCpuConstraint = null;


        try {
            // InternalFogDsl.g:3782:54: (iv_ruleCpuConstraint= ruleCpuConstraint EOF )
            // InternalFogDsl.g:3783:2: iv_ruleCpuConstraint= ruleCpuConstraint EOF
            {
             newCompositeNode(grammarAccess.getCpuConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCpuConstraint=ruleCpuConstraint();

            state._fsp--;

             current =iv_ruleCpuConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCpuConstraint"


    // $ANTLR start "ruleCpuConstraint"
    // InternalFogDsl.g:3789:1: ruleCpuConstraint returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleCpuAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) ;
    public final EObject ruleCpuConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalFogDsl.g:3795:2: ( ( () ( (lv_expression_1_0= ruleCpuAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) ) )
            // InternalFogDsl.g:3796:2: ( () ( (lv_expression_1_0= ruleCpuAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            {
            // InternalFogDsl.g:3796:2: ( () ( (lv_expression_1_0= ruleCpuAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) ) )
            // InternalFogDsl.g:3797:3: () ( (lv_expression_1_0= ruleCpuAttributeExpression ) ) otherlv_2= ':' ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            {
            // InternalFogDsl.g:3797:3: ()
            // InternalFogDsl.g:3798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCpuConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalFogDsl.g:3804:3: ( (lv_expression_1_0= ruleCpuAttributeExpression ) )
            // InternalFogDsl.g:3805:4: (lv_expression_1_0= ruleCpuAttributeExpression )
            {
            // InternalFogDsl.g:3805:4: (lv_expression_1_0= ruleCpuAttributeExpression )
            // InternalFogDsl.g:3806:5: lv_expression_1_0= ruleCpuAttributeExpression
            {

            					newCompositeNode(grammarAccess.getCpuConstraintAccess().getExpressionCpuAttributeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_expression_1_0=ruleCpuAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCpuConstraintRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"fr.imta.semafor.FogDsl.CpuAttributeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getCpuConstraintAccess().getColonKeyword_2());
            		
            // InternalFogDsl.g:3827:3: ( ( (lv_expression_3_0= ruleIntegerValueExpression ) ) | ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                alt73=1;
            }
            else if ( ((LA73_0>=82 && LA73_0<=86)) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalFogDsl.g:3828:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3828:4: ( (lv_expression_3_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3829:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3829:5: (lv_expression_3_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3830:6: lv_expression_3_0= ruleIntegerValueExpression
                    {

                    						newCompositeNode(grammarAccess.getCpuConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleIntegerValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCpuConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:3848:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    {
                    // InternalFogDsl.g:3848:4: ( ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) ) )
                    // InternalFogDsl.g:3849:5: ( (lv_operator_4_0= ruleComparaisonOperator ) ) otherlv_5= ':' ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    {
                    // InternalFogDsl.g:3849:5: ( (lv_operator_4_0= ruleComparaisonOperator ) )
                    // InternalFogDsl.g:3850:6: (lv_operator_4_0= ruleComparaisonOperator )
                    {
                    // InternalFogDsl.g:3850:6: (lv_operator_4_0= ruleComparaisonOperator )
                    // InternalFogDsl.g:3851:7: lv_operator_4_0= ruleComparaisonOperator
                    {

                    							newCompositeNode(grammarAccess.getCpuConstraintAccess().getOperatorComparaisonOperatorEnumRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_operator_4_0=ruleComparaisonOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCpuConstraintRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_4_0,
                    								"fr.imta.semafor.FogDsl.ComparaisonOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_56); 

                    					newLeafNode(otherlv_5, grammarAccess.getCpuConstraintAccess().getColonKeyword_3_1_1());
                    				
                    // InternalFogDsl.g:3872:5: ( (lv_expression_6_0= ruleIntegerValueExpression ) )
                    // InternalFogDsl.g:3873:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    {
                    // InternalFogDsl.g:3873:6: (lv_expression_6_0= ruleIntegerValueExpression )
                    // InternalFogDsl.g:3874:7: lv_expression_6_0= ruleIntegerValueExpression
                    {

                    							newCompositeNode(grammarAccess.getCpuConstraintAccess().getExpressionIntegerValueExpressionParserRuleCall_3_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleIntegerValueExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCpuConstraintRule());
                    							}
                    							add(
                    								current,
                    								"expression",
                    								lv_expression_6_0,
                    								"fr.imta.semafor.FogDsl.IntegerValueExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCpuConstraint"


    // $ANTLR start "entryRuleIntegerValueExpression"
    // InternalFogDsl.g:3897:1: entryRuleIntegerValueExpression returns [EObject current=null] : iv_ruleIntegerValueExpression= ruleIntegerValueExpression EOF ;
    public final EObject entryRuleIntegerValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueExpression = null;


        try {
            // InternalFogDsl.g:3897:63: (iv_ruleIntegerValueExpression= ruleIntegerValueExpression EOF )
            // InternalFogDsl.g:3898:2: iv_ruleIntegerValueExpression= ruleIntegerValueExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValueExpression=ruleIntegerValueExpression();

            state._fsp--;

             current =iv_ruleIntegerValueExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerValueExpression"


    // $ANTLR start "ruleIntegerValueExpression"
    // InternalFogDsl.g:3904:1: ruleIntegerValueExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerValueExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:3910:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalFogDsl.g:3911:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalFogDsl.g:3911:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalFogDsl.g:3912:3: (lv_value_0_0= RULE_INT )
            {
            // InternalFogDsl.g:3912:3: (lv_value_0_0= RULE_INT )
            // InternalFogDsl.g:3913:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerValueExpressionAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerValueExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntegerValueExpression"


    // $ANTLR start "entryRuleReplicasAttributeExpression"
    // InternalFogDsl.g:3932:1: entryRuleReplicasAttributeExpression returns [EObject current=null] : iv_ruleReplicasAttributeExpression= ruleReplicasAttributeExpression EOF ;
    public final EObject entryRuleReplicasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplicasAttributeExpression = null;


        try {
            // InternalFogDsl.g:3932:68: (iv_ruleReplicasAttributeExpression= ruleReplicasAttributeExpression EOF )
            // InternalFogDsl.g:3933:2: iv_ruleReplicasAttributeExpression= ruleReplicasAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getReplicasAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReplicasAttributeExpression=ruleReplicasAttributeExpression();

            state._fsp--;

             current =iv_ruleReplicasAttributeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReplicasAttributeExpression"


    // $ANTLR start "ruleReplicasAttributeExpression"
    // InternalFogDsl.g:3939:1: ruleReplicasAttributeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'replicas' ) ) ;
    public final EObject ruleReplicasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:3945:2: ( ( (lv_attributeName_0_0= 'replicas' ) ) )
            // InternalFogDsl.g:3946:2: ( (lv_attributeName_0_0= 'replicas' ) )
            {
            // InternalFogDsl.g:3946:2: ( (lv_attributeName_0_0= 'replicas' ) )
            // InternalFogDsl.g:3947:3: (lv_attributeName_0_0= 'replicas' )
            {
            // InternalFogDsl.g:3947:3: (lv_attributeName_0_0= 'replicas' )
            // InternalFogDsl.g:3948:4: lv_attributeName_0_0= 'replicas'
            {
            lv_attributeName_0_0=(Token)match(input,69,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getReplicasAttributeExpressionAccess().getAttributeNameReplicasKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReplicasAttributeExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "replicas");
            			

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
    // $ANTLR end "ruleReplicasAttributeExpression"


    // $ANTLR start "entryRuleRuntimesAttributeExpression"
    // InternalFogDsl.g:3963:1: entryRuleRuntimesAttributeExpression returns [EObject current=null] : iv_ruleRuntimesAttributeExpression= ruleRuntimesAttributeExpression EOF ;
    public final EObject entryRuleRuntimesAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimesAttributeExpression = null;


        try {
            // InternalFogDsl.g:3963:68: (iv_ruleRuntimesAttributeExpression= ruleRuntimesAttributeExpression EOF )
            // InternalFogDsl.g:3964:2: iv_ruleRuntimesAttributeExpression= ruleRuntimesAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getRuntimesAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuntimesAttributeExpression=ruleRuntimesAttributeExpression();

            state._fsp--;

             current =iv_ruleRuntimesAttributeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuntimesAttributeExpression"


    // $ANTLR start "ruleRuntimesAttributeExpression"
    // InternalFogDsl.g:3970:1: ruleRuntimesAttributeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'runtimes' ) ) ;
    public final EObject ruleRuntimesAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:3976:2: ( ( (lv_attributeName_0_0= 'runtimes' ) ) )
            // InternalFogDsl.g:3977:2: ( (lv_attributeName_0_0= 'runtimes' ) )
            {
            // InternalFogDsl.g:3977:2: ( (lv_attributeName_0_0= 'runtimes' ) )
            // InternalFogDsl.g:3978:3: (lv_attributeName_0_0= 'runtimes' )
            {
            // InternalFogDsl.g:3978:3: (lv_attributeName_0_0= 'runtimes' )
            // InternalFogDsl.g:3979:4: lv_attributeName_0_0= 'runtimes'
            {
            lv_attributeName_0_0=(Token)match(input,70,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getRuntimesAttributeExpressionAccess().getAttributeNameRuntimesKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRuntimesAttributeExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "runtimes");
            			

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
    // $ANTLR end "ruleRuntimesAttributeExpression"


    // $ANTLR start "entryRuleDiskAttributeExpression"
    // InternalFogDsl.g:3994:1: entryRuleDiskAttributeExpression returns [EObject current=null] : iv_ruleDiskAttributeExpression= ruleDiskAttributeExpression EOF ;
    public final EObject entryRuleDiskAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskAttributeExpression = null;


        try {
            // InternalFogDsl.g:3994:64: (iv_ruleDiskAttributeExpression= ruleDiskAttributeExpression EOF )
            // InternalFogDsl.g:3995:2: iv_ruleDiskAttributeExpression= ruleDiskAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getDiskAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskAttributeExpression=ruleDiskAttributeExpression();

            state._fsp--;

             current =iv_ruleDiskAttributeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiskAttributeExpression"


    // $ANTLR start "ruleDiskAttributeExpression"
    // InternalFogDsl.g:4001:1: ruleDiskAttributeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'diskStorage' ) ) ;
    public final EObject ruleDiskAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4007:2: ( ( (lv_attributeName_0_0= 'diskStorage' ) ) )
            // InternalFogDsl.g:4008:2: ( (lv_attributeName_0_0= 'diskStorage' ) )
            {
            // InternalFogDsl.g:4008:2: ( (lv_attributeName_0_0= 'diskStorage' ) )
            // InternalFogDsl.g:4009:3: (lv_attributeName_0_0= 'diskStorage' )
            {
            // InternalFogDsl.g:4009:3: (lv_attributeName_0_0= 'diskStorage' )
            // InternalFogDsl.g:4010:4: lv_attributeName_0_0= 'diskStorage'
            {
            lv_attributeName_0_0=(Token)match(input,71,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getDiskAttributeExpressionAccess().getAttributeNameDiskStorageKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDiskAttributeExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "diskStorage");
            			

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
    // $ANTLR end "ruleDiskAttributeExpression"


    // $ANTLR start "entryRuleMemoryAttributeExpression"
    // InternalFogDsl.g:4025:1: entryRuleMemoryAttributeExpression returns [EObject current=null] : iv_ruleMemoryAttributeExpression= ruleMemoryAttributeExpression EOF ;
    public final EObject entryRuleMemoryAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryAttributeExpression = null;


        try {
            // InternalFogDsl.g:4025:66: (iv_ruleMemoryAttributeExpression= ruleMemoryAttributeExpression EOF )
            // InternalFogDsl.g:4026:2: iv_ruleMemoryAttributeExpression= ruleMemoryAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getMemoryAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryAttributeExpression=ruleMemoryAttributeExpression();

            state._fsp--;

             current =iv_ruleMemoryAttributeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMemoryAttributeExpression"


    // $ANTLR start "ruleMemoryAttributeExpression"
    // InternalFogDsl.g:4032:1: ruleMemoryAttributeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'memory' ) ) ;
    public final EObject ruleMemoryAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4038:2: ( ( (lv_attributeName_0_0= 'memory' ) ) )
            // InternalFogDsl.g:4039:2: ( (lv_attributeName_0_0= 'memory' ) )
            {
            // InternalFogDsl.g:4039:2: ( (lv_attributeName_0_0= 'memory' ) )
            // InternalFogDsl.g:4040:3: (lv_attributeName_0_0= 'memory' )
            {
            // InternalFogDsl.g:4040:3: (lv_attributeName_0_0= 'memory' )
            // InternalFogDsl.g:4041:4: lv_attributeName_0_0= 'memory'
            {
            lv_attributeName_0_0=(Token)match(input,72,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getMemoryAttributeExpressionAccess().getAttributeNameMemoryKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMemoryAttributeExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "memory");
            			

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
    // $ANTLR end "ruleMemoryAttributeExpression"


    // $ANTLR start "entryRuleCpuAttributeExpression"
    // InternalFogDsl.g:4056:1: entryRuleCpuAttributeExpression returns [EObject current=null] : iv_ruleCpuAttributeExpression= ruleCpuAttributeExpression EOF ;
    public final EObject entryRuleCpuAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCpuAttributeExpression = null;


        try {
            // InternalFogDsl.g:4056:63: (iv_ruleCpuAttributeExpression= ruleCpuAttributeExpression EOF )
            // InternalFogDsl.g:4057:2: iv_ruleCpuAttributeExpression= ruleCpuAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getCpuAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCpuAttributeExpression=ruleCpuAttributeExpression();

            state._fsp--;

             current =iv_ruleCpuAttributeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCpuAttributeExpression"


    // $ANTLR start "ruleCpuAttributeExpression"
    // InternalFogDsl.g:4063:1: ruleCpuAttributeExpression returns [EObject current=null] : ( (lv_attributeName_0_0= 'CpuCores' ) ) ;
    public final EObject ruleCpuAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4069:2: ( ( (lv_attributeName_0_0= 'CpuCores' ) ) )
            // InternalFogDsl.g:4070:2: ( (lv_attributeName_0_0= 'CpuCores' ) )
            {
            // InternalFogDsl.g:4070:2: ( (lv_attributeName_0_0= 'CpuCores' ) )
            // InternalFogDsl.g:4071:3: (lv_attributeName_0_0= 'CpuCores' )
            {
            // InternalFogDsl.g:4071:3: (lv_attributeName_0_0= 'CpuCores' )
            // InternalFogDsl.g:4072:4: lv_attributeName_0_0= 'CpuCores'
            {
            lv_attributeName_0_0=(Token)match(input,73,FOLLOW_2); 

            				newLeafNode(lv_attributeName_0_0, grammarAccess.getCpuAttributeExpressionAccess().getAttributeNameCpuCoresKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCpuAttributeExpressionRule());
            				}
            				setWithLastConsumed(current, "attributeName", lv_attributeName_0_0, "CpuCores");
            			

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
    // $ANTLR end "ruleCpuAttributeExpression"


    // $ANTLR start "entryRuleValue"
    // InternalFogDsl.g:4087:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalFogDsl.g:4087:45: (iv_ruleValue= ruleValue EOF )
            // InternalFogDsl.g:4088:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalFogDsl.g:4094:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4100:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) )
            // InternalFogDsl.g:4101:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            {
            // InternalFogDsl.g:4101:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_STRING) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_INT) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalFogDsl.g:4102:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:4110:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleTag"
    // InternalFogDsl.g:4121:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalFogDsl.g:4121:44: (iv_ruleTag= ruleTag EOF )
            // InternalFogDsl.g:4122:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalFogDsl.g:4128:1: ruleTag returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4134:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_ID ) ) ) )
            // InternalFogDsl.g:4135:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // InternalFogDsl.g:4135:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_ID ) ) )
            // InternalFogDsl.g:4136:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_ID ) )
            {
            // InternalFogDsl.g:4136:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalFogDsl.g:4137:4: (lv_key_0_0= RULE_ID )
            {
            // InternalFogDsl.g:4137:4: (lv_key_0_0= RULE_ID )
            // InternalFogDsl.g:4138:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_key_0_0, grammarAccess.getTagAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getColonKeyword_1());
            		
            // InternalFogDsl.g:4158:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalFogDsl.g:4159:4: (lv_value_2_0= RULE_ID )
            {
            // InternalFogDsl.g:4159:4: (lv_value_2_0= RULE_ID )
            // InternalFogDsl.g:4160:5: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTagAccess().getValueIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleEString"
    // InternalFogDsl.g:4180:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFogDsl.g:4180:47: (iv_ruleEString= ruleEString EOF )
            // InternalFogDsl.g:4181:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFogDsl.g:4187:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4193:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFogDsl.g:4194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFogDsl.g:4194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_STRING) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalFogDsl.g:4195:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:4203:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleMultiplicityOperator"
    // InternalFogDsl.g:4214:1: ruleMultiplicityOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'allOf' ) | (enumLiteral_1= 'anyOf' ) | (enumLiteral_2= 'exclusivelyOneOf' ) ) ;
    public final Enumerator ruleMultiplicityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4220:2: ( ( (enumLiteral_0= 'allOf' ) | (enumLiteral_1= 'anyOf' ) | (enumLiteral_2= 'exclusivelyOneOf' ) ) )
            // InternalFogDsl.g:4221:2: ( (enumLiteral_0= 'allOf' ) | (enumLiteral_1= 'anyOf' ) | (enumLiteral_2= 'exclusivelyOneOf' ) )
            {
            // InternalFogDsl.g:4221:2: ( (enumLiteral_0= 'allOf' ) | (enumLiteral_1= 'anyOf' ) | (enumLiteral_2= 'exclusivelyOneOf' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt76=1;
                }
                break;
            case 75:
                {
                alt76=2;
                }
                break;
            case 76:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalFogDsl.g:4222:3: (enumLiteral_0= 'allOf' )
                    {
                    // InternalFogDsl.g:4222:3: (enumLiteral_0= 'allOf' )
                    // InternalFogDsl.g:4223:4: enumLiteral_0= 'allOf'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityOperatorAccess().getAllOfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityOperatorAccess().getAllOfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:4230:3: (enumLiteral_1= 'anyOf' )
                    {
                    // InternalFogDsl.g:4230:3: (enumLiteral_1= 'anyOf' )
                    // InternalFogDsl.g:4231:4: enumLiteral_1= 'anyOf'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityOperatorAccess().getAllOfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityOperatorAccess().getAllOfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFogDsl.g:4238:3: (enumLiteral_2= 'exclusivelyOneOf' )
                    {
                    // InternalFogDsl.g:4238:3: (enumLiteral_2= 'exclusivelyOneOf' )
                    // InternalFogDsl.g:4239:4: enumLiteral_2= 'exclusivelyOneOf'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityOperatorAccess().getExclusivelyOneOfEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicityOperatorAccess().getExclusivelyOneOfEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMultiplicityOperator"


    // $ANTLR start "ruleTransportProtocol"
    // InternalFogDsl.g:4249:1: ruleTransportProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) ;
    public final Enumerator ruleTransportProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4255:2: ( ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) )
            // InternalFogDsl.g:4256:2: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            {
            // InternalFogDsl.g:4256:2: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==77) ) {
                alt77=1;
            }
            else if ( (LA77_0==78) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalFogDsl.g:4257:3: (enumLiteral_0= 'TCP' )
                    {
                    // InternalFogDsl.g:4257:3: (enumLiteral_0= 'TCP' )
                    // InternalFogDsl.g:4258:4: enumLiteral_0= 'TCP'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getTransportProtocolAccess().getTCPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransportProtocolAccess().getTCPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:4265:3: (enumLiteral_1= 'UDP' )
                    {
                    // InternalFogDsl.g:4265:3: (enumLiteral_1= 'UDP' )
                    // InternalFogDsl.g:4266:4: enumLiteral_1= 'UDP'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getTransportProtocolAccess().getUDPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransportProtocolAccess().getUDPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTransportProtocol"


    // $ANTLR start "ruleNetworkClassEnum"
    // InternalFogDsl.g:4276:1: ruleNetworkClassEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Ethernet' ) | (enumLiteral_1= 'Wifi' ) | (enumLiteral_2= 'Bluetooth' ) ) ;
    public final Enumerator ruleNetworkClassEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4282:2: ( ( (enumLiteral_0= 'Ethernet' ) | (enumLiteral_1= 'Wifi' ) | (enumLiteral_2= 'Bluetooth' ) ) )
            // InternalFogDsl.g:4283:2: ( (enumLiteral_0= 'Ethernet' ) | (enumLiteral_1= 'Wifi' ) | (enumLiteral_2= 'Bluetooth' ) )
            {
            // InternalFogDsl.g:4283:2: ( (enumLiteral_0= 'Ethernet' ) | (enumLiteral_1= 'Wifi' ) | (enumLiteral_2= 'Bluetooth' ) )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt78=1;
                }
                break;
            case 80:
                {
                alt78=2;
                }
                break;
            case 81:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalFogDsl.g:4284:3: (enumLiteral_0= 'Ethernet' )
                    {
                    // InternalFogDsl.g:4284:3: (enumLiteral_0= 'Ethernet' )
                    // InternalFogDsl.g:4285:4: enumLiteral_0= 'Ethernet'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getNetworkClassEnumAccess().getEthernetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNetworkClassEnumAccess().getEthernetEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:4292:3: (enumLiteral_1= 'Wifi' )
                    {
                    // InternalFogDsl.g:4292:3: (enumLiteral_1= 'Wifi' )
                    // InternalFogDsl.g:4293:4: enumLiteral_1= 'Wifi'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getNetworkClassEnumAccess().getWifiEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNetworkClassEnumAccess().getWifiEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFogDsl.g:4300:3: (enumLiteral_2= 'Bluetooth' )
                    {
                    // InternalFogDsl.g:4300:3: (enumLiteral_2= 'Bluetooth' )
                    // InternalFogDsl.g:4301:4: enumLiteral_2= 'Bluetooth'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getNetworkClassEnumAccess().getBluetoothEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNetworkClassEnumAccess().getBluetoothEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNetworkClassEnum"


    // $ANTLR start "ruleComparaisonOperator"
    // InternalFogDsl.g:4311:1: ruleComparaisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Lesser' ) | (enumLiteral_1= 'Greater' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'LesserOrEqual' ) | (enumLiteral_4= 'GreaterOrEqual' ) ) ;
    public final Enumerator ruleComparaisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFogDsl.g:4317:2: ( ( (enumLiteral_0= 'Lesser' ) | (enumLiteral_1= 'Greater' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'LesserOrEqual' ) | (enumLiteral_4= 'GreaterOrEqual' ) ) )
            // InternalFogDsl.g:4318:2: ( (enumLiteral_0= 'Lesser' ) | (enumLiteral_1= 'Greater' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'LesserOrEqual' ) | (enumLiteral_4= 'GreaterOrEqual' ) )
            {
            // InternalFogDsl.g:4318:2: ( (enumLiteral_0= 'Lesser' ) | (enumLiteral_1= 'Greater' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'LesserOrEqual' ) | (enumLiteral_4= 'GreaterOrEqual' ) )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt79=1;
                }
                break;
            case 83:
                {
                alt79=2;
                }
                break;
            case 84:
                {
                alt79=3;
                }
                break;
            case 85:
                {
                alt79=4;
                }
                break;
            case 86:
                {
                alt79=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalFogDsl.g:4319:3: (enumLiteral_0= 'Lesser' )
                    {
                    // InternalFogDsl.g:4319:3: (enumLiteral_0= 'Lesser' )
                    // InternalFogDsl.g:4320:4: enumLiteral_0= 'Lesser'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getComparaisonOperatorAccess().getLesserEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparaisonOperatorAccess().getLesserEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFogDsl.g:4327:3: (enumLiteral_1= 'Greater' )
                    {
                    // InternalFogDsl.g:4327:3: (enumLiteral_1= 'Greater' )
                    // InternalFogDsl.g:4328:4: enumLiteral_1= 'Greater'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getComparaisonOperatorAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparaisonOperatorAccess().getGreaterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFogDsl.g:4335:3: (enumLiteral_2= 'Equal' )
                    {
                    // InternalFogDsl.g:4335:3: (enumLiteral_2= 'Equal' )
                    // InternalFogDsl.g:4336:4: enumLiteral_2= 'Equal'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getComparaisonOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparaisonOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFogDsl.g:4343:3: (enumLiteral_3= 'LesserOrEqual' )
                    {
                    // InternalFogDsl.g:4343:3: (enumLiteral_3= 'LesserOrEqual' )
                    // InternalFogDsl.g:4344:4: enumLiteral_3= 'LesserOrEqual'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getComparaisonOperatorAccess().getLesserOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparaisonOperatorAccess().getLesserOrEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFogDsl.g:4351:3: (enumLiteral_4= 'GreaterOrEqual' )
                    {
                    // InternalFogDsl.g:4351:3: (enumLiteral_4= 'GreaterOrEqual' )
                    // InternalFogDsl.g:4352:4: enumLiteral_4= 'GreaterOrEqual'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getComparaisonOperatorAccess().getGreaterOrEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparaisonOperatorAccess().getGreaterOrEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleComparaisonOperator"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\16\1\14\1\17\10\uffff";
    static final String dfa_3s = "\1\16\1\14\1\26\10\uffff";
    static final String dfa_4s = "\3\uffff\1\7\1\10\1\1\1\5\1\2\1\4\1\6\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\5\1\7\1\12\1\10\1\6\1\11\1\3\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "92:3: ( (otherlv_3= 'resourceType' otherlv_4= ':' otherlv_5= 'FogArea' this_fogArea_6= rulefogArea ) | (otherlv_7= 'resourceType' otherlv_8= ':' otherlv_9= 'FogSystem' this_fogSystem_10= rulefogSystem ) | (otherlv_11= 'resourceType' otherlv_12= ':' otherlv_13= 'PhysicalNode' (this_PhysicalNodeType_14= rulePhysicalNodeType | this_PhysicalNode_15= rulePhysicalNode ) ) | (otherlv_16= 'resourceType' otherlv_17= ':' otherlv_18= 'VirtualNode' (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode ) ) | (otherlv_21= 'resourceType' otherlv_22= ':' otherlv_23= 'Network' this_NetworkType_24= ruleNetworkType ) | (otherlv_25= 'resourceType' otherlv_26= ':' otherlv_27= 'Service' this_SerivceType_28= ruleSerivceType ) | (otherlv_29= 'resourceType' otherlv_30= ':' otherlv_31= 'Application' this_Application_32= ruleApplication ) | (otherlv_33= 'resourceType' otherlv_34= ':' otherlv_35= 'Attribute' this_AttributeType_36= ruleAttributeType ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\27\1\14\1\30\2\14\1\4\1\32\1\uffff\1\31\1\4\1\uffff\1\14\1\4\1\32";
    static final String dfa_9s = "\1\27\1\14\1\31\2\14\1\5\1\44\1\uffff\1\31\1\4\1\uffff\1\14\1\4\1\44";
    static final String dfa_10s = "\7\uffff\1\1\2\uffff\1\2\3\uffff";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\7",
            "\1\11\1\12\10\uffff\1\7",
            "",
            "\1\4",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "\1\11\1\12\10\uffff\1\7"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "186:5: (this_VirtualNodeType_19= ruleVirtualNodeType | this_VirtualNode_20= ruleVirtualNode )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004004800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00001A0000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000120004000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000020004000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000030L,0x00000000007C0000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000070L,0x00000000007C0000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0004000004000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0070000004000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0060000004000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000386L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000186L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000086L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000006L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000384L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000184L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000084L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000004L});

}
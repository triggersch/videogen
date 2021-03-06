package fr.istic.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalVideoGenLexer() {;} 
    public InternalVideoGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVideoGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVideoGen.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:11:7: ( 'TOP' )
            // InternalVideoGen.g:11:9: 'TOP'
            {
            match("TOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:12:7: ( 'BOTTOM' )
            // InternalVideoGen.g:12:9: 'BOTTOM'
            {
            match("BOTTOM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:13:7: ( 'CENTER' )
            // InternalVideoGen.g:13:9: 'CENTER'
            {
            match("CENTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:14:7: ( 'h' )
            // InternalVideoGen.g:14:9: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:15:7: ( 'horizontal' )
            // InternalVideoGen.g:15:9: 'horizontal'
            {
            match("horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:16:7: ( 'v' )
            // InternalVideoGen.g:16:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:17:7: ( 'vertical' )
            // InternalVideoGen.g:17:9: 'vertical'
            {
            match("vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:18:7: ( 'VideoGen' )
            // InternalVideoGen.g:18:9: 'VideoGen'
            {
            match("VideoGen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:19:7: ( '@author' )
            // InternalVideoGen.g:19:9: '@author'
            {
            match("@author"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:20:7: ( '@version' )
            // InternalVideoGen.g:20:9: '@version'
            {
            match("@version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:21:7: ( '@creation' )
            // InternalVideoGen.g:21:9: '@creation'
            {
            match("@creation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:22:7: ( 'mandatory' )
            // InternalVideoGen.g:22:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:23:7: ( 'optional' )
            // InternalVideoGen.g:23:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:24:7: ( 'alternatives' )
            // InternalVideoGen.g:24:9: 'alternatives'
            {
            match("alternatives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:25:7: ( 'image' )
            // InternalVideoGen.g:25:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:26:7: ( 'toptext' )
            // InternalVideoGen.g:26:9: 'toptext'
            {
            match("toptext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:27:7: ( 'bottomtext' )
            // InternalVideoGen.g:27:9: 'bottomtext'
            {
            match("bottomtext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:28:7: ( 'videoseq' )
            // InternalVideoGen.g:28:9: 'videoseq'
            {
            match("videoseq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:29:7: ( 'duration' )
            // InternalVideoGen.g:29:9: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:30:7: ( 'probability' )
            // InternalVideoGen.g:30:9: 'probability'
            {
            match("probability"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:31:7: ( 'description' )
            // InternalVideoGen.g:31:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:32:7: ( 'filter' )
            // InternalVideoGen.g:32:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:33:7: ( 'text' )
            // InternalVideoGen.g:33:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:34:7: ( 'content' )
            // InternalVideoGen.g:34:9: 'content'
            {
            match("content"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:35:7: ( 'position' )
            // InternalVideoGen.g:35:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:36:7: ( 'color' )
            // InternalVideoGen.g:36:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:37:7: ( 'size' )
            // InternalVideoGen.g:37:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:38:7: ( 'b&w' )
            // InternalVideoGen.g:38:9: 'b&w'
            {
            match("b&w"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:39:7: ( 'negate' )
            // InternalVideoGen.g:39:9: 'negate'
            {
            match("negate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:40:7: ( 'flip' )
            // InternalVideoGen.g:40:9: 'flip'
            {
            match("flip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_LEFT_BRACKET"
    public final void mRULE_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2976:19: ( '{' )
            // InternalVideoGen.g:2976:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACKET"

    // $ANTLR start "RULE_RIGHT_BRACKET"
    public final void mRULE_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2978:20: ( '}' )
            // InternalVideoGen.g:2978:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACKET"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2980:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVideoGen.g:2980:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVideoGen.g:2980:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalVideoGen.g:2980:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVideoGen.g:2980:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVideoGen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2982:10: ( ( '0' .. '9' )+ )
            // InternalVideoGen.g:2982:12: ( '0' .. '9' )+
            {
            // InternalVideoGen.g:2982:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVideoGen.g:2982:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2984:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVideoGen.g:2984:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVideoGen.g:2984:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:2984:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVideoGen.g:2984:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalVideoGen.g:2984:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVideoGen.g:2984:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:2984:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVideoGen.g:2984:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVideoGen.g:2984:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVideoGen.g:2984:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2986:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVideoGen.g:2986:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVideoGen.g:2986:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVideoGen.g:2986:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2988:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVideoGen.g:2988:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVideoGen.g:2988:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVideoGen.g:2988:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalVideoGen.g:2988:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:2988:41: ( '\\r' )? '\\n'
                    {
                    // InternalVideoGen.g:2988:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalVideoGen.g:2988:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2990:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVideoGen.g:2990:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVideoGen.g:2990:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVideoGen.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:2992:16: ( . )
            // InternalVideoGen.g:2992:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalVideoGen.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalVideoGen.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalVideoGen.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalVideoGen.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalVideoGen.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalVideoGen.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalVideoGen.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalVideoGen.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalVideoGen.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalVideoGen.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalVideoGen.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalVideoGen.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalVideoGen.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalVideoGen.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalVideoGen.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalVideoGen.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalVideoGen.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalVideoGen.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalVideoGen.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalVideoGen.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalVideoGen.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalVideoGen.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalVideoGen.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalVideoGen.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalVideoGen.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalVideoGen.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalVideoGen.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalVideoGen.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalVideoGen.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalVideoGen.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalVideoGen.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalVideoGen.g:1:190: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 32 :
                // InternalVideoGen.g:1:208: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 33 :
                // InternalVideoGen.g:1:227: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalVideoGen.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalVideoGen.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalVideoGen.g:1:256: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalVideoGen.g:1:272: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalVideoGen.g:1:288: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalVideoGen.g:1:296: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\37\1\43\1\46\1\37\1\35\14\37\2\uffff\1\35\2\uffff\3\35\2\uffff\1\37\1\uffff\3\37\1\uffff\2\37\1\uffff\1\37\3\uffff\7\37\1\uffff\11\37\7\uffff\1\133\27\37\1\uffff\13\37\1\176\6\37\1\u0085\2\37\1\u0088\12\37\1\u0093\1\37\1\uffff\6\37\1\uffff\1\37\1\u009c\1\uffff\1\37\1\u009e\1\u009f\7\37\1\uffff\6\37\1\u00ad\1\37\1\uffff\1\u00af\2\uffff\7\37\1\u00b7\5\37\1\uffff\1\u00bd\1\uffff\1\37\1\u00bf\1\u00c0\1\u00c1\1\37\1\u00c3\1\37\1\uffff\1\37\1\u00c6\2\37\1\u00c9\1\uffff\1\37\3\uffff\1\u00cb\1\uffff\2\37\1\uffff\2\37\1\uffff\1\u00d0\1\uffff\1\37\1\u00d2\2\37\1\uffff\1\37\1\uffff\1\u00d6\1\u00d7\1\u00d8\3\uffff";
    static final String DFA12_eofS =
        "\u00d9\uffff";
    static final String DFA12_minS =
        "\1\0\2\117\1\105\2\60\1\151\2\141\1\160\1\154\1\155\1\145\1\46\1\145\1\157\1\151\1\157\1\151\1\145\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\120\1\uffff\1\124\1\116\1\162\1\uffff\1\162\1\144\1\uffff\1\144\3\uffff\1\156\2\164\1\141\1\160\1\170\1\164\1\uffff\1\162\1\163\1\157\1\163\1\154\1\151\1\154\1\172\1\147\7\uffff\1\60\2\124\1\151\1\164\2\145\1\144\1\151\1\145\1\147\3\164\1\141\1\143\1\142\1\151\1\164\1\160\1\164\1\157\1\145\1\141\1\uffff\1\117\1\105\1\172\1\151\2\157\1\141\1\157\1\162\2\145\1\60\1\157\1\164\1\162\1\141\1\164\1\145\1\60\1\145\1\162\1\60\1\164\1\115\1\122\1\157\1\143\1\163\1\107\1\164\2\156\1\60\1\170\1\uffff\1\155\2\151\1\142\1\151\1\162\1\uffff\1\156\1\60\1\uffff\1\145\2\60\1\156\1\141\2\145\1\157\2\141\1\uffff\2\164\1\157\1\160\1\151\1\157\1\60\1\164\1\uffff\1\60\2\uffff\1\164\1\154\1\161\1\156\1\162\1\154\1\164\1\60\1\145\1\156\1\164\1\154\1\156\1\uffff\1\60\1\uffff\1\141\3\60\1\171\1\60\1\151\1\uffff\1\170\1\60\2\151\1\60\1\uffff\1\154\3\uffff\1\60\1\uffff\1\166\1\164\1\uffff\1\157\1\164\1\uffff\1\60\1\uffff\1\145\1\60\1\156\1\171\1\uffff\1\163\1\uffff\3\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\117\1\105\2\172\1\151\1\166\1\141\1\160\1\154\1\155\2\157\1\165\1\162\1\154\1\157\1\151\1\145\2\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\120\1\uffff\1\124\1\116\1\162\1\uffff\1\162\1\144\1\uffff\1\144\3\uffff\1\156\2\164\1\141\1\160\1\170\1\164\1\uffff\1\162\1\163\1\157\1\163\1\154\1\151\1\156\1\172\1\147\7\uffff\1\172\2\124\1\151\1\164\2\145\1\144\1\151\1\145\1\147\3\164\1\141\1\143\1\142\1\151\1\164\1\160\1\164\1\157\1\145\1\141\1\uffff\1\117\1\105\1\172\1\151\2\157\1\141\1\157\1\162\2\145\1\172\1\157\1\164\1\162\1\141\1\164\1\145\1\172\1\145\1\162\1\172\1\164\1\115\1\122\1\157\1\143\1\163\1\107\1\164\2\156\1\172\1\170\1\uffff\1\155\2\151\1\142\1\151\1\162\1\uffff\1\156\1\172\1\uffff\1\145\2\172\1\156\1\141\2\145\1\157\2\141\1\uffff\2\164\1\157\1\160\1\151\1\157\1\172\1\164\1\uffff\1\172\2\uffff\1\164\1\154\1\161\1\156\1\162\1\154\1\164\1\172\1\145\1\156\1\164\1\154\1\156\1\uffff\1\172\1\uffff\1\141\3\172\1\171\1\172\1\151\1\uffff\1\170\1\172\2\151\1\172\1\uffff\1\154\3\uffff\1\172\1\uffff\1\166\1\164\1\uffff\1\157\1\164\1\uffff\1\172\1\uffff\1\145\1\172\1\156\1\171\1\uffff\1\163\1\uffff\3\172\3\uffff";
    static final String DFA12_acceptS =
        "\24\uffff\1\37\1\40\1\uffff\1\41\1\42\3\uffff\1\46\1\47\1\uffff\1\41\3\uffff\1\4\2\uffff\1\6\1\uffff\1\11\1\12\1\13\7\uffff\1\34\11\uffff\1\37\1\40\1\42\1\43\1\44\1\45\1\46\30\uffff\1\1\42\uffff\1\27\6\uffff\1\36\2\uffff\1\33\12\uffff\1\17\10\uffff\1\32\1\uffff\1\2\1\3\15\uffff\1\26\1\uffff\1\35\7\uffff\1\20\5\uffff\1\30\1\uffff\1\7\1\22\1\10\1\uffff\1\15\2\uffff\1\23\2\uffff\1\31\1\uffff\1\14\4\uffff\1\5\1\uffff\1\21\3\uffff\1\25\1\24\1\16";
    static final String DFA12_specialS =
        "\1\2\30\uffff\1\0\1\1\u00be\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\7\35\1\33\12\30\6\35\1\7\1\27\1\2\1\3\20\27\1\1\1\27\1\6\4\27\3\35\1\26\1\27\1\35\1\12\1\15\1\21\1\16\1\27\1\20\1\27\1\4\1\13\3\27\1\10\1\23\1\11\1\17\2\27\1\22\1\14\1\27\1\5\4\27\1\24\1\35\1\25\uff82\35",
            "\1\36",
            "\1\40",
            "\1\41",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\16\37\1\42\13\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\4\37\1\44\3\37\1\45\21\37",
            "\1\47",
            "\1\50\1\uffff\1\52\22\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\60\11\uffff\1\57",
            "\1\62\110\uffff\1\61",
            "\1\64\17\uffff\1\63",
            "\1\66\2\uffff\1\65",
            "\1\67\2\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\130\1\uffff\1\127",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0086",
            "\1\u0087",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u009d",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ae",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00be",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c2",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c7",
            "\1\u00c8",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00ca",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00d1",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 63;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 63;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='T') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='h') ) {s = 4;}

                        else if ( (LA12_0=='v') ) {s = 5;}

                        else if ( (LA12_0=='V') ) {s = 6;}

                        else if ( (LA12_0=='@') ) {s = 7;}

                        else if ( (LA12_0=='m') ) {s = 8;}

                        else if ( (LA12_0=='o') ) {s = 9;}

                        else if ( (LA12_0=='a') ) {s = 10;}

                        else if ( (LA12_0=='i') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='b') ) {s = 13;}

                        else if ( (LA12_0=='d') ) {s = 14;}

                        else if ( (LA12_0=='p') ) {s = 15;}

                        else if ( (LA12_0=='f') ) {s = 16;}

                        else if ( (LA12_0=='c') ) {s = 17;}

                        else if ( (LA12_0=='s') ) {s = 18;}

                        else if ( (LA12_0=='n') ) {s = 19;}

                        else if ( (LA12_0=='{') ) {s = 20;}

                        else if ( (LA12_0=='}') ) {s = 21;}

                        else if ( (LA12_0=='^') ) {s = 22;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='S')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='e'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='q' && LA12_0<='r')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 23;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='?')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
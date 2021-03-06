/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.angularjs.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static org.angularjs.lang.lexer.AngularJSTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>angular.flex</tt>
 */
class _AngularJSLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYSTRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1296 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\176\2");

  /* The ZZ_CMAP_A table has 384 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\3\1\1\1\0\1\63\22\0\1\32\1\44\1\12\1\0\1\10\1\41\1\47\1\11\1\51"+
    "\1\52\1\37\1\36\1\60\1\7\1\5\1\40\12\4\1\62\1\61\1\45\1\43\1\46\1\57\1\0\1"+
    "\64\1\35\2\64\1\6\1\64\24\10\1\55\1\2\1\56\1\42\1\10\1\0\1\23\1\33\1\30\1"+
    "\26\1\21\1\22\1\10\1\14\1\15\1\10\1\31\1\24\1\10\1\25\1\27\2\10\1\17\1\16"+
    "\1\13\1\20\3\10\1\34\1\10\1\53\1\50\1\54\42\0\1\1\337\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\11\5\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\2\37\1\40\1\41\1\0\2\3\2\5\1\42"+
    "\3\5\1\43\2\5\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\0\1\3"+
    "\7\5\1\57\1\60\1\5\1\61\1\62\1\63\1\64"+
    "\1\65\1\66\1\67\2\5\1\70\1\5\1\71\1\64"+
    "\2\5\1\72\1\64\1\0\2\5\1\0\1\73\1\5"+
    "\1\73\1\5\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[107];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\152\0\152\0\152\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c"+
    "\0\u02b1\0\u02e6\0\u031b\0\u0350\0\152\0\152\0\152\0\152"+
    "\0\152\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e\0\152"+
    "\0\152\0\152\0\152\0\152\0\152\0\u04c3\0\152\0\152"+
    "\0\u04f8\0\u052d\0\u0562\0\152\0\152\0\152\0\324\0\u0597"+
    "\0\u05cc\0\u0601\0\u0636\0\u0173\0\u066b\0\u06a0\0\u06d5\0\u070a"+
    "\0\u073f\0\u0774\0\u0173\0\u07a9\0\152\0\u07de\0\152\0\152"+
    "\0\152\0\152\0\152\0\152\0\152\0\u0813\0\u0848\0\u087d"+
    "\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb\0\152\0\u0173"+
    "\0\u09f0\0\152\0\152\0\152\0\u0a25\0\u0173\0\u0173\0\u0173"+
    "\0\u0a5a\0\u0a8f\0\u0173\0\u0ac4\0\u0173\0\u0af9\0\u0b2e\0\u0b63"+
    "\0\u0173\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0173\0\u0ca1"+
    "\0\152\0\u0cd6\0\u0173";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[107];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
    "\1\10\1\12\1\13\1\14\1\10\1\15\2\10\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\10\1\24\2\10"+
    "\1\4\3\10\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\4"+
    "\1\10\2\52\1\53\1\54\5\52\1\55\1\56\50\52"+
    "\1\54\1\52\66\0\1\4\1\57\1\4\26\0\1\4"+
    "\30\0\1\4\4\0\1\4\65\0\1\6\1\60\1\61"+
    "\12\0\1\61\47\0\1\60\64\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\17\10\1\0\3\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\1\10"+
    "\1\62\2\10\1\63\12\10\1\0\3\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\12\10"+
    "\1\64\4\10\1\0\3\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\12\10\1\65\4\10"+
    "\1\0\3\10\26\0\1\10\4\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\11\10\1\66\5\10\1\0\3\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\10\10\1\67\6\10\1\0\3\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\3\10"+
    "\1\70\13\10\1\0\3\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\6\10\1\71\10\10"+
    "\1\0\3\10\26\0\1\10\4\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\5\10\1\72\11\10\1\0\3\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\7\10\1\73\7\10\1\0\3\10\26\0\1\10"+
    "\43\0\1\74\26\0\1\75\35\0\1\76\64\0\1\77"+
    "\64\0\1\100\70\0\1\101\65\0\1\102\21\0\1\103"+
    "\141\0\1\104\2\0\2\52\2\0\5\52\2\0\50\52"+
    "\1\0\1\52\3\105\1\0\14\105\1\106\42\105\1\0"+
    "\1\105\4\0\1\60\1\0\1\61\12\0\1\61\47\0"+
    "\1\107\2\0\1\107\26\0\1\107\32\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\2\10\1\110\3\10\1\111"+
    "\10\10\1\0\3\10\26\0\1\10\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\5\10\1\112\2\10\1\113"+
    "\6\10\1\0\3\10\26\0\1\10\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\13\10\1\114\3\10\1\0"+
    "\3\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\3\10\1\115\13\10\1\0\3\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\11\10\1\116\5\10\1\0\3\10\26\0\1\10\4\0"+
    "\1\10\1\117\1\10\1\0\1\10\2\0\17\10\1\0"+
    "\3\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\1\120\16\10\1\0\3\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\11\10"+
    "\1\121\5\10\1\0\3\10\26\0\1\10\43\0\1\122"+
    "\64\0\1\123\21\0\4\124\1\125\1\124\1\125\12\124"+
    "\3\125\2\124\1\125\1\124\1\125\2\124\1\125\1\124"+
    "\1\125\26\124\1\125\4\0\1\107\64\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\3\10\1\126\13\10\1\0"+
    "\3\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\12\10\1\127\4\10\1\0\3\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\6\10\1\130\10\10\1\0\3\10\26\0\1\10\4\0"+
    "\1\10\1\0\1\10\1\0\1\10\2\0\15\10\1\131"+
    "\1\10\1\0\3\10\26\0\1\10\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\6\10\1\132\10\10\1\0"+
    "\3\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\6\10\1\133\10\10\1\0\3\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\3\10\1\134\13\10\1\0\3\10\26\0\1\10\4\0"+
    "\1\10\1\0\1\10\1\0\1\10\2\0\11\10\1\135"+
    "\5\10\1\0\3\10\26\0\1\10\4\0\1\136\1\0"+
    "\1\136\12\0\3\136\2\0\1\136\1\0\1\136\2\0"+
    "\1\136\1\0\1\136\26\0\1\136\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\16\10\1\137\1\0\3\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\7\10\1\140\7\10\1\0\3\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\6\10"+
    "\1\141\10\10\1\0\3\10\26\0\1\10\4\0\1\142"+
    "\1\0\1\142\12\0\3\142\2\0\1\142\1\0\1\142"+
    "\2\0\1\142\1\0\1\142\26\0\1\142\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\17\10\1\143\2\10"+
    "\1\144\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\2\10\1\145\14\10\1\0\3\10\26\0"+
    "\1\10\4\0\1\105\1\0\1\105\12\0\3\105\2\0"+
    "\1\105\1\0\1\105\2\0\1\105\1\0\1\105\26\0"+
    "\1\105\33\0\1\146\35\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\17\10\1\0\1\10\1\147\1\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\12\10\1\150\4\10\1\0\3\10\26\0\1\10\34\0"+
    "\1\151\34\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\6\10\1\152\10\10\1\0\3\10\26\0\1\10\4\0"+
    "\1\10\1\0\1\10\1\0\1\10\2\0\13\10\1\153"+
    "\3\10\1\0\3\10\26\0\1\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3339];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\5\1\3\11\11\1\5\11\6\1\6\11"+
    "\1\1\2\11\3\1\3\11\1\0\15\1\1\11\1\1"+
    "\7\11\1\0\10\1\1\11\2\1\3\11\16\1\1\0"+
    "\2\1\1\0\2\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[107];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private char quote;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _AngularJSLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 61: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 62: break;
          case 3: 
            { return NUMERIC_LITERAL;
            }
          case 63: break;
          case 4: 
            { return DOT;
            }
          case 64: break;
          case 5: 
            { return IDENTIFIER;
            }
          case 65: break;
          case 6: 
            { return MINUS;
            }
          case 66: break;
          case 7: 
            { yybegin(YYSTRING); quote = '\''; return STRING_LITERAL;
            }
          case 67: break;
          case 8: 
            { yybegin(YYSTRING); quote = '"'; return STRING_LITERAL;
            }
          case 68: break;
          case 9: 
            { return PLUS;
            }
          case 69: break;
          case 10: 
            { return MULT;
            }
          case 70: break;
          case 11: 
            { return DIV;
            }
          case 71: break;
          case 12: 
            { return PERC;
            }
          case 72: break;
          case 13: 
            { return XOR;
            }
          case 73: break;
          case 14: 
            { return EQ;
            }
          case 74: break;
          case 15: 
            { return EXCL;
            }
          case 75: break;
          case 16: 
            { return LT;
            }
          case 76: break;
          case 17: 
            { return GT;
            }
          case 77: break;
          case 18: 
            { return AND;
            }
          case 78: break;
          case 19: 
            { return OR;
            }
          case 79: break;
          case 20: 
            { return LPAR;
            }
          case 80: break;
          case 21: 
            { return RPAR;
            }
          case 81: break;
          case 22: 
            { return LBRACE;
            }
          case 82: break;
          case 23: 
            { return RBRACE;
            }
          case 83: break;
          case 24: 
            { return LBRACKET;
            }
          case 84: break;
          case 25: 
            { return RBRACKET;
            }
          case 85: break;
          case 26: 
            { return QUEST;
            }
          case 86: break;
          case 27: 
            { return COMMA;
            }
          case 87: break;
          case 28: 
            { return SEMICOLON;
            }
          case 88: break;
          case 29: 
            { return COLON;
            }
          case 89: break;
          case 30: 
            { return STRING_LITERAL;
            }
          case 90: break;
          case 31: 
            { yypushback(yytext().length()); yybegin(YYINITIAL);
            }
          case 91: break;
          case 32: 
            { if (quote == '\'') yybegin(YYINITIAL); return STRING_LITERAL;
            }
          case 92: break;
          case 33: 
            { if (quote == '"') yybegin(YYINITIAL); return STRING_LITERAL;
            }
          case 93: break;
          case 34: 
            { return IN_KEYWORD;
            }
          case 94: break;
          case 35: 
            { return AS_KEYWORD;
            }
          case 95: break;
          case 36: 
            { return OF_KEYWORD;
            }
          case 96: break;
          case 37: 
            { return EQEQ;
            }
          case 97: break;
          case 38: 
            { return ASSERT_NOT_NULL;
            }
          case 98: break;
          case 39: 
            { return NE;
            }
          case 99: break;
          case 40: 
            { return LE;
            }
          case 100: break;
          case 41: 
            { return GE;
            }
          case 101: break;
          case 42: 
            { return ANDAND;
            }
          case 102: break;
          case 43: 
            { return OROR;
            }
          case 103: break;
          case 44: 
            { return ELVIS;
            }
          case 104: break;
          case 45: 
            { return ONE_TIME_BINDING;
            }
          case 105: break;
          case 46: 
            { return ESCAPE_SEQUENCE;
            }
          case 106: break;
          case 47: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 2);
            { return IDENTIFIER;
            }
          case 107: break;
          case 48: 
            { return LET_KEYWORD;
            }
          case 108: break;
          case 49: 
            { return EQEQEQ;
            }
          case 109: break;
          case 50: 
            { return NEQEQ;
            }
          case 110: break;
          case 51: 
            { yypushback(1); return INVALID_ESCAPE_SEQUENCE;
            }
          case 111: break;
          case 52: 
            { return INVALID_ESCAPE_SEQUENCE;
            }
          case 112: break;
          case 53: 
            { return THIS_KEYWORD;
            }
          case 113: break;
          case 54: 
            { return THEN;
            }
          case 114: break;
          case 55: 
            { return TRUE_KEYWORD;
            }
          case 115: break;
          case 56: 
            { return ELSE_KEYWORD;
            }
          case 116: break;
          case 57: 
            { return NULL_KEYWORD;
            }
          case 117: break;
          case 58: 
            { return FALSE_KEYWORD;
            }
          case 118: break;
          case 59: 
            { return TRACK_BY_KEYWORD;
            }
          case 119: break;
          case 60: 
            { return UNDEFINED_KEYWORD;
            }
          case 120: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

package com.example.macbook.mymenuproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TranslatorTest {

    private MorseAlphaTranslator morseAlphabet;

    @Before
    public void setup() {
        this.morseAlphabet = morseAlphabet;
    }

//    @Test
//    public void canGetMorseFromAlpha() {
//        String morse = MorseAlphaTranslator.stringAlphaToMorse("Hello World!");
//        assertEquals(".- -...  ", morse);
//    }

//    @Test
//    public void canGetAlphaFromMorse() {
    //        String alpha = MorseAlphaTranslator.morseToAlpha(".... . .-.. .-.. ---   .-- --- .-. .-.. -.. ---.  ");
//        assertEquals("this is an example ", alpha);
//    }

//    @Test
//    public void canGetAlphaThruBinary(){
//        String something = MorseAlphaTranslator.binaryToAlpha("0111010001101000011010010111001100100000011010010111001100100000011000010010000001110100011001010111001101110100");
//        assertEquals("abb", something);
//    }

//    @Test
//    public void canGetBinaryThruAlpha() {
//        String string = MorseAlphaTranslator.alphaToHebrew("this is a test");
//        assertEquals("0101", string);
//    }

    @Test
    public void canGetHebrewThruAlpha() {
        String string = MorseAlphaTranslator.hebrewToAlpha("תהיס יס א תיסת");
        assertEquals("0101", string);
    }
}
package com.example.macbook.mymenuproject;

import com.google.common.base.Splitter;

import java.util.HashMap;

public class MorseAlphaTranslator {

    MorseAlphabet morseAlphabet;

    public static String stringAlphaToMorse(String alpha){
        char[] letters = alpha.toLowerCase().toCharArray();
        StringBuilder morseWordOutput = new StringBuilder();
        for (char letter : letters) {
            for (MorseAlphabet morseEnumRow : MorseAlphabet.values()){
                if (morseEnumRow.getAlphabet().equals(Character.toString(letter))) {
                    morseWordOutput.append(morseEnumRow.getMorse()).append(" ");
                }
            }
        }
        return morseWordOutput.toString();
    }



    public static String morseToAlpha(String morse) {
        String[] morseWords = morse.split("  ");
        StringBuilder alphaWordOutput = new StringBuilder();
        for (String word : morseWords) {
            for (String letter : word.split(" ")) {
                for (MorseAlphabet alphaEnumRow : MorseAlphabet.values()) {
                    if (alphaEnumRow.getMorse().equals(letter)) {
                        alphaWordOutput.append(alphaEnumRow.getAlphabet());
                    }
                }
            }
            alphaWordOutput.append(" ");
        }
        return alphaWordOutput.toString();
    }


//    https://stackoverflow.com/questions/2297347/splitting-a-string-at-every-n-th-character/2298477#2298477
//    guava libraries are used based on above comment for Splitter class

//    https://www.ascii-code.com/
//    list of first 255 assigned symbols for 8 bits 00000000 thru 11111111

    public static String binaryToAlpha(String binaryString) {
        Iterable<String> iOwordsSplit = Splitter.fixedLength(8).split(binaryString);
        StringBuilder alphaWordOutput = new StringBuilder();
        for (String iOword : iOwordsSplit){
            for (MorseAlphabet alphaEnumRow : MorseAlphabet.values()){
                if (alphaEnumRow.getBinary().equals(iOword)){
                    alphaWordOutput.append(alphaEnumRow.getAlphabet());
                }
            }
        }
        return alphaWordOutput.toString();
    }


    public static String alphaToBinary(String alphaString) {
        char [] letters = alphaString.toLowerCase().toCharArray();
        StringBuilder binaryOutput = new StringBuilder();
        for (char letter : letters) {
            for (MorseAlphabet binaryEnumRow : MorseAlphabet.values()) {
                if (binaryEnumRow.getAlphabet().equals(Character.toString(letter))) {
                    binaryOutput.append(binaryEnumRow.getBinary());
                }
            }
        }
        return binaryOutput.toString();
    }



//    hebrew is automatically being generated from right to left

    public static String alphaToHebrew(String alphaString) {
        char [] letters = alphaString.toLowerCase().toCharArray();
        StringBuilder hebrewOutput = new StringBuilder();
        for (char letter : letters) {
            for (MorseAlphabet hebrewEnumRow : MorseAlphabet.values()) {
                if (hebrewEnumRow.getAlphabet().equals(Character.toString(letter))) {
                    hebrewOutput.append(hebrewEnumRow.getHebrew());
                }
            }
        }
        return hebrewOutput.toString();
    }



    public static String hebrewToAlpha(String hebrewString) {
        char [] letters = hebrewString.toCharArray();
        StringBuilder alphaOutput = new StringBuilder();
        for (char letter : letters) {
            for (MorseAlphabet alphaEnumRow : MorseAlphabet.values()) {
                if (alphaEnumRow.getHebrew().equals(Character.toString(letter))) {
                    alphaOutput.append(alphaEnumRow.getAlphabet());
                }
            }
        }
        return alphaOutput.toString();
    }




}


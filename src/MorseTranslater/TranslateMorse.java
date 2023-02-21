package MorseTranslater;

import java.util.HashMap;

public class TranslateMorse {

    public String input(String lineInput) {

        // Table for translation character to morse
        HashMap<String, String> morseAlphabet = new HashMap<>();

        morseAlphabet.put("A", "*-");
        morseAlphabet.put("B", "-***");
        morseAlphabet.put("C", "-*-*");
        morseAlphabet.put("D", "-**");
        morseAlphabet.put("E", "*");
        morseAlphabet.put("F", "**-*");
        morseAlphabet.put("G", "--*");
        morseAlphabet.put("H", "****");
        morseAlphabet.put("I", "**");
        morseAlphabet.put("J", "*---");
        morseAlphabet.put("K", "-*-");
        morseAlphabet.put("L", "*-**");
        morseAlphabet.put("M", "--");
        morseAlphabet.put("N", "-*");
        morseAlphabet.put("O", "---");
        morseAlphabet.put("P", "*--*");
        morseAlphabet.put("Q", "--*-");
        morseAlphabet.put("R", "*-*");
        morseAlphabet.put("S", "***");
        morseAlphabet.put("T", "-");
        morseAlphabet.put("U", "**-");
        morseAlphabet.put("V", "***-");
        morseAlphabet.put("W", "*--");
        morseAlphabet.put("X", "-**-");
        morseAlphabet.put("Y", "-*--");
        morseAlphabet.put("Z", "--**");
        morseAlphabet.put("1", "*----");
        morseAlphabet.put("2", "**---");
        morseAlphabet.put("3", "***--");
        morseAlphabet.put("4", "****-");
        morseAlphabet.put("5", "*****");
        morseAlphabet.put("6", "-****");
        morseAlphabet.put("7", "--***");
        morseAlphabet.put("8", "---**");
        morseAlphabet.put("9", "----*");
        morseAlphabet.put("0", "-----");
        morseAlphabet.put(".", "*-*-*-");
        morseAlphabet.put(",", "--**--");
        morseAlphabet.put("?", "**--**");
        morseAlphabet.put(" ", "/");

        // Table for translation morse to character
        HashMap<String, String> morseAlphabetBackwards = new HashMap<>();

        morseAlphabetBackwards.put("*-", "A");
        morseAlphabetBackwards.put("-***", "B");
        morseAlphabetBackwards.put("-*-*","C");
        morseAlphabetBackwards.put("-**","D");
        morseAlphabetBackwards.put("*","E");
        morseAlphabetBackwards.put("**-*","F");
        morseAlphabetBackwards.put("--*","G");
        morseAlphabetBackwards.put("****","H");
        morseAlphabetBackwards.put("**","I");
        morseAlphabetBackwards.put("*---","J");
        morseAlphabetBackwards.put("-*-","K");
        morseAlphabetBackwards.put("*-**","L");
        morseAlphabetBackwards.put("--","M");
        morseAlphabetBackwards.put("-*","N");
        morseAlphabetBackwards.put("---","O");
        morseAlphabetBackwards.put("*--*","P");
        morseAlphabetBackwards.put("--*-","Q");
        morseAlphabetBackwards.put("*-*","R");
        morseAlphabetBackwards.put("***","S");
        morseAlphabetBackwards.put("-","T");
        morseAlphabetBackwards.put("**-","U");
        morseAlphabetBackwards.put("***-","V");
        morseAlphabetBackwards.put("*--","W");
        morseAlphabetBackwards.put("-**-","X");
        morseAlphabetBackwards.put("-*--","Y");
        morseAlphabetBackwards.put("--**","Z");
        morseAlphabetBackwards.put("*----","1");
        morseAlphabetBackwards.put("**---", "2");
        morseAlphabetBackwards.put("***--","3");
        morseAlphabetBackwards.put("****-","4");
        morseAlphabetBackwards.put("*****","5");
        morseAlphabetBackwards.put("-****","6");
        morseAlphabetBackwards.put("--***","7");
        morseAlphabetBackwards.put("---**","8");
        morseAlphabetBackwards.put("----*","9");
        morseAlphabetBackwards.put("-----","0");
        morseAlphabetBackwards.put("*-*-*-",".");
        morseAlphabetBackwards.put("--**--",",");
        morseAlphabetBackwards.put("**--**","?");
        morseAlphabetBackwards.put("/"," ");


        String output = "";
        // determine if the input is plain text or morse code, if the input contains * and/or -, assume it's morse code
        if ((lineInput.contains("*") && lineInput.contains("-")) || (lineInput.contains("*") || lineInput.contains("-")))
        {
            // split morse code by blanks
            String[] chars = lineInput.split(" ");
            for (String var : chars) {
                // determine if morse code exists in translation table, if it does translate and add to output. Else stop and show error message what code triggered the error
                if (morseAlphabetBackwards.containsKey(var)) output += morseAlphabetBackwards.get(var);
                else return "\""+var+"\" is not a supported morse code";
            }
        }
        else
        {
            String[] chars = lineInput.split("");
            for (String var : chars) {
                // determine if character exists in translation table, if it does translate and add to output. Else stop and show error message what character triggered the error
                if (morseAlphabet.containsKey(var.toUpperCase())) output += morseAlphabet.get(var.toUpperCase()) +" ";
                else return "\""+var.toUpperCase()+"\" is not a supported character";
        }

        }

        // return translated message
        return output;}

    }



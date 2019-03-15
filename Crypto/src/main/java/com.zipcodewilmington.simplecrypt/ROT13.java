package com.zipcodewilmington.simplecrypt;

public class ROT13  {

    private final Integer shift;

    ROT13(Character cs, Character cf) {
        shift = Math.abs(cs - cf);
    }

    ROT13() {
        this('a', 'n');
    }


    public String crypt(String text) throws UnsupportedOperationException {
        String result = "";
        int n = 13;
        result = rotateChar(text, result, n);
        return result;
    }

    public String encrypt(String text) {
        String result = "";
        int n = shift;
        result = rotateChar(text, result, n);
        return result;
    }

    public String decrypt(String text) {
        String result = "";
        int n = -shift;
        result = rotateChar(text, result, n);
        return result;
    }

    public static String rotate(String s, Character c) {
        Integer spot = s.indexOf(c);
        return s.substring(spot) + s.substring(0, spot);
    }

    public String rotateChar(String text, String result, int n) {
        for (int i = 0; i < text.length(); i++) {
            char ascii = text.charAt(i);
            char rotated = ascii;
            if (ascii > 64 && ascii < 91) {//Capital letters are 60 to 90
                rotated = (char) (rotated + n);
                if (rotated > 90) {
                    rotated += -90 + 64;
                }
                if (rotated < 65) {
                    rotated += -64 + 90;
                }
            } else if (ascii > 96 && ascii < 123) { //Lowercase letters are between 97 and 122
                rotated = (char) (rotated + n);
                if (rotated > 122) {
                    rotated += -122 + 96;
                }
                if (rotated < 97) {
                    rotated += -96 + 122;
                }
            }
            result += (char) rotated;
        }
        return result;
    }
}
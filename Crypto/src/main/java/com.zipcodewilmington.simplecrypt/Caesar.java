package com.zipcodewilmington.simplecrypt;

public class Caesar extends ROT13{


    public Caesar() {
    }

    public String CeasarEncrypt(String text) {
        String result = "";
        int n = 4;
        result = rotateChar(text, result, n);
        return result;
    }

    public String CeasarDecrypt(String text){
        String result = "";
        int n = -4;
        result = rotateChar(text, result, n);
        return result;
    }


}


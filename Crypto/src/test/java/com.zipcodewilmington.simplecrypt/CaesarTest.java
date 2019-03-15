package com.zipcodewilmington.simplecrypt;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {


    @Test
    public void encryptTest1() {
        // Given
        Caesar ceasar = new Caesar();

        String Q1 = "Why did the chicken cross the road?";
        String A1 = "Alc hmh xli glmgoir gvsww xli vseh?";

        String Q2 = "To get to the other side!";
        String A2 = "Xs kix xs xli sxliv wmhi!";

        // When
        String actual = ceasar.CeasarEncrypt(Q1);
        System.out.println(Q1);
        System.out.println(actual);
        // Then

        // When
        String actual2 = ceasar.CeasarEncrypt(Q2);
        System.out.println(Q2);
        System.out.println(actual2);
        // Then
        assertTrue(actual.equals(A1));
        assertTrue(actual2.equals(A2));
    }

    @Test
    public void decryptTest1() {
        // Given
        Caesar ceasar = new Caesar();

        String Q1 = "Alc hmh xli glmgoir gvsww xli vseh?";
        String A1 = "Why did the chicken cross the road?";

        String Q2 = "Xs kix xs xli sxliv wmhi!";
        String A2 = "To get to the other side!";

        // When
        String actual = ceasar.CeasarDecrypt(Q1);
        System.out.println(Q1);
        System.out.println(actual);
        // Then

        // When
        String actual2 = ceasar.CeasarDecrypt(Q2);
        System.out.println(Q2);
        System.out.println(actual2);
        // Then
        assertTrue(actual.equals(A1));
        assertTrue(actual2.equals(A2));
    }
}
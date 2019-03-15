package com.zipcodewilmington.simplecrypt;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class EncryptFileTest {
    EncryptFile encryptFile = new EncryptFile();

    @Test
    public void encryptFile() throws IOException {
        System.out.println(encryptFile.encryptFile());
    }
}
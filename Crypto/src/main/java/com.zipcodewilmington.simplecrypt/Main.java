package com.zipcodewilmington.simplecrypt;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        String currentProjectDirectory = System.getProperty("user.dir");
        String resourceDirectory = currentProjectDirectory + "/Crypto/src/main/resources";
        String fileName = resourceDirectory + "/sonnet18.txt";

        String currentProjectDirectory2 = System.getProperty("user.dir");
        String resourceDirectory2 = currentProjectDirectory2 + "/Crypto/src/main/resources";
        String fileName2 = resourceDirectory2 + "/sonnet18.enc";


        FileInputStream in = new FileInputStream(fileName);
        String body = IOUtils.toString(in, StandardCharsets.UTF_8.name());
        System.out.println(body);
        PrintStream out = new PrintStream(new FileOutputStream(fileName2));
        ROT13 rot13 = new ROT13();
        String output = rot13.encrypt(body);
        out.append(output);
        out.flush();
    }
}

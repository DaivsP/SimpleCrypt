package com.zipcodewilmington.simplecrypt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncryptFile extends ROT13 {

    public EncryptFile(){

    }

    public String encryptFile() throws IOException {
        String currentProjectDirectory = System.getProperty("user.dir");
        String resourceDirectory = currentProjectDirectory + "/Crypto/src/main/resources";
        String fileName = resourceDirectory + "/sonnet18.txt";
        System.out.println(currentProjectDirectory);
        Stream<String> bands = Files.readAllLines(Paths.get(fileName)).stream();
        List<String> answer = bands.map(this::encrypt).collect(Collectors.toList());
        bands.close();
        String returnString = "";
        for (String string : answer){
            returnString += string;
        }
        return returnString;
    }
}

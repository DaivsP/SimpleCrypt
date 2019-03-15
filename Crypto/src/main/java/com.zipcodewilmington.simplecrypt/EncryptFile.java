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
        Stream<String> bands = (Stream<String>) Files.readAllLines(Paths.get("sonnet18.txt"));
        List<String> answer =bands.map(this::encrypt).collect(Collectors.toList());
        bands.close();
        String returnString = "";
        for (String string : answer){
            returnString += string;
        }
        return returnString;
    }
}

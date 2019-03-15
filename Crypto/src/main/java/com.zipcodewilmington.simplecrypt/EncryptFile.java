package com.zipcodewilmington.simplecrypt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncryptFile extends ROT13 {

    public EncryptFile(){

    }

    public String encryptFile() throws IOException {
        Function<String, String > function = s -> encrypt(s);
        return action(function);
    }

    public String decryptFile() throws IOException{
        Function<String, String > function = s -> decrypt(s);
        return action(function);
    }

    public Stream<String> getFileToStream() throws IOException {
        String currentProjectDirectory = System.getProperty("user.dir");
        String resourceDirectory = currentProjectDirectory + "/Crypto/src/main/resources";
        String fileName = resourceDirectory + "/sonnet18.txt";
        //System.out.println(currentProjectDirectory);
        return Files.readAllLines(Paths.get(fileName)).stream();
    }

    private String action(Function function) throws IOException {
        Stream<String> bands = getFileToStream();
        List<String> answer = (List<String>) bands.map(function).collect(Collectors.toList());
        bands.close();
        String returnString = getString(answer);
        return returnString;
    }

    private String getString(List<String> answer) {
        String returnString = "";
        for (String string : answer){
            returnString += string + " \n";
        }
        return returnString;
    }
}

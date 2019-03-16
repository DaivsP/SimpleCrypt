package com.zipcodewilmington.simplecrypt;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class EncryptFileTest {
    EncryptFile encryptFile = new EncryptFile();

    @Test
    public void encryptFile() throws IOException {
        String expected = "Funyy V pbzcner gurr gb n fhzzre’f qnl? \n" +
                "Gubh neg zber ybiryl naq zber grzcrengr: \n" +
                "Ebhtu jvaqf qb funxr gur qneyvat ohqf bs Znl, \n" +
                "Naq fhzzre’f yrnfr ungu nyy gbb fubeg n qngr; \n" +
                "Fbzrgvzr gbb ubg gur rlr bs urnira fuvarf, \n" +
                "Naq bsgra vf uvf tbyq pbzcyrkvba qvzz'q; \n" +
                "Naq rirel snve sebz snve fbzrgvzr qrpyvarf, \n" +
                "Ol punapr be angher’f punatvat pbhefr hagevzz'q; \n" +
                "Ohg gul rgreany fhzzre funyy abg snqr, \n" +
                "Abe ybfr cbffrffvba bs gung snve gubh bj’fg; \n" +
                "Abe funyy qrngu oent gubh jnaqre’fg va uvf funqr, \n" +
                "Jura va rgreany yvarf gb gvzr gubh tebj’fg: \n" +
                "   Fb ybat nf zra pna oerngur be rlrf pna frr, \n" +
                "   Fb ybat yvirf guvf, naq guvf tvirf yvsr gb gurr. \n";
        String actual = encryptFile.encryptFile();
        Assert.assertEquals(expected, actual);
        //System.out.println(encryptFile.encryptFile());
    }
}

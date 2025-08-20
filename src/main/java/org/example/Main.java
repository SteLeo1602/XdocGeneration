package org.example;

import java.io.File;

import org.junit.jupiter.api.io.TempDir;

public class Main {
    @TempDir
    private static File temporaryFolder;

    public static void main(String[] args) throws Exception {

        XdocGenerator.generateXdocContent(temporaryFolder);

        System.out.println("Hello world!");
    }
}
package com.ooyala.jloc;

import java.io.File;

public class FileCounterApp {
    public static void main(String[] args) {
        System.out.println("Files: " + countFiles(args[0]));
    }

    public static int countFiles(String path) {

        File file = new File(path);

        File[] children = file.listFiles();

        return 0;
    }

}

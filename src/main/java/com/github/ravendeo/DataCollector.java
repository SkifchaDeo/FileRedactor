package com.github.ravendeo;

import java.util.Scanner;

public class DataCollector {
    private String readFilePath;
    private String writeFilePath;
    private String oldSubStr;
    private String newSubStr;

    public DataCollector(){
        Scanner consoleReader = new Scanner(System.in);
        readFilePath = consoleReader.next();
        oldSubStr = consoleReader.next();
        newSubStr = consoleReader.next();
        writeFilePath = consoleReader.next();
        consoleReader.close();
   }

    public String getReadFilePath() {
        return readFilePath;
    }

    public String getOldSubStr() {
        return oldSubStr;
    }

    public String getNewSubStr() {
        return newSubStr;
    }

    public String getWriteFilePath() {
        return writeFilePath;
    }
}

package com.github.ravendeo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static java.nio.file.Files.readString;

public class Controller {
    private String oldFileData;
    private String newFileData;
    private DataCollector data;

    public Controller(){
        data = new DataCollector();
    }

    public void readOldFile(){
        try {
            oldFileData = readString(Path.of(data.getReadFilePath()), StandardCharsets.UTF_8);//D:\\1.txt
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeData(){
        newFileData = oldFileData.replaceAll(data.getOldSubStr(),data.getNewSubStr());
    }

    public void writeNewFile(){
        try {
            FileWriter fw=new FileWriter(data.getWriteFilePath());
            fw.write(newFileData);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package com.github.ravendeo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static java.nio.file.Files.readString;

public class Controller {
    public String oldFileData, newFileData;

    DataCollector data = new DataCollector();

    public Controller(){
        readOldFile();
        changeData();
        writeNewFile();
    }

    public void readOldFile(){
        try {
            oldFileData = readString(Path.of("D:\\" + data.readFileName + ".txt"), StandardCharsets.UTF_8);
            System.out.println(oldFileData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeData(){
        newFileData = oldFileData.replaceAll(data.oldSubStr,data.newSubStr);
        System.out.println(newFileData);
    }

    public void writeNewFile(){
        File file = new File("D:\\"+data.writeFileName+".txt");
        try {
            file.createNewFile();
            FileWriter fw=new FileWriter("D:\\"+data.writeFileName+".txt");
            fw.write(newFileData);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


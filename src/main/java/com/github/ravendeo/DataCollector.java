package com.github.ravendeo;

import java.util.Scanner;

public class DataCollector {
    public String readFileName,writeFileName;
    public String oldSubStr,newSubStr;

    public DataCollector(){
        Scanner consoleReader = new Scanner(System.in);
        readFileName = consoleReader.next();
        oldSubStr = consoleReader.next();
        newSubStr = consoleReader.next();
        writeFileName = consoleReader.next();
        consoleReader.close();
        //showData();
   }
   public void showData(){
       System.out.println(readFileName+" "+oldSubStr+" "+newSubStr+" "+writeFileName+" ");
   }
}

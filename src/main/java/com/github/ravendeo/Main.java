package com.github.ravendeo;

public class Main {
    public static void main(String[] args){
        Controller start = new Controller();
        start.readOldFile();
        start.changeData();
        start.writeNewFile();
    }
}

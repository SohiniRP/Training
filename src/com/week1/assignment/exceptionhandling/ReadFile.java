package com.week1.assignment.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try(FileReader newFile = new FileReader("../Desktop/Balance.txt")){
            newFile.read();
        } catch(IOException e){
            System.out.println("File not found!!");
        }
    }
}

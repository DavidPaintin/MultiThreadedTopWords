package com.m3c.dap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookReader implements Runnable{
    private int counter;
    private String filename;
    private static int readerCount=0;
    public synchronized static void incReaderCount(){
        readerCount++;
    }
    public BookReader(int counter, String filename){
        this.counter=counter;
        this.filename = filename;
        incReaderCount();
    }
    public void run(){
        LineTester lineTester = new LineTester();
        runWordCounter(lineTester,filename);
    }
    public void runWordCounter(LineTester lineTester, String filename) {
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            for(int i=1;i<counter;i++){
                bufferedReader.readLine();
            }
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                readLine = lineTester.lineFormatter(readLine);
                {
                    for (String word : readLine.split("\\s+")) {
                        lineTester.countWord(word);
                    }
                    for(int i=1;i<readerCount;i++){
                        bufferedReader.readLine();
                    }
                    readLine = bufferedReader.readLine();

                }
            }
            lineTester.synchCountWord();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}

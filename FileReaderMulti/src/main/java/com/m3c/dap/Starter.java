package com.m3c.dap;

import com.m3c.dap.BookReader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Starter {

    public static void main (String[] args){
        long startTime = System.nanoTime();
        ExecutorService executor = Executors.newFixedThreadPool(6);
        for (int i=1;i<7;i++){
            Runnable worker = new BookReader(i,"resources/aLargeFile");
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){

        }
        LineTester lineTester = new LineTester();
        for(int i=1;i<4;i++) {
            lineTester.mostCommon(i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime+" nanoseconds taken");
    }
}

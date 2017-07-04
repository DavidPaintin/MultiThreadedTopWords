package com.m3c.dap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class LineTester {
    private  HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
    private static ConcurrentHashMap<String,Integer> globalWordCount = new ConcurrentHashMap<String,Integer>();

    private static Pattern p = Pattern.compile("[^a-z\\s]");
    public String lineFormatter(String string){
        return p.matcher(string.toLowerCase()).replaceAll("");
    }

    public void countWord(String word){
        if (wordCount.containsKey(word)){
            Integer count=wordCount.get(word);
            count++;
            wordCount.put(word, count);
        }
        else {
            wordCount.put(word,1);
        }
    }
    public  void synchCountWord(){
        for(String word:wordCount.keySet()){
            if (globalWordCount.containsKey(word)){
                globalWordCount.put(word,globalWordCount.get(word)+wordCount.get(word));
            }
            else{
                globalWordCount.put(word,wordCount.get(word));
            }

        }
    }
    private String getKey(int element) {
        String returnvalue = "";
        for (String key : globalWordCount.keySet()) {
            if (globalWordCount.get(key) == element) {
                returnvalue = key;
            }
        }
        return returnvalue;
    }


    public  void mostCommon(int position){
        List<Integer> list = new ArrayList(globalWordCount.values());
        Collections.sort(list);
        Integer count=list.get(list.size()-position);
        System.out.println(getKey(count) + " "+count);
    }
}

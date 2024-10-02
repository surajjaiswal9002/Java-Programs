package com._Trillion._Programs;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.HashSet;
import java.util.Set;

public class FindDublicateString {

    public static void main(String[] args) {

        String s = "helloworld";
        System.out.println("Input : "+s);
        Set<String> set = new HashSet<>();
        Set<String> dublicateString = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(!set.add(s.charAt(i)+"")){
                dublicateString.add(s.charAt(i)+"");
            }
        }
        System.out.println(" output : "+dublicateString);
    }
}

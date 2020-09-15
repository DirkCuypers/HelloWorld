package com.kbc.firstapp;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world on Mac");
        List<String> myFirstList = new ArrayList<>();
        myFirstList.add("C. First Element");
        myFirstList.add("B. Second Element");
        myFirstList.add("A. Third Element");
        myFirstList.add("ZZZZ extra topic");
        myFirstList.add("Extra branck item");
        myFirstList.add("In the second branch");
        System.out.println("My first list:" + myFirstList);

        List<String> mySortedList = myFirstList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("My first sorted list:"+mySortedList);
    }
}


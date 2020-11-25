package com.Selenium.homework1;


import java.util.*;


import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Integer[] masyv = {4, 2, 43, 54, 3, 2, 0, 6, 43, 2};

        List<Integer> words = new ArrayList<Integer>();

        List<Integer> list = Arrays.asList(masyv);
        Collections.reverse(list);

        Set<Integer> setWithoutDuplicates = new HashSet<Integer>(list);
        System.out.println("reversed list " + list);
        System.out.println("no dublicate " +setWithoutDuplicates);


    }
}
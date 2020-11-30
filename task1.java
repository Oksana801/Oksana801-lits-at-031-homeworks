package com.Selenium.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.addAll(Arrays.asList("car", "bus", "taxi", "taxi","bus", "bus", "train", "taxi"));



        list.subList(0, list.size()/2);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("taxi")) {
                list.set(i, "minivan");


            }
        }
        System.out.print(list);

    }
}
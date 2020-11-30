package com.Selenium.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<String>();
        l1.add("car");
        l1.add("bus");
        l1.add("taxi");
        l1.add("taxi");
        l1.add("bus");
        l1.add("bus");
        l1.add("train");
        l1.add("taxi");

        //System.out.print("\t" + l1);
        List<String> head = l1.subList(0, 4);
        List<String> tail = l1.subList(5, 8);


        for (int i = 0; i < head.size(); i++) {
            if (head.get(i).equals("taxi")) {
                head.set(i, "minivan");


            }
        }
        System.out.print(l1);

    }
}
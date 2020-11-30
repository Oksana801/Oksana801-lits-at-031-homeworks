package com.Selenium.homework1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3 {



    public static void main(String[] args) {
        Integer [] array = {3,43,7,7,0,54,3,1,2,0,6,43,0,1,0,2};
        int min = 0;
        int average;
        for (int i = array.length - 1; i >= 0; i--) {
            if (min > array[i])
                min = array[i];

        }
        System.out.println("min " +  min);

        if (array.length >0){
            int sum =0;
            for (int j=0; j< array.length; j++) {
                sum +=array[j];
            }
            average =sum/array.length;
            System.out.println("average " + average);
            List<Integer> list = Arrays.asList(array);
            list.set(list.lastIndexOf(min), average);
            System.out.println("update last min element" +list);

        }
    }

}
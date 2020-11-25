package com.Selenium.homework1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3 {



    public static void main(String[] args) {
        Integer[] masyv = { 3, 43,7,7,0, 54, 3,1, 2,0, 6, 43,0,1,0, 2,};
        Integer min = masyv[0];
        Integer average = 0;
        for (int i = masyv.length - 1; i >= 0; i--) {
            if (min > masyv[i])
                min = masyv[i];

        }
        System.out.println("min " +  min);

        if (masyv.length >0){
            int sum =0;
            for (int j=0; j< masyv.length; j++) {
                sum +=masyv[j];
            }
            average =sum/masyv.length;
            System.out.println("average " + average);
            List<Integer> list = Arrays.asList(masyv);
            list.set(list.lastIndexOf(min), average);
            System.out.println("update last min element" +list);

        }
    }

}
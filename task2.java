package com.Selenium.homework1;


import java.util.*;


import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 43, 54, 3, 2, 0, 6, 43, 2};
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println("reversed list" +list);
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }
        System.out.println("no duplicates"+ Arrays.toString(whitelist));
    }
}

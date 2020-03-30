package com.it.academy.homework2;

public class SecondSmallest {
    public static void main(String args[]) {
        int[] myInts = {0, 1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i< myInts.length; i++){
            if (myInts[i] == min) {
                second_min = min;
            } else if (myInts[i] < min) {
                second_min = min;
                min = myInts [i];
            } else if (myInts [i] < second_min){
                second_min = myInts[i];
                }
            }
        System.out.println("The second smallest number is " + second_min);
        }
    }
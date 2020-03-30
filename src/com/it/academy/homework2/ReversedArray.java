package com.it.academy.homework2;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String args[]) {
        int [] myInts = new int[6];
        int [] intValues = {0,1,2,3,4,5};
        for (int i = 0; i<= (intValues.length / 2) -1; i++){
            int temp = intValues [i];
            intValues [i] = intValues [intValues.length -i -1];
            intValues [intValues.length -i -1] = temp;
            System.out.println("Temp array: " + Arrays.toString(intValues));
        }
        System.out.println("Reversed array: " + Arrays.toString(intValues));




    }
}

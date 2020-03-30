package com.it.academy.homework3;

import java.util.Scanner;

public class    CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];


        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
                    }
        for (int i = 0 ; i< n; i++){
            array2[i] = scanner.nextInt();
        }

                    for (int i=0; i<array1.length; i++){
                for (int j = 0; j< array2.length; j++){
                if (array1[i] == array2[j]){
                    array1[i] = array3[i];


                    System.out.println("Common elements are: " + (array3));
                }
                    }
                }

                    }


    }


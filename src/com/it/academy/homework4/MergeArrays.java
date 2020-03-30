package com.it.academy.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[2 * n];
        int c = 0;


        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array3[i] = array1[i];
            c++;
        }


        for (int j = 0; j < n; j++){
            array3[c++] = array2[j];

                }
        for (int i = 0; i < n*2; i++){
            System.out.print(array3[i] + " ");
        }

        for (int i = 2; i <= n*2; i++) {
            for (int j = 0; j <= n*2 - i; j++) {
                if (array3[j] > array3[j + 1]) {
                    int temp = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = temp;
                }

            }
        }
        System.out.println("\n" + Arrays.toString(array3));
    }
}
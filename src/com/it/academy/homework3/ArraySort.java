package com.it.academy.homework3;

import java.util.Arrays;
import java.util.Scanner;


public class ArraySort {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i =0; i<n ; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

}

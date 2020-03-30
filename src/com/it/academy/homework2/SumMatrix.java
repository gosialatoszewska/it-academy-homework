package com.it.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String args[]) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows");
        a = scanner.nextInt();
        System.out.println("Input number of columns");
        b = scanner.nextInt();
        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int array3[][] = new int[a][b];
        System.out.println("Input elements of first matrix");
        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                array1[c][d] = scanner.nextInt();
            }
        }
        System.out.println("Input elements of second matrix");

        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                array2[c][d] = scanner.nextInt();
            }
        }

        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                array3[c][d] = array1[c][d] + array2[c][d];
            }
        }
        System.out.println("Sum of the matrices:");

        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                System.out.println(array3[c][d] + "\t");
                System.out.println();
            }
        }
    }


}


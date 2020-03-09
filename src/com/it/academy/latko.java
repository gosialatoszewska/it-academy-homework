package com.it.academy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class latko {
    public static void main(String args[]) {
        Random rand = new Random();
        int columns,rows;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please number of rows");
        rows = scanner.nextInt();
        System.out.println("Please number of columns");
        columns = scanner.nextInt();
        int array1[][] = new int[rows][columns];
        int array2[][] = new int[rows][columns];
        int results[][] = new int[rows][columns];
        for (int k=0;k<rows;k++) {
            for (int l = 0; l < columns; l++) {
                array1[k][l] = rand.nextInt(10);
                array2[k][l] = rand.nextInt(10);
            }
        }
        System.out.println("This is Array1");
        for (int k=0;k<rows;k++){
            for (int l=0;l<columns;l++){
                System.out.print(array1[k][l] +"\t");
            }
        }
        System.out.println("\n This is Array2");
        for (int k=0;k<rows;k++) {
            for (int l = 0; l < columns; l++) {
                System.out.print(array2[k][l] + "\t");
            }
        }
        System.out.println("\n This is Final Array");
        for (int k=0;k<rows;k++) {
            for (int l = 0; l < columns; l++) {
                results[k][l] = array1[k][l] + array2[k][l];
                System.out.print(results[k][l] + "\t");
            }
        }
    }
}

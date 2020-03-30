package com.it.academy.homework2;

public class RowsSum {
    public static void main(String args[]){
        int rows, cols, sumRows;

        int a[][] ={
                {2, 4, 6},
                {1, 3, 5},
                {7, 8, 9}
        };

        rows = a.length;
        cols = a[0].length;

        for (int i= 0; i < rows; i++){
            sumRows=0;
            for (int j = 0; j < cols; j++) {
                sumRows = sumRows + a[i][j];
            }
            System.out.println("Sum of " + (i+1) + " row is " + sumRows);
            }
        }


    }


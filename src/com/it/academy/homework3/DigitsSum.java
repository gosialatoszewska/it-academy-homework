package com.it.academy.homework3;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = 0;
        int sum = 0;

        while (n>0){
            temp = n % 10;
            sum = sum + temp;
            n = n/10; }

        System.out.println(sum);


        }
        }


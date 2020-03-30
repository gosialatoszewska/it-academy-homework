package com.it.academy.homework1;

import java.util.Scanner;

public class NumbersComparison {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide Number 1");
        int Number1 = scanner.nextInt();
        System.out.println("Please provide Number 2");
        int Number2 = scanner.nextInt();
        if(Number1 > Number2){
            System.out.println(Number1 + ">" + Number2);
        }
        else if(Number1 == Number2){
            System.out.println(Number1 + "=" + Number2);
        }
        else{
            System.out.println(Number1 + "<" + Number2);
        }



    }
}

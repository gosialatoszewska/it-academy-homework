package com.it.academy;

import java.util.Scanner;

public class AgeDiscounts {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the age");
        int Age = scanner.nextInt();
        if(Age>65){
            System.out.println("10%");
        }
        else if(Age<18){
            System.out.println("25%");
                    }
        else {
            System.out.println("5%");
        }
    }

}


package com.it.academy;

public class ArrayDuplicates {
    public static void main(String args[]) {

        int [] myInts = {0,1,2,1,4,0};
        for (int i = 0; i < myInts.length -1; i++){
            for (int j = i + 1; j < myInts.length; j++) {
                if ((myInts[i] == myInts[j]) && (i != j)) {
                    System.out.println("Duplicate elements" + myInts[j]);
                }
                           }

        }

    }
}

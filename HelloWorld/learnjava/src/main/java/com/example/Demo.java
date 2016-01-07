package com.example;

public class Demo {
    public static void main(String[] args) {

        int[] elements = {5, 7, 9, 3, 6};
        int indexPos = 0;
        int sumTotal = 0;

        while(indexPos < elements.length) {
            sumTotal += elements[indexPos];
            indexPos++;
        }

        System.out.println(sumTotal);

    }
}

package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[1000000];

        Random ranNumbersForArray = new Random();

        for(int i = 0; i< numbers.length; i++){
            numbers[i] = ranNumbersForArray.nextInt();
        }

    }
    private boolean search(int[] numbers, int x){
        return true;
    }
}
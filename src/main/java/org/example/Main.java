package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[1000000];

        Random ranNumbersForArray = new Random();

        for(int i = 0; i< numbers.length; i++){
            numbers[i] = ranNumbersForArray.nextInt();
        }
        Arrays.sort(numbers);

        for (int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }
    }
    private boolean search(int[] numbers, int x){
        return true;
    }
}
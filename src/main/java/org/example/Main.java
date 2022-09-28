package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

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

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        Main main = new Main();
        System.out.println(main.search(numbers, x));
    }
    private boolean search(int[] numbers, int x){
        int value = x;
        boolean contains = IntStream.of(numbers).anyMatch(number -> number == value );
        return contains;
    }
}
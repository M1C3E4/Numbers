package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random ranNumbersForArray = new Random();

        int[] numbers = new int[1000000];

        for(int i = 0; i< numbers.length; i++){
            numbers[i] = ranNumbersForArray.nextInt();
        }
        Arrays.sort(numbers);

        for (int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }
        int x = scanner.nextInt();
        System.out.println(search(numbers, x));
    }
    private static boolean search(int[] numbers, int x){
        int value = x;
        boolean contains = IntStream.of(numbers).anyMatch(number -> number == value );
        return contains;
    }
}
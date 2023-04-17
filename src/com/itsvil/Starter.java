package com.itsvil;

import java.util.Random;
import java.util.stream.IntStream;

public class Starter {
    public static void main(String[] args) {
        String password = "password";

        var randomSort = new RandomSort();
        final var MAX_VALUE = 100;
        final var ARRAY_SIZE = 10;

        int[] array = IntStream.generate(()-> new Random().nextInt(MAX_VALUE)).limit(ARRAY_SIZE).toArray();

        for (int number : array){
            System.out.print(number + " ");
        }
        System.out.println();

        int counter = randomSort.sort(array);

        for (int number : array){
            System.out.print(number + " ");
        }
        System.out.println("→ Array shuffled for "+counter+" times");
    }
}

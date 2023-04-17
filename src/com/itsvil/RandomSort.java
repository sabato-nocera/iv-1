package com.itsvil;

import java.util.Random;

public class RandomSort {

    private final Random random = new Random();

    public int sort(int[] array) {
        var counter = 0;
        while (!isSorted(array)) {
            shuffle(array);
            counter++;
        }
        return counter;
    }

    private static boolean isSorted(int[] array) {
        for (var i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void shuffle(int[] array) {
        for (var i = 0; i < array.length; ++i) {
            var index1 = random.nextInt(array.length);
            var index2 = random.nextInt(array.length);

            int tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
        }
    }

}

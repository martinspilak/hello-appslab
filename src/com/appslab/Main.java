package com.appslab;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println((warOfNumbers(new int[]{2, 8, 7, 5})));
        System.out.println((warOfNumbers(new int[]{12, 90, 75})));
        System.out.println((warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243})));
        System.out.println((warOfNumbers(new int[]{7, 18})));
    }

    private static int warOfNumbers(int[] array) {
        int even = 0, odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even += array[i];
            else
                odd += array[i];

        }
        if (even > odd) return even - odd;
        else return odd - even;
    }
}

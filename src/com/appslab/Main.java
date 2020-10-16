package com.appslab;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println((differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21})));
        System.out.println((differenceMaxMin(new int[]{44, 32, 86, 19})));
        System.out.println((differenceMaxMin(new int[]{50, 18, -5, 24, -100, -8, 34, 27})));
        System.out.println((differenceMaxMin(new int[]{440, -32, 8, 19, 37})));
        System.out.println((differenceMaxMin(new int[]{7, 2, 4, -15, -12, 60, 29, -21})));
        System.out.println((differenceMaxMin(new int[]{5, 7, 2, 4, 9})));
    }

    private static int differenceMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
            else if(array[i] < min)
                min = array[i];

        }
        return max -min;
    }
}

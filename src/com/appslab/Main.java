package com.appslab;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println(equalSlices(11, 5, 2));
        System.out.println(equalSlices(11, 5, 3));
        System.out.println(equalSlices(8, 3, 2));
        System.out.println(equalSlices(8, 3, 3));
        System.out.println(equalSlices(24, 12, 2));
    }
    private static boolean equalSlices(int totalslices, int people, int slicesforpople) {
    if(people * slicesforpople <= totalslices) return true;
    else return false;
    }
}

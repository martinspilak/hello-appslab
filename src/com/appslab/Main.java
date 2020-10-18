package com.appslab;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println(checkEnding("abc", "bc"));
        System.out.println(checkEnding("abc", "d"));
        System.out.println(checkEnding("samurai", "zi"));
        System.out.println(checkEnding("feminine", "nine"));
        System.out.println(checkEnding("convention", "tio"));
    }

    private static Boolean checkEnding(String str1, String str2) {
       if (str1.endsWith(str2)) return true;
       else return false;
    }
}

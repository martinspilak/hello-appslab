package com.appslab;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("mom"));
        System.out.println(checkPalindrome("scary"));
        System.out.println(checkPalindrome("reviver"));
        System.out.println(checkPalindrome("stressed"));
    }
    private static boolean checkPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        if (sb.reverse().toString().equals(str)) return true;
        else return false;
    }
}

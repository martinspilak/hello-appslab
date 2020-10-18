package com.appslab;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println(canCapture(new String[] {"A8", "E8"}));
        System.out.println(canCapture(new String[] {"A1", "B2"}));
        System.out.println(canCapture(new String[] {"H4", "H3"}));
        System.out.println(canCapture(new String[] {"F5", "C8"}));
        System.out.println(canCapture(new String[] {"C8", "C5"}));
        System.out.println(canCapture(new String[] {"A8", "H6"}));
        System.out.println(canCapture(new String[] {"G1", "E4"}));
        System.out.println(canCapture(new String[] {"F3", "B3"}));
    }

    private static Boolean canCapture(String[] array) {
       if(array[0].contains("1") && array[1].contains("1")) return true;
       else if(array[0].contains("2") && array[1].contains("2")) return true;
       else if(array[0].contains("3") && array[1].contains("3")) return true;
       else if(array[0].contains("4") && array[1].contains("4")) return true;
       else if(array[0].contains("5") && array[1].contains("5")) return true;
       else if(array[0].contains("6") && array[1].contains("6")) return true;
       else if(array[0].contains("7") && array[1].contains("7")) return true;
       else if(array[0].contains("8") && array[1].contains("8")) return true;
       else if(array[0].contains("A") && array[1].contains("A")) return true;
       else if(array[0].contains("B") && array[1].contains("B")) return true;
       else if(array[0].contains("C") && array[1].contains("C")) return true;
       else if(array[0].contains("D") && array[1].contains("D")) return true;
       else if(array[0].contains("E") && array[1].contains("E")) return true;
       else if(array[0].contains("F") && array[1].contains("F")) return true;
       else if(array[0].contains("G") && array[1].contains("G")) return true;
       else if(array[0].contains("H") && array[1].contains("H")) return true;
        else return false;
    }
    }

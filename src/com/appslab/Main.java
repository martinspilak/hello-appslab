package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(Equality(3, 4, 3));
        System.out.println(Equality(1, 1, 1));
        System.out.println(Equality(3, 4, 1));
    }
    private static double Equality(int a,int b, int c) {
        if (a == b && b == c ) {
            return (3);
        }
        else if(a == b || a == c || b == c){
         return(2);}
        else{
        }
        return (0);
}
}

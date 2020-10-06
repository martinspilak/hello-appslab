package com.appslab;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
            System.out.println(rps("rock", "paper"));
            System.out.println(rps("paper", "rock"));
            System.out.println(rps("paper", "scissors"));
            System.out.println(rps("scissors", "scissors"));
            System.out.println(rps("scissors", "paper"));
            System.out.println(rps("scissors", "rock"));
            System.out.println(rps("rock", "scissors"));
            System.out.println(rps("paper", "paper"));
            System.out.println(rps("rock", "rock"));
        }
        private static String rps(String player, String player2) {
        if (player == "rock" && player2 == "scissors" || player == "paper" && player2 == "rock" || player == "scissors" && player2 == "paper")
            return "Player 1 wins";
        if (player2 == "rock" && player == "scissors" || player2 == "paper" && player == "rock" || player2 == "scissors" && player == "paper")
            return "Player 2 wins";
        return "TIE";
        }
    }







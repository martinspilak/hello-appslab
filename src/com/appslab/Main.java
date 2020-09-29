package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(totalDistance(0.2, 0.4, 100.0));
        System.out.println(totalDistance(0.3, 0.2, 25.0));
        System.out.println(totalDistance(0.1, 0.1, 6.0));
    }
    private static double totalDistance(double stepHeight, double stepLength, double towerHeight) {
        var numOfSteps = (towerHeight / stepHeight) * (stepHeight + stepLength);
        return ((int)numOfSteps);
}
}

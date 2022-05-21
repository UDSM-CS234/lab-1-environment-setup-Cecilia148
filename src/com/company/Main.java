
package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 10.0;
        double fallingTime = 5;
        double initialPosition = 150;
        double finalPosition;

        finalPosition = 0.5 * (gravity * fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition;
        finalPosition = (double)(Math.round(finalPosition * 10.0))/10.0;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
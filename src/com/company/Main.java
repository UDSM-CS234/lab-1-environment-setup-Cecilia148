
package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 5.0;
        double fallingTime = 3;
        double initialPosition = 170;
        double finalPosition;

        finalPosition = 0.5 * (gravity * fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition;
        finalPosition = (double)(Math.round(finalPosition * 10.0))/10.0;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}

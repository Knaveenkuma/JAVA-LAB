/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.io.*;
/**
 *
 */
public class divisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lowerLimit = 101;
        int upperLimit = 200;
        int divisibleBy = 8;
        int sum = 0;

        for (int num = lowerLimit; num < upperLimit; num++) {
            if (num % divisibleBy == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of integers between " + lowerLimit + " and " + upperLimit +
                           " divisible by " + divisibleBy + ": " + sum);
    }
}

        

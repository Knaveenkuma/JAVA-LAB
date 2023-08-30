/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.*;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        scanner.close();

        double revenue = unitPrice * quantity;
        double discountRate = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.10;
        } else if (quantity > 120) {
            discountRate = 0.15;
        }

        double discountAmount = revenue * discountRate;
        double discountedRevenue = revenue - discountAmount;

        System.out.println("The revenue from sale: " + revenue);
        System.out.println("After discount: " + discountAmount + " (" + (discountRate * 100) + "%)");
        System.out.println("Discounted revenue: " + discountedRevenue);
    }
}


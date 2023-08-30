/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.io.*;
/**
 *
 * 
 */
public class light {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days = 365; 
        double lightSpeedKmps = 299792.458; 

        double distanceKm = lightSpeedKmps * days * 24 * 60 * 60; 

        System.out.println("Distance traveled by light in " + days + " days: " + distanceKm + " kilometers");
    }
}
        // TODO code application logic here
 
    


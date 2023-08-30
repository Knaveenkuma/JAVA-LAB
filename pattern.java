/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab;
import java.io.*;
/**
 *
 * @author 22cseb60
 */
public class pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i,j,n=5;
    for(i=5;i>=1;i--)
    {
        for(j=5;j>=i;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}

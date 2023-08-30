/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.util.*;

/**
 *
 *
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the Array Limit :");
  int l = input.nextInt();
  int [] a = new int[l];
  for(int i = 0; i < l; i++)
  {
   System.out.println("Element of a[" + i + "] :");
   a[i] = input.nextInt();
  }
  System.out.print("Enter the Search Array Element :");
  int s = input.nextInt();
  int i, f = 0;
  for(i = 0; i < l; i++)
  {
   if(a[i] == s)
   {    
    f = 1;
    break;
   }
  }
  if(f == 1)
  {
   System.out.println("The Element is found in the position : " + (i + 1));
   System.out.println("The Element is found in the index : " + i);
  }
  else
  {
   System.out.println("The Element is Not found");
  }
    }
}
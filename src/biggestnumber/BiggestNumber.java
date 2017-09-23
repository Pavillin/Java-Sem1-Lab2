/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggestnumber;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class BiggestNumber {

   public static void main(String[] args)
    {
        System.out.printf("Please enter 3 DIFFERENT numbers%n");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = keyboard.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = keyboard.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = keyboard.nextDouble();
        
        System.out.printf("%f is the biggest number%n", largestNumber(num1,num2,num3));
    }
    
   public static double largestNumber (double n1, double n2, double n3)
    {
        if (n1 > n2 && n1 > n3)
            return (n1);
        else if (n2 > n1 && n2 > n3)
            return (n2);
        else
            return (n3);
    }
}

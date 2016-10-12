/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question 3, Assignment 2
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 02/08/13

import java.util.Scanner;

public class Question3 {
    public static void main (String [] args){
        Rational Rational1 = new Rational();
        Rational Rational2 = new Rational();
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter numerator 1:");
        Rational1.numerator = input.nextInt();
        System.out.println("Enter denominator 1:");
        Rational1.denominator = input.nextInt();
        System.out.println("Enter numerator 2:");
        Rational2.numerator = input.nextInt();
        System.out.println("Enter denominator 2:");
        Rational2.denominator = input.nextInt();
       
        RationalOperations operate = new RationalOperations();
        
        operate.operatons(Rational1, Rational2);
                
                
    }

}

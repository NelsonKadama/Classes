/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question 1, Assignment 2 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 02/08/13

import java.util.Scanner;

public class Question1 {
    public static void main (String [] args){
        String first_name,middle_name,last_name;
        
        Scanner input = new Scanner (System.in);
        
        Student student_class = new Student();
        
        System.out.println("Enter first name:");
        first_name = input.nextLine();
        System.out.println("Enter middle name:");
        middle_name = input.nextLine();
        System.out.println("Enter last name:");
        last_name = input.nextLine();
        
        student_class.setNames(first_name, middle_name, last_name);
        
        System.out.println(student_class.getFullName());
    }

}

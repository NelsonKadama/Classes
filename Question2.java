/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question 2, Assignment 2 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 02/08/13

import java.util.Scanner;
import java.text.*;

public class Question2 {
    public static void main (String [] args){
        String number;
        double airtime;
        double cost;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        Scanner input = new Scanner(System.in);
        Cellphone Cellphone_class = new Cellphone();
        
        System.out.println("Enter telephone number (e.g., +27 21 650 2663):");
        number = input.nextLine();
        System.out.println("Enter initial airtime (e.g., 12.00):");
        airtime = input.nextDouble();
        System.out.println("Enter cost per second (e.g., 0.05):");
        cost = input.nextDouble();
        
        Cellphone_class.initialise(number, airtime, cost);
        
        int decision;
        boolean run = true;
        
        while(run){
            System.out.println("------------ Phone Operation Menu: " + number + " ----------");
            System.out.println("0. Quit");
            System.out.println("1. View airtime");
            System.out.println("2. Add airtime");
            System.out.println("3. Make telephone call");
            System.out.println("4. Receive call");
            System.out.println("5. View call history");
            
            System.out.println("Enter user operation number:");
            decision = input.nextInt();
            
            String num;
            int length;
            
            switch(decision){
                case 0:
                    System.out.println("Bye");
                    run = false;
                    break;
                case 1:
                    System.out.println("Airtime remaining: R" + df.format(Cellphone_class.airtime));
                    break;
                case 2:
                    double amount;
                    System.out.println("Enter airtime (e.g., 12.00):");
                    amount = input.nextDouble();
                    Cellphone_class.AddAirtime(amount);
                    System.out.println("Airtime remaining: R" + df.format(Cellphone_class.airtime)); 
                    break;
                case 3:
                    System.out.println("Enter number to call:");
                    num = input.nextLine();
                    num = input.nextLine();
                    System.out.println("Enter the duration of the call (in seconds):");
                    length = input.nextInt();
                    
                    if (Cellphone_class.makeCall(num, length) == true){
                        System.out.println("Call successful");
                    }
                    else if (Cellphone_class.makeCall(num, length) == false){
                        System.out.println("Not enough airtime");
                    }
                    
                    break;
                case 4:
                    
                    System.out.println("Enter number to recieve call from:");
                    num = input.nextLine();
                    num = input.nextLine();
                    System.out.println("Enter the duration of the call (in seconds):");
                    length = input.nextInt();
                    
                    Cellphone_class.recieveCall(num, length);
                    
                    System.out.println("Call successful");
                    break;
                case 5:
                    System.out.println(Cellphone_class.history);
                    break;
                            
            }
                
        }
        
                
        

    }

}

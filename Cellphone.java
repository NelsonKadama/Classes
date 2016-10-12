/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question 2, Assignment 2 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 02/08/13

import java.text.*;

public class Cellphone {
    private String number;
    String history = "";
    double airtime = 0;
    double cost;
    
    DecimalFormat mins = new DecimalFormat("#");
    
    void initialise(String number, double airtime, double cost){
        this.number = number;
        this.airtime = airtime;
        this.cost = cost;
        
    }
    
    void AddAirtime(double amount){
        airtime += amount;
    }
    
    boolean makeCall(String number, int duration){
        double fee = duration*cost;
        
        if (fee > airtime){
            return false;
        }
            
        else{
            airtime -= fee;
            history += "Called " + number + "("+duration+"s)\n";
            return true;
        }
            
    }
    
    void recieveCall(String number, int duration){
        history += "Recieved " + number + "("+duration+"s)\n";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question1 1, Assignment 2 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 02/08/13

public class Student {
    String first, last, middle;
    
    public void setNames(String first, String middle, String last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    public String getFullName(){
        return ("The full name is: " + this.first +" "+ middle.charAt(0) + ". " + this.last );
    }

}

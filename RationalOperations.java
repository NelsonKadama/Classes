/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question 3, Assignment 2
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 02/08/13

public class RationalOperations {
    Rational final_ = new Rational();
    
    
    void addition(Rational first, Rational second){
        
        final_.denominator = first.denominator*second.denominator;
        final_.numerator = (((final_.denominator/first.denominator)*first.numerator)+((final_.denominator/second.denominator)*second.numerator));
        
        System.out.println("Addition");
        simplify(final_.numerator, final_.denominator);

    
    }
    
    void subtraction(Rational first, Rational second){
        
        final_.denominator = first.denominator*second.denominator;
        final_.numerator = (((final_.denominator/first.denominator)*first.numerator)-((final_.denominator/second.denominator)*second.numerator));
        
        
        System.out.println("Subtraction");
        simplify(final_.numerator, final_.denominator);
    }
    
    void multiplication (Rational first, Rational second){
        final_.numerator = first.numerator*second.numerator;
        final_.denominator  = first.denominator*second.denominator;
        
        System.out.println("Multiplication");
        simplify(final_.numerator, final_.denominator);
    }
    
    void division(Rational first, Rational second){
        final_.numerator = first.numerator*second.denominator;
        final_.denominator  = first.denominator*second.numerator;
    
        System.out.println("Division");
        simplify(final_.numerator, final_.denominator);
    }
    
    void simplify (int first, int second){
        int num1 = first;
        int num2 = second;
      
        while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

        final_.numerator = (final_.numerator/num1);
        final_.denominator = (final_.denominator/num1);
        
        
        System.out.println(final_.numerator+"/"+final_.denominator);
    }
    void operatons(Rational first, Rational second){
        addition(first, second);
        subtraction(first, second);
        multiplication(first, second);
        division(first, second);
    }
    

}

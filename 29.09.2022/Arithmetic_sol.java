/*1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as
parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic*/

package com.cognizant.shapes;

class Arithmetic{
    public int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

class Adder extends Arithmetic {  
    public int callAdd(int a, int b){
        return add(a, b);
    }
}

public class Arithmetic_sol {
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();  
        System.out.print(a.add(10,32));
     }
}

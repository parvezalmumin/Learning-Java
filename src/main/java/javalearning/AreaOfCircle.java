package javalearning;

import  java.util.Scanner;

public class AreaOfCircle { 
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in); 
           double pi,r,A;
           pi = 22/7;
           
           System.out.println("Enter the value of radius: ");
           r = input.nextDouble();
           
           System.out.println("You entered " + r);
           System.out.println("Value of PI is 22/7");
           
           A = pi * (r * r);
           System.out.println("Area of Circle is " + A);
           input.close();
           
    }
}

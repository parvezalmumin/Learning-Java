package javalearning;

import java.util.Scanner;

public class ArithmeticOperationsByTakingUnputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give First Number: ");
        double FirstNumber = input.nextDouble();
        input.nextLine();
        
        System.out.println("Give Second Number: ");
        double SecondNumber = input.nextDouble();
        input.nextLine();
        
        double result;
        result = FirstNumber + SecondNumber;
        System.out.println("Summation: " + result);
        
         result = FirstNumber - SecondNumber;
        System.out.println("Substraction: " + result);
        
        result = FirstNumber*SecondNumber;
        System.out.println("Multiplication: " + result);
        
        result = FirstNumber/SecondNumber;
        System.out.println("Divions: " + result);
        
         result = FirstNumber % SecondNumber;
        System.out.println("Remainder: " + result);
        
        input.close();
        
    }
}

package javalearning;
import java.util.Scanner;
public class Assignment4alternativeVersion {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int phonePrice = 1800; 
        
        System.out.println("Welcome to Phone Installment Calculator!");
        System.out.println("Phone price: " + phonePrice + " euros");
        System.out.print("In how many months do you want to pay? ");//  Ask user for input
        
        int months = input.nextInt();   //  Get user input   
        int monthlyAmount = phonePrice / months; //Calculate
        
        System.out.println("\n--- Your Payment Plan ---");
        System.out.println("Phone Price: " + phonePrice + " euros");
        System.out.println("Payment Period: " + months + " months");
        System.out.println("Monthly Payment: " + monthlyAmount + " euros");
        
        input.close();
    
    }
   
}

package javalearning;

import java.util.Scanner;
public class ParimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double P,s;
        
        System.out.println("YOU ARE HERE TO CALCULATE THE PERIMETER OF A SQUARE ");
         System.out.println("Give, Length of Side, s = ");
         s = input.nextDouble();
         P = 4 * s;
         System.out.println("Perimeter of Square = " + P);
         input.close();
    }
}

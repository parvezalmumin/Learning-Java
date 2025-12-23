
package javalearning;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double S, A;
        
        System.out.println("Give Length of Sides, S: ");
        S = input.nextDouble();
        
       A = S * S;
        System.out.println("Your area of Square is " + A);
        
        input.close();
    }
}

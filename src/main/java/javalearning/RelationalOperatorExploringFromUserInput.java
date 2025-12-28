package javalearning;

import java.util.Scanner;

public class RelationalOperatorExploringFromUserInput {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = input.nextInt();

        System.out.print("Enter second number: ");
        int y = input.nextInt();

        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y  : " + (x > y));
        System.out.println("x < y  : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));

        input.close();
    }
}

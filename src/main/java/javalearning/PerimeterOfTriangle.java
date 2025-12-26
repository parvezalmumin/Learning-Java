package javalearning;

import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,P;
        System.out.println("YOU ARE HERE TO FIND THE PERMETER OF A TRIANGLE");
        System.out.println("Give, Side a = ");
        a = input.nextDouble();
        System.out.println("Give,another side, c = ");
        c = input.nextDouble();
        System.out.println("Give Base, b = ");
        b = input.nextDouble();
        P = a + b + c;
        System.out.println("Perimeter of a Tra=iangle is, P = " + P);
        input.close();
    }
}

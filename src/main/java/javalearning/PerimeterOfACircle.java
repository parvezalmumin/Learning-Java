package javalearning;
import java.util.Scanner;
public class PerimeterOfACircle {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        double P, pi, r;
        pi = 3.14159265359;
        System.out.println("YOU ARE HERE TO FIND THE PERIMETER OF CIRCLE");
        System.out.println("Give, Radius, r = ");
        r = input.nextDouble();
        System.out.println("Pi is approximately 3.14159");
        P = 2 * pi * r;
        System.out.println("So, The Perimeter of a Circle is , P = " + P);
        input.close();
    }
}

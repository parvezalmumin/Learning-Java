package javalearning;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,w,P;
        System.out.println("YOU ARE HERE TO FIND THE PERIMETER OF RECTANGLE");
        System.out.println("Give,Length,l = ");
        l = input.nextDouble();
        System.out.println("Give,Width, w = ");
        w = input.nextDouble();
        P = 2 * (l + w);
        System.out.println("Perimeter  of Rectangle is, P = " + P);
        input.close();
    }
 
}

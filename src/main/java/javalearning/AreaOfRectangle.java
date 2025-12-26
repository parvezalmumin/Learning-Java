package javalearning;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,w,A;
        System.out.println("Give Length of Rectangle: ");
        l = input.nextDouble();
        System.out.println("Give Width Of Rectangle: ");
        w = input.nextDouble();
        A = l * w;
        System.out.println("Area of Rectangle is:" + A);
        input.close();
    }
}

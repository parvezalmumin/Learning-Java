package javalearning;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double b,h,A;
            System.out.println("YOU ARE HERE FOR CALCULATE AREA OF TRIANGLE");
            System.out.println("Give,Base = ");
            b = input.nextDouble();
            System.out.println("Give,Height = ");
            h = input.nextByte();
            A = 0.5 * (b * h);
            System.out.println("Area of Triangle is = " + A);
            input.close();
    }
    
}

package javalearning;
import java.util.Scanner;
public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C,F;
        System.out.println("YOU ARE HERE TO CONVERT CELSIUS TO FARENHEIT");
        System.out.println("Give the value of Celsius: ");
        C = input.nextDouble();
        F = ((9/5) * C ) + 32 ;
        System.out.println("Farenheit is: " + F);
        input.close();
    }
}

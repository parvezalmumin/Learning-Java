package javalearning;
import java.util.Scanner;
public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C,F;
        System.out.println("YOU ARE HERE TO CONVERT CELSIUS TO FARENHEIT");
        System.out.println("Give the value of Farenheit: ");
        F = input.nextDouble();
        C = (5.0/9) * (F  - 32) ;
        System.out.println("Farenheit is: " + C);
        input.close();
    }
}

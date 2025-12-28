
package javalearning;

import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give number");
        int num = input.nextInt();
        
        if(num>0){
            System.out.println("Number is Positive");
        }
    }
}

/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */
package Assignments;

import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give Number from 1 to 9 for printing Spelling");
        int num = input.nextInt();
        
        if( num == 1){
            System.out.println("One");
        }
        else if (num == 2){
            System.out.println("Two");
        }
        else if (num == 3){
            System.out.println("Three");
        }
        else if (num == 4){
            System.out.println("Four");
        }
        else if (num == 5){
            System.out.println("Five");
        }
        else if (num == 6){
            System.out.println("Six");
        }
        else if(num == 7){
            System.out.println("Seven");
        }
        else if (num == 8){
            System.out.println("Eight");
        }
        else if (num == 9){
            System.out.println("Nine");
        }
        
        else if (num == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Invalid Number.Please give number from 1 to 9  ");
        }
    }
}

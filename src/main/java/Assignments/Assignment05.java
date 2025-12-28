
/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */
package Assignments;

import java.util.Scanner;

public class Assignment05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = input.nextInt();
        
        if(age>=18){
            System.out.println("Congratulations!! You are a Voter Now");
        }
                else if(age<0){
            System.out.println("You  have given Invalid number.Try Again.");
        }
        else if (age<18){
        int waiting = 18 - age;
      if(waiting==1){
          System.out.println("Sorry!! You have to wait more " + waiting + " more Year");
      }
      else{
          System.out.println("Sorry!! You have to wait more " + waiting + " more Years");
      }   
        }
 input.close();
    }
}

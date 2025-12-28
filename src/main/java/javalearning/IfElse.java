package javalearning;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give number");
        int num = input.nextInt();
        
        if(num>0){
            System.out.println("Number is Positive");
        }
           else{
            System.out.println("Give number bigger than zero");
        }  
    }
}


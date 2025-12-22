/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */
package Assignments;

import java.util.Scanner;

public class Product03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Enter Product Details ===");
        
       
        System.out.println("Give Your ID:");
        int id = input.nextInt();
        input.nextLine();  
        
       
        System.out.println("Give Title:");
        String title = input.nextLine();
        
      
        System.out.println("Give Price:");
        double price = input.nextDouble();
        input.nextLine();  
        
     
        System.out.println("Give Description:");
        String description = input.nextLine();
        
       
        System.out.println("Give Category:");
        String category = input.nextLine();
        
      
        System.out.println("\n Product Information ");
        System.out.println("Product ID: " + id);
        System.out.println("Product Title: " + title);
        System.out.println("Product Price: $" + price);
        System.out.println("Product Description: " + description);
        System.out.println("Product Category: " + category);
        
        input.close();  
    }
}
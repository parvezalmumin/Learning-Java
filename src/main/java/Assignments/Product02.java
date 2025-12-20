/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */

package Assignments;

public class Product02 {
    public static void main(String[] args){
        int id = 101;
        String title = "iPhone 15";
        double price = 1895;
        String description = "Perfect product with best image quality";
        String category = "Phone";

        System.out.println("Product ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price + " euros");
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
    }
    
}

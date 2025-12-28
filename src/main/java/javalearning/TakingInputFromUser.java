


// Step 1: Import the Scanner class
import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        
                // Step 2: Create a Scanner class and an  object, We can name it anything
        Scanner input = new Scanner(System.in);
        
        // --- Reading a String ---
        System.out.print("What is your name? ");
        String name = input.nextLine();
                // --- Reading an Integer ---
        System.out.print("How old are you? ");
        int age = input.nextInt();

        // --- Reading a Double ---
        System.out.print("What is your favorite number (can be a decimal)? ");
        double favoriteNumber = input.nextDouble();
        
        
        // --- Displaying the results ---
        System.out.println("\n--- Hello, " + name + "! ---");
                System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite number is " + favoriteNumber + ".");

        
        
                // Step 4: Close the scanner
        input.close();

    }
}

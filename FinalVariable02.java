public class FinalVariable02 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java Variables.");
        
        //Final Variables in Java
        // If I don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
     final int myNum = 15;
         System.out.println(myNum);
         
         // Normal variable (not final)
            int x = 5;
        System.out.println("Before change, x = " + x);
        x = 10;  // ✅ Allowed
        System.out.println("After change, x = " + x);
    }
}

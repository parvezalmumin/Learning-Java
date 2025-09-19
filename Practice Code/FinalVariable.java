 public class FinalVariable {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java Variables.");
        
        //Final Variables in Java
        // If I don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
     final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
         System.out.println(myNum);
    }
}
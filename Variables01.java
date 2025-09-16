 public class Variables01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java Variables.");
        
       int myNum;
       myNum = 15;
       System.out.println(myNum);
       
       int num = 15;
       System.out.println(num);
       
         int age = 21;  // declaring an integer variable
        int nextYearAge = age + 1; // doing a calculation with integer
        System.out.println("Current age: " + age);
        System.out.println("Next year age: " + nextYearAge);
        
        //if I assign a new value to an existing variable, it will overwrite the previous value:
        int myNumber = 15;
          myNumber = 20;  // myNumber is now 20
        System.out.println(myNumber);
        
    }
}

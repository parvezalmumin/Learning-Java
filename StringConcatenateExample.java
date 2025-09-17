 public class StringConcatenateExample {
    public static void main(String[] args) {
        // Using + operator
        String firstName = "Apu";
        String lastName = "Miah";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name (using +): " + fullName);

        // Using concat() method
        String hello = "Hello";
        String world = "World";
        String message = hello.concat(" ").concat(world);
        System.out.println("Message (using concat): " + message);
    }
}
 public class StringCharAtExample {
    public static void main(String[] args) {
        String name = "Apu";

        // Get first character (index 0)
        char firstChar = name.charAt(0);

        // Get second character (index 1)
        char secondChar = name.charAt(1);

        // Get third character (index 2)
        char thirdChar = name.charAt(2);

        // Print characters
        System.out.println("String: " + name);
        System.out.println("First character: " + firstChar);
        System.out.println("Second character: " + secondChar);
        System.out.println("Third character: " + thirdChar);

        // Example: last character (length-1)
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("Last character: " + lastChar);
    }
}

 
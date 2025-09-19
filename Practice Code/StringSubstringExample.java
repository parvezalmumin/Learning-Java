 public class StringSubstringExample {
    public static void main(String[] args) {
        String sentence = "Hello, Java World!";

        // Substring from index 7 to end
        String part1 = sentence.substring(7);
        System.out.println("Substring from index 7: " + part1);

        // Substring between index 0 and 5 (exclusive of 5)
        String part2 = sentence.substring(0, 5);
        System.out.println("Substring from 0 to 5: " + part2);

        // Substring in the middle
        String part3 = sentence.substring(7, 11);
        System.out.println("Substring from 7 to 11: " + part3);
    }
}


/*
 * Key Points:
 * Indexing starts from 0.
 * End index is not included.
 * substring(x) → takes everything from index x to the end.
 * substring(x, y) → takes from index x to y-1.
 * 
 * 
 */
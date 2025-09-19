 public class StringReplaceExample {
    public static void main(String[] args) {
        String sentence = "I love Java";

        // Replace a word
        String newSentence = sentence.replace("Java", "Python");
        System.out.println("Original: " + sentence);
        System.out.println("After replace: " + newSentence);

        // Replace a character
        String replacedChar = sentence.replace('a', 'o');
        System.out.println("After replacing 'a' with 'o': " + replacedChar);

        // Replace spaces with dashes
        String dashed = sentence.replace(" ", "-");
        System.out.println("After replacing spaces: " + dashed);
    }
}


package javalearning;

public class Typecast {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;      
        int i = s;       
        long l = i;      
        float f = l;      
        double d = f;  
        System.out.println(d);
        
        double price = 123.456;
        int roundedPrice = (int) price; 
        System.out.println(roundedPrice);
        
        char letter = 'A';
        int ascii = letter; 
        System.out.println(ascii);
        
        int num = 66;
        char ch = (char) num;  
        System.out.println(ch);
        
        
    }
}

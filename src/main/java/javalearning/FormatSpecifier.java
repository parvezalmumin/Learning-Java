package javalearning;

public class FormatSpecifier {
    public static void main(String[] args){
        boolean b = true;
        char c = 'a';
        short s = 3291;
        int i = 1234556;
        float f = 10.2f;
        double d = 10.221122341;
        
        
        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Character c = %c\n",c);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("Integer i = %d\n",i);
        System.out.printf("Float f = %.1f\n",f);
        System.out.printf("Double d = %.3f\n",d);
    }
}

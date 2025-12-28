package javalearning;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("### You are playing now with Unary Plus and Unary Minus ###\n");

        // Unary Minus
        System.out.println("## Unary Minus ##\n");

        System.out.println("Give a positive value");
        int a = input.nextInt();
        System.out.println("After using unary minus, value = " + (-a));

        System.out.println("\nGive a negative value");
        int c = input.nextInt();
        System.out.println("After using unary minus, value = " + (-c));

        // Unary Plus
        System.out.println("\n## Unary Plus ##\n");

        System.out.println("Give a positive value");
        int e = input.nextInt();
        System.out.println("After using unary plus, value = " + (+e));

        System.out.println("\nGive a negative value");
        int g = input.nextInt();
        System.out.println("After using unary plus, value = " + (+g));

        // Increment
        System.out.println("\n### Now you are playing with Increment ###\n");

        // Pre-increment
        System.out.println("## Pre-increment (++x) ##\n");

        System.out.println("Give a positive value");
        int i = input.nextInt();
        System.out.println("Before Pre-increment (++x) = " + i);
        System.out.println("After Pre-increment (++x) = " + (++i));
        System.out.println("Explanation: First increases the value, then uses it");

        System.out.println("\nGive a negative value");
        int k = input.nextInt();
        System.out.println("Before Pre-increment (++x) = " + k);
        System.out.println("After Pre-increment (++x) = " + (++k));
        System.out.println("Explanation: First increases the value, then uses it");

        // Post-increment
        System.out.println("\n## Post-increment (x++) ##\n");

        System.out.println("Give a positive value");
        int m = input.nextInt();
        System.out.println("Before Post-increment (x++) = " + m);
        int n = m++;
        System.out.println("Value used = " + n);
        System.out.println("After Increased = " + m);
        System.out.println("Explanation: After Post-increment (x++) = First uses the value, then increases it");

        System.out.println("\nGive a negative value");
        int o = input.nextInt();
        System.out.println("Before Post-increment (x++) = " + o);
        int p = o++;
        System.out.println("Value used = " + p);
        System.out.println("After Increased = " + o);
        System.out.println("Explanation: After Post-increment (x++) = First uses the value, then increases it");

        // Decrement
        System.out.println("\n### Now you are playing with Decrement ###\n");

        // Pre-decrement
        System.out.println("## Pre-decrement (--x) ##\n");

        System.out.println("Give a positive value");
        int r = input.nextInt();
        System.out.println("Before Pre-decrement (--x) = " + r);
        System.out.println("After Pre-decrement (--x) = " + (--r));
        System.out.println("Explanation: First decreases the value, then uses it");

        System.out.println("\nGive a negative value");
        int w = input.nextInt();
        System.out.println("Before Pre-decrement (--x) = " + w);
        System.out.println("After Pre-decrement (--x) = " + (--w));
        System.out.println("Explanation: First decreases the value, then uses it");

        // Post-decrement
        System.out.println("\n## Post-decrement (x--) ##\n");

        System.out.println("Give a positive value");
        int y = input.nextInt();
        System.out.println("Before Post-decrement (x--) = " + y);
        int z = y--;
        System.out.println("Value used = " + z);
        System.out.println("After Decreased = " + y);
        System.out.println("Explanation: After Post-decrement (x--) = First uses the value, then decreases it");

        System.out.println("\nGive a negative value");
        int t = input.nextInt();
        System.out.println("Before Post-decrement (x--) = " + t);
        int s = t--;
        System.out.println("Value used = " + s);
        System.out.println("After Decreased = " + t);
        System.out.println("Explanation: After Post-decrement (x--) = First uses the value, then decreases it");

        input.close();
    }
}


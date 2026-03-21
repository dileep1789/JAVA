package Operator;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-decrement: " + (a--));
        System.out.println("Final value: " + a);
    }
}
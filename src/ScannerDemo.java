import java.util.Scanner;

class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading integer
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Reading float
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        // Reading a single word
        System.out.print("Enter your name: ");
        String name = sc.next();

        // Reading a full line
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Displaying input
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Name: " + name);
        System.out.println("Sentence: " + sentence);

        sc.close(); // close scanner
    }
}
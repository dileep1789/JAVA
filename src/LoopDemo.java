class LoopDemo {
    public static void main(String[] args) {

        System.out.println("=== For Loop ===");
        // For loop: prints 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n=== While Loop ===");
        // While loop: prints 5 to 1
        int j = 5;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }

        System.out.println("\n=== Do-While Loop ===");
        // Do-while loop: prints 1 to 5
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);

    }
}
class StringDemo {
    public static void main(String[] args) {
        String name = "Dileep";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring (0-3): " + name.substring(0, 3));
        System.out.println("Concatenation: " + name.concat(" Kumar"));
        System.out.println("Replace D with K: " + name.replace('D', 'K'));
    }
}
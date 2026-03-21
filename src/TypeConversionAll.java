public class TypeConversionAll {
    public static void main(String[] args) {

        // Implicit
        int i = 50;
        double d = i;

        // Explicit
        double x = 9.99;
        int y = (int) x;

        // Char to int
        char ch = 'B';
        int ascii = ch;

        // String to int
        String s = "123";
        int num = Integer.parseInt(s);

        System.out.println("Implicit (int→double): " + d);
        System.out.println("Explicit (double→int): " + y);
        System.out.println("Char ASCII: " + ascii);
        System.out.println("String to int: " + num);
    }
}
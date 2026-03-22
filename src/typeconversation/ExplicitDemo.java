package typeconversation;

class ExplicitDemo {
    public static void main(String[] args) {
        double a = 100.55;
        int b = (int) a; // double explicitly converted to int
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
package typeconversation;

class ImplicitDemo {
    public static void main(String[] args) {
        int a = 100;
        double b = a;  // int automatically converted to double
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

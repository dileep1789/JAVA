package OOPs;

class Student {
    private String name;  // private data

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Dileep");
        System.out.println(s.getName());
    }
}
class Student {
    // data members
    int rollNo;
    String name;

    // method
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

 class class_obj1 {
    public static void main(String[] args) {
        // create object
        Student s1 = new Student();

        // assign values
        s1.rollNo = 1;
        s1.name = "Dileep";

        // display values
        s1.display();
    }
}
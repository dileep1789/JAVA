package OOPs;

class Car {
    String color = "Red";

    void drive() {
        System.out.println("Car is driving");
    }
}

public class class_obj {
    public static void main(String[] args) {
        Car c = new Car();  // object creation
        System.out.println(c.color);
        c.drive();
    }
}
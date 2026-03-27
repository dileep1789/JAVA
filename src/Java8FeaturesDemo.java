import java.util.*;
import java.util.stream.*;

// Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello(String name);

    // Default method (Java 8 feature)
    default void defaultMethod() {
        System.out.println("This is a default method in interface.");
    }
}

public class Java8FeaturesDemo {
    public static void main(String[] args) {

        // 1. Lambda Expression
        MyFunctionalInterface obj = (name) -> {
            System.out.println("Hello, " + name);
        };
        obj.sayHello("Dileep");
        obj.defaultMethod();

        // 2. Method Reference
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan", "Sita");
        System.out.println("\nUsing Method Reference:");
        names.forEach(System.out::println);

        // 3. Stream API
        System.out.println("\nEven Numbers using Stream:");
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        evenNumbers.forEach(n -> System.out.println(n));

        // 4. Optional Class
        System.out.println("\nUsing Optional:");
        String[] words = new String[5];
        Optional<String> checkNull = Optional.ofNullable(words[2]);

        if (checkNull.isPresent()) {
            System.out.println(words[2].toUpperCase());
        } else {
            System.out.println("Value is null");
        }
    }
}
package Java8_Features;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = getName();

        // if(name.isPresent()) {
        //     System.out.println(name.get());
        // }

         //name.ifPresent(System.out::println);

        // System.out.println(name.orElse("Unknown"));

        // System.out.println(name.orElseGet(() -> "Unknown"));

        //System.out.println(name.orElseThrow());

        name.ifPresentOrElse(System.out::println, () -> System.out.println("Unknown"));
    }

    public static Optional<String> getName() {
        return Optional.ofNullable("Aditya");
    }
}
package Java8_Features;
import java.util.function.*;
public class TypesOfFunInterfaces {
    public static void main(String[] args) {

        // Function Interface
        Function<Integer,Integer>square=x-> x*x;
        System.out.println(square.apply(5));

        //Consumer Interface
        Consumer<Integer> print=x->System.out.println(x);
        print.accept(7);

        //Supplier Interface
        Supplier<Double>randomvalue=()->Math.random();
        System.out.println(randomvalue.get());

        //Predicate Interface
        Predicate<Integer>isEven=x->(x%2==0);
        System.out.println(isEven.test(4));

    }
}

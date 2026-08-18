package Java8_Features;
import java.util.function.*;

public class FunctionalComposition {
    public static void main(String[] args) {

        //(x+2)*3 ->x+2,x+3

        Function<Integer,Integer>equation=x->((x+2)*3);

        Function<Integer,Integer>add2=x->x + 2; // f(x)
        Function<Integer,Integer>multiply3=x-> x * 3;  //g(x)

       // int ans1=multiply3.apply(add2.apply(2)); //g(f(x))

        //andThen
        // int ans2=add2.andThen(multiply3).apply(2);

        // Function<Integer,Integer>ansfunc=add2.andThen(multiply3);
        // int ans3=ansfunc.apply(2);

        // System.out.println(ans3);

        //Compose
        
        Function<Integer, Integer> combined2 = add2.compose(multiply3);
        System.out.println(combined2.apply(3));   
        // Step 1: square(3) = 9   (runs FIRST, even though written second)
        // Step 2: addTwo(9) = 11
        // Output: 11
        
    }
}

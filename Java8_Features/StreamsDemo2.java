package Java8_Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(11,34,13,1,13,4,34));

        //Intermediate Operation Methods

        list.stream()
            .filter(x->x > 10)
            .map(x->x * 2)
            .peek(System.out::println)
            .sorted()
            .distinct()
            .forEach(System.out::println);
 
        // List<List<Integer>>list2=List.of(  //two dimensional list
        //     List.of(1,2),
        //     List.of(3,4)
        // );

        // list2.stream()
        //      .flatMap(x->x.stream())
        //      .map(x->x * 2)
        //      .forEach(System.out::println);

    //     Stream.iterate(1, x->x+1)
    //      .limit(10)
    //      .skip(5)
    //      .forEach(System.out::println);

     }
}
//filter
//map
//flatMap->flattening operation
//Sorted  ->stateful
//distinct->keep unique values(Hashing)-->stateful
//limit() //skip
//peek()-->Debugging-observe element in pipleline
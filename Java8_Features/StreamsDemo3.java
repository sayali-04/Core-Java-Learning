package Java8_Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo3 {
    public static void main(String[] args) {
        //Termination Operations

        List<Integer>list=new ArrayList<>(List.of(1,13,11,9));
        
        List<Integer> list2=list.stream()
            .map(x->x+2)
            .collect(Collectors.toList());

            list2.add(4);

            System.out.println(list2);


    }
}
//forEach()
//toList
//collect()
//reduce()-->combines streams elements into single value
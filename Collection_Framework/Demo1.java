package Collection_Framework;
import java.util.*;
import java.util.ArrayList;

//Arraylist 
public class Demo1 {
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer>it=list.iterator();

        while(it.hasNext()){
            System.out.println(next(it));
        }
    }

    private static char[] next(Iterator<Integer> it) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
}

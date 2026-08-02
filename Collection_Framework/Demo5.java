//list interface

package Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

      //  System.out.println(list.get(2));

     //   list.set(2,6);

     //   list.addAll(0,List.of(9,8,7));

       // System.out.println(list);

      //  list.remove(0);
      //  System.out.println(list);

      //  list.indexOf(2);
      //  list.lastIndexOf(5);

        // ListIterator<Integer>it=list.listIterator(2);

        // while(it.hasPrevious()){
        //     System.out.println(it.previous());
        // }

            List l=List.of(1,2,3,4,5,6,7,8);
           // l.add(9);  //unmodifiable

           List<Integer> l2=List.copyOf(l);
           l2.add(9);
            System.out.println(l);
    }
}

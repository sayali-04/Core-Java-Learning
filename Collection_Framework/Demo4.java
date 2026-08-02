//Collection Interface

package Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        Collection <Integer> c=new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        //size()
       // System.out.println(c.size());

       //isEmpty()
       // System.out.println(c.isEmpty());

      //contains()
       //System.out.println(c.contains(2));

    //toArray()
    //    Object[] obj = c.toArray();
    //    for(Object o:obj){
    //     System.out.println(o);
    //    }

       //boolean add
      // boolean b=c.add(5);
      // System.out.println(b);

       //T[] toArray(T[] a)

    //    Integer[] arr2= new Integer[0];
    //    Integer[] arr=c.toArray(arr2);
    //    for(Integer i: arr){
    //     System.out.println(i);
    //    }

    //boolean remove(Object obj)
    // System.out.println(c.remove(2));
    // for(Integer i: c){
    //      System.out.println(i);
    //    }

    //boolean addAll(Collection<? extends E>c)
    // c.addAll(List.of(5,6,7,8,9));
    // System.out.println(c);

    // //boolean containsAll(Collection<?>c)

    // System.out.println(c.containsAll(List.of(1,2,3)));

    //boolean removeAll(Collection<?> c)
    //boolean retainAll(Collection<?> c) -->Intersection

   // c.removeAll(List.of(1,2,3)); //[4]
    // c.retainAll(List.of(1,2,3));  //[1,2,3]

    // System.out.println(c);

    //clear()
    c.clear();
    System.out.println(c);

    }
}

//add, addAll,remove,removeAll,retainsAll,contains,containsAll,toArray,iterator,
//size,isEmpty

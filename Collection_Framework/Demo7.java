//Set  Interface

package Collection_Framework;

import java.util.*;

public class Demo7 {
    public static void main(String[] args) {

    /*
        //Constructors of HashSet / LinkedHashSet
        
        Set<Integer> set=new HashSet<>(); //default 16 size bucket
        
        //initial capacity
        Set<Integer>set2=new HashSet<>(100);

        //capacity,load factor
        Set<Integer> set3=new HashSet<>(100,08f);

       //using another collection
       Set<Integer> set4=new HashSet<>(List.of(1,2,3,4,5,6,7,8,9)); */

       /* *******  TreeSet Methods ******** */ 

       TreeSet<Integer> set = new TreeSet<>();

    // Set<Integer> set2 = new HashSet<>(List.of(2,5,7,9));

      set.add(80);
      set.add(23);
      set.add(10);
      set.add(90);
      set.add(50);

    /*  //SortedSet Interfaces

    //   System.out.println(set.first());
    //   System.out.println(set.last());

        System.out.println(set.headSet(50)); //gives elements less than 50  
        System.out.println(set.tailSet(50)); //gives element greater than 50

        //fromElement is inclusive and toElement is exclusive
        System.out.println(set.subSet(23, 80)); //[23,50] */

    //Navigable set

    //    //largest number smaller than 80  
    //    System.out.println(set.lower(80)); 
       
    //    //Greatest element less than or equal to 80  
    //    System.out.println(set.lower(80)); 

    //    //Smallest number greater than 80  
    //    System.out.println(set.higher(80)); 

    //    //Smallest number greater than or equal to 80  
    //    System.out.println(set.ceiling(80)); 

    //    System.out.println(set.pollFirst()); 
    //    System.out.println(set.pollLast()); 
      
    //    System.out.println(set.descendingSet()); 

    //    Iterator<Integer> it=set.descendingIterator();

    //    while(it.hasNext()){
    //     System.out.println(it.next());
    //    }

      System.out.println(set.headSet(80,true)); 
     
      System.out.println(set.tailSet(80,false)); 

      set.subSet(10,false,80,true);



 

    }
}

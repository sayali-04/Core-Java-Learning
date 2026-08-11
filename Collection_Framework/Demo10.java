package Collection_Framework;

import java.util.*;

public class Demo10 {
    
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();

        //Single ended queue
        //eneque operations
        // queue.add(1); //if fails throws exceptions
        // queue.offer(2); //false
        // queue.offer(3);

        //front acess method
        // System.out.println(queue.peek()); //return nulls (safe)
        // System.out.println(queue.element()); // throws exception (unsafe)

        //element remove
      // System.out.println(queue.remove()); //exception if queue is empty
       System.out.println(queue.poll()); //returns null

    }
}

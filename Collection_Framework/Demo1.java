package Collection_Framework;
import java.util.*;


public class Demo1 {
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer>it=list.iterator();

        while(it.hasNext()){
            System.out.println(next());
        }
    }
}

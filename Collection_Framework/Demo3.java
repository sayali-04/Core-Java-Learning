//List interface

package Collection_Framework;
import java.util.*;
import java.util.ArrayList;


public class Demo3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            Integer num = it.next();

            if (num == 20) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
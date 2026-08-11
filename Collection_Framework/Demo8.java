//Map Interface

package Collection_Framework;
import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101, "Sayali");
        map.put(102, "Aditya");
        map.put(103, "Kunal");
        map.put(104, "Yash");

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

        // System.out.println(map.containsKey(101));
        // System.out.println(map.containsValue("Aditya"));

        // System.out.println(map.get(101));

        // System.out.println(map.put(104, "Prisha"));
        // System.out.println(map.get(104));

        // System.out.println(map.remove(101));

        //  Map<Integer,String> map2=new HashMap<>();
        //  map.putAll(map2);

        // map.clear();

        // Set<Integer> set=map.keySet();

        // System.out.println(set);

        // Collection <String> c =map.values();
        // System.out.println(c);

        // Set<Map.Entry<Integer,String>>entries=map.entrySet();
        // System.out.println(entries);

        System.out.println(map.getOrDefault(105,"unknown"));

        System.out.println(map.putIfAbsent(104,"Prisha"));

        map.remove(101,"Prisha");

        map.replace(102,"Sonu");

        


        
        


    }
}

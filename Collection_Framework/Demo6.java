package Collection_Framework;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("Sayali");
        s.add("Aditya");
        s.add("Yash");
        s.add("Ajeet");

        System.out.println(s.contains("Aditya")); //true

        Map <Integer,String> map=new HashMap<>();
        map.put(101,"Sayali");
        map.put(102,"Aditya");
        map.put(103,"Ajeet");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(102));


    }
}

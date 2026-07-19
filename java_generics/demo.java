package java_generics;

public class demo {
    public static void main(String[] args) {

        //upcasting(smaller to bigger)
        String s="Hello";
        Object obj=s;
       // System.out.println(obj);


        //downcasting
        Object obj2="hello";
        String s1=(String)obj;
       // System.out.println(s1);

        //dangerous case
        Object obj3=10;
        String s2=(String)obj3;
        System.out.println(s2); ///ClassCastException

    }
}

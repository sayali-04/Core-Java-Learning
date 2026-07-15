/*Imp classes in java */


/*
//static inner class
public class demo3 {
    public static void main(String[] args) {
            Outer outer=new Outer();
            Outer.Inner obj=new Outer.Inner(outer);
            obj.display(outer);

    }
}
class Outer{
    static int x=4;
    int y;
    static class Inner{
         private static int a=4;

         Outer outer;
         Inner(Outer outer){    //inner class constructor
            this.outer=outer;
         }

        void display(Outer outer)  //passing reference 
        {
            System.out.println(x);
            System.out.println(outer.y);
            System.out.println(a);
        }
      
    }
}
*/

//Non-static inner class
/* 
class Outer {
    String name="sayali";
    int x=4;

    class inner {
      int x=5;
        void fun()
        {
            System.out.println("student name is:"+ name);
            System.out.println(x);
            System.out.println(Outer.this.x);
        }
    }
}

public class demo3 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.inner obj= outer.new inner();
        obj.fun();

    }
 }  */

//Local class
/* 
class demo3{
    public static void main(String[] args) {
        outer ot=new outer();
        ot.greet();
    }
}

class outer{
    void greet(){
        class local{
            void sayhello(){
                 System.out.println("Hello");

            }
        }

        local c=new local();
        c.sayhello();
    }
} */


//Anonymous Class
/*
public class demo3{
    public static void main(String[] args) {
        // Person p1=new Person();
        // p1.introduce();

        // Person p2=new Guest();
        // p2.introduce();

        Person p2=new Person(){
            String name="Sayali";
            @Override
            void introduce(){
                greet();
                System.out.println("Hi ,i am a guest");
                System.out.println("my name is:"+name);
            }
            void greet(){
                System.out.println("hello");
            }
        };
        p2.introduce();
    }
}
class Person{
    void introduce(){
        System.out.println("Hi ,i am a person");
    }
}
// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hi ,i am a Guest");
//     }
// }

*/
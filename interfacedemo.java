/* public class interfacedemo {
    public static void main(String[] args) {
        Car c=new BlackThar();
        c.drive();
    }
}
interface Car{
    void drive();

}
abstract class Thar implements Car{
  abstract public void drive();
}
class BlackThar extends Thar{
    @Override
    public void drive(){
        System.out.println("BlackThar is driving");
    }
} */

//multiple inheritance using interface

public class interfacedemo{
 public static void main(String[] args) {
    D d=new D();
    d.fun();

 }
}
/* interface inheritance
 */
interface A{
 default void fun(){
    System.out.println("A");
 }
    
}
interface B extends A{
   default void fun(){
    System.out.println("B");
   }
}
interface C extends A{
    void fun();
}
class D implements B,C{
    @Override
    public void fun(){
    // System.out.println("This is actual implemetation");
     B.super.fun();
    }
}
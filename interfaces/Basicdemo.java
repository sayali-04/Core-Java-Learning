
public class Basicdemo {
    public static void main(String[] args) {

        // Animal animal = new Dog();
        // animal.walk();
        // Animal cat=new Cat();
        // cat.walk();

        Vehicle vehicle=new Car();
        vehicle.start();
    }
}
/* 
interface Animal {
    void walk();
}
class Dog implements Animal {
    @Override
   public void walk(){
    System.out.println("Dog is walking");

   }
}
class Cat implements Animal{
    @Override
    public void walk(){
        System.out.println("Cat is walking");

    }
}  */

// 2.for vehicle
interface Vehicle{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("car is starting");
    }
}
class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is starting");
    }
}
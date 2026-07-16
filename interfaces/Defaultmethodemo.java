public class Defaultmethodemo {
    public static void main(String[] args) {
        Car c=new Car();
        c.drive();


    }
}
interface vehicle{
    default void drive(){
        System.out.println("Vehicle is driving");
    }

}
class Car implements vehicle{
    @Override
    public void drive(){
        System.out.println("Car is driving");
    }

}
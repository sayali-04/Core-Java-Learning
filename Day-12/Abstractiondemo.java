public class Abstractiondemo {
    public static void main(String[] args) {
        Car car=new Fuelcar();
        car.start();
        car.accelerate();
        car.brake();
        
    }
}
abstract class Car{
    void start(){
     System.out.println("Car Started");
    }
    abstract void accelerate();
    abstract void brake();
}
class Fuelcar extends Car{
    @Override
    void accelerate(){
    System.out.println("Fuelcar is accelerating at 10km/hr");
    }

    @Override
    void brake(){
    System.out.println("Fuelcar is Stopping");
    }

}
class Electriccar extends Car{
    @Override
    void accelerate(){
    System.out.println("Electriccar is accelerating at 10km/hr");
    }
    
    @Override
    void brake(){
    System.out.println("Electriccar is Stopping");

    }

}

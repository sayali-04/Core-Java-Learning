//interfaces in java
public class Demo2 {
 
    public static void main(String[] args) {
        Car car= new FuelCar();
        car.start();
        car.accelerate();
        car.brake();

    }
    
}
interface Car{
    void start();
    void accelerate();
    void brake();
}

class FuelCar implements Car{
    @Override

    public void start(){
        System.out.println("Feul car has started");

    }
    public void accelerate(){
        System.out.println("Fuel car is accelrating");

    }

   public void brake(){
        System.out.println("Fuelcar has stopped");
    }
}

class ElectricCar implements Car{
    @Override

    public void start(){
        System.out.println("Electric car has started");

    }
    public void accelerate(){
        System.out.println("Electric car is accelrating");

    }

   public void brake(){
        System.out.println("Electric car has stopped");
    }

}
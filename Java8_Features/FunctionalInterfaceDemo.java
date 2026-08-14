package Java8_Features;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Calculator c=(a,b)->a + b;   //lambda expression
       
        print(4,5,c);

    }

    public static void print(int a, int b, Calculator c) {
    System.out.println(c.Calculate(a, b));
}
}
@FunctionalInterface
interface Calculator{
    int Calculate(int a,int b); //one abstract method
    
}
// class Addition implements Calculator{
//     @Override
//     public int Calculate(int a,int b){
//      return a+b;
//     }
// }
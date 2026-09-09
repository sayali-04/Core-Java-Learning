package Exception_Handling;

public class Demo {
    public static void main(String[] args) {
        
        System.out.println("Step 1");
        try {
            int a=5;
            int b=0;

            System.out.println(a/b);//-->internally iilegeal-->new ArithmeticException("/by zero")
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Divide by zero is not allowed");
        }
        finally{
            System.out.println("Heyyyy");
        }

        System.out.println("Step 2");
    }
}

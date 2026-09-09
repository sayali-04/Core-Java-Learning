package Exception_Handling;

public class Demo2 {
    //Nested try-catch-block
    public static void main(String[] args) {

        //Case -1:inner try handles its own exception
        try {

            System.out.println("Outer try starts");

            try {
                System.out.println("Inner try starts");

                System.out.println(5/0);

                System.out.println("Inner try ends");
                
            } catch (ArithmeticException e) 
            {
                System.out.println("Divide by zero is not allowed:Inner");
            }
            System.out.println("Outer try ends");

        } catch (ArithmeticException e) 
        {
            System.out.println("Divide by zero is not allowed:Outer");
        }
    }
}

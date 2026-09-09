package Exception_Handling;

public class Demo4 {
    //throw keyword

    public static void main(String[] args) {
        CheckEligibility(-5);
    }

        public static void CheckEligibility(int age)
        {
          if(age<=0){
            throw new IllegalArgumentException("Age cannot be negative");
          }

          if(age>18){
            System.out.println("Your are eligible");
          }
        }
}

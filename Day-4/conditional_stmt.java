import java.util.Scanner;

public class conditional_stmt {
    
    public static int check_posneg(int n){
        if(n>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
        return n;

    }

    //check even or odd number

    public static int check_evenodd(int n){
        if(n%2==0){
            System.out.println("number is even");
        }
        else if(n%2!=0){
            System.out.println("number is odd");
        }
        return n;
    }

    //greater of two number
    public static void greateroftwo(int a,int b){
        if(a>b){
            System.out.println(+ a +" is greater");
        }
        else if(a<b){
            System.out.println(+ b +" is greater");
        }
    }

//Classify the temperature
    public static int check_temperature(int temp){
        if(temp<=10){
            System.out.println("Very cold");
        }
        else if(temp>=10 &&  temp <25){
            System.out.println("Moderate");
        }
        else if(temp>=25){
            System.out.println("Hot");
        }
        else{
            System.out.println("neutral");
        }
        return temp;
    }

//Student Grade calculator
    public static int Grade_calculator(int marks){
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else if(marks>=60){
            System.out.println("Grade C");
        }
        else if(marks>=40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Pass");
        }
        return marks;
    }

    //Leap Year program
    public static void check_leapyear(int year){
        if(year % 400==0 || year%4==0 && year%100!=0){
            System.out.println("leap year");
        } else{
            System.out.println("not leap year");
        }
    }

     //Days of week 
     public static void Days_ofweek(int day){
         switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
     }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int a=2; int b=5;
            // System.out.print("Enter the number:");
            // int n=sc.nextInt();
            // check_posneg(n);
            // check_evenodd(n);
            // greateroftwo(a, b);

            // System.out.println("Enter the temperature:");
            // int temp=sc.nextInt();
            // check_temperature(temp);

            // System.out.println("Enter your marks:");
            // int marks=sc.nextInt();
            // Grade_calculator(marks);

            System.out.println("Enter the year:");
            int year=sc.nextInt();
            check_leapyear(year);

            System.out.println("Enter the days of week (1-7):");
            int day=sc.nextInt();
            Days_ofweek(day);

        }

    }
}

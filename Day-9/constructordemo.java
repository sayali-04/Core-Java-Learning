class Student{
        int rollno;
        String name;

        Student(int n,String nm){ //paramterized constructor
            System.out.println("I am Parameterized constructor");
            rollno=n;
            name=nm;
        }
        Student(){  //constructor overload
        System.out.println(" I am default constructor");
        }
}
public class constructordemo {
    public static void main(String[] args) {
        Student s1=new Student(20,"Aditya");
        Student s2=new Student();   
        System.out.println(s1.rollno+ " "+s1.name);

    }
    
}




//Static Keyword in java

class Student{
        int rollno;
        int age;
        String name;
        static String college;

        Student(int rollno,int age,String name){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        }
        //static block
        static{
            college="IIT Guhawati";
        }
}
public class keyword {
    public static void main(String[] args) {
    Student s1=new Student(12,20,"Sayali");
    Student s2=new Student(13,21,"Yash");
    
//     Student.college="Guwahatii";

    System.out.println(s1.rollno +","+s1.age+","+s1.name+","+Student.college);
    System.out.println(s2.rollno +","+s2.age+","+s2.name+","+Student.college);

        
    }
 } 

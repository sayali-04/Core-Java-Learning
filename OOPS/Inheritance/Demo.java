class Student{
 String name;
 int rollno;

 void markAttendance(){
    System.out.println("Attencance marked");
 }
}
class Engineeringstudent extends Student{
    void attendlabs(){
        System.out.println("Attended labs");
    }
}

public class Demo {
    public static void main(String[] args) {
    Engineeringstudent es=new Engineeringstudent();
    es.markAttendance();
    es.attendlabs();
    }

}


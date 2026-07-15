/*Types of inheritance
1.single inheritance
2.multi-level inheritance
3.Hierarchical inheritance
4.Mulitple Inheritance
 */

/* //Single Inheritance
class Student{   //parent class
 String name;
 int rollno;

 void markAttendance(){
    System.out.println("Attencance marked");
 }
}
class Engineeringstudent extends Student{     //child class
    void attendlabs(){
        System.out.println("Attended labs");
    }
}*/

//Multilevel inehritance
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
class CSEEngineeringStudent extends Engineeringstudent{
    void attendCSElabs(){
        System.out.println("attend cse lab");
    }
}


public class Demo2 {
    public static void main(String[] args) {
        
    }
}

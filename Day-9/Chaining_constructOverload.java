public class Chaining_constructOverload {

    public static void main(String[] args) {
        Student s1=new Student();
        // Student s2=new Student("Sayali");
        // Student s3 =new Student("Priti",25);
        // Student s4=new Student("Prachi",24,41);
        // Student s5=new Student("Yash",20,61,"MET IOE");

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.age);
        System.out.println(s1.college);
    }
}

//1st.constructor overloading ->constructor chaining
class Student{
    String name;
    int rollno;
    int age;
    String college;

Student(){
    this("unknown");
    System.out.println("I am in first constructor");
}

Student(String name){
    //this.name=name; //construtor overloading
    this(name,0,0); //constuctor chaining
    System.out.println("I am in second constructor");
}

Student(String name,int age){
    // this.name=name;
    // this.age=age;
    this(name,age,0);
    System.out.println("I am in third constructor");
}
Student(String name,int age,int rollno){
    // this.name=name;
    // this.age=age;
    // this.rollno=rollno;
    this(name,age,rollno,"unknown");
    System.out.println("I am in fourth constructor");
}
Student(String name,int age,int rollno,String college){
    this.name=name;
    this.age=age;
    this.rollno=rollno;
    this.college=college;
    System.out.println("I am in fifth constructor");
}
}
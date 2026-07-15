public class Student {
    int rollno;   //variables represents Characteristics
    String name;
    int marks;

    void marksAttendance(){ //functions represents behaviour
        System.out.println("Attendance marked by:"+name);
    }
    void print(){
        System.out.println(name+ ","+rollno +","+marks+",");

    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="sayali";   
        s1.rollno=12;
        s1.marks=90;

        s1.marksAttendance();
        s1.print();
    }
}
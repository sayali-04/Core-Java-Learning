
/* Object class methods */

/*public class demo4 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=23;
        s1.name="Sayali";

       // System.out.println(s1);


        Student s2=new Student();
        s2.age=23;
        s2.name="Sayali";

        // System.out.println(s1.equals(s2));

        // System.out.println(s1.hashCode()==s2.hashCode());

        System.out.println(s1.getClass().getName());


    }
}
class Student {
    int age;
    String name;

    @Override
    public String toString(){
        return(name +","+age);
    }

    @Override
    public boolean equals(Object obj){
        Student s=(Student)obj;
        return (this.name==s.name && this.age==s.age);
    }

//     @Override
//    // public int hashCode(){
        
//     }
}
*/

//clone()
public class demo4{
 Student s1 = new Student();

 //Student s2 = (Student)s1.clone();
}
class Student implements Cloneable {

    String name = "Sayali";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
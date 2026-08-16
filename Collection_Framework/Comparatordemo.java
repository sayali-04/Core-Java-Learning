//Comparator interface/Anonymous class

package Collection_Framework;
import java.util.*;
import java.util.ArrayList;

public class Comparatordemo {
    public static void main(String[] args) {
    List <Student> list = new ArrayList<>();
    list.add(new Student("Sayali",101,85));
    list.add(new Student("Aditya",102,89));
    list.add(new Student("Summit",103,93));
    list.add(new Student("Prachi",104,98));

    //creating object of comparator
    // Comparator<Student>c1=new SortByName();
    // Comparator<Student>c2=new SortByRollno();
    // Comparator<Student>c3=new SortByMarks();

    
    // Collections.sort(list,c2); //c1 means sort by name if c2 then sort by rollno 
    // Collections.sort(list,new Comparator<Student>(){
    //  @Override
    //  public int compare(Student s1,Student s2){
    //     return s1.rollno-s2.rollno;
    //  }
    // });

    Collections.sort(list,(s1,s2)->s1.marks-s2.marks);

    for(Student s:list){
       System.out.println(s.name + " "+ s.rollno +" "+ s.marks);
    }
        
    }
}

//Three different classes used for sorting by diff ways
// class SortByName implements Comparator<Student>{
//     @Override
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);
//     }
// }

// class SortByRollno implements Comparator<Student>{
//     @Override
//     public int compare(Student s1,Student s2){
//         return s1.rollno-s2.rollno;
//     }
// }

// class SortByMarks implements Comparator<Student>{
//     @Override
//     public int compare(Student s1,Student s2){
//         return s1.marks-s2.marks;
//     }
// }

class Student{
    String name;
    int rollno;
    int marks;

    public Student(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
}
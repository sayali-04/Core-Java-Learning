package Collection_Framework;
import java.util.*;
import java.util.ArrayList;
public class Comparabledemo {
    public static void main(String[] args) {
        List<Student>list =new ArrayList<>();
        list.add(new Student("Sayali",95));
        list.add(new Student("Kunaal",85));
        list.add(new Student("Rohit",56));
        list.add(new Student("Mauu",85));

        Collections.sort(list); //ascending
        for(Student s:list){
             System.out.println(s.name + " "+s.marks);
        }
        System.out.println(list);

        // List<Integer> list2=new ArrayList<>();
        // list2.add(20);
        // list2.add(40);
        // list2.add(30);

        // Collections.sort(list2);
        // System.out.println(list2); //done
        
    }
}
class Student implements Comparable<Student>{
    String name;
    int marks;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student other){
        if(this.marks!=other.marks){
            return this.marks-other.marks;
        }
       return this.name.compareTo(other.name); //string compareTo is used to compare lexicographically
    }
}

//this.marks-other.marks;
//<0 -> this.marks,other.marks
//>0->other.marks, this.marks
//0->
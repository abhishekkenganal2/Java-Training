import java.util.ArrayList;
import java.util.Iterator;

class student
{
    String sname;
    int age;
    student(){}
    student(String sname,int age)
    {
        this.sname = sname;
        this.age = age;
    }
    public String toString()
    {
        return sname + age;
    }
}
public class arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        student s1 = new student("Java",20);
        student s2 = new student("C++",22);
        student s3 = new student("C program",25);
        student s4 = new student("HTML",21);
        al.add(new student("java",20));
        al.add(s2);
        al.add(s3);
        al.add(s4);
        System.out.println(al);
        Iterator it = al.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

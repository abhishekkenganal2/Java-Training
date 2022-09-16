import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class student implements serializable
{
    String name;
    int age;
    student(){}
    student(String name,int age){
        this.name = name;
        this.age = age;
    }
}


public class serialize
{
    public static void main(String[] args) {
        student s = new student("Abhi",20);
        try{
            FileOutputStream fos = new FileOutputStream("C://myfile.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(s);
            out.close();
            fos.close();
            System.out.println("Serialized success");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

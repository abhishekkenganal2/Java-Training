import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class filenotfound {
    public static void main(String[] args) {
        filenotfound ch = new filenotfound();
        ch.m1();
    }
    public void m1()
    {
        System.out.println("Hii");
        try{
            FileInputStream fo = new FileInputStream("");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

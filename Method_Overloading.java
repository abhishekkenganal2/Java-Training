
class Father{
    public void bike() {
        System.out.println("Old bike.");
    }
    public void bikeStart() {
        System.out.println("Starts");
    }
}

class Abhi extends Father
{
    public void bike() {
        System.out.println("New bike");
    }

}
public class Method_Overloading 
{
    public static void main(String[] args) {
        Father obj = new Abhi();
        obj.bike();
    }    
}

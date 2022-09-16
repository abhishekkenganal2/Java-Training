import javax.lang.model.util.ElementScanner14;

class Cab{

}

class Luxury extends Cab{
    int price = 3000;
}

class Auto extends Cab{
    int price =500;
}

class Mini extends Cab{
    int price = 100;
}

public class InstanceOf {
    public static void main(String[] args) {
        Cab b;
        b=new Mini();
        if(b instanceof Luxury)
        {
            Luxury l =(Luxury)b;
            System.out.println(l.price);
        }
        else if(b instanceof Auto)
        {
            Auto a= (Auto)b;
            System.out.println(a.price);
        }
        else {
            Mini m = (Mini)b;
            System.out.println(m.price);
        }
    }
}

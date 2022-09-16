
class Parent
{
    int i=1;
    public void m1() {
        System.out.println(i);
    }
}

class Child extends Parent{
    int j=10;
    public void disp() {
        System.out.println(i);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.i = 1220;
        System.out.println(p.i);
        Child c = new Child();
        System.out.println(c.j);
        c.i = 1220;
        System.out.println(c.i);
        c.m1();
    }
}


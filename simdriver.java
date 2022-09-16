class Sim{
    private String Simprovider;
    private int Simno;
    private String color;

    Sim(String Simprovider,int Simno,String color){
        this.Simprovider = Simprovider;
        this.Simno = Simno;
        this.color =color;
    }

    Sim(){}
    
    public String getSimprovider()
    {
        return Simprovider;
    }
    public int getSimno()
    {
        return Simno;
    }
    public String getcolor()
    {
        return color;
    }

    public String setcolor(String color)
    {
        return this.color = color;
    }

}


public class simdriver {
    public static void main(String[] args) {
        Sim s1 = new Sim("Jio",001,"blue");
        System.out.println(s1.getSimprovider());
        System.out.println(s1.getSimno());
        System.out.println(s1.getcolor());
        System.out.println(s1.setcolor("Pink"));
    }
}

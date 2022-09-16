public class Handling {
    public void NullPointer() throws ArithmeticException
    {
        String s = null;
        System.out.println(s.charAt(0));
    }
    public static void main(String[] args) {
        Handling obj = new Handling();
        try{
            obj.NullPointer();
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

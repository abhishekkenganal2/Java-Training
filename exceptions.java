public class exceptions {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        System.out.println("main starts");
        try
        {
            int c = a/b;
        }
        catch(NullPointerException e)
        {
            System.out.println("Thiss is null");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("See the index value.");
        }
        catch(Throwable e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Main ends");
    }
}

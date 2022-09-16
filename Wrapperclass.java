public class Wrapperclass {
    public static void main(String[] args) {
        Integer i = new Integer(200);
        int i1 = i;
        System.out.println(i1);

        Double x= new Double(123.5);
        double y=x;
        System.out.println(y);

        String s = "12";
        int s1 = Integer.parseInt(s);
        System.out.println(s1);

        String ss = "12.5f";
        Float f = Float.parseFloat(ss);
        System.out.println(f);

        String b = "False";
        boolean bb = Boolean.parseBoolean(b);
        System.out.println(bb);
    }
}

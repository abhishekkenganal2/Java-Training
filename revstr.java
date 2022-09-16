public class revstr {
    public static void main(String[] args) {
        // String s = "Java";
        // StringBuilder rev = new StringBuilder();
        // String a1 = append(s);
        // a1.reverse();
        // System.out.println(a1);

        // String s1 = "Hello";
        // StringBuilder sb = new StringBuilder();
        // long start = System.nanoTime();
        // for(int i =s.length()-1;i>=0;i--)
        // {
        // sb.append(s.charAt(i));
        // }
        // long end = System.nanoTime();
        // System.out.println("Total time is:"+(end + start));
        // System.out.println(sb);

        // String s = "banana";
        // StringBuilder sb = new StringBuilder();

        char a[] = "Hello everyone";
        int l = 0;
        while (a[l] != '\0') {
            l++;
        }
        System.out.println(l);

    }
}

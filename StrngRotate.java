class StrngRotate {

    static String rotatee(String s) 
    {
        char[] a = s.toCharArray();
        int i, k;
        for (i = 0; i < a.length; i++) {
            k = i;
            while (i <= a.length && a[i] != ' ')
                i++;
            char t = a[k];
            a[k] = a[i - 1];
            a[i - 1] = t;
        }
        return new String(a);
    }

    public static void main(String[] args) {
        String s = "Geeks for";
        System.out.println(rotatee(s));
    }

}
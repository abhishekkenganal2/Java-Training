import java.util.Scanner;

// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         int i;
//         int[] a;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eneter size");
//         int size = sc.nextInt();
//         a = new int[size];
//         System.out.println("Enter the elements");
//         for(i=0;i<=a.length-1;i++)
//         {
//             a[i] = sc.nextInt();
//         }
//         for(i=0;i<=a.length-1;i++)
//         {
//             System.out.println(a[i]);
//         }
//         System.out.println("Reverse of array");
//         for(i = a.length-1;i>=0;i--)
//         {
//             System.out.println(a[i]);
//         }
//     }
// }


public class array{
    public static void main(String[] args) {
        String s = "Alvas Institute of Engineering, technology";
        int l = s.length();
        String str = s.toLowerCase();
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                System.out.print(str.charAt(i)+" ");
            }
        }
        // String s;
        // Scanner sc = new Scanner(System.in);
        // s = sc.next();
        // System.out.println(strrev(s));
    }
}


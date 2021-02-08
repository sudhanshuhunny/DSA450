package Code;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m = s.nextInt();
        int n=s.nextInt();
        int[] a=new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
}
}

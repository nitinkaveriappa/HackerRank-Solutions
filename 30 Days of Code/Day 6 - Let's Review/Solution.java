import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n];
        char[] even;
        char[] odd;
        int m,t1,t2;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.next();
        }
        in.close();
        for(int i=0;i<n;i++) {
            m = a[i].length();
            even = new char[m];
            odd = new char[m];
            even[0] = a[i].charAt(0);
            t1=1;t2=0;
            for(int j=1;j<m;j++) {
                if(j%2==0) {
                    even[t1] = a[i].charAt(j);
                    t1++;
                }
                else {
                    odd[t2] = a[i].charAt(j);
                    t2++;
                }
            }
            for(int k=0;k<t1;k++)
                System.out.print(even[k]);
            System.out.print(" ");
            for(int l=0;l<t2;l++)
                System.out.print(odd[l]);
            System.out.println();
        }
    }
}

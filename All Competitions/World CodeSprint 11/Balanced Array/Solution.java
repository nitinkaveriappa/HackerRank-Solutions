import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] a){
        int maxl=0,maxr=0;
        int suml=0,sumr=0;
        for (int i=0;i<a.length;i++){
            if(i<a.length/2){
                suml += a[i];
                if(a[i]>maxl){
                    maxl = a[i];
                }
            }
            else {
                sumr += a[i];
                if(a[i]>maxr){
                    maxr = a[i];
                }
            }
        }

        int diff=0;
        if(suml>sumr){
            diff=suml-sumr;
            return diff;
        }
        else if(sumr>suml){
            diff=sumr-suml;
            return diff;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = solve(a);
        System.out.println(result);
    }
}

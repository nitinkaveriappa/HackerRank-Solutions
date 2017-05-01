import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int i1=0, j1=0, i2=0, j2=n-1;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            sum1= sum1 + a[i1][j1];
            sum2= sum2 + a[i2][j2];
            i1++;j1++;
            i2++;j2--;
        }
        int sum = Math.abs(sum1-sum2);
        System.out.println(sum);
    }
}

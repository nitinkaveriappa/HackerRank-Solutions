import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] arr = new long[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;

        Arrays.sort(arr);
        long minsum=0,maxsum=0;
        for(int i=1;i<5;i++)
            maxsum = maxsum + arr[i];

        for(int i=0;i<4;i++)
            minsum = minsum + arr[i];

        System.out.println(minsum+" "+maxsum);
    }
}

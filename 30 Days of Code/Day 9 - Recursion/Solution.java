import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.print(factorial(n));
    }
    public static int factorial(int n) {
        int result;
        if(n==0 || n==1)
            return 1;
       result = factorial(n-1) * n;
       return result;
    }
}

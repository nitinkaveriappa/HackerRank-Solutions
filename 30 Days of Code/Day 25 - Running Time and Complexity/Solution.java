import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i=0;i<n;i++){
            if(isPrime(arr[i]))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    //checks whether an int is prime or not.
    static boolean isPrime(int n) {
        //check if n is 2
        if (n==2) return true;
        //check if n is a multiple of 2 or n is 1
        if (n%2==0 || n==1) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}

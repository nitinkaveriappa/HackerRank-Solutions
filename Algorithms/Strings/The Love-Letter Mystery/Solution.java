import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int isPalindrome(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        int l1, l2;
        int cnt=0;
        while (i2 > i1) {
            while (word[i1] != word[i2]) {
                l1 = (int)word[i1];
                l2 = (int)word[i2];
                if(l1 > l2){
                    l1--;
                    word[i1] = (char)l1;
                    cnt++;
                }
                else{
                    l2--;
                    word[i2] = (char)l2;
                    cnt++;
                }
            }
            ++i1;
            --i2;
        }
        return cnt;
    }

    public static int testcase(String A){
        char[] arr = A.toCharArray();
        int index = arr.length-1;
        int cnt = 0, prevValue;
        cnt = isPalindrome(arr);
        return cnt;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Read
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }

        int result;
        for(int arr_i=0; arr_i < n; arr_i++){
            result = testcase(arr[arr_i]);
            System.out.println(result);
        }
    }
}

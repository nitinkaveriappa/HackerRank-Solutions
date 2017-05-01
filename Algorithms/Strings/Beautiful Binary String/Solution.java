import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        boolean var = true;
        String temp;
        String C = B;
        int cnt = 0;
        for (int i=0; i<(n-2); i++) {
            temp = C.substring(i,i+3);
            if(temp.equals("010")){
                if((i+4)<n){
                    if(C.substring(i+3,i+4).equals("1")){
                        C = C.substring(0,i+2)+"1"+C.substring(i+3,n);
                        cnt++;
                    }
                    else{
                        C = C.substring(0,i+1)+"0"+C.substring(i+2,n);
                        cnt++;
                    }
                }
                else{
                    C = C.substring(0,i+1)+"0"+C.substring(i+2,n);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}

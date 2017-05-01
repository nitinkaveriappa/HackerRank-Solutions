import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int cnt=n,temp1,temp2;
        for(int i=1;i<=n;i++){
            temp1=cnt-1;
            temp2=1;
            while(temp1>0){
                System.out.print(" ");
                temp1--;
            }
            while(temp2<=i){
                System.out.print("#");
                temp2++;
            }
            System.out.println();
            cnt--;
        }

    }
}

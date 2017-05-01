import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int pos=0,neg=0,zer=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else if(arr[i]==0){
                zer++;
            }
        }
        double poss=0,negg=0.0,zerr=0.0;
        poss = (double)pos/(double)n;
        poss = Math.round(poss*1000000.0)/1000000.0;
        negg = (double)neg/(double)n;
        negg = Math.round(negg*1000000.0)/1000000.0;
        zerr = (double)zer/(double)n;
        zerr = Math.round(zerr*1000000.0)/1000000.0;
        System.out.println(poss);
        System.out.println(negg);
        System.out.println(zerr);

    }
}

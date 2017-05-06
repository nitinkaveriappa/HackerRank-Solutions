import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] findTheBug(String[] grid){
        // Complete this function
        int res[] = new int[2];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length();j++){
                if(grid[i].charAt(j) == 'X') {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        // Return an array containing [r, c]
        int[] result = findTheBug(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        System.out.println("");


    }
}

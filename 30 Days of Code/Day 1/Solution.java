import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int j = scan.nextInt();
        double e = scan.nextDouble();
        String t = "";
        while(scan.hasNext())
            t += scan.nextLine();
        System.out.println(i+j);
        System.out.println(d+e);
        System.out.println(s+t);

        scan.close();
      }
}

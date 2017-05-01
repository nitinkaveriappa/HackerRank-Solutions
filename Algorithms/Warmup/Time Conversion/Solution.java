import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String amorpm = time.substring(8,10);
        String hh = time.substring(0,2);
        String mm = time.substring(3,5);
        String ss = time.substring(6,8);
        if(amorpm.equals("PM"))
        {
            if(!hh.equals("12"))
            {
                hh = Integer.parseInt(hh) + 12 + "";
            }
        }
        else
        {
            if(hh.equals("12"))
            {
                hh="00";
            }
        }
        System.out.print(hh+":"+mm+":"+ss);
      }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getPoints(int month1, int month2, int month3){
        int totalPoints=0;
        if(month1>10)
            totalPoints += 100;
        else
            totalPoints += month1 * 10;
        if(month2>10)
            totalPoints += 100;
        else
            totalPoints += month2 * 10;
        if(month3>10)
            totalPoints += 100;
        else
            totalPoints += month3 * 10;
        return totalPoints;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        int pointsEarned = getPoints(month1, month2, month3);
        System.out.println(pointsEarned);
    }
}

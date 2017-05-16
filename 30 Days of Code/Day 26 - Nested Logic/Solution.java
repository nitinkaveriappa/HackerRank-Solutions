import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int actualDay = scan.nextInt();
        int actualMonth = scan.nextInt();
        int actualYear = scan.nextInt();
        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();
        scan.close();
        int fine = 0;
        int monthsLate = actualMonth - expectedMonth;
        int daysLate = actualDay - expectedDay;
        int yearDifference = actualYear - expectedYear;
        if(yearDifference > 0){
            fine = 10000;
        }
        else if(monthsLate > 0 && yearDifference == 0) {
            fine = monthsLate * 500;
        }
        else if(daysLate > 0 && yearDifference == 0) {
            fine = daysLate * 15;
        }
        System.out.println (fine);
    }
}

import java.util.*;
import java.io.*;
class Calculator {

    // Default constructor is always created by JAVA Compiler

    int power(int mN, int mP) throws Exception{

        if(mN >= 0 && mP >= 0){
            return (int) Math.pow(mN, mP);
        }else{
            throw new Exception("n and p should be non-negative");
        }
    }
}
class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

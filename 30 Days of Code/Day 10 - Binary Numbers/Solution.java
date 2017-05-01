import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static Stack<Integer> stackPush(Stack<Integer> st, int a){

		st.push(new Integer(a));
		return st;

	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> st = new Stack<Integer>();
		int reminder = 0;
		while (n > 0) {
			reminder = n % 2;
			n = n / 2;
			stackPush(st, reminder);
		}
        scanner.close();
		int count = 0;
		int totalCount = 0;
		for (int s: st){
			if(s==1){
				count++;
			}
			else if(count>=totalCount) {
				totalCount = count;
				count = 0;
			}else if (count < totalCount){
				count = 0;
			}
		}
		if (totalCount>count) {
			System.out.println(totalCount);
		} else {
			System.out.println(count);
		}
    }
}

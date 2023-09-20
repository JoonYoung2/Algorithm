package programmers;

import java.util.HashMap;
import java.util.Map;

class Try50{
	public String solution(int a, int b) {
        String answer = "";
        Map<Integer, Integer> monthDate = new HashMap<>();
        monthDate.put(1, 31);
        monthDate.put(2, 29);
        monthDate.put(3, 31);
        monthDate.put(4, 30);
        monthDate.put(5, 31);
        monthDate.put(6, 30);
        monthDate.put(7, 31);
        monthDate.put(8, 31);
        monthDate.put(9, 30);
        monthDate.put(10, 31);
        monthDate.put(11, 30);
        monthDate.put(12, 31);
        int sum = 0;
        for(int i = 1; i < a; ++i) {
        	sum += monthDate.get(i);
        }
        sum += b;
        int x = sum % 7;
        if(x == 1) {
        	answer = "FRI";
        }
        if(x == 2) {
        	answer = "SAT";
        }
        if(x == 3) {
        	answer = "SUN";
        }
        if(x == 4) {
        	answer = "MON";
        }
        if(x == 5) {
        	answer = "TUE";
        }
        if(x == 6) {
        	answer = "WED";
        }
        if(x == 0) {
        	answer = "THU";
        }
        return answer;
    }
}

public class Lv1_50 {
	public static void main(String[] args) {
		Try50 T = new Try50();
		System.out.println(T.solution(2, 26));	
	}
}

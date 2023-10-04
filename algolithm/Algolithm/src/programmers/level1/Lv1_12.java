package programmers.level1;

import java.util.HashMap;
import java.util.Map;

class Try12{
	public long solution(long n) {
        long answer = 0;
        String s = "" + n;
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length()-1; ++i) {
        	for(int j = i+1; j < s.length(); ++j) {
        		if(c[i] < c[j]) {
        			char tmp = c[i];
        			c[i] = c[j];
        			c[j] = tmp;
        		}
        	}
        	long d = Character.getNumericValue(c[i]);
        	answer = (answer * 10) + d;
        	if(i == s.length()-2) {
        		d = Character.getNumericValue(c[i+1]);
        		answer = (answer * 10) + d;
        	}
        }
        if(s.length() == 1) {
        	answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}

public class Lv1_12 {
	public static void main(String[] args) {
		Try12 T = new Try12();
		System.out.println(T.solution(1));
	}
}
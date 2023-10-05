package programmers.level2;

import java.util.Stack;

class Try09{
	public int solution(String s) {
        int answer = 1;
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); ++i) {
        	if(st.size() == 0) {
        		st.add(s.charAt(i));
        		continue;
        	}
        	
        	if(st.peek() == s.charAt(i)) {
        		st.pop();
        		int cnt = 0;
        		while(cnt != 1) {
        			i++;
        			if(st.size() > 0 && i < s.length()) {
        				if(st.peek() == s.charAt(i)) {
            				st.pop();
            			}else {
            				st.add(s.charAt(i));
            				cnt++;
            			}
        			}else {
        				i--;
        				break;
        			}
        		}
        	}else {
        		st.add(s.charAt(i));
        	}
        }
        
        if(st.size() != 0)
        	return 0;
        
        return answer;
    }
}

public class Lv2_09 {
	public static void main(String[] args) {
		Try09 T = new Try09();
		String s = "baabaa";

		System.out.println(T.solution(s));
	}
}
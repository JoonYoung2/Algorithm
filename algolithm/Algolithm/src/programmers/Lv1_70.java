package programmers;

import java.util.Stack;

class Try70 {
	public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int cnt = 0;
        for(int x : ingredient) {
        	st.add(x);
        	if(x - 1 == cnt) {
        		cnt++;
        		
        	}else if(cnt == 3 && x == 1) {
        		
        		for(int i = 0; i < 4; ++i) {
        			st.pop();
        		}
        		
        		cnt = 0;
        		answer++;
        		if(st.size() > 0) {
        			if(st.peek() == 1) {
            			cnt = 1;
            		}else if(st.peek() == 2 && st.size() > 1) {
            			int tmp = st.pop();
            			if(st.peek() == 1) {
            				st.add(tmp);
            				cnt = 2;
            				continue;
            			}else {
            				st.add(tmp);
            				continue;
            			}
            		}else if(st.peek() == 3 && st.size() > 2) {
            			int tmp = st.pop();
            			int tmp2 = st.pop();
            			if(st.peek() == 1 && tmp2 == 2) {
            				st.add(tmp2);
            				st.add(tmp);
            				cnt = 3;
            			}else {
            				st.add(tmp2);
            				st.add(tmp);
            			}
            		}
        		}
        		
        		
        	}else if(x == 1) {
        		cnt = 1;
        	}else {
        		cnt = 0;        		
        	}
        	
        }
        return answer;
    }
}

public class Lv1_70 {
	public static void main(String[] args) {
		Try70 T = new Try70();
		int[] ingredient = {2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 3, 1, 3, 1};
		System.out.println(T.solution(ingredient));
	}
}
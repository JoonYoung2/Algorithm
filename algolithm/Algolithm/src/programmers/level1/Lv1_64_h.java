package programmers.level1;

class Try64 {
	public int solution(String s) {
        int answer = 0;
        int start = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        char c = ' ';
        
        for(char x : s.toCharArray()) {
        	++start;
        	if(start == s.length())
        		return ++answer;
        	if(c == ' ')
        		c = x;
        	if(c == x) {
        		++cnt1;
        	}else {
        		++cnt2;
        	}
        	if(cnt1 == cnt2) {
        		answer++;
        		cnt1 = 0;
        		cnt2 = 0;
        		c = ' ';
        	}
        	
        	
        }
        return answer;
    }
}

public class Lv1_64_h {
	public static void main(String[] args) {
		Try64 T = new Try64();
		System.out.println(T.solution("banana"));
	}
}
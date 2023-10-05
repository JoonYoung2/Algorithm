package programmers.level2;

class Try04{
	boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        for(char c : s.toCharArray()) {
        	if(c == '(') {
        		cnt++;
        	}else {
        		cnt--;
        	}
        	
        	if(cnt < 0) {
        		return false;
        	}
        }
        if(cnt != 0) {
        	return false;
        }
        return answer;
    }
}

public class Lv2_04 {
	public static void main(String[] args) {
		Try04 T = new Try04();
		String s = "()()";
		System.out.println(T.solution(s));
	}
}
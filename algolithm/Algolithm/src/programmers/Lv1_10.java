package programmers;

class Try10{
	boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int cnt = 0;
        for(int i = 0; i < s.length(); ++i) {
        	if(s.charAt(i) == 'y') 
        		++cnt;
        	else if(s.charAt(i) == 'p')
        		--cnt;
        }
        if(cnt != 0)
        	answer = false;
        return answer;
    }
}

public class Lv1_10 {
	public static void main(String[] args) {
		Try10 T = new Try10();
		System.out.println(T.solution("PpoooS"));
	}
}
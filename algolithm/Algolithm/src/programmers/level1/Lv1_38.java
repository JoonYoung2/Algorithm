package programmers.level1;

class Try38{
	public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); ++i) {
        	if(s.charAt(i) == ' ') {
        		answer += " ";
        		continue;
        	}
        	if( 65 <= s.charAt(i) && 90 >= s.charAt(i)) { //대문자
        		if(s.charAt(i) + n > 90) {
        			answer += (char)(s.charAt(i) + n - 26);
        		}else {
        			answer += (char)(s.charAt(i) + n);
        		}
        	}else { //소문자
        		if(97 <= s.charAt(i) && 122 >= s.charAt(i)) {
        			if(s.charAt(i) + n > 122) {
        				answer += (char)(s.charAt(i) + n - 26);
        			}else {
            			answer += (char)(s.charAt(i) + n);
            		}
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_38 {
	public static void main(String[] args) {
		Try38 T = new Try38();
		int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
//		for(int x : )
		System.out.println(T.solution("a B z", 4));
	}
}

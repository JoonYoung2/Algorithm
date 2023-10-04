package programmers.level2;

class Try02{
	public String solution(String s) {
        String answer = "";
        for(char x : s.toCharArray()) {
        	if(x == ' ') {
        		answer += " ";
        	}else if(Character.isAlphabetic(x) && (answer.length() == 0 || answer.charAt(answer.length()-1) == ' ')) {
        		answer += (x + "").toUpperCase();
        	}else if(Character.isAlphabetic(x) && (x + "").toUpperCase().equals(x+"")){
        		answer += (x+"").toLowerCase();
        	}else
        		answer += x;
        }
        return answer;
    }
}

public class Lv2_02 {
	public static void main(String[] args) {
		Try02 T = new Try02();
		String s = "for the last week";
		System.out.println(T.solution(s));
	}
}
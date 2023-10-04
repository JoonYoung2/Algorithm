package programmers.level1;

class Try21{
	public String solution(String s) {
        String answer = "";
        if(s.length()%2 == 1) {
        	answer = ""+s.charAt(s.length()/2);
        }else {
        	answer = "" + s.charAt((s.length()/2)-1) + "" + s.charAt(s.length()/2);
        }
        return answer;
    }
}

public class Lv1_21 {
	public static void main(String[] args) {
		Try21 T = new Try21();
		
		System.out.println(T.solution("abab"));
	}
}
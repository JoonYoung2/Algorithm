package programmers;

class Try22{
	public String solution(int n) {
        String answer = "";
        for(int i = 1; i <= n; ++i) {
        	if(i % 2 == 0) {
        		answer += "박";
        	}else
        		answer += "수";
        }
        return answer;
    }
}

public class Lv1_22 {
	public static void main(String[] args) {
		Try22 T = new Try22();
		
		System.out.println(T.solution(1));
	}
}
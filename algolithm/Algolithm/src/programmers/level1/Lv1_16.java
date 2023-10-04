package programmers.level1;

class Try16{
	public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; ++i) {
        	if(seoul[i].matches("Kim")) {
        		return "김서방은 " + i + "에 있다";
        	}
        }
        return answer;
    }
}

public class Lv1_16 {
	public static void main(String[] args) {
		Try16 T = new Try16();
		String[] a = {"Jane", "Kim"};
		System.out.println(T.solution(a));
	}
}
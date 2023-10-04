package programmers.level1;

class Try07{
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; ++i) {
        	if(n % i == 1) {
        		return i;
        	}
        }
        return answer;
    }
}

public class Lv1_07 {
	public static void main(String[] args) {
		Try07 T = new Try07();

		System.out.println(T.solution(10));
	}
}

package programmers;

class Try06{
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long result = x;
        for(int i = 0; i < n; ++i) {
        	answer[i] = result;
        	result += x;
        }
        return answer;
    }
}

public class Lv1_06 {
	public static void main(String[] args) {
		Try06 T = new Try06();

		for(long x : T.solution(2, 5))System.out.println(x);
	}
}

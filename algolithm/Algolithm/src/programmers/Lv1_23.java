package programmers;

class Try23{
	public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; ++i) {
        	answer += a[i] * b[i];
        }
        return answer;
    }
}

public class Lv1_23 {
	public static void main(String[] args) {
		Try23 T = new Try23();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(T.solution(a, b));
	}
}
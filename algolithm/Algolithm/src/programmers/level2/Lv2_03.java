package programmers.level2;

import java.util.Arrays;

class Try03{
	public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int cnt = A.length - 1;
        for(int i = 0; i < A.length; ++i) {
        	answer += A[i] * B[cnt];
        	--cnt;
        }
        return answer;
    }
}

public class Lv2_03 {
	public static void main(String[] args) {
		Try03 T = new Try03();
		int []A = {1, 4, 2};
		int []B = {5, 4, 4};
		System.out.println(T.solution(A,B));
	}
}
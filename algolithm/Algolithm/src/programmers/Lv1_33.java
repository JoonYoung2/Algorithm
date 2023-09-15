package programmers;

import java.util.Arrays;

class Try33{
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; ++i) {
        	sum += d[i];
        	if(!(sum > budget)) {
        		answer++;
        	}
        }
        return answer;
    }
}

public class Lv1_33 {
	public static void main(String[] args) {
		Try33 T = new Try33();
		int[] a = {2,2,3,3};
		
//		for(int x : )
		System.out.println(T.solution(a, 10));
	}
}
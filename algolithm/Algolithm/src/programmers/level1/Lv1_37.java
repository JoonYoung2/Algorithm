package programmers.level1;

import java.util.Arrays;

class Try37{
	public int solution(int[][] sizes) {
        int answer = 0;
        int[] maxOfMax = new int[sizes.length];
        int[] minOfMax = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; ++i) {
        	maxOfMax[i] = Math.max(sizes[i][0], sizes[i][1]);
        	minOfMax[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(maxOfMax);
        Arrays.sort(minOfMax);
        answer = maxOfMax[sizes.length-1] * minOfMax[sizes.length-1];
        return answer;
    }
}

public class Lv1_37 {
	public static void main(String[] args) {
		Try37 T = new Try37();
		int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
//		for(int x : )
		System.out.println(T.solution(a));
	}
}

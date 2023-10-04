package programmers.level1;

import java.util.Arrays;

class Try51{
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        int cnt = score.length-1;
        Arrays.sort(score);
        for(int i = 0; i < score.length/m; ++i) {
        	int min = Integer.MAX_VALUE;
        	for(int j = 0; j < m; ++j) {
        		min = Math.min(min, score[cnt]);
        		cnt--;
        		if(j == m-1) {
        			answer += m*min;
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_51 {
	public static void main(String[] args) {
		Try51 T = new Try51();
		int[] nums = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println(T.solution(4, 3, nums));	
	}
}

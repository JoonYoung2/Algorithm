package programmers;

import java.util.Arrays;

class Try48{
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] a = new int[k];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < score.length; ++i) {
        	if(i > k-1) {
        		Arrays.sort(a);
        		if(a[0] < score[i]) {
        			a[0] = score[i];
        			Arrays.sort(a);
        			answer[i] = a[0];
        		}else
        			answer[i] = a[0];
        	}else {
        		a[i] = score[i];
        		min = Math.min(min, score[i]);
        		answer[i] = min;
        	}
        }
        return answer;
    }
}

public class Lv1_48 {
	public static void main(String[] args) {
		Try48 T = new Try48();
		int[] a = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		for(int x : T.solution(4, a))
		System.out.println(x);
	}
}

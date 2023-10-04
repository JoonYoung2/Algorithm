package programmers.level1;

import java.util.Arrays;

class Try42{
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; ++i) {
        	int start = commands[i][0]-1;
        	int end = commands[i][1];
        	int[] a = new int[end-start];
        	int cnt = 0;
        	for(int j = start; j < end; ++j) {
        		a[cnt] = array[j];
        		++cnt;
        	}
        	Arrays.sort(a);
        	answer[i] = a[commands[i][2]-1];
        }
        return answer;
    }
}

public class Lv1_42 {
	public static void main(String[] args) {
		Try42 T = new Try42();
		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//		for(int x : )
		for(int x : T.solution(a, b))
		System.out.println(x);
	}
}

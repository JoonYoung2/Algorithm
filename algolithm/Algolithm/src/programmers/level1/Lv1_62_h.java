package programmers.level1;

/* 정열이 안되어있는 상태에서 값이 올 수 있기 때문에 정렬 한 번 해줘야 한다. */

import java.util.Arrays;

class Try62 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int cnt = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		for(int i = 0; i < reserve.length; ++i) {
			for(int j = 0; j < lost.length; ++j) {
				if(reserve[i] == lost[j]) {
					reserve[i] = Integer.MIN_VALUE;
					lost[j] = Integer.MAX_VALUE;
					cnt++;
					break;
				}
			}
		}
		for(int i = 0; i < reserve.length; ++i) {
			for(int j = 0; j < lost.length; ++j) {
				if(reserve[i] < 0) {
					break;
				}else if(lost[j] > 100){
					continue;
				}
				if(reserve[i]-1 == lost[j]) {
					reserve[i] = Integer.MIN_VALUE;
					lost[j] = Integer.MAX_VALUE;
					cnt++;
					break;
				}else if(reserve[i]+1 == lost[j]) {
					reserve[i] = Integer.MIN_VALUE;
					lost[j] = Integer.MAX_VALUE;
					cnt++;
					break;
				}
			}
			if(cnt == lost.length) {
				break;
			}
		}
		answer -= (lost.length - cnt);
		return answer;
	}
}

public class Lv1_62_h {
	public static void main(String[] args) {
		Try62 T = new Try62();
		int[] lost = {4,2};
		int[] reserve = {3,5};
		System.out.println(T.solution(5, lost, reserve));
	}
}
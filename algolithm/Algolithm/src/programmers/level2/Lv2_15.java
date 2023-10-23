package programmers.level2;

import java.util.Arrays;

class Try15{
	public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        answer = arr[arr.length-1];
        while(true) {
        	int cnt = 0;
        	for(int i = 0; i < arr.length; ++i) {
        		if(answer % arr[i] == 0) {
        			cnt++;
        		}
        	}
        	if(cnt != arr.length) {
        		answer += arr[arr.length-1];
        	}else
        		break;
        }
        return answer;
    }
}

public class Lv2_15 {
	public static void main(String[] args) {
		Try15 T = new Try15();
		int[] arr = {2,6,8,14};
		
		System.out.println(T.solution(arr));
	}
}
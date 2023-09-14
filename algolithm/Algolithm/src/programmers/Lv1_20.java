package programmers;

import java.util.Arrays;

class Try20{
	public int[] solution(int[] arr) {
		int[] answer = {-1};
		
		if(arr.length == 1) {
			return answer;
		}else {
			answer = new int[arr.length-1];
		}
		int[] a = arr.clone();
		Arrays.sort(a);
		int cnt = 0;
		for(int i = 0; i < arr.length; ++i) {
			if(a[0] == arr[i])
				continue;
			answer[cnt] = arr[i];
			cnt++;
		}
        
        return answer;
    }
}

public class Lv1_20 {
	public static void main(String[] args) {
		Try20 T = new Try20();
		int[] a = {4,3,2,1};
		for(int x : T.solution(a))
		System.out.println(x);
	}
}
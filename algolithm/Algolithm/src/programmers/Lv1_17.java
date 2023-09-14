package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Try17{
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {1};
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
        	if(a % divisor == 0) {
        		list.add(a);        		
        	}
        }
        
        if(list.size() == 0) {
        	answer[0] = -1;
        }else {
        	answer = new int[list.size()];
        	for(int i = 0; i < list.size(); ++i) {
        		answer[i] = list.get(i);
        	}
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Lv1_17 {
	public static void main(String[] args) {
		Try17 T = new Try17();
		int[] a = {2, 36, 1, 3};
		for(int x : T.solution(a, 1)) System.out.println(x);
	}
}
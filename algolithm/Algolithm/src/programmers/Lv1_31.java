package programmers;

import java.util.ArrayList;

class Try31{
	public int[] solution(int []arr) {
        int[] answer;
        int a = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr) {
        	if(a != x) {
        		a = x;
        		list.add(x);
        	}
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); ++i) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}

public class Lv1_31 {
	public static void main(String[] args) {
		Try31 T = new Try31();
		int[] a = {1,1,3,3,0,1,1};
		
		for(int x : T.solution(a))
		System.out.println(x);
	}
}
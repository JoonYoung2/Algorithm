package programmers.level1;

import java.util.TreeSet;

class Try44{
	public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length-1; ++i) {
        	for(int j = i+1; j < numbers.length; ++j) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        int size = set.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; ++i) {
        	answer[i] = set.pollFirst();
        }
        
        return answer;
    }
}

public class Lv1_44 {
	public static void main(String[] args) {
		Try44 T = new Try44();
		int[] a = {2,1,3,4,1};

		for(int x : T.solution(a))
		System.out.println(x);
	}
}

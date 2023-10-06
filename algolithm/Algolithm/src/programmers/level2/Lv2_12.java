package programmers.level2;

import java.util.Arrays;

class Try12{
	public int solution(int[] people, int limit) {
        int answer = people.length;
        int start = 0;
        int end = people.length-1;
        
        Arrays.sort(people);
        while(start < end) {
        	if(people[start] + people[end] > limit) {
        		end--;
        	}else if(people[start] + people[end] <= limit) {
        		answer--;
        		start++;
        		end--;
        	}
        }
        
        return answer;
    }
	
	
}

public class Lv2_12 {
	public static void main(String[] args) {
		Try12 T = new Try12();
		int[] people = {50, 50, 50, 50, 70, 80};
		int limit = 100;
		
		System.out.println(T.solution(people, limit));
	}
}
package programmers;

class Try56{
	public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] person = new int[number];
        int cnt = 0;
        for(int i = 1; i <= number; ++i) {
        	for(int j = 1; j <= i; ++j) {
        		if(i%j == 0) {
        			person[i-1] += 1;
        		}
        	}
        	if(person[i-1] > limit) {
        		
        	}
        }
        
        return answer;
    }
}

public class Lv1_56 {
	public static void main(String[] args) {
		Try56 T = new Try56();
		
		System.out.println(T.solution(5, 3, 2));	
	}
}

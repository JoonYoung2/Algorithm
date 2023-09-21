package programmers;

class Try56 {
	public int solution(int number, int limit, int power) {
		int answer = 1;
		int[] x = new int[number];
		
	
		for (int i = 2; i <= number; ++i) {
			int person = 0;
			if(x[i-1] == 0) {
				for(int j = i; j <= number; j+=i) {
					x[j-1] += 1;
				}
				person = 2;
			}else {
				for(int j = i+i; j <= number; j+=i) {
					x[j-1] += 1;
				}
				person = x[i-1] + 2;
			}
			if (person > limit) {
				answer += power;
			} else
				answer += person;
		}

		return answer;
	}
}

public class Lv1_56 {
	public static void main(String[] args) {
		Try56 T = new Try56();

		System.out.println(T.solution(10000000, 3, 2));
	}
}
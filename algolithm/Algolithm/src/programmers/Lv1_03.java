package programmers;

import java.util.Scanner;

class Try03{
	public String solution(int num) {
		String answer = "Odd";
		if(num % 2 == 0) {
			answer="Even";
		}
		return answer;
	}
}

public class Lv1_03 {
	public static void main(String[] args) {
		Try03 T = new Try03();
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(T.solution(num));
	}
}

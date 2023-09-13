package programmers;

import java.util.Scanner;

class Try04{
	public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int x : arr) {
        	sum += x;
        }
        
        answer = sum / arr.length;
        return answer;
    }
}

public class Lv1_04 {
	public static void main(String[] args) {
		Try04 T = new Try04();
		int[] arr = {1,2,3,4};
		System.out.println(T.solution(arr));
	}
}

package programmers;

class Try30{
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int sum = 1;
        if(m % n == 0) {
        	answer[0] = n;
        	answer[1] = m;
        }else {
        	for(int i = 1; i <= n; ++i) {
        		if(n % i == 0 && m % i == 0) {
        			sum *= i;
        			n /= i;
        			m /= i;
        			i = 1;
        		}
        	}
        	answer[0] = sum;
        	answer[1] = sum * n * m;
        }
        
        
        return answer;
    }
}

public class Lv1_30 {
	public static void main(String[] args) {
		Try30 T = new Try30();
		int[][] a = {{1,2},{2,3}};
		int[][] b = {{3,4},{5,6}};
		for(int x : T.solution(3,12))
		System.out.println(x);
	}
}
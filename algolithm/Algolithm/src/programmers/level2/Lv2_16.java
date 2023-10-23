package programmers.level2;

class Try16{
	private static int number = 0;
	public long solution(int n) {
        long answer = 0;
        long[] tmp = new long[2];
        if(n == 1) {
        	return 1;
        }else if(n == 2) {
        	return 2;
        }else if(n == 3) {
        	return 3;
        }
        number = 4;
        tmp[0] = 2;
        tmp[1] = 3;
        while(number <= n) {
        	long x = (tmp[0] % 1234567) + (tmp[1] % 1234567);
        	tmp[0] = tmp[1];
        	tmp[1] = x;
        	number++;
        }
        
        answer = tmp[1] % 1234567;
        return answer;
    }
}

public class Lv2_16 {
	public static void main(String[] args) {
		Try16 T = new Try16();
		int n = 2000;
		System.out.println(T.solution(n));
	}
}
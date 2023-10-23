package programmers.level2;

class Try16{
	private static long cnt = 0;
	private static int number = 0;
	public long solution(int n) {
        long answer = 0;
        if(n == 1) {
        	return 1;
        }else if(n == 2) {
        	return 2;
        }else if(n == 3) {
        	return 3;
        }
        number = n;
        DFS(0);
        answer = cnt;
        return answer;
    }
	
	private void DFS(int n) {
		if(n == number) {
			cnt++;
			return;
		}
		if(n > number) {
			return;
		}
		DFS(n+1);
		DFS(n+2);
	}
}

public class Lv2_16 {
	public static void main(String[] args) {
		Try16 T = new Try16();
		int n = 100;
		System.out.println(T.solution(n));
	}
}
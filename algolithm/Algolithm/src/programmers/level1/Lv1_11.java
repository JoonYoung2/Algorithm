package programmers.level1;

class Try11{
	public long solution(long n) {
        long answer = 0;
        long cnt = 1;
        while(true) {
        	if(cnt * cnt == n) {
        		cnt = cnt + 1;
        		answer = cnt * cnt;
        		break;
        	}
        	if(cnt * cnt > n) {
        		answer = -1;
        		break;
        	}
        	cnt++;
        }
        return answer;
    }
}

public class Lv1_11 {
	public static void main(String[] args) {
		Try11 T = new Try11();
		System.out.println(T.solution(121));
	}
}
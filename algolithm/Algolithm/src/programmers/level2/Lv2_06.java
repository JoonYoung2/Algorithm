package programmers.level2;

class Try06{
	public int solution(int n) {
        int answer = 1;
        int cnt = 1;
        while(n/2 >= cnt) {
        	int x = 0;
        	for(int i = cnt; i <= n/2+1; ++i) {
        		x += i;
        		if(x == n) {
        			answer++;
        			break;
        		}else if(x > n) {
        			break;
        		}
        	}
        	cnt++;
        }
        return answer;
    }
}

public class Lv2_06 {
	public static void main(String[] args) {
		Try06 T = new Try06();
		int n = 10000;
		
		System.out.println(T.solution(n));
	}
}
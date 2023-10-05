package programmers.level2;

class Try07{
	public int solution(int n) {
        int answer = n;
        int nCnt = 0;
        int aCnt = 0;
        while(n > 0) {
        	int tmp = n%2;
        	n /= 2;
        	if(tmp == 1) {
        		nCnt++;
        	}
        }
        while(nCnt != aCnt) {
        	answer++;
        	aCnt = 0;
        	int tmp = answer;
        	while(tmp > 0) {
        		int x = tmp % 2;
        		tmp /= 2;
        		if(x == 1) {
        			aCnt++;
        		}
        		if(aCnt > nCnt) {
        			break;
        		}
        	}
        }
        return answer;
    }
}

public class Lv2_07 {
	public static void main(String[] args) {
		Try07 T = new Try07();
		int n = 78;
		
		System.out.println(T.solution(n));
	}
}
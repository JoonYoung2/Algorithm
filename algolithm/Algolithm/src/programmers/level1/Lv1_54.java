package programmers.level1;

class Try54{
	public int solution(int n) {
        int answer = 1;
        boolean[] a = new boolean[n+1];
        for(int i = 2; i <= n; i*=2) {
        	a[i] = true;
        }
        if(n >= 3) {
        	answer += 1;
        	for(int i = 3; i <= n; i+=3) {
            	a[i] = true;
            }
        }
        for(int i = 3; i <= n; ++i) {
        	int cnt = 0;
        	if(a[i] == false) {
        		for(int j = 2; j <= i/2; ++j) {
        			if(i % 2 == 0) {
        				cnt++;
        				break;
        			}
        		}
        		if(cnt == 0) {
        			answer += 1;
        			for(int j = i; j <= n; j+=i) {
        				a[j] = true;
        			}
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_54 {
	public static void main(String[] args) {
		Try54 T = new Try54();

		System.out.println(T.solution(10));	
	}
}

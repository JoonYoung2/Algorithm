package programmers;

class Try24{
	public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; ++i) {
        	int cnt = 0;
        	for(int j = 1; j <= i; ++j) {
        		if(i % j == 0) {
        			cnt++;
        		}
        	}
        	if(cnt % 2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }
        return answer;
    }
}

public class Lv1_25 {
	public static void main(String[] args) {
		Try24 T = new Try24();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(T.solution(13, 17));
	}
}
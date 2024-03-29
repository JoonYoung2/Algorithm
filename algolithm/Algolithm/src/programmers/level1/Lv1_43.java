package programmers.level1;

class Try43{
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i = 1; i < s.length(); ++i) {
        	int min = Integer.MAX_VALUE;
        	int cnt = 0;
        	for(int j = 0; j < i; ++j) {
        		if(s.charAt(i) == s.charAt(j)) {
        			min = Math.min(min, i-j);
        			cnt++;
        		}
        		if(j == i-1 && cnt == 0) {
        			answer[i] = -1;
        		}else
        			answer[i] = min;
        	}
        }
        
        return answer;
    }
}

public class Lv1_43 {
	public static void main(String[] args) {
		Try43 T = new Try43();
		for(int x : T.solution("banana"))
		System.out.println(x);
	}
}

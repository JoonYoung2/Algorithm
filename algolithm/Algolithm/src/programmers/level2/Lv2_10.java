package programmers.level2;

class Try10{
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int forLength = brown + yellow;
        
        for(int i = 1; i <= forLength; ++i) {
        	for(int j = i; j <= forLength; ++j) {
        		if(i * j > forLength)
        			break;
        		else if(i * j == forLength) {
        			if((i - 2) * (j - 2) == yellow) {
        				answer[0] = j;
        				answer[1] = i;
        				return answer;
        			}else {
        				break;
        			}
        		}
        	}
        }
        
        return answer;
    }
}

public class Lv2_10 {
	public static void main(String[] args) {
		Try10 T = new Try10();
		int brown = 24;
		int yellow = 24;
		
		for(int x : T.solution(brown, yellow))
		System.out.println(x);
	}
}
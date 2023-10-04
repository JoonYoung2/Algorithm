package programmers.level1;

class Try15{
	public int solution(int num) {
        int answer = 0;
        long a = num;
        if(a == 1) {
    		return answer;
    	}
        while(true) {
        	answer++;
        	if(a % 2 == 0) {
        		a /= 2;
        	}else {
        		a = (a*3)+1;
        	}
        	if(a == 1) {
        		return answer;
        	}
        	if (answer == 500) {
        		return -1;
        	}
        }
    }
}

public class Lv1_15 {
	public static void main(String[] args) {
		Try15 T = new Try15();
		System.out.println(T.solution(626331));
	}
}
package programmers.level2;

class Try14{
	public int solution(int n, int a, int b){
        int answer = 0;
        
        while(true) {
        	answer++;
        	if(a % 2 != 0) {
        		a += 1;
        	}
        	if(b % 2 != 0) {
        		b += 1;
        	}
        	
        	if(a == b) {
        		break;
        	}
        	
        	a /= 2;
        	b /= 2;
        }
        return answer;
    }
}

public class Lv2_14 {
	public static void main(String[] args) {
		Try14 T = new Try14();
		
		System.out.println(T.solution(8, 4, 7));
	}
}
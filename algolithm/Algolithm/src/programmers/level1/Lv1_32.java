package programmers.level1;

class Try32{
	public int solution(int n) {
        int answer = 0;
        int c = 0;
        String s = "";
        
        int sum = 1;
        while(n > 0) {
        	s += n % 3;
        	n = n / 3;
        }
        if(s.charAt(0) == '0') {
        	s = "" + Integer.parseInt(s);        	
        }
        
        int x = s.length()-1;
        for(int i = 0; i < s.length(); ++i) {
        	for(int j = 0; j < x; ++j) {
        		sum *= 3;
        	}
        	answer += sum * Integer.parseInt(""+s.charAt(i));
        	sum = 1;
        	--x;
        }
        return answer;
    }	
}

public class Lv1_32 {
	public static void main(String[] args) {
		Try32 T = new Try32();
		int[] a = {1,1,3,3,0,1,1};
		
//		for(int x : )
		System.out.println(T.solution(100000000));
	}
}
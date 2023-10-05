package programmers.level2;

class Try05{
	public int[] solution(String s) {
        int[] answer = new int[2];
        String tmp = "";
        int zeroCnt = 0;
        int changeCnt = 0;
        int endCnt = 0;
        while(true) {
        	
        	changeCnt++;
        	
        	for(char c : s.toCharArray()) {
        		if(c == '1') {
        			tmp += c+"";
        		}else {
        			zeroCnt++;
        		}
        	}
        	
        	int length = tmp.length();
        	
        	tmp = "";
        	s = "";
        	while(length > 0) {
        		tmp += (length % 2) + "";
        		length /= 2;
        		if(length == 1) {
        			tmp += 1+"";
        			break;
        		}
        	}
        	
        	for(int i = tmp.length()-1; i >= 0; --i) {
        		s += tmp.charAt(i) + "";
        	}
        	tmp = "";

        	if(s.length() == 1) {
        		break;
        	}
        	
        }
        answer[0] = changeCnt;
        answer[1] = zeroCnt;
        return answer;
    }
}

public class Lv2_05 {
	public static void main(String[] args) {
		Try05 T = new Try05();
		String s = "01110";
		for(int x : T.solution(s))
		System.out.println(x);
	}
}
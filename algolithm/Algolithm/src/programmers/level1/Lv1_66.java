package programmers.level1;

class Try66 {
	public String solution(String s, String skip, int index) {
        String answer = "";
        char tmp = ' ';
        for(char c : s.toCharArray()) {
        	tmp = c;
        	int cnt = index;
        	while(cnt > 0) {
        		c++;
        		if(c > 122) {
        			c -= 26;
        		}
        		
        		c = cSearch(c, tmp, skip);
        		--cnt;
        	}
        	
        	answer += (char)(c) + "";
        }
        return answer;
    }
	
	private char cSearch(char c, char tmp, String skip) {
		int count = 0;
		while(count == 0) {
			int a = 0;
			for(char sk : skip.toCharArray()) {
	    		if(c == sk) {
	    			c++;
	    			if(c > 122) {
	        			c -= 26;
	        		}
	    			a++;
	    		}
	    	}
			if(a == 0) {
				count++;
			}
		}
		
		return c;
	}
}

public class Lv1_66 {
	public static void main(String[] args) {
		Try66 T = new Try66();
		System.out.println(T.solution("z","abcdefghij",20));
	}
}
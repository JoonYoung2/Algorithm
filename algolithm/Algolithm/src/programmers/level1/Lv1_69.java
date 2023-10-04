package programmers.level1;

class Try69 {
	public String solution(String new_id) {
        String answer = "";
        boolean dotCheck = true;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for(char x : new_id.toCharArray()) {
        	if((x > 96 && x < 123) || (x > 47 && x < 58) || x == '-' || x == '_' || x == '.' || (x > 64 && x < 91)) {
        		if(x > 64 && x < 91) {
        			sb.append((char)(x+32));
        			continue;
        		}
        		sb.append(x);
        		continue;
        	}
        	
        	if(cnt > 15) {
        		break;
        	}
        }
        new_id = sb.toString();
        if(new_id.length() == 0) {
			return "aaa";
		}
       
        while(dotCheck) {
        	if(new_id.charAt(0) == '.' || new_id.charAt(new_id.length()-1) == '.') {
        		if(new_id.length() == 1 || new_id.length() == 0) {
        			return "aaa";
        		}
        		if(new_id.charAt(0) == '.' && new_id.charAt(new_id.length()-1) == '.') {
        			if(new_id.length() == 2) {
        				return "aaa";
        			}
        			new_id = new_id.substring(1, new_id.length());
        			continue;
        		}
        		
        		
        		
        		if(new_id.charAt(0) == '.') {
        			new_id = new_id.substring(1);
        			continue;
        		}
        		
        		if(new_id.charAt(new_id.length()-1) == '.') {
        			new_id = new_id.substring(0, new_id.length()-1);
        			continue;
        		}
        	}else {
        		if(new_id.length() == 0) {
        			return "aaa";
        		}
        		dotCheck = false;
        	}
        }
        char tmp = new_id.charAt(0);
        
        if(new_id.length() > 1) {
        	for(int i = 1; i < new_id.length(); ++i) {
        		if(tmp == '.' && new_id.charAt(i) == '.') {
        			String tmp1 = new_id.substring(0, i);
        			String tmp2 = new_id.substring(i+1);
        			new_id = tmp1 + tmp2;
        			i--;
        		}else {
        			tmp = new_id.charAt(i);
        		}
        	
        	}        	
        }
        
        if(new_id.length() == 0) {
        	return "aaa";
        }
        
        if(new_id.length() > 15) {
        	new_id = new_id.substring(0, 15);
        }
        
        if(new_id.length() == 15) {
        	dotCheck = true;
        }
        
        while(dotCheck) {
        	if(new_id.charAt(0) == '.' || new_id.charAt(new_id.length()-1) == '.') {
        		if(new_id.length() == 1) {
        			return "aaa";
        		}
        		if(new_id.charAt(0) == '.') {
        			new_id = new_id.substring(1);
        		}
        		
        		if(new_id.charAt(new_id.length()-1) == '.') {
        			new_id = new_id.substring(0, new_id.length()-1);
        		}
        	}else {
        		dotCheck = false;
        	}
        }
        
        if(new_id.length() < 3) {
        	while(new_id.length() < 3) {
        		new_id += new_id.charAt(new_id.length()-1);
        	}
        }
        
        answer = new_id;
        return answer;
    }
}

public class Lv1_69 {
	public static void main(String[] args) {
		Try69 T = new Try69();
		System.out.println(T.solution("......"));
	}
}
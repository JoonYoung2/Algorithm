package programmers;

class Try59 {
	public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        int next = 1;
        String tmp = "";
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        while(babbling.length >= next) {
        	if(babbling[next-1].charAt(0) == 'a') {
        		if(baby[0].length() <= babbling[next-1].length()) {
        			tmp = babbling[next-1].substring(0, baby[0].length());        			
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
        			continue;
        		}
        		if(tmp.equals(baby[0])) {
        			cnt0++;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
        			if(cnt0 == 2) {
        				cnt0 = 0;
        				next++;
        				continue;
        			}
        			babbling[next-1] = babbling[next-1].substring(baby[0].length());
        			if(babbling[next-1].length() > 0) {
        				continue;
        			}else if(babbling[next-1].length() == 0){
        				answer++;
        				next++;
        				cnt0 = 0;
            			cnt1 = 0;
            			cnt2 = 0;
            			cnt3 = 0;
        				continue;
        			}
        		}else{
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
    				continue;
        		}
        	}
        	
        	if(babbling[next-1].charAt(0) == 'y') {
        		if(baby[1].length() <= babbling[next-1].length()) {
        			tmp = babbling[next-1].substring(0, baby[1].length());        			
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
        			continue;
        		}
        		if(tmp.equals(baby[1])) {
        			cnt0 = 0;
        			++cnt1;
        			cnt2 = 0;
        			cnt3 = 0;
        			if(cnt1 == 2) {
        				cnt1 = 0;
        				next++;
        				continue;
        			}
        			babbling[next-1] = babbling[next-1].substring(baby[1].length());
        			if(babbling[next-1].length() > 0) {
        				continue;
        			}else if(babbling[next-1].length() == 0){
        				answer++;
        				next++;
        				cnt0 = 0;
            			cnt1 = 0;
            			cnt2 = 0;
            			cnt3 = 0;
        				continue;
        			}
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
    				continue;
        		}
        	}
        	
        	if(babbling[next-1].charAt(0) == 'w') {
        		if(baby[2].length() <= babbling[next-1].length()) {
        			tmp = babbling[next-1].substring(0, baby[2].length());        			
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
        			continue;
        		}
        		if(tmp.equals(baby[2])) {
        			cnt2++;
        			cnt1 = 0;
        			cnt0 = 0;
        			cnt3 = 0;
        			if(cnt2 == 2) {
        				cnt2 = 0;
        				next++;
        				continue;
        			}
        			babbling[next-1] = babbling[next-1].substring(baby[2].length());
        			if(babbling[next-1].length() > 0) {
        				continue;
        			}else if(babbling[next-1].length() == 0){
        				answer++;
        				next++;
        				cnt0 = 0;
            			cnt1 = 0;
            			cnt2 = 0;
            			cnt3 = 0;
        				continue;
        			}
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
    				continue;
        		}
        	}
        	
        	if(babbling[next-1].charAt(0) == 'm') {
        		if(baby[3].length() <= babbling[next-1].length()) {
        			tmp = babbling[next-1].substring(0, baby[3].length());        			
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
        			continue;
        		}
        		if(tmp.equals(baby[3])) {
        			cnt3++;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt0 = 0;
        			if(cnt3 == 2) {
        				cnt3 = 0;
        				next++;
        				continue;
        			}
        			babbling[next-1] = babbling[next-1].substring(baby[3].length());
        			if(babbling[next-1].length() > 0) {
        				continue;
        			}else if(babbling[next-1].length() == 0){
        				answer++;
        				next++;
        				cnt0 = 0;
            			cnt1 = 0;
            			cnt2 = 0;
            			cnt3 = 0;
        				continue;
        			}
        		}else {
        			next++;
        			cnt0 = 0;
        			cnt1 = 0;
        			cnt2 = 0;
        			cnt3 = 0;
    				continue;
        		}
        	}
        	cnt0 = 0;
			cnt1 = 0;
			cnt2 = 0;
			cnt3 = 0;
        	next++;
        	continue;
        }
        return answer;
    }
}

public class Lv1_59_r {
	public static void main(String[] args) {
		Try59 T = new Try59();
		String[] babbling = {"maayayeye", "yeaya", "ye","yaayama","aya"};
		System.out.println(T.solution(babbling));
	}
}
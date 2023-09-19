package programmers;

// line 19~22 if문 - 이미 앞에 문자열이 서로 같은 값이 아닌 상태에서 뒤에 문자열이 더 크면 바로 break 잡아줘야 하는데 이거 생각하는데 쉽지 않았음...

class Try41{
	public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();
        
        for(int i = 0; i < strings.length; ++i) {
        	for(int j = i; j < strings.length; ++j) {
        		if(answer[i].charAt(n) > answer[j].charAt(n)) {
        			String tmp = answer[i];
        			answer[i] = answer[j];
        			answer[j] = tmp;
        		}else if(answer[i].charAt(n) == answer[j].charAt(n)) {
        			int min = Math.min(answer[i].length(), answer[j].length());
        			int cnt = 0;
        			for(int k = 0; k < min; ++k) {
        				if(answer[i].charAt(k) < answer[j].charAt(k)) {
        					cnt++;
        					break;
        				}
        				if(answer[i].charAt(k) > answer[j].charAt(k)) {
        					cnt++;
        					String tmp = answer[i];
                			answer[i] = answer[j];
                			answer[j] = tmp;
                			break;
        				}
        			}
        			if(cnt == 0 && answer[i].length() > answer[j].length()) {
        				String tmp = answer[i];
            			answer[i] = answer[j];
            			answer[j] = tmp;
        			}
        		}
        	}
        }
        
        return answer;
    }
}

public class Lv1_41_h {
	public static void main(String[] args) {
		Try41 T = new Try41();
		String[] a = {"aca", "gzowerasdsad", "aza", "aca", "bab", "kzh", "asdjfhi", "vniua", "aca", "aaa", "gzowerquwyrrrr", "abc", "kzh", "baa", "azaa", "ab", "azc", "abcd", "abb", "acc", "azaa", "aca", "azd", "acc", "azaaa", "aza", "kzh", "gzower" , "aza", "gzo", "kzh" , "aza"};
		
//		for(int x : )
		for(String x : T.solution(a, 1))
		System.out.println(x);
	}
}

package programmers.level2;

import java.util.HashMap;

class Try11{
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 0;
        int continueNum = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);
        while(true) {
        	continueNum++;
        	int playerNum = 1;
        	for(int i = 0; i < n; ++i) {
        		if(cnt == 0) {
        			cnt = 1;
        			playerNum = 2;
        			continue;
        		}else if(!map.containsKey(words[cnt]) && words[cnt-1].charAt(words[cnt-1].length()-1) == words[cnt].charAt(0)) {
        			map.put(words[cnt], playerNum);
        			playerNum++;
        			cnt++;
        		}else {
        			answer[0] = playerNum;
        			answer[1] = continueNum;
        			return answer;
        		}
        		if(cnt == words.length)
        			break;
        	}
        	if(cnt == words.length)
        		break;
        }
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}

public class Lv2_11 {
	public static void main(String[] args) {
		Try11 T = new Try11();
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		for(int x : T.solution(n, words))
		System.out.println(x);
	}
}
package programmers;

import java.util.HashMap;

class Try65 {
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        HashMap<Character, Integer> keyMap = new HashMap<>();
        for(int i = 0; i < keymap.length; ++i) {
        	int cnt = 0;
        	for(char c : keymap[i].toCharArray()) {
        		cnt++;
        		if(!keyMap.containsKey(c)) {
        			keyMap.put(c, cnt);
        		}else {
        			if(keyMap.get(c) > cnt) {
        				keyMap.replace(c, cnt);
        			}
        		}
        	}
        }
        
        for(int i = 0; i < targets.length; ++i) {
        	int cnt = 0;
        	int count = 0;
        	for(char c : targets[i].toCharArray()) {
        		if(keyMap.containsKey(c)) {
        			count += keyMap.get(c);
        		}else {
        			cnt++;
        			answer[i] = -1;
        			break;
        		}
        	}
        	if(cnt == 0) {
        		answer[i] = count;
        	}
        }
        
        return answer;
    }
}

public class Lv1_65 {
	public static void main(String[] args) {
		Try65 T = new Try65();
		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"ABCD","AABB"};
		for(int x : T.solution(keymap, targets))
			System.out.println(x);
	}
}
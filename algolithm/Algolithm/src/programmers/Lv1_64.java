package programmers;

import java.util.HashMap;

class Try64 {
	public int solution(String s) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char tmp = ' ';
        for(char x : s.toCharArray()) {
        	if(!(map.size() > 0)) {
        		map.put(x, 1);
        		tmp = x;
        	}else {
        		
        		if(map.containsValue(map.getOrDefault(map.get(x), 0)+1)) {
        			answer++;
        			map.clear();
        			continue;
        		}else {
        			map.put(x, map.getOrDefault(map.get(x), 0)+1);
        		}
        	}
        }
        
        return ++answer;
    }
}

public class Lv1_64 {
	public static void main(String[] args) {
		Try64 T = new Try64();
		System.out.println(T.solution("banana"));
	}
}
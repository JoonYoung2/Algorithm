package programmers.level1;

import java.util.HashMap;
import java.util.Map;

class Try39{
	public int solution(String s) {
        int answer = 0;
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        for(int i = 0; i < s.length(); ++i) {
        	if(Character.isAlphabetic(s.charAt(i))) {
        		for(int j = 0; j <= 9; ++j) {
        			if(map.get(j).length() + i <= s.length()) {
        				if(map.get(j).equals(s.substring(i, i+map.get(j).length()))) {
        					answer = answer * 10 + j;
        					i+=map.get(j).length()-1;
        					break;
        				}
        			}
        		}
        	}else {
        		answer = answer * 10 + Integer.parseInt(s.charAt(i) + "");
        	}
        }
        return answer;
    }
}

public class Lv1_39 {
	public static void main(String[] args) {
		Try39 T = new Try39();
		int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
//		for(int x : )
		System.out.println(T.solution("123"));
	}
}

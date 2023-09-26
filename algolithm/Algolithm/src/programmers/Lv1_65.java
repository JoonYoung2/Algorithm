package programmers;

class Try65 {
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int keyCnt = 0;
        int minKey = Integer.MAX_VALUE;
        int tarCnt = 0;
        
        for(int i = 0; i < targets.length; ++i) {
        	
        	for(char x : targets[i].toCharArray()) {
        		
        		for(int j = 0; j < keymap.length; ++j) {
        			
        			for(char c : keymap[j].toCharArray()) {
        				if(x == c) {
        					++keyCnt;
        					break;
        				}
        				++keyCnt;
        				if(keyCnt == keymap[j].length()) {
        					keyCnt = 0;
        				}
        			}
        			
        			if(keyCnt > 0) {
        				minKey = Math.min(minKey, keyCnt);
        				keyCnt = 0;
        			}
        			
        			if(minKey > 1000000 && j == keymap.length-1) {
        				answer[i] = -1;
        			}else if(minKey < 1000000 && j == keymap.length-1) {
        				tarCnt += minKey;
        				minKey = Integer.MAX_VALUE;
        			}
        			
        		}
        		
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
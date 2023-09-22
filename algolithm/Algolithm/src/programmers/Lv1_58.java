package programmers;

import java.util.ArrayList;
import java.util.List;

class Try58 {
	public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int step = 0;
        for(char x : dartResult.toCharArray()) {
        	if(x == 'S') {
        		list.set(index, list.get(index));
        		index++;
        		step = 0;
        	}else if(x == 'D') {
        		list.set(index, list.get(index) * list.get(index));
        		index++;
        		step = 0;
        	}else if(x == 'T') {
        		list.set(index, list.get(index) * list.get(index) * list.get(index));
        		index++;
        		step = 0;
        	}else if(x == '*') {
        		if(list.size() > 1) {
        			for(int i = list.size()-2; i < list.size(); ++i) {
        				list.set(i, list.get(i) * 2);
        			}        			
        		}else
        			list.set(0, list.get(0) * 2);
        		step = 0;
        	}else if(x == '#') {
        		list.set(index-1, list.get(index-1) * -1);
        		step = 0;
        	}else {
        		if(step == 0) {
        			list.add(Integer.parseInt(x + ""));        			
        		}
        		step++;
        		if(step > 1) {
        			list.set(index, list.get(index) * 10 + Integer.parseInt(x + ""));
        		}
        	}
        }
        for(int x : list) 
        	answer+=x;
        
        
        return answer;
    }
}

public class Lv1_58 {
	public static void main(String[] args) {
		Try58 T = new Try58();

		System.out.println(T.solution("1S*2T*3S"));
	}
}
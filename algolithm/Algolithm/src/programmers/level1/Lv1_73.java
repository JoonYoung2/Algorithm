package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Try73 {
	public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int yyyy = Integer.parseInt(today.split("[.]")[0]);
        int mm = Integer.parseInt(today.split("[.]")[1]);
        int dd = Integer.parseInt(today.split("[.]")[2]);
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(String c : terms) {
        	char part = c.split(" ")[0].charAt(0);
        	int month = Integer.parseInt(c.split(" ")[1]);
        	map.put(part, month);
        }
        int cnt = 0;
        for(String c : privacies) {
        	cnt++;
        	String years = c.split(" ")[0];
        	char part = c.split(" ")[1].charAt(0);
        	
        	int resultY = yyyy;
        	int resultM = mm;
        	int resultD = dd;
        	
        	int priY = Integer.parseInt(years.split("[.]")[0]);
        	int priM = Integer.parseInt(years.split("[.]")[1]);
        	int priD = Integer.parseInt(years.split("[.]")[2]);
        	int month = map.get(part);
        	for(int i = 0; i < month; ++i) {
        		resultM--;
        		if(resultM == 0) {
        			resultM = 12;
        			resultY--;
        		}
        	}
        	
        	if(resultY > priY) {
        		list.add(cnt);
        	}else if(resultY == priY && resultM > priM){
        		list.add(cnt);
        	}else if(resultY == priY && resultM == priM && resultD >= priD) {
        		list.add(cnt);
        	}
        	
        }
        answer = new int[list.size()];
        
        cnt = 0;
        for(int x : list) {
        	answer[cnt] = x;
        	cnt++;
        }
        
        return answer;
    }
}

public class Lv1_73 {
	public static void main(String[] args) {
		Try73 T = new Try73();
		String today = "2020.05.17";
		String[] terms = {"A 3", "B 12"};
		String[] privacies = {"2020.01.01 A", "2020.05.17 B"};
		
		for(int x : T.solution(today, terms, privacies))
		System.out.println(x);
	}
}

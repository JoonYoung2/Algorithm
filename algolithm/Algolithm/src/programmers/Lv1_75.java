package programmers;

import java.util.HashMap;

class Try75 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, String> reportMap = new HashMap<>();
        HashMap<String, Integer> reportCntMap = new HashMap<>();
        for(String x : id_list) {
        	reportMap.put(x, "");
        	reportCntMap.put(x, 0);
        }
        
        for(String x : report) {
        	int cnt = 0;
        	String tmp = x.split(" ")[0];
        	String tmp2 = x.split(" ")[1];
        	String[] tmp3 = reportMap.get(tmp).split(",");
        	if(tmp3.length > 1) {
        		for(int i = 1; i < tmp3.length; ++i) {
        			if(tmp3[i] == tmp2) {
        				cnt++;
        				break;
        			}
        		}
        	}
        	if(cnt == 1)
        		continue;
        	
        	reportMap.put(tmp, reportMap.get(tmp) + "," + tmp2);
        	reportCntMap.put(tmp2, reportCntMap.get(tmp2)+1);
        }
        
        return answer;
    }
}

public class Lv1_75 {
	public static void main(String[] args) {
		Try75 T = new Try75();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"}; 
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; 
		int k = 2;
		
		for(int x : T.solution(id_list, report, k))
		System.out.println(x);
	}
}

package kakao.year2022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Try01{
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		Map<String, Integer> reportCnt = new HashMap<>();
		for(String x : id_list) {
			reportCnt.put(x, 0);
		}
		Set<String> reportSet = new HashSet<>();
		for(String x : report)
			reportSet.add(x);
		Iterator<String> iter = reportSet.iterator();
		while(iter.hasNext()) {
			String[] reportContent = iter.next().split(" ");
			reportCnt.put(reportContent[1], reportCnt.get(reportContent[1])+1);
		}
		
		for(String x : id_list) {
			if(reportCnt.get(x) >= k) {
				
			}
		}
		
		return answer;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 0;
		
		Try01 t = new Try01();
		for(int x : t.solution(id_list, report, k))
			System.out.println(x);
	}
}

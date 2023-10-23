package programmers;

class Try76 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        return answer;
    }
}

public class Lv1_76 {
	public static void main(String[] args) {
		Try76 T = new Try76();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		for(int x : T.solution(id_list, report, k))
		System.out.println(x);
	}
}

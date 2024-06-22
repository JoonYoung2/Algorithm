package kakao.test;

class Try06{
	public int[] solution(int[][] v) {
		int[] answer = new int[2];
		int xCheck = 0;
		int yCheck = 0;
		for(int i = 0; i < 2; ++i) {
			int x = v[i][0];
			int y = v[i][1];
			for(int j = i+1; j < 3; ++j) {
				if(x == v[j][0]) {
					xCheck++;
				}
			}
		}
		
		return answer;
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Try06 t = new Try06();
		int[][] v = {{1,4},{3,4},{3,10}};
		System.out.println(t.solution(v));
	}
}


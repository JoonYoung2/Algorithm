package programmers;

// line 19~22 if문 - 이미 앞에 문자열이 서로 같은 값이 아닌 상태에서 뒤에 문자열이 더 크면 바로 break 잡아줘야 하는데 이거 생각하는데 쉽지 않았음...

class Try42{
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        for(int i = 0; i < commands.length; ++i) {
        	for(int j = 0; j < array.length; ++j) {
        		int start = commands[i][0], end = commands[i][1];
        		if(i < start || i > end) {
        			
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_42 {
	public static void main(String[] args) {
		Try42 T = new Try42();
		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//		for(int x : )
		for(int x : T.solution(a, b))
		System.out.println(x);
	}
}

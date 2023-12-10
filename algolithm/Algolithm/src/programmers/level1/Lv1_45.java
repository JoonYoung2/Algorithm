package programmers.level1;

class Try45{
	public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; ++i) {
        	int count = food[i]/2;
        	for(int j = 0; j < count; ++j) {
        		sb.append(i);
        	}
        }
        sb.append(0);
        int cnt = food.length-1;
        for(int i = food.length-1; i >= 1; --i) {
        	int count = food[cnt]/2;
        	for(int j = 0; j < count; ++j) {
        		sb.append(i);
        	}
        	--cnt;
        }
        answer = sb.toString();
        return answer;
    }
}

public class Lv1_45 {
	public static void main(String[] args) {
		Try45 T = new Try45();
		int[] a = {1, 3, 4, 6};

		System.out.println(T.solution(a));
	}
}

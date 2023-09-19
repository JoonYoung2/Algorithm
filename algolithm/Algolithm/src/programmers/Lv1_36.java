package programmers;

class Try36{
	public int solution(int[] number) {
		int answer = 0;
		for(int i = 0; i < number.length-2; ++i) {
			for(int j = i + 1; j < number.length-1; ++j) {
				for(int k = j + 1; k < number.length; ++k) {
					if(number[i] + number[j] + number[k] == 0) 
						answer += 1;
				}
			}
		}
        return answer;
    }
}

public class Lv1_36 {
	public static void main(String[] args) {
		Try36 T = new Try36();
		int[] a = {-3, -2, -1, 0, 1, 2, 3};
		
//		for(int x : )
		System.out.println(T.solution(a));
	}
}
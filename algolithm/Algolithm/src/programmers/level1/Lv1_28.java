package programmers.level1;

class Try28{
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; ++i) {
        	for(int j = 0; j < arr1[i].length; ++j) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }
}

public class Lv1_28 {
	public static void main(String[] args) {
		Try28 T = new Try28();
		int[][] a = {{1,2},{2,3}};
		int[][] b = {{3,4},{5,6}};
		System.out.println(T.solution(a, b));
	}
}
package programmers.level1;

import java.util.Stack;

class Try67 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int x : moves) {
        	for(int i = 0; i < board.length; ++i) {
        		if(board[i][x-1] != 0) {
        			if(st.size() == 0) {
        				st.add(board[i][x-1]);
        				board[i][x-1] = 0;
        				break;
        			}else {
        				if(st.peek() == board[i][x-1]) {
        					st.pop();
        					answer += 2;
        					board[i][x-1] = 0;
        					break;
        				}else {
        					st.add(board[i][x-1]);
        					board[i][x-1] = 0;
        					break;
        				}
        			}
        		}
        	}        	
        }
        
        return answer;
    }
}

public class Lv1_67 {
	public static void main(String[] args) {
		Try67 T = new Try67();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(T.solution(board, moves));
	}
}
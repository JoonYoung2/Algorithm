package programmers;

class Try72 {
	public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 0, luy = Integer.MAX_VALUE, rdx = 0, rdy = 0;
        int luxCnt = 0;
        for(int i = 0; i < wallpaper.length; ++i) {
        	int minLuyCnt = 0;
        	for(char c : wallpaper[i].toCharArray()) {
        		if(c == '#' && luxCnt == 0) {
        			luxCnt++;
        		}
        		
        		if(c == '#') {
        			luy = Math.min(minLuyCnt, luy);
        			rdx = Math.max(rdx, i+1);
        			rdy = Math.max(rdy, minLuyCnt+1);
        		}
        		minLuyCnt++;
        	}
        	if(luxCnt == 1) {
        		lux = i;
        		luxCnt++;
        	}
        }
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        return answer;
    }
}

public class Lv1_72 {
	public static void main(String[] args) {
		Try72 T = new Try72();
		String[] wallpaper = { ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...." };
		
		for(int x : T.solution(wallpaper))
		System.out.println(x);
	}
}
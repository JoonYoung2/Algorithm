package programmers;

class Try75 {
	public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;
        
        for(String str: park){
            if(str.contains("S")){
               x = str.indexOf("S");
               break;
            }
            y++;
        }

        for(String move : routes){
            String[] arr = move.split(" ");
            Character dir = arr[0].charAt(0);
            int num = Integer.parseInt(arr[1]);
            int postX = x, postY = y;
            
            num *= (dir == 'W' || dir == 'N') ? -1 : 1;
            if(dir == 'E' || dir == 'W'){
                postX += num;
            }else{
                postY += num;
            }
            
            if(postX < 0 || postX >= park[0].length() || postY < 0 || postY >= park.length){
                continue;
            }
            
            Boolean isBlocked = false;
            
            for(int i = (x < postX ? x : postX); i <= (x < postX ? postX : x); i++){
                if(park[y].charAt(i) == 'X'){
                    isBlocked = true;
                    break;
                }   
            }
            
            for(int j = (y < postY ? y : postY); j <= (y < postY ? postY : y); j++){
                if(park[j].charAt(x) == 'X'){
                    isBlocked = true;
                    break;
                }
            }
            
            if(!isBlocked){
                x = postX;
                y = postY;    
            }
        }
        return new int[] {y, x};
    }
}

public class Lv1_75 {
	public static void main(String[] args) {
		Try75 T = new Try75();
		String[] park = {"SOO","OXX","OOO"};
		String[] routes = {"E 2","S 2","W 1"};
		
		for(int x : T.solution(park, routes))
		System.out.println(x);
	}
}

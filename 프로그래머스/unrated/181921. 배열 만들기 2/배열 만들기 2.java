import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        
        for(int i = l; i <= r; i++) {
           if(contains(i)) {
               answer.add(i);
           }
        }
        
        if(answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
    
    public static boolean contains(int n) {
        String numStr = Integer.toString(n);
        for(char c : numStr.toCharArray()) {
            if(c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}
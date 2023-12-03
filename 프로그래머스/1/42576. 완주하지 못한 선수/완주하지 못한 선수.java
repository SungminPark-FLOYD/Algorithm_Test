import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> mp = new HashMap<>();
        
        for(String part : participant) mp.put(part, mp.getOrDefault(part, 0)+ 1);
        for(String com : completion) mp.put(com, mp.get(com)-1);
        
        for(String key : mp.keySet()) {
            if(mp.get(key) != 0) {
                answer += key + "";
                
            }
        }
        
        return answer;
    }
}
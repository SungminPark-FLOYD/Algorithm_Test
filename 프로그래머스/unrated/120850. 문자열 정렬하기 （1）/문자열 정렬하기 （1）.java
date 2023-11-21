import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        String num = "";
        char[] ch = my_string.toCharArray();
        for(char c : ch) {
            if(c >= 48 && c <= 57) num += c;
        }
        int[] answer = new int[num.length()];
        String[] st = new String[num.length()];
        
        for(int i=0; i < num.length(); i++) {
            st[i] = num.charAt(i) + "";
            answer[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}
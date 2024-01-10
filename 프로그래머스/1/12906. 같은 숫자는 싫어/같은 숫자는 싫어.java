import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int n = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != n) {
                answer.add(arr[i]);
                n = arr[i];
            }
        }
        
        int[] res = new int[answer.size()];
        for(int i=0; i < res.length; i++) {
            res[i] = answer.get(i);
        }
        
        return res;
    }
}
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a = i; a <= j; a++) {
            String str = Integer.toString(a);
            for(int b=0; b < str.length(); b++) {
                if(Integer.toString(k).equals(str.substring(b, b+1))) answer++;
            }
        }
        return answer;
    }
}
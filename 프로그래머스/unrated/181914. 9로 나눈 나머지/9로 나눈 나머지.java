class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] num = number.split("");
        int sum = 0;
        for(int n =0; n < num.length; n++) {
            sum +=  Integer.parseInt(num[n]);
        }
        
        
        return sum%9;
    }
}
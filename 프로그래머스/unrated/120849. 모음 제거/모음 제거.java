class Solution {
    public String solution(String my_string) {
        String charsToRemove = "aeiou";
        
        for(char c : charsToRemove.toCharArray()) {
            my_string = my_string.replace(String.valueOf(c), "");
        }
        
        
        
        return my_string;
    }
}
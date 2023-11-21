class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int[] answer = {};
        
        int num = 0;
        int length = numlist.length;
        while(num < length) {
            if(numlist[num]%n != 0){
                numlist = remove(numlist, num);
            }
            else num++;
            length = numlist.length;
        }
         return numlist;
//         int count = 0;
//         for(int i=0; i < numlist.length; i++) {          
//             if(numlist[i]%n == 0) count++;                        
//         }
//         int[] answer = new int[count];
//         int index = 0;
        
//         for(int i=0; i < numlist.length; i++) {          
//             if(numlist[i]%n == 0) {
//                 answer[index] = numlist[i];       
//                 index++;}
//         }
//         return answer;
        
    }
    public int[] remove(int[] numlist, int index) {
        int[] tmp = new int[numlist.length-1];
        int num = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(i == index) continue;
            tmp[num++] = numlist[i];
        }
        return tmp;
    }
    
}
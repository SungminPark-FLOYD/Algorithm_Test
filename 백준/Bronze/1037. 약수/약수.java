import java.util.*;

public class Main {
    
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	
    	int len = sc.nextInt();
    	int[] num = new int[len];
    	
    	for(int i = 0; i < num.length; i++) {
    		int n = sc.nextInt();
    		num[i] = n;
    	}
    	
        
    	Arrays.sort(num);
    	
    	int answer = num[0]*num[len-1];
    	
    	System.out.println(answer);
       
       
    }

  
}
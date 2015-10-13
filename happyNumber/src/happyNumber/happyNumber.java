package happyNumber;

import java.util.HashSet;

public class happyNumber {
    public boolean isHappy(int n) {
    	
    	int temp = 0;
    	HashSet<Integer> happySet = new HashSet<>();
    	
    	while(!happySet.contains(n)){
    		happySet.add(n);
    		temp = 0;
    		while(n != 0){
    			temp += (n%10)*(n%10);
    			n= n/10;
    		}
    		n =temp;
    		
    		if(n==1) return true;
    		
    	}
    	
    
    	return false;   
    }
    


}

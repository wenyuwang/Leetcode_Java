package primes;

public class countPrimes {
	
    public static int countPrime(int n) {
    	
    	n = n-1;
    	
    	if ( n <=1) return 0;
    	if ( n <=2) return 1;
    	if ( n ==3) return 2;
    	
    	int count =1;
    	for (int i=3; i <= n; i++){
    		if (isPrime(i)) {
    			count = count +=1;
    		}
    		
    	}
    	
        return count;
    }
	
	public static boolean isPrime(int n ){
		
		float limit =  (float) Math.sqrt(n);
		for (float i =2; i <=limit; i++){
			if (n % i ==0) return false;
			
		}
		
		return true;
	}

}

package addDigits;

public class addDigits {
    public int addDigits(int num) {
     if (num <10) return num;
     else
    	 return addDigits(num%10 + (num)/10);
    }
}

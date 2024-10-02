//Check whether the number is a perfect number or not
//Perfect Number: sum of all divisors equal to the number
public class perfectNum {
    public static boolean isPerfect(int n) {
    	int sum=0;
    	for(int i=n-1;i>=1;i--) {
    		if(n%i==0) {
    			sum+=i;
    		}
    		//System.out.println("sum: "+sum);
    	}
    	return sum==n;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=28;
        System.out.println("Is "+num+" a perfect number? "+isPerfect(num));
	    
	}

}

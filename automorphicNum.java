//Check if a number is automorphic number or not
//Automorphic: square of the number ends with the given number
//e.g., 5*5=25 so 5 end digut in 25
public class automorphicNum {
	public static int countDig(int n) {
    	int c=0;
    	while(n!=0) {
    		int rem=n%10;
    		n=n/10;
    		c++;
    	}
    	return c;
    }
	public static boolean isAutomorphicNum(int num) {
    	int squareNum=num*num;
    	int res=0;
    	for(int i=0;i<countDig(num);i++) {
    		int r=squareNum%10;
    		System.out.println("r:"+r);
    		res+=(int)Math.pow(10,i)*r;
    		squareNum=squareNum/10;
    	}
    	System.out.println("res: "+res+"num: "+num);
    	return res==num;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=76;
	        System.out.println("Is "+n+" a automorphic number? "+isAutomorphicNum(n));
		
	}

}

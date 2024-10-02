//When the sum of factorial of individual digits of a number is equal 
//to the original number the number is called a strong number. 
public class strongNum {
	public static int fact(int n) {
    	int fact=1;
    	for(int i=n;i>=1;i--) {
    		fact*=i;
    	}
    	return fact;
    }
	public static boolean isStrongNum(int num) {
    	int dupNum=num;//duplicate of num
    	int rem=0,res=0;
    	while(num!=0) {
    		rem=num%10;
    		res+=fact(rem);
    		//System.out.println("res: "+res+"num: "+num);
    		num=num/10;
    	}
    	return dupNum==res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
        System.out.println("Is "+n+" a strong num? "+isStrongNum(n));
	}

}

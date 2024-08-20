//Striver DSA Sheet(Basic Math)
//Q6: sum of all divisor of a given number from 1 to n(given number)
import java.util.Scanner;
public class sumDivisor {
	public static int divisor(int n) {
		int s=1;
		for(int i=n;i>1;i--) {
			if(n%i==0)
				s+=i;
		}
		//sum of divisor
		System.out.println("s: "+s);
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
        	sum+=divisor(i);
        }
        System.out.println("Sum of all divisors from 1 to "+n+" is "+sum);
	}

}

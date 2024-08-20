//Striver DSA Sheet(Basic Math)
//Q2: Reverse a number & Q3: Check  whether a number is palindrome 
import java.util.Scanner;
import java.lang.Math;
public class revNum {
	public static int countDig(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int n=num;
        //System.out.println("n: "+n);
        int rem=0,outNum=0;
        //System.out.println("Count Digit: "+countDig(num));
        while(num!=0) {
        	rem=num%10;
        	outNum+=(Math.pow(10,countDig(num)-1)*rem);
        	num=num/10;
        	//System.out.println("outNum:"+outNum);
        }
        //to check whether the number is palindrome or not then 
        //revNum==num and if it's -ve num then
        //-121 from left to right reads -121 but from right to left
        //it reads 121- which is not palindrome
        if(n>=0&&outNum==n)
        	System.out.println("Palindrome number.");
        else
        	System.out.println("Not a Palindrome number.");
	}

}

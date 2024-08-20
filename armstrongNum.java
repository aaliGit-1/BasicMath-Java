//Striver DSA Sheet(Basic Math)
//Q5: Check if a number is Armstrong or not
import java.util.Scanner;
import java.lang.Math;
public class armstrongNum {
	/*public static int countDig(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		return c;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int n=num;
        int rem=0;
        int temp=0;
        //int dig=countDig(num);
        while(num!=0) {
        	rem=num%10;
        	num=num/10;
            temp+=Math.pow(rem,3);    	
        }
        if(temp==n)
        	System.out.println("Is the number Armstrong? True");
        else
        	System.out.println("Is the number Armstrong? False");
	}

}

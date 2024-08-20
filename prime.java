//Striver DSA Sheet(Basic Math)
//Q7: Check if the number is prime or not
import java.util.Scanner;
import java.lang.Math;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int p=1;//let p be 1(as 1 divides every number)
        for(int i=(int)Math.sqrt(n);i>1;i--) {
        	if(n%i==0) {
        		p++;
        		break;
        	}
        }
        if(p>1)
        	System.out.println("Is "+n+" prime number? False");
        else
        	System.out.println("Is "+n+" prime number? True");
    }

}

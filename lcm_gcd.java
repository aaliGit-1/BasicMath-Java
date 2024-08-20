//Striver DSA Sheet(Basic Math)
//Q4: Find LCM and GCD of a number
import java.util.Scanner;
public class lcm_gcd {
	public static int lcm(int n1,int n2) {
		int smallNum=0,largeNum=0;
		smallNum=n1<n2?n1:n2;
		largeNum=n2>n1?n2:n1;
		int i=1;
		while((largeNum*i)%smallNum!=0) {
			i++;
		}
		return largeNum*i;
	}
	public static int gcd(int n1,int n2) {
		int smallNum=0,largeNum=0;
		smallNum=n1<n2?n1:n2;
		largeNum=n2>n1?n2:n1;
		int sNum=largeNum%smallNum==0?smallNum:smallNum-1;
		//System.out.println("smallNum,sNum:"+smallNum+","+sNum);
		while(sNum>1&&(largeNum%sNum!=0||smallNum%sNum!=0)) {
			sNum--;
		} 
		return sNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int n1=sc.nextInt();
        System.out.println("Enter num2: ");
        int n2=sc.nextInt();
        System.out.println("LCM of "+n1+" and "+n2+" is "+lcm(n1,n2)+", while their GCD is "+gcd(n1,n2));
	}

}

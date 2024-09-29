//Q8:How much time left to reach the destination ?
import java.util.Scanner;
public class TimeLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Scanner sc=new Scanner(System.in);
        int h=14;
        int m=20;
        int totalMinutes=h*60+m;
        int leftHour=0,leftMinutes=0;
        if(totalMinutes<=1440) {
        	leftHour=(int)((1440-totalMinutes)/60);
        	leftMinutes=60-m;
        }
        else {
        	leftHour=(int)((1440-totalMinutes)/60);
        	leftMinutes=m;
        }
        System.out.println("Time left to reach destination= "
        		+leftHour+"::"+leftMinutes);
	}

}

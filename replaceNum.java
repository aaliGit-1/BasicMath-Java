//Replace 0 with 1 in a number
public class replaceNum {

	public static int repNum(int num) {
		int ans=0,temp=1;
		while(num!=0) {
			int rem=num%10;
			if(rem==0) {
				rem=1;
			}
			ans=temp*rem+ans;
			temp=temp*10;
			num=num/10;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=204;
        //System.out.println("replacing 0 with 1: "+repNum(num));
	    String c="ayesha";
	    String newC="";
	    String ans="";
	    for(int i=0;i<c.length();i++) {
	    	if(i==0||i==c.length()-1) {
	    		newC+=c.charAt(i);
	    		ans+=newC.toUpperCase();
	    		//System.out.println("newC:"+newC+",ans:"+ans);
	    		newC="";
	    	}
	    	else{
	    		ans+=c.charAt(i);
	    	}
	    }
	    System.out.println("Changed String: "+ans);
	}

}

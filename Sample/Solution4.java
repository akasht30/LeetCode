import java.util.*;
class Solution4 {
	 public static int numberOfSteps(int n) {
		 
		 int c=0,d=0;
		 
		 do{
		
			if( n%2==0) {
				 d=n/2;
			}
			if( n%2==1) {
				int t=n-1;
				if(t!=0) {
					 d=t/2;
				}	
			}				
			 n=d;
			c++;
		 }while(n>0);
		 
		 
        
		return c;
		
		
	}
	public static void main(String[] args ){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		int  ar= numberOfSteps(n);
		
		
		System.out.println(ar);


	}
}

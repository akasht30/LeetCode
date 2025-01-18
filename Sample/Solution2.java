import java.util.*;
class Solution2 {
	public static int maximumWealth(int[][] accounts) {
        
		int maximumWealthSoFar=0;
		
		for(int[] customers :accounts) {
			int currentCustomerWealth=0;
			
			for( int bank:customers) {
			
			currentCustomerWealth=currentCustomerWealth+bank;
			
			}
			
			maximumWealthSoFar=Math.max(maximumWealthSoFar,currentCustomerWealth);
			
		}
		
		return maximumWealthSoFar;
		
	}
	public static void main(String[] args ){

		int[][] ar={{1,2,3},{3,2,1}};
		
		int sum=maximumWealth(ar);
		System.out.println(sum);


	}
}

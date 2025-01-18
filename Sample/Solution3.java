import java.util.*;
class Solution3 {
	 public static List<String> fizzBuzz(int n) {
		 
		 List<String>  ac=new ArrayList<>(n);
		 
		for(int i=1;i<=n;i++) {
			
			if( i%3==0 && i%5 ==0) {
				ac.add("FizzBuzz");
			}
			else if( i%3==0) {
				ac.add("Fizz");
			}
			else if(i%5 == 0) {
				ac.add("Buzz");
			}
			else {
				ac.add(String.valueOf(i));
			}
		}
        
		return ac;
		
		
	}
	public static void main(String[] args ){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		List<String> ar= fizzBuzz(n);
		
		
		System.out.println(ar);


	}
}

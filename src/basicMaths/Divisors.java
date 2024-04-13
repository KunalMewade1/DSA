package basicMaths;

public class Divisors {
	public static void printDivisorsBruteforce(int n)
    {
   	 System.out.println("the divisors of "+n+"are");
   	 for(int i=1;i<=n;i++) {
   		 if(n%i==0)
   		 {
   			 System.out.print(i+" ");
   		 }
   		// System.out.println();
   	 }
   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=36;
		printDivisorsBruteforce(n);
         
	}

}

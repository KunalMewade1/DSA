package basicMaths;

public class CountDigits {
	public static int countDigits(int n) {
		int x=n;
		int count=0;
		while(x!=0) {
			x=x/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12345;
		System.out.println("number of digits in" + n + " is " +countDigits(n)); 
	}

}

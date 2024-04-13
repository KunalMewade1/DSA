package basicMaths;

public class CountDigits2 {
	public static int countDigits(int n) {
		String n2=Integer.toString(n);
		return n2.length();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		System.out.println("number of digits in " + n + " is " +countDigits(n));

	}

}

package basicMaths;

public class GCDOptimal {
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4, b=8;
		int ans=gcd(a, b);
		System.out.println("The gcd of the two nunber is "+ans);

	}

}

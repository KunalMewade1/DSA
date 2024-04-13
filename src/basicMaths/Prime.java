package basicMaths;

public class Prime {

	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		boolean ans=isPrime(n);
		if(n!=1&& ans==true)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Non prime");
		}

	}

}

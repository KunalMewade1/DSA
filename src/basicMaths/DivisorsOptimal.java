package basicMaths;

public class DivisorsOptimal {
	public static void printDivisorsOptimal(int n)
	{
		System.out.println("the divisors of "+n+" are ");
		for(int i=1;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
			if(i!=n/i)
			{
				System.out.print(n/i+" ");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDivisorsOptimal(36);
	}

}

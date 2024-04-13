package basicMaths;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=3,num2=6;
		int ans=1;
		for(int i=1;i<=Math.min(num1, num2);i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				ans=i;
			}
			
		}
            System.out.println("The GCD of two number is " +ans);
	}

}

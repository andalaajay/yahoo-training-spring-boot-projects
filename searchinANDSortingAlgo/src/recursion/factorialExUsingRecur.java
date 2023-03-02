package recursion;

public class factorialExUsingRecur {
	public static int result=1;
	public static void main(String args[])
	{
		System.out.println(fact(5));
		System.out.println(fact(10));
	}
	
	public static int fact(int n)
	{
		if(n>=1)
		{	
			result=result*n;
			return fact(n-1);
		}
		return result;
	}

}

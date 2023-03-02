package dataStructures;

import java.util.Scanner;

public class Test {
	
	public static void main(String args[])
	{
//		long start=System.currentTimeMillis();
//		int a=10+20;
//		System.out.println(a);
//		long end=System.currentTimeMillis();
//		System.out.println(start+"--"+end);
		//swapping of two numbers using two variables
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		System.out.println("before swapping"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping"+a+" "+b);
		
		
	}
	
	

}

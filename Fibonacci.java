package java1;

import java.util.Scanner;
//generation of fibonacci series
public class Fibonacci {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.println("Enter count of  numbers in fibonacci series");
		n=s.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}

package java1;

import java.util.Scanner;

public class PrimeNumber {
	static Scanner s=new Scanner(System.in);
//given no is prime no or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Enter any number");
n=s.nextInt();
int f=0;
if(n<=1)
	System.out.println(n+" is not a prime number");
else
{
for(int i=2;i*i<n;i++)
{
	if(n%i==0)
		{System.out.println(n+" is not a prime number");
		f=1;
		break;
		}
}
if(f==0)
	System.out.println(n+" is  a prime number");
	
}

	}

}

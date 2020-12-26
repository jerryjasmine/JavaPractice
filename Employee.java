package java1;

import java.util.Scanner;

public class Employee {
	static Scanner s=new Scanner(System.in);
	String name,address;
	int yr;
	float sal;
	Employee(int a)
	{
		System.out.println("Enter the name of Employee "+a);
		name=s.next();
		System.out.println("Enter the year of joining of Employee "+a);
		yr=s.nextInt();
		System.out.println("Enter the salary of Employee "+a);
		sal=s.nextFloat();
		System.out.println("Enter the address of Employee "+a);
		address=s.next();
		System.out.println();
		display(a);
	}
	public void display(int b)
	{
		System.out.println("employee "+b);
		System.out.println("name: "+name);
		System.out.println("year of joining: "+yr);
		System.out.println("salary: "+sal);
		System.out.println("address: "+address);
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number of employees: ");
		n=s.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee(i+1);
		}
		

	}

}

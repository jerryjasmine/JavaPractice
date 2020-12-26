package java1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SwitchCase program..\n Enter 1.hi  2. hello  3.hey");
		int ch;
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:System.out.println("hi");break;
		case 2:System.out.println("hello");break;
		case 3:System.out.println("hey");break;
		default:System.out.println("invalid choice");
		}

	}

}

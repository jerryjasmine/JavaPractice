package java1;

import java.util.*;

public class MinToYrsAndDays {
//converting minutes to years and days
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long  t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the minutes: ");
		t=s.nextLong();
		int yrs=(int)(t/525600);
		int days=(int)(t/1440)%365;
		System.out.println("years : "+yrs+"\nDays: "+days);
		
		
		
		

	}

}

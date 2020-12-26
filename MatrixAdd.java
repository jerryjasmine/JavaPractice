package java1;

import java.util.Scanner;

public class MatrixAdd {
	static Scanner s=new Scanner(System.in);
	int r1,c1,r2,c2;
	int mat1[][],mat2[][];
	 MatrixAdd()
	{int f=0,f1=0;
		 System.out.println("Enter number of rows of first matrix");
			r1=s.nextInt();
			System.out.println("Enter number of columns of first matrix");
			c1=s.nextInt();
			 System.out.println("Enter number of rows of second matrix");
				r2=s.nextInt();
				System.out.println("Enter number of columns of second matrix");
				c2=s.nextInt();
				if(r2!=c1)
					System.out.println("multiplication can't be done on these matrices");
				else
					f=1;
				 if(r1!=r2 || c1!=c2)
					System.out.println("Addition can't be done on these matrices");
				 else
					 f1=1;
				 if(f==1 || f1==1)
				 {
			System.out.println("Enter data for first matrix");
			mat1=getData(r1,c1);
			System.out.println("Enter data for second matrix");
			mat2=getData(r2,c2);
			if(f==1)
				product();
			if(f1==1)
				add();
				 }
	
	}
	public int[][] getData(int r,int c)
	{int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		return a;
	}
	public void add()
	{int ans[][]=new int[r1][c1];
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				ans[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("Addition of 2 matrices : ");
		
		display(ans);
	
		
		
	}
	public void product()
	{
		int ans[][]=new int[r1][c2];
		
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
				
			{
				ans[i][j]=0;
				for(int k=0;k<r2;k++)
				{
					ans[i][j]=ans[i][j]+(mat1[i][k]*mat2[k][j]);
				}
			}
		}
		System.out.println("multiplication of 2 matrices : ");
		
		display(ans);
		}
		
	
	public void display(int [][]disp)
	{
		for(int i=0;i<disp.length;i++)
		{
			for(int j=0;j<disp[0].length;j++)
			{

System.out.print(disp[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] addans;
		MatrixAdd obj=new MatrixAdd();
	}

}

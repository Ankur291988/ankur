package Concepts;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		pattern1();
		//pattern2();
	}
public static void pattern1(){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int row = obj.nextInt();
	for(int i=row;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			if(j%2==0){
				System.out.print(0);}
			else
			{System.out.print(1);
			}
				}
		System.out.println();
	}
	
}
}

package Concepts;

import java.util.Random;

public class randon {

	public static void main(String[] args) {
		int [] array = new int[10];
		
		Random rnd = new Random();
		for(int i=0;i<5;i++)
		{
			array[i]=rnd.nextInt(200);
			System.out.println(array[i]);
		}
		// TODO Auto-generated method stub
System.out.println("Third random number is :" +array[2]);
	}

}

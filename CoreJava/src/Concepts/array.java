package Concepts;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter the number");
		for (int i =0;i<5;i++){
			array[i]=in.nextInt();
			System.out.println("number is:" +array[i]);
		}

	}

}

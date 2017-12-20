package com.practice;



public class Example {

	public static void main(String[] args) {

String abc = "Ankur";
char[] temp = abc.toCharArray();
int length = abc.length()-1;
for(int i=0;i<length;i++,length--){
	char temp1 = temp[i];
	temp[i]=temp[length];
	temp[length]= temp1;
}
	for(char c : temp)
		System.out.print(c);
	System.out.println();

	}

}


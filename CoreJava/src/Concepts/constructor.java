package Concepts;

public class constructor {
 private int i;
 private char c;
 public constructor(){
	 i=10;
	  }
 public constructor(int j){
	 i=j;}
 public constructor(int j,char c){
	 i=j+1;
	 }
public int getValue(){
	return i;
	}
public static void main(String[] args){
		constructor obj = new constructor(77,'A');
		obj.getValue();
		System.out.println(+obj.getValue());
		
	}
}


package Concepts;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj = new ArrayList <String>();
		obj.add("Ankur");
		obj.add(1,"Anku");
		obj.add("Ank");
		obj.add("An");
		obj.set(3, "An");
		obj.add("A");
		for(String temp : obj){
			System.out.println(temp);
		}
		
		

	}

}

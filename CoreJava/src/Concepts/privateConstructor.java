package Concepts;

public class privateConstructor {
	
	private static privateConstructor obj=null;
	private privateConstructor(){
		
	}
public static privateConstructor objectCreationMethod(){
	if (obj==null) {
		obj=new privateConstructor();
			}
	return obj;
}
public void display(){
	System.out.println("Worked");
}
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		privateConstructor myobj = privateConstructor.objectCreationMethod();
		myobj.display();
	}

}
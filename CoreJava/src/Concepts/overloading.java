package Concepts;

public class overloading {
			public void disp(int i){
				System.out.println(i);
			}
			public void disp(char c){
				System.out.println(c);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading obj = new overloading();
		obj.disp(5);
		obj.disp('A');
	}

	
}
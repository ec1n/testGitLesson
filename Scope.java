
public class Scope {

	public static void main(String[] args) {

		int x; 
		x = 10;
		if(x == 10) 
			{ 
		int у = 20; 
		System.out.println("х и у: " + x + " " + у) ; x = у * 2;
			}
		
		// int y = 100; 

		System.out.println("х равна " + x);
		// System.out.println("х равна " + y);
	}

}

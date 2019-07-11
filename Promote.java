
public class Promote {

	public static void main(String[] args) {
		
		byte b = 42;
		char с = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / с) - (d * s);
		System.out.println((int)с);
		System.out.println((f * b) + " + " + (i / с) + " — " + (d * s)); 
		System.out.println("result = " + result);
		
		int character = 97;    
		char ascii = (char) character;
		System.out.println(ascii);
	}

}

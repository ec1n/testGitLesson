import java.util.Arrays;

public class Lesson4 {

	public static void main(String[] args) {
		
		String[] strings = {"abc", "y", "op", "bcd", "z"};
		System.out.println(Arrays.toString(strings));
		
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		Arrays.sort(strings, Lesson4::reverse);
		System.out.println(Arrays.toString(strings));
	}

	public static int reverse(String str1, String str2) {
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		if (str1.length() > str2.length()) {
			return 1;
		}	else  if (str1.length() == str2.length()) { 
			return str1.compareToIgnoreCase(str2);
		}	else {
			return -1;
		}
	}
}

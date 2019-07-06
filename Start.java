import java.util.Scanner;
 
public class Start { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введити 6-ти значное число: ");
			int i = sc.nextInt();
			int x1 = i/100000;
			int x2 = (i%100000)/10000;
			int x3 = (i%10000)/1000;
			int x4 = (i%1000)/100;
			int x5 = (i%100)/10;
			int x6 = (i%10);
			System.out.println(x1);
			System.out.println(x2);
			System.out.println(x3);
			System.out.println(x4);
			System.out.println(x5);
			System.out.println(x6);
		
    }   
}

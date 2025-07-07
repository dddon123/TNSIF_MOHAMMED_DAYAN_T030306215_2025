package HELLOWORLD;

import java.util.Scanner;

public class THREE_VARIABLES {
	
	public static void main(String[] args) {
	
		
		int d;
		int e;
		
			Scanner scan = new Scanner(System.in);
			
			int a = scan.nextInt();
			scan.nextLine();
			int b = scan.nextInt();
			scan.nextLine();
			int c = scan.nextInt();
			
			d = a * b * c;
			
			e = a + b + c;
			
			System.out.println(d);
			System.out.println(e);
			System.out.print(d/e);
	}
	

}

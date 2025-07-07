package HELLOWORLD;
import java.util.Scanner;

public class Name_Age {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine();
		String c = scan.nextLine();	
		int b = scan.nextInt();
			
		System.out.println(" Name " + a);
		System.out.println(" Age " + b);
		System.out.print(" Address " + c);
	
	}

}

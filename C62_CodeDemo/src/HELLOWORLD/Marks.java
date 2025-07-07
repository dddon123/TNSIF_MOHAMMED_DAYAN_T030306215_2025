package HELLOWORLD;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		int Mark = Scan.nextInt();
		
		if (Mark >= 35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}

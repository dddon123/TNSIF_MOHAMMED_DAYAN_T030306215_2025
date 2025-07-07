package HELLOWORLD;

import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int Income = Scan.nextInt();
		
		if (Income >= 7000) {
			System.out.println(" Scholarship is availble ");
		} else {
			System.out.print("Not eligible for scholarship");
		}
	}
}

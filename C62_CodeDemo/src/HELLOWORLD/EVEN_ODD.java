package HELLOWORLD;

import java.util.Scanner;

public class EVEN_ODD {
public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int number = Scan.nextInt();
				
				if (number%2 == 0) {
			System.out.print("its even number");
		}
		
		else {
			System.out.print("its odd number");
		}
		
}
}

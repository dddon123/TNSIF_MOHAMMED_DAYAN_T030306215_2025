package HELLOWORLD;

import java.util.Scanner;

public class Division_sum {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int divisible = Scan.nextInt();
				
				if (divisible %  3 == 0 && divisible % 5 == 0) {
			System.out.print("the number is divisible by 3 and 5");
		}
		
		else {
			System.out.print("the number is not divisible by 3 and 5");
		}
		
		
		
		
		
	}


}

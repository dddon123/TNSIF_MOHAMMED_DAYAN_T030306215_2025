package HELLOWORLD;

import java.util.Scanner;

public class Score_ifelse {
public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int Score = Scan.nextInt();
				
				if (Score<50) {
			System.out.print("You need to imporve");
		}
		else if (Score >= 50 && Score <= 70){
			System.out.print("Good Job");
		}
		else if(Score > 70){
			System.out.print("Excellent Performance");
		
}
}
}
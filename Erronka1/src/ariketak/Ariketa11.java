package ariketak;

import java.util.Scanner;

public class Ariketa11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu 2 zenbaki osoak:");
		int zbk1 = sc.nextInt();
		int zbk2 = sc.nextInt();

		float batura = zbk1+zbk2;
		System.out.println("Hau da batezbesteko aritmetikoa:" + batura/2);
		
		
		sc.close();
	}
}

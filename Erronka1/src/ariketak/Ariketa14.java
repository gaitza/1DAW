package ariketak;

import java.util.Scanner;

public class Ariketa14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sartu bi zenbaki osoak: ");

		int zbk1 = sc.nextInt();
		int zbk2 = sc.nextInt();


		int batuketa = zbk1 + zbk2;
		int kenketa = zbk1 - zbk2;
		int biderketa = zbk1 * zbk2;
		
		System.out.println("Bi zenbakien batuketa " + batuketa + " da.");
		System.out.println("Bi zenbakien kenketa " + kenketa + " da.");
		System.out.println("Bi zenbakien biderketa " + biderketa + " da.");
		
		if (zbk2 == 0) {
			System.out.println("Zenbakien arteko zatiketa infinitoa da:");
		} else {
			System.out.print("Bi zenbakien zatiketa " + (zbk1/zbk2) + " da.");
		}
		
		sc.close();
		
	}

}

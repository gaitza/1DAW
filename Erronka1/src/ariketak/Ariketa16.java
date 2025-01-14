package ariketak;

import java.util.Scanner;

public class Ariketa16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Sartu bi zenbaki:");
		float zbk1 = sc.nextInt();
		float zbk2 = sc.nextInt();
		int opc;

		do {
			System.out
					.println("\n 1.Batuketa \n 2.Kenketa \n 3.Biderketa \n 4.Zatiketa \n 5.Atera");
			opc = sc.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Batuketa " + (zbk1 + zbk2) + " ematen du.");
				break;
			case 2:
				System.out.println("Kenketa " + (zbk1 - zbk2) + " ematen du.");
				break;
			case 3:
				System.out.println("Biderketa " + (zbk1 * zbk2) + " ematen du.");
				break;
			case 4:
				System.out.println("Zatiketa " + (zbk1 / zbk2) + " ematen du.");
				break;
			case 5:
				System.out.println("Aguur");
				break;

			default:
				break;
			}
		} while (opc != 5);
		sc.close();
	}

}

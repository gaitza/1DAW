package ariketak;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] zbk1 = new int[5];
		int[] zbk2 = new int[5];
		int[] batuketa = new int[5];

		System.out.println("Sartu lehenengo array-aren 5 zenbaki osoak:");
		for (int i = 0; i < zbk1.length; i++) {
			System.out.print((i + 1) + ". zenbakia: ");
			zbk1[i] = sc.nextInt();
		}

		System.out.println("Sartu bigarren array-aren 5 zenbaki osoak:");
		for (int i = 0; i < zbk2.length; i++) {
			System.out.print((i + 1) + ". zenbakia: ");
			zbk2[i] = sc.nextInt();
		}

		for (int i = 0; i < batuketa.length; i++) {
			batuketa[i] = zbk1[i] + zbk2[i];
		}

		System.out.println("Hirugarren array-aren balioak (batuketa):");
		for (int i = 0; i < batuketa.length; i++) {
			System.out.println("Elementu " + (i + 1) + ": " + batuketa[i]);
		}

		sc.close();
	}

}

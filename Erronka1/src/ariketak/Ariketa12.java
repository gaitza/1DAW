package ariketak;

import java.util.Scanner;

public class Ariketa12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu zenbaki bat:");
		int zbk = sc.nextInt();
		boolean erantzuna = true;
		if (zbk >= 50 && zbk <= 100) {
			System.out.println("Zenbakia 50 eta 100 artean dago? " + erantzuna);
		} else {
			erantzuna = false;
			System.out.println("Zenbakia 50 eta 100 artean dago? " + erantzuna);
		}

		sc.close();
	}
}

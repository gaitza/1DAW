package ariketak;

import java.util.Scanner;

public class proba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Array Sortu
		int[] zenbakiak = new int[5];
		// Batuketa, Kenketa, Biderketa
		int batuketa = 0;
		int kenketa = 0;
		int biderketa = 1;
		// Baloreak Array-ean sartu
		System.out.println("Sartu 5 zenbaki:");

		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = sc.nextInt();
			// Batuketa egin
			batuketa = batuketa + zenbakiak[i];
			// Kenketa egin
			kenketa = kenketa - zenbakiak[i];
			// Biderketa egin
			biderketa = biderketa * zenbakiak[i];
		}

		int txikiena = zenbakiak[0];
		int handiena = zenbakiak[0];

		// Komprobatu Balore Txikiena eta Handiena
		for (int j = 0; j < zenbakiak.length; j++) {
			if (zenbakiak[j] < txikiena) {
				txikiena = zenbakiak[j];
			}
			if (zenbakiak[j] > handiena) {
				handiena = zenbakiak[j];
			}

		}
		System.out.println("Zenbaki txikiena " + txikiena + " da.");
		System.out.println("Zenbaki handiena " + handiena + " da.");
		System.out.println("Zenbakien batuketa " + batuketa + " da.");
		System.out.println("Zenbakien kenketa " + kenketa + " da.");
		System.out.println("Zenbakien biderketa " + biderketa + " da.");

	}

}

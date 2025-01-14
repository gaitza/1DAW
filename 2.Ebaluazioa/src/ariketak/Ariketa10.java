package ariketak;

import java.util.Scanner;

public class Ariketa10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Sortu 3x3 array
		int[][] matriz = new int[3][3];

		System.out.println("Sartu 9 zenbaki:");
		// 2. Bete array-a 1-9 zenbakiekin
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// 3. Bistaratu array-a lehenengo matrizearen formatua
		System.out.println("Matrizea lehenengo:");
		imprimirMatriz(matriz);

		// 4. Eguneratu array-a
		int[][] eguneratutakoMatriz = { { 00, 01, 02 }, { 10, 11, 12 }, { 20, 21, 22 } };

		// 5. Bistaratu array-a eguneratutako formatuan
		System.out.println("\nMatrizea eguneratutako:");
		imprimirMatriz(eguneratutakoMatriz);

		sc.close();
	}

	// Matrizea inprimatzeko metodoa
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); // Errenkada berria
		}
	}

}

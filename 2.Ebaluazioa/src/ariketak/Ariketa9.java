package ariketak;

import java.util.Scanner;

public class Ariketa9 {

	public static void main(String[] args) {

		arrayak();

	}

	public static int[] arrayak() {

		int[] array1 = new int[6];

		int[] array2 = new int[6];

		Scanner sc = new Scanner(System.in);

		System.out.println("Sartu hemen 6 zenbaki: ");

		for (int i = 0; i < 6; i++) {

			array1[i] = sc.nextInt();

		}

		System.out.println("Sartu premiatutako 6 zenbaki: ");

		for (int i = 0; i < 6; i++) {

			array2[i] = sc.nextInt();

		}

		int berdinak = 0;

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array1.length; j++) {

				if (array1[i] == array2[j]) {

					berdinak = berdinak + 1;

				}

			}

		}

		System.out.println("Asmatutako zenbaki kopurua: " + berdinak);

		return null;

	}

}

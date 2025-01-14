package ariketak;

import java.util.Arrays;
import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Variables
		int n = 5;
		String[] arrayOriginal = new String[5];
		System.out.println("Sartu 5 hitz:");

		for (int i = 0; i < arrayOriginal.length; i++) {
			arrayOriginal[i] = sc.nextLine();
		}
		// Listamos los caracteres introducidos
		System.out.print("Sartu dituzun hitzak: ");
		for (int i = 0; i < arrayOriginal.length; i++) {
			if (i < 4) {
				System.out.print(arrayOriginal[i] + ", ");
			} else {
				System.out.print(arrayOriginal[i] + ". ");
			}
		}
		String[] arrayInvertido = new String[5];

		for (int i = 0; i < 5; i++) {
			arrayInvertido[i] = arrayOriginal[n - 1 - i];
		}
		// Listamos los caracteres ordenados
		System.out.print("\n" + "Los numeros invertidos son: ");
		for (int i = 0; i < 5; i++) {
			if (i < 4) {
				System.out.print(arrayInvertido[i] + ", ");
			} else {
				System.out.print(arrayInvertido[i] + ". ");
			}
		}

	}

}

package ariketak;

import java.util.Scanner;

public class ArrayRepaso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Array Sortu
		int[] zenbakiak = new int [10];

		//Baloreak Array-ean sartu
		System.out.println("Sartu 10 zenbaki:");
		
		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = sc.nextInt();
		}
		
		int txikiena = zenbakiak[0];
		int handiena = zenbakiak[0];
		
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
		
	}
}

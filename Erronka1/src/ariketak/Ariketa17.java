package ariketak;

import java.util.Scanner;

public class Ariketa17 {
	public static void marraztuTriangeluaGorantz(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void marraztuBeheranzkoTriangelua(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void marraztuPiramideGorantz(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void marraztuPiramideaBeheranzkoa(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void marraztuPiramideOsoa(int n) {
		marraztuPiramideGorantz(n);
		marraztuPiramideaBeheranzkoa(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opc;
		boolean apa = true;
		
		do {
			System.out.println("\n 1. \n 2. \n 3. \n 4. \n 5. ");
			opc = sc.nextInt();
			
			
				switch (opc) {
				case 1:
					System.out.println("1:");
					marraztuTriangeluaGorantz(5);
					break;
				case 2:
					System.out.println("\n2:");
					marraztuBeheranzkoTriangelua(5);
					break;
				case 3:
					System.out.println("\n3:");
					marraztuPiramideGorantz(6);
					break;
				case 4:

					System.out.println("\n4:");
					marraztuPiramideaBeheranzkoa(6);
					break;
				case 5:

					System.out.println("\n5:");
					marraztuPiramideOsoa(6);
					break;

				default:
					
					break;
				}
				
			
			System.out.println("Deseas elegir otra opcion: (S/N)");
			char a = sc.next().charAt(0);
			if (a == 'S') {

				apa = true;
			} else {
				apa = false;
			}
		} while (apa == true);

		System.out.println("Agurrrr.");
		sc.close();

	}

}

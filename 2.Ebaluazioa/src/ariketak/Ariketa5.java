package ariketak;

import java.util.Scanner;

public class Ariketa5 {
	// Array batean dagoen baliorik handiena kalkulatzen duen funtzioa
	public static int max(int t[]) {
		// Hasierako balioa arrayko lehen elementua izango da
		int maxValue = t[0];
		for (int i = 1; i < t.length; i++) {
			if (t[i] > maxValue) {
				maxValue = t[i];
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zenbatekoa nahi duzu Array izatea:");
		int n = sc.nextInt();
		// Adibideko arraya
		int[] zbk = new int[n];
		
		System.out.println("Sartu " + n + " zenbaki:");
		for (int i = 0; i < zbk.length; i++) {
			System.out.print((i + 1) + ". zenbakia: ");
			zbk[i] = sc.nextInt();
		}
		
		// Baliorik handiena kalkulatu
		int maxValue = max(zbk);

		// Emaitza pantailan bistaratuko da
		System.out.println("Arrayko baliorik handiena: " + maxValue);
	}
}

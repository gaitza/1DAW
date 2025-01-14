package ariketak;

import java.util.Scanner;

public class Ariketa10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu 5 zenbaki:");
		float zbk1 = sc.nextFloat();
		float zbk2 = sc.nextFloat();
		float zbk3 = sc.nextFloat();
		float zbk4 = sc.nextFloat();
		float zbk5 = sc.nextFloat();

		float batura = zbk1+zbk2+zbk3+zbk4+zbk5;
		System.out.println("Hau da bost zenbakien batura:" + batura);
		System.out.println("Hau da batezteskeo:" + batura/5);
		
		sc.close();
	}
}

package ariketak;

import java.util.Scanner;

public class Ariketa09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu 3 zenbaki:");
		int zbk1 = sc.nextInt();
		int zbk2 = sc.nextInt();
		int zbk3 = sc.nextInt();

		if (zbk1 > zbk2 && zbk1 > zbk3) {
		
			System.out.println(zbk1 + " Zenbaki handiena da");
		
		}else if (zbk2 > zbk1 && zbk2 > zbk3) {
		
			System.out.println(zbk2 + " Zenbaki handiena da");
		
		}else {
		
			System.out.println(zbk3 + " Zenbaki handiena da");
		
		}
		
		if (zbk1 < zbk2 && zbk1 < zbk3) {
			
			System.out.println(zbk1 + " Zenbaki txikiena da");
		
		}else if (zbk2 < zbk1 && zbk2 < zbk3) {
		
			System.out.println(zbk2 + " Zenbaki txikiena da");
		
		}else {
		
			System.out.println(zbk3 + " Zenbaki txikiena da");
		
		}
		sc.close();
	}

}
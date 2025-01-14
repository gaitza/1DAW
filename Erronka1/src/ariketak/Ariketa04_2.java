package ariketak;

import java.util.Scanner;

public class Ariketa04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable
		int urtea;
		System.out.println("Ze urtetan jaio zara?");
		urtea = sc.nextInt();
		System.out.println(2024 - urtea);
		sc.close();
	}
	
}
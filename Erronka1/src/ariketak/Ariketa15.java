package ariketak;

import java.util.Scanner;

public class Ariketa15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sartu urte bat: ");
		int urtea = sc.nextInt();
		
		if (urtea % 4 == 0) {
			if (urtea % 100 == 0) {
				if (urtea % 400 == 0) {
					System.out.println(urtea + " Bisurtea da.");
				} else  {
					System.out.println(urtea + " Ez da Bisurtea.");
				}
			}else  {
				System.out.println(urtea + " Bisurtea da.");
			}
		} else {
			System.out.println(urtea + " Ez da Bisurtea da.");
		}

		sc.close();
		
	}

}

package ariketak;

import java.util.Scanner;

public class Ariketa13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu zirkunferentzia baten erradioa:");
		double erradioa = sc.nextFloat();
		
		double Perimetroa = (2 * Math.PI * erradioa);
		double Azalera =  (Math.PI * Math.pow(erradioa, 2));
		double Bolumena = (4*Math.PI*Math.pow(erradioa, 3)/3);
		
		System.out.println("Zirkunferentziaren perimetroa: " + Perimetroa + " da.");
		System.out.println("Zirkunferentziaren azalera: " + Azalera + " da.");
		System.out.println("Esferaren bolumena: " + Bolumena + " da.");
	
		sc.close();
	}
}

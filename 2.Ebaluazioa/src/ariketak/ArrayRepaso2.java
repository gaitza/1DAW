package ariketak;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRepaso2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Kontadorea
		System.out.println("Zenbat zenbaki sartuko dituzu?");
		int contador = sc.nextInt();
		
		//Array Sortu
		ArrayList<Integer> zenbakiak = new ArrayList<>();

		//Baloreak Array-ean sartu
		System.out.println("Sartu " + contador + " zenbaki:");
		
		for (int i = 0; i < contador; i++) {
			zenbakiak.add(i, sc.nextInt());
		}
		
		
		int txikiena = zenbakiak.getFirst();
		int handiena = zenbakiak.getFirst();
		
		for (int j = 0; j < contador; j++) {
			if (zenbakiak.get(j) < txikiena) {
				txikiena = zenbakiak.get(j);
			}
			if (zenbakiak.get(j) > handiena) {
				handiena = zenbakiak.get(j);
			}
			
		}
		
		System.out.println("Zenbaki txikiena " + txikiena + " da.");
		System.out.println("Zenbaki handiena " + handiena + " da.");
		
	}
}

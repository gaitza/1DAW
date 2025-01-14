package ariketak;

import java.util.Scanner;

public class Ariketa06 {
	public static void main(String[] args) {
		//Escanerra hasi
		Scanner sc = new Scanner(System.in);
		//Balorea definitu
		Short valor;
		//Zenbakia eskatu eta bat gehitu
		System.out.println("Sartu valio bat");
		valor = sc.nextShort();
		valor++;
		//Zenbakia pantailatik atera
		System.out.println(valor);
		//Escanerra itxi
		sc.close();
	}
}

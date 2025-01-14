package clases;

import java.util.Scanner;

public class KlaseNagusia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Sortu objetuak bere informazioarekin
		// Lehen objetua
		Ikaslea ikaslea1 = new Ikaslea("Mark", "a", 10, "689532147", "Calle 1");

		// Bigarren objetua
		Ikaslea ikaslea2 = new Ikaslea("Paolo", "b", 9.19, "689532147", "Calle 2");

		// Hirugarren objetua
		Ikaslea ikaslea3 = new Ikaslea("Darwin", "c", 7.7, "689532147", "Calle 3");

		// Laugarren objetua
		Ikaslea ikaslea4 = new Ikaslea("Andrew", "d", 8.8, "689532147", "Calle 4");

		// Bosgarren objetua
		Ikaslea ikaslea5 = new Ikaslea("Lia", "e", 6, "689532147", "Calle 5");

		// Seigarren objetua
		Ikaslea ikaslea6 = new Ikaslea("Torres", "f", 5, "689532147", "Calle 6");

		// Zazpigarren objetua
		Ikaslea ikaslea7 = new Ikaslea("Victor", "g", 7, "689532147", "Calle 7");

		// Zortzigaren objetua
		Ikaslea ikaslea8 = new Ikaslea("Ulrick", "h", 6.2, "689532147", "Calle 8");

		// Bederratzigarren objetua
		Ikaslea ikaslea9 = new Ikaslea("Erico", "i", 9, "689532147", "Calle 9");

		// Hamargarren objetua
		Ikaslea ikaslea10 = new Ikaslea("Gaizka", "j", 9.87, "689532147", "Calle 10");

		// Ikasleak pantailatik atera
		System.out.println(ikaslea1);
		System.out.println(ikaslea2);
		System.out.println(ikaslea3);
		System.out.println(ikaslea4);
		System.out.println(ikaslea5);
		System.out.println(ikaslea6);
		System.out.println(ikaslea7);
		System.out.println(ikaslea8);
		System.out.println(ikaslea9);
		System.out.println(ikaslea10);
		

	}

}

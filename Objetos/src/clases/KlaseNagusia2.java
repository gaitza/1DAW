package clases;

import java.util.Scanner;

public class KlaseNagusia2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Zenbat ikasle
		System.out.println("Zenbat ikasle sartu nahi dituzu? ");
		int kopurua = sc.nextInt();
		sc.nextLine();

		// Arraya Sortu
		Ikaslea[] ikasleak = new Ikaslea[kopurua];

		// Datuak teklatutik eskatu
		for (int i = 0; i < kopurua; i++) {
			System.out.println("\n[" + (i + 1) + ". ikaslea]");

			System.out.println("Izena: ");
			String izena = sc.nextLine();

			System.out.println("Abizena: ");
			String abizena = sc.nextLine();

			System.out.println("Nota Media: ");
			double notaMedia = sc.nextDouble();

			System.out.println("Telefono: ");
			String telefonoa = sc.nextLine();

			System.out.println("Helbidea: ");
			String helbidea = sc.nextLine();

			// Objetua sortu seterrekin
			Ikaslea ikaslea = new Ikaslea(izena, abizena, notaMedia, telefonoa, helbidea);
			ikaslea.setIzena(izena);
			ikaslea.setAbizena(abizena);
			ikaslea.setNotaMedia(notaMedia);
			ikaslea.setTelefonoa(telefonoa);
			ikaslea.setHelbidea(helbidea);

			// Gorde objetua arrayan
			ikasleak[i] = ikaslea;
		}

		// Erakutsi informazioa

		System.out.println("\n Ikasleen informazioa");
		for (int i = 0; i < kopurua; i++) {
			System.out.println("\n[" + (i + 1) + ". ikaslea]");

			System.out.println("\n" + ikasleak[i].getIzena());
			System.out.println("\n" + ikasleak[i].getAbizena());
			System.out.println("\n" + ikasleak[i].getNotaMedia());
			System.out.println("\n" + ikasleak[i].getTelefonoa());
			System.out.println("\n" + ikasleak[i].getHelbidea());

		}

	}

}

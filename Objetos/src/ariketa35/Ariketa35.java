package ariketa35;

import java.util.Scanner;

public class Ariketa35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kotxea[] k = new Kotxea[2];
		Kamioia[] ka = new Kamioia[2];
		for (int i = 0; i < 2; i++) {
			k[i] = new Kotxea();
			System.out.print("Kotxearen Marka: ");
			k[i].setMarka(sc.next());
			System.out.print("Kotxearen Modeloa: ");
			k[i].setModeloa(sc.next());
			System.out.print("Mota ");
			k[i].setMota(sc.next());
			System.out.print("Bidaiari kopurua ");
			k[i].setBidaiariKop(sc.nextInt());
			System.out.print("Segurtasun maila ");
			k[i].setSegurMaila(sc.nextInt());
		}
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i].toString());
		}

		for (int i = 0; i < 2; i++) {
			ka[i] = new Kamioia();
			System.out.print("Kotxearen Marka: ");
			ka[i].setMarka(sc.next());
			System.out.print("Kotxearen Modeloa: ");
			ka[i].setModeloa(sc.next());
			System.out.print("Karga Mota ");
			ka[i].setKargaMota(sc.next());
			System.out.print("Pisu maximoa ");
			ka[i].setPisuMax(sc.nextInt());
			System.out.print("Segurtasun maila ");
			ka[i].setBolumena(sc.nextInt());
		}

		for (int i = 0; i < k.length; i++) {
			System.out.println(ka[i].toString());
		}

	}
}
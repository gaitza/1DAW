package clases;

import java.util.Scanner;

import ariketa35.Kamioia;
import ariketa35.Kotxea;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Persona Persona p = new Persona("Ana", 26); p.saludar();
		 */

		/*
		 * Produktua System.out.println("Prezioa: "); int prezioa = sc.nextInt();
		 * System.out.println("Beherapena: "); int beherapena = sc.nextInt();
		 * 
		 * // Objetua sortu seterrekin Produktua produktua1 = new Produktua(prezioa,
		 * beherapena); produktua1.setPrezioa(prezioa);
		 * produktua1.setBeherapena(beherapena);
		 * 
		 * //Hartu baloreak geterrekin produktua1.getPrezioa();
		 * produktua1.getBeherapena();
		 * 
		 * produktua1.mostrar();
		 * 
		 */

		/*
		 * Kontu Korrontea ArrayList<KontuKorrontea> kontuak = new ArrayList<>();
		 * 
		 * // 10 kontu sortu for (int i = 0; i < 10; i++) {
		 * System.out.println("Sartu NAN (" + (i + 1) + ". kontua):"); String nan =
		 * sc.nextLine(); System.out.println("Sartu titularraren izena:"); String
		 * titularra = sc.nextLine();
		 * 
		 * // Kontua sortu KontuKorrontea kontu = new KontuKorrontea(nan, titularra);
		 * kontuak.add(kontu); }
		 * 
		 * // Eragiketak for (KontuKorrontea kontu : kontuak) { kontu.diruaSartu(100);
		 * // Kontu bakoitzari 100€ sartu boolean atera = kontu.diruaAtera(50); // 50€
		 * atera saiatu if (atera) { System.out.println("Dirua atera da kontutik: " +
		 * kontu.lortuInformazioaFitxategirako()); } else {
		 * System.out.println("Ez da posible dirua ateratzea: " +
		 * kontu.lortuInformazioaFitxategirako()); } }
		 * 
		 * // Kontuen informazioa erakutsi for (KontuKorrontea kontu : kontuak) {
		 * kontu.erakutsiInformazioa(); }
		 * 
		 * // Fitxategian gorde try (BufferedWriter writer = new BufferedWriter(new
		 * FileWriter("kontuak.txt"))) { for (KontuKorrontea kontu : kontuak) {
		 * writer.write(kontu.lortuInformazioaFitxategirako()); }
		 * System.out.println("Kontuen datuak kontuak.txt fitxategian gorde dira."); }
		 * catch (IOException e) { System.out.println("Errorea fitxategian idaztean: " +
		 * e.getMessage()); }
		 * 
		 */
		
		/*Ariketa35
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
	*/
		sc.close();
	}

}

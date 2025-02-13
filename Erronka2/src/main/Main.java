package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

import klaseak.BDErabiltzaile;
import klaseak.Erabiltzaile;
import klaseak.ScriptaGeneratu;
import klaseak.XMLSortu;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Kargatu erabiltzaileak eta pasahitzak fitxategitik
		Map<String, String> kontuak = kargatuKontuak("Fitxategiak/kontuak.txt");

		// Autentifikazioa
		if (!autentifikatu(kontuak, sc)) {
			System.out.println("Lau saiakera oker. Saioa amaitu da.");
			sc.close();
			return;
		}

		int resp = 0;

		try {
			do {
				// Menua inprimatu
				System.out.println("\n1. Sortu Erabiltzaile Berria.");
				System.out.println("2. Sortu XML.");
				System.out.println("3. Datu-basea Eguneratu.");
				System.out.println("4. Datuak Erakutsi.");
				System.out.println("5. Itxi Saioa.");
				System.out.print("ELIJA UNA OPCIÓN (1-5): ");

				if (sc.hasNextInt()) {
					resp = sc.nextInt();

					switch (resp) {
					case 1:
						alta();
						break;
					case 2:
						XMLSortu.sortuXML("langile.xml");
						break;
					case 3:
						datuBaseaEguneratu();
						break;
					case 4:
						datuakErakutsi();
						break;
					case 5:
						System.out.println("Agur!");
						break;
					default:
						System.out.println("Sartu behar duzu 1-5 arteko aukera bat.");
					}
				} else {
					System.out.println("Hori ez da zenbaki bat. Saiatu berriz.");
					sc.next();
				}
			} while (resp != 5);
		} catch (Exception e) {
			System.out.println("Errore bat gertatu da: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

	public static void datuBaseaEguneratu() {
		Scanner sc = new Scanner(System.in);
		int resp2 = 0;

		try {
			do {
				System.out.println("\n1. Eremua gehitu.");
				System.out.println("2. Taula eguneratu.");
				System.out.println("3. Atzera joan.");
				System.out.print("ELIJA UNA OPCIÓN (1-3): ");

				if (sc.hasNextInt()) {
					resp2 = sc.nextInt();

					switch (resp2) {
					case 1:
						eremuaGehitu();
						break;
					case 2:
						taulaEguneratu();
						break;
					case 3:
						return;
					default:
						System.out.println("Sartu behar duzu 1-3 arteko aukera bat.");
					}
				} else {
					System.out.println("Hori ez da zenbaki bat. Saiatu berriz.");
					sc.next();
				}
			} while (resp2 != 3);
		} catch (Exception e) {
			System.out.println("Errore bat gertatu da: " + e.getMessage());
		}
	}

	public static void eremuaGehitu() {
		ScriptaGeneratu.eremuaGehitu();
	}

	public static void taulaEguneratu() {
		ScriptaGeneratu.taulaEguneratu();
	}

	public static void datuakErakutsi() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Sartu taula baten izena (adibidez: LANGILE): ");
	    String taulaIzena = sc.nextLine().trim().toLowerCase();

	    String archivoCSV = "Fitxategiak/" + taulaIzena + ".csv"; // CSV artxiboaren ibilbidea

	    try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
	        String linea;
	        boolean lehenengoIllara = true;
	        String[] encabezado = null;

	        // Lerroak irakurri eta erakutsi
	        while ((linea = br.readLine()) != null) {
	            String[] columnas = linea.split(",");
	            if (lehenengoIllara) {
	                encabezado = columnas;  // Goiburukoa gordeko dugu zutabe kopurua jakiteko
	                lehenengoIllara = false;

	                // Sortu formatua dinamikoki zutabe kopuruaren arabera
	                StringBuilder formato = new StringBuilder();
	                for (int i = 0; i < encabezado.length; i++) {
	                    formato.append("%-20s");  // Gure ustez, zutabe bakoitzak 20 karaktereko tamaina finkoa izango du.
	                }
	                // Inprimatu goiburukoa
	                System.out.printf(formato.toString() + "\n", (Object[]) encabezado);
	            } else {
	                // Datuak inprimatu antzemandako formatuaren arabera
	                System.out.printf(generateFormat(encabezado.length) + "\n", (Object[]) columnas);
	            }
	        }

	    } catch (IOException e) {
	        System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
	    }
	}

	// Formatu dinamikoa sortzeko metodo osagarria, zutabe kopuruaren arabera
	private static String generateFormat(int numColumnas) {
	    StringBuilder formato = new StringBuilder();
	    for (int i = 0; i < numColumnas; i++) {
	        formato.append("%-20s");  
	    }
	    return formato.toString();
	}


	public static void alta() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu Erabiltzailearen izena: ");
		String izena = sc.next();

		System.out.print("Sartu Pasahitza: ");
		String pasahitza = sc.next();

		System.out.print("Errepikatu pasahitza: ");
		String berretsitakoPasahitza = sc.next();

		if (!pasahitza.equals(berretsitakoPasahitza)) {
			System.out.println("Pasahitzak ez datoz bat. Erabiltzailea ez da sortu.");
			return;
		}

		Erabiltzaile erabiltzaile = new Erabiltzaile(izena, pasahitza, berretsitakoPasahitza);
		if (BDErabiltzaile.erabiltzaileGorde(erabiltzaile)) {
			System.out.println("Erabiltzailea Sortuta.");
		} else {
			System.out.println("Errorea Erabiltzailea Sortzean.");
		}
	}

	public static Map<String, String> kargatuKontuak(String fitxategia) {
		Map<String, String> kontuak = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fitxategia))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] zatitua = line.split(":");
				if (zatitua.length == 2) {
					kontuak.put(zatitua[0], zatitua[1]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Ez da aurkitu fitxategia: " + fitxategia);
		} catch (IOException e) {
			System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
		}
		return kontuak;
	}

	public static boolean autentifikatu(Map<String, String> kontuak, Scanner sc) {
		int saiakerak = 4;
		while (saiakerak > 0) {
			System.out.print("Sartu erabiltzaile izena: ");
			String erabiltzailea = sc.next();
			System.out.print("Sartu pasahitza: ");
			String pasahitza = sc.next();

			if (kontuak.containsKey(erabiltzailea) && kontuak.get(erabiltzailea).equals(pasahitza)) {
				System.out.println("Autentifikazioa arrakastatsua.");
				return true;
			} else {
				saiakerak--;
				System.out.println("Erabiltzaile edo pasahitz okerra. Geratzen diren saiakerak: " + saiakerak);
			}
		}
		return false;
	}
}

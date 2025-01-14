package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import klaseak.BDErabiltzaile;
import klaseak.Erabiltzaile;
import klaseak.XMLSortu;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Kargatu erabiltzaileak eta pasahitzak fitxategitik
		Map<String, String> kontuak = kargatuKontuak("Fitxategiak/kontuak.txt");

		// Autentifikazioa
		if (!autentifikatu(kontuak, sc)) {
			System.out.println("Hiru saiakera oker. Saioa amaitu da.");
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

				// Sarrera irakurri eta zenbaki bihurtu
				if (sc.hasNextInt()) {
					resp = sc.nextInt();

					// Aukeraren arabera erantzuna
					switch (resp) {
					case 1:
						alta();
						break;
					case 2:
						XMLSortu.generarXML("erabiltzaile.xml");
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
					sc.next(); // Karaktere baliogabea garbitu
				}
			} while (resp != 5);
		} catch (Exception e) {
			System.out.println("Errore bat gertatu da: " + e.getMessage());
		} finally {
			sc.close(); // Baliabidea garbitu
		}
	}

	// Metodo Erabiltzaile Berria
	public static void alta() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu Erabiltzailearen izena: ");
		String izena = sc.next();

		System.out.print("Sartu Pasahitza: ");
		String pasahitza = sc.next();

		// Verificar que la contraseña se repita correctamente
		System.out.print("Errepikatu pasahitza: ");
		String berretsitakoPasahitza = sc.next();

		if (!pasahitza.equals(berretsitakoPasahitza)) {
			System.out.println("Pasahitzak ez datoz bat. Erabiltzailea ez da sortu.");
			return;
		}

		Erabiltzaile erabiltzaile = new Erabiltzaile(izena, pasahitza);
		if (BDErabiltzaile.erabiltzaileGorde(erabiltzaile)) {
			System.out.println("Erabiltzailea Sortuta.");
		} else {
			System.out.println("Errorea Erabiltzailea Sortzean.");
		}
	}

	public static void datuBaseaEguneratu() {
		System.out.println("Datu-basea eguneratzen...");
	}

	public static void datuakErakutsi() {
		System.out.println("Datuak erakusten...");
	}

	// Fitxategitik kontuak kargatzeko metodoa
	public static Map<String, String> kargatuKontuak(String fitxategia) {
		Map<String, String> kontuak = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fitxategia))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] zatitua = line.split(":"); // Erabiltzaile eta pasahitzak ":" bidez bereizita
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

	// Autentifikazio metodoa
	public static boolean autentifikatu(Map<String, String> kontuak, Scanner sc) {
		int saiakerak = 3;
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

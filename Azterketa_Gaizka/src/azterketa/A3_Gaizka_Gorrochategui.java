package azterketa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class A3_Gaizka_Gorrochategui {

	public static void main(String[] args) {
		NewYorkJaio();
		BarackObama();
	}

	
	public static void NewYorkJaio() {
		try {
			FileReader fr = new FileReader("Fitxategiak/presidenteak.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String zbk;
			zbk = br.readLine();
			
			ArrayList<String> newYork = new ArrayList<>();
			
			while ((zbk = br.readLine()) != null) {
				String[] lerroZatiak = zbk.split("\t");

				String izena = lerroZatiak[1];
				String estatua = lerroZatiak[2];

				if (estatua.equalsIgnoreCase("New York")) {
					newYork.add(izena);
				}
			}
			System.out.println(newYork.size() + " Pertsona jaio dira New Yorken.");
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Errorea: Fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: Fitxategia irakurtzean arazo bat gertatu da.");
		}
	}
	
	public static void BarackObama() {
		try {
			FileReader fr = new FileReader("Fitxategiak/presidenteak.txt");
			BufferedReader br = new BufferedReader(fr);

			String zbk;
			zbk = br.readLine();

			while ((zbk = br.readLine()) != null) {
				String[] lerroZatiak = zbk.split("\t");

				Integer id = Integer.parseInt(lerroZatiak[0]);
				String izena = lerroZatiak[1];

				if (izena.equalsIgnoreCase("Barack Obama")) {
					System.out.println("Barack Obama " + id + " presidentea izan zen.");
					break;
				}
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Errorea: Fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: Fitxategia irakurtzean arazo bat gertatu da.");
		}

		try {
			FileReader fr = new FileReader("Fitxategiak/presidenteak.txt");
			BufferedReader br = new BufferedReader(fr);

			String urte;
			urte = br.readLine();

			while ((urte = br.readLine()) != null) {
				String[] lerroZatiak = urte.split("\t");

				Integer jaiotzaData = Integer.parseInt(lerroZatiak[3]);
				String izena = lerroZatiak[1];

				if (izena.equalsIgnoreCase("Barack Obama")) {
					int urteak = 2024-jaiotzaData;
					System.out.println("Barack Obama " + urteak + " urte ditu.");
					break;
				}
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Errorea: Fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: Fitxategia irakurtzean arazo bat gertatu da.");
		}

	}
}

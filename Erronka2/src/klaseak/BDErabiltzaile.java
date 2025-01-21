package klaseak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BDErabiltzaile {
	private static final String archivo = "Fitxategiak/kontuak.txt";

	// Kargatu erabiltzaileak fitxategitik
	public static Map<String, String> erabiltzaileakKargatu() {
		Map<String, String> usuarios = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] partes = line.split(":");
				if (partes.length == 2) {
					usuarios.put(partes[0], partes[1]);
				}
			}
		} catch (IOException e) {
			System.out.println("Errore bat gertatu da erabiltzaileak kargatzean: " + e.getMessage());
		}
		return usuarios;
	}

	// Gorde erabiltzaile berri bat
	public static boolean erabiltzaileGorde(Erabiltzaile erabiltzaile) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
			// Idatzi erabiltzaile berria fitxategian, formatua "izena:pasahitza"
			bw.write(erabiltzaile.toString());
			bw.newLine(); // Erabiltzaile bakoitzaren ondoren lerro berri bat gehitu
			return true;
		} catch (IOException e) {
			System.out.println("Errorea erabiltzailea gordetzean: " + e.getMessage());
			return false;
		}
	}

	// Egiaztatu erabiltzailea pasahitz zuzena duen ala ez
	public static boolean erabiltzaileaAutentifikatu(String izena, String pasahitza) {
		Map<String, String> erabiltzaileak = erabiltzaileakKargatu();
		return erabiltzaileak.containsKey(izena) && erabiltzaileak.get(izena).equals(pasahitza);
	}
}

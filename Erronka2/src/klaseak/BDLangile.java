package klaseak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BDLangile {

	private static final String CSV_PATH = "Fitxategiak/langile.csv"; // CSV fitxategiaren bidea
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yy"); // Espero den
																										// data-formatua
	static List<Langile> langiles = new ArrayList<>();

	public static List<Langile> getLangilesFromCSV() {

		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(CSV_PATH))) {
			// Irakurri goiburua (baldin badago) eta jarraitu datuekin
			br.readLine(); // Demagun lehen lerroa goiburua dela

			while ((line = br.readLine()) != null) {
				String[] values = line.split(","); // Banatu balioak komaz

				// Ziurtatu fitxategia formatu egokian dagoela
				if (values.length == 7) {
					int id = Integer.parseInt(values[0].trim());
					String izena = values[1].trim();
					String abizenak = values[2].trim();
					String emaila = values[3].trim();
					String telefonoa = values[4].trim();
					// Erabili formatua data analizatzeko
					LocalDate kontratazioData = LocalDate.parse(values[5].trim(), DATE_FORMATTER);
					int idNagusia = Integer.parseInt(values[6].trim());

					// Sortu Langile objektu bat eta gehitu zerrendara
					langiles.add(new Langile(id, izena, abizenak, emaila, telefonoa, kontratazioData, idNagusia));
				}
			}
		} catch (IOException e) {
			System.out.println("Errorea CSV fitxategia irakurtzean: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Errorea datuak prozesatzean: " + e.getMessage());
		}
		return langiles;

	}

	// Langile objektu berriak gehitzeko metodoa
	public void addLangile(Langile langile) {
		langiles.add(langile);
	}

	// Langile guztien informazioa formatu egokian bistaratzen duen metodoa
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Langile langile : langiles) {
			sb.append(langile.toString()).append("\n");
		}
		return sb.toString();
	}
}

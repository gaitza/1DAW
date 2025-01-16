package klaseak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BDLangile {

    private static final String CSV_PATH = "Fitxategiak/langile.csv"; // Ruta del archivo CSV
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yy"); // Formato esperado

    public static List<Langile> getLangilesFromCSV() {
        List<Langile> langiles = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(CSV_PATH))) {
            // Leer la cabecera (si existe) y continuar con los datos
            br.readLine(); // Supongamos que la primera línea es la cabecera

            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // Separar los valores por coma

                // Asegurarnos de que el archivo tiene el formato correcto
                if (values.length == 7) {
                    int id = Integer.parseInt(values[0].trim());
                    String izena = values[1].trim();
                    String abizenak = values[2].trim();
                    String emaila = values[3].trim();
                    String telefonoa = values[4].trim();
                    // Usar el formato para parsear la fecha
                    LocalDate kontratazioData = LocalDate.parse(values[5].trim(), DATE_FORMATTER);
                    int idNagusia = Integer.parseInt(values[6].trim());

                    // Crear un objeto Langile y añadirlo a la lista
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
}


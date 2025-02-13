package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDBezero {

    private static final String FILE_NAME = "Fitxategiak/BEZEROAK.csv";  

    // Método para añadir un nuevo cliente a la base de datos (archivo CSV)
    public static void addBezero(Bezero bezero) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(bezero.getId() + "," + bezero.getIzena() + "," + bezero.getAbizena() + ","
                    + bezero.getHelbidea() + "," + bezero.getEmaila() + "\n");
            System.out.println("Bezeroa gorde da: " + bezero);
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
        }
    }

    // Método para mostrar todos los clientes guardados en el archivo CSV
    public static void erakutsiBezeroak() {
        List<Bezero> bezeroak = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String izena = data[1];
                String abizena = data[2];
                String helbidea = data[3];
                String emaila = data[4];

                Bezero bezero = new Bezero(id, izena, abizena, helbidea, emaila);
                bezeroak.add(bezero);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }

        // Mostrar todos los Bezero (clientes)
        for (Bezero bezero : bezeroak) {
            System.out.println(bezero);  // Llamada al toString de Bezero
        }
    }

    // Método toString para mostrar el contenido de todos los clientes almacenados
    @Override
    public String toString() {
        List<Bezero> bezeroak = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String izena = data[1];
                String abizena = data[2];
                String helbidea = data[3];
                String emaila = data[4];

                Bezero bezero = new Bezero(id, izena, abizena, helbidea, emaila);
                bezeroak.add(bezero);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }

        // Construir la cadena de texto que representa todos los Bezero
        for (Bezero bezero : bezeroak) {
            sb.append(bezero).append("\n");  // Usar el toString de Bezero para obtener la representación del cliente
        }
        return sb.toString();  // Devolver la cadena representando todos los clientes
    }
}

package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDHerrialde {

    private static final String FILE_NAME = "Fitxategiak/HERIIALDE.csv"; 

    
    public static boolean addHerrialde(Herrialde herrialde) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(herrialde.getId() + "," + herrialde.getIzena() + "," + herrialde.getIdKontinente() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
            return false;
        }
    }

    
    public static List<Herrialde> getAllHerrialde() {
        List<Herrialde> herrialdeList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnas = line.split(",");
                String id = columnas[0];
                String izena = columnas[1];
                int idKontinente = Integer.parseInt(columnas[2]);

                Herrialde herrialde = new Herrialde(id, izena, idKontinente);
                herrialdeList.add(herrialde);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return herrialdeList;
    }

    
    public static void showAllHerrialde() {
        List<Herrialde> herrialdeList = getAllHerrialde();

        if (herrialdeList.isEmpty()) {
            System.out.println("Ez dago Herrialde daturik.");
            return;
        }

        System.out.println(String.format("%-10s%-30s%-15s", "ID", "Izena", "Kontinente ID"));
        for (Herrialde herrialde : herrialdeList) {
            System.out.println(String.format("%-10s%-30s%-15d", herrialde.getId(), herrialde.getIzena(), herrialde.getIdKontinente()));
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Herrialde> herrialdeList = getAllHerrialde();
        for (Herrialde herrialde : herrialdeList) {
            sb.append(herrialde.toString()).append("\n");
        }
        return sb.toString();
    }
}

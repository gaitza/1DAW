package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDKategoria {

    private static final String FILE_NAME = "Fitxategiak/KATEGORIA.csv"; 

    
    public static boolean addKategoria(Kategoria kategoria) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(kategoria.getId() + "," + kategoria.getIzena() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
            return false;
        }
    }

    
    public static List<Kategoria> getAllKategoria() {
        List<Kategoria> kategoriaList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnas = line.split(",");
                int id = Integer.parseInt(columnas[0]);
                String izena = columnas[1];

                Kategoria kategoria = new Kategoria(id, izena);
                kategoriaList.add(kategoria);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return kategoriaList;
    }

    
    public static void showAllKategoria() {
        List<Kategoria> kategoriaList = getAllKategoria();

        if (kategoriaList.isEmpty()) {
            System.out.println("Ez dago Kategoria daturik.");
            return;
        }

        System.out.println(String.format("%-10s%-20s", "ID", "Izena"));
        for (Kategoria kategoria : kategoriaList) {
            System.out.println(String.format("%-10d%-20s", kategoria.getId(), kategoria.getIzena()));
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Kategoria> kategoriaList = getAllKategoria();
        for (Kategoria kategoria : kategoriaList) {
            sb.append(kategoria.toString()).append("\n");
        }
        return sb.toString();
    }
}

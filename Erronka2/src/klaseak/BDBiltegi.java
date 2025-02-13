package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDBiltegi {

    private static final String FILE_NAME = "Fitxategiak/BILTEGI.csv";  

    
    public static boolean addBiltegi(Biltegi biltegi) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(biltegi.getId() + "," + biltegi.getIzena() + "," + biltegi.getIdKokaleku() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
            return false;
        }
    }

    
    public static List<Biltegi> getAllBiltegi() {
        List<Biltegi> biltegiList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnas = line.split(",");
                int id = Integer.parseInt(columnas[0]);
                String izena = columnas[1];
                int idKokaleku = Integer.parseInt(columnas[2]);

                Biltegi biltegi = new Biltegi(id, izena, idKokaleku);
                biltegiList.add(biltegi);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return biltegiList;
    }

    
    public static void showAllBiltegi() {
        List<Biltegi> biltegiList = getAllBiltegi();

        if (biltegiList.isEmpty()) {
            System.out.println("Ez dago Biltegi daturik.");
            return;
        }

        
        System.out.println(String.format("%-5s%-20s%-15s", "ID", "Izena", "Kokaleku ID"));
        for (Biltegi biltegi : biltegiList) {
            System.out.println(String.format("%-5d%-20s%-15d", biltegi.getId(), biltegi.getIzena(), biltegi.getIdKokaleku()));
        }
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Biltegi> biltegiList = getAllBiltegi();
        for (Biltegi biltegi : biltegiList) {
            sb.append(biltegi.toString()).append("\n");
        }
        return sb.toString();
    }
}

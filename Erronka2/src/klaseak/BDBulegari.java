package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDBulegari {

    private static final String FILE_NAME = "Fitxategiak/BULEGARI.csv";

    public static boolean addBulegari(Bulegari bulegari) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(bulegari.getId() + "," + bulegari.getIdLanpostu() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
            return false;
        }
    }

    public static List<Bulegari> getAllBulegari() {
        List<Bulegari> bulegariList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnas = line.split(",");
                int id = Integer.parseInt(columnas[0]);
                int idLanpostu = Integer.parseInt(columnas[1]);

                Bulegari bulegari = new Bulegari(id, idLanpostu);
                bulegariList.add(bulegari);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return bulegariList;
    }

    public static void showAllBulegari() {
        List<Bulegari> bulegariList = getAllBulegari();

        if (bulegariList.isEmpty()) {
            System.out.println("Ez dago Bulegari daturik.");
            return;
        }

        System.out.println(String.format("%-5s%-15s", "ID", "Lanpostu ID"));
        for (Bulegari bulegari : bulegariList) {
            System.out.println(String.format("%-5d%-15d", bulegari.getId(), bulegari.getIdLanpostu()));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Bulegari> bulegariList = getAllBulegari();
        for (Bulegari bulegari : bulegariList) {
            sb.append(bulegari.toString()).append("\n");
        }
        return sb.toString();
    }
}

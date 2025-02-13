package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDInbentario {

    private static final String FILE_NAME = "Fitxategiak/INBENTARIO.csv"; 

    
    public static boolean addInbentario(Inbentario inbentario) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(inbentario.getIdProduktu() + "," + inbentario.getIdBiltegi() + "," + inbentario.getKopurua() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
            return false;
        }
    }

    
    public static List<Inbentario> getAllInbentario() {
        List<Inbentario> inbentarioList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnas = line.split(",");
                int idProduktu = Integer.parseInt(columnas[0]);
                int idBiltegi = Integer.parseInt(columnas[1]);
                int kopurua = Integer.parseInt(columnas[2]);

                Inbentario inbentario = new Inbentario(idProduktu, idBiltegi, kopurua);
                inbentarioList.add(inbentario);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return inbentarioList;
    }

    
    public static void showAllInbentario() {
        List<Inbentario> inbentarioList = getAllInbentario();

        if (inbentarioList.isEmpty()) {
            System.out.println("Ez dago Inbentario daturik.");
            return;
        }

        System.out.println(String.format("%-15s%-15s%-15s", "Produktu ID", "Biltegi ID", "Kopurua"));
        for (Inbentario inbentario : inbentarioList) {
            System.out.println(String.format("%-15d%-15d%-15d", inbentario.getIdProduktu(), inbentario.getIdBiltegi(), inbentario.getKopurua()));
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Inbentario> inbentarioList = getAllInbentario();
        for (Inbentario inbentario : inbentarioList) {
            sb.append(inbentario.toString()).append("\n");
        }
        return sb.toString();
    }
}

package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BDBezeroTelefono {

    private static final String FILE_NAME = "Fitxategiak/BEZERO_TELEFONO.csv";  

    
    public static boolean addBezeroTelefono(BezeroTelefono bezeroTelefono) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(bezeroTelefono.getId() + "," + bezeroTelefono.getIdBezero() + "," + bezeroTelefono.getZenbakia() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
            return false;
        }
    }

    
    public static List<BezeroTelefono> getAllBezeroTelefono() {
        List<BezeroTelefono> bezeroTelefonos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnas = line.split(",");
                int id = Integer.parseInt(columnas[0]);
                int idBezero = Integer.parseInt(columnas[1]);
                int zenbakia = Integer.parseInt(columnas[2]);

                BezeroTelefono bezeroTelefono = new BezeroTelefono(id, idBezero, zenbakia);
                bezeroTelefonos.add(bezeroTelefono);
            }
        } catch (IOException e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return bezeroTelefonos;
    }

    
    public static void showAllBezeroTelefono() {
        List<BezeroTelefono> bezeroTelefonos = getAllBezeroTelefono();

        if (bezeroTelefonos.isEmpty()) {
            System.out.println("Ez dago BezeroTelefono daturik.");
            return;
        }

        
        System.out.println(String.format("%-5s%-15s%-15s", "ID", "Bezero ID", "Telefono Zenbakia"));
        for (BezeroTelefono bezeroTelefono : bezeroTelefonos) {
            System.out.println(String.format("%-5d%-15d%-15d", bezeroTelefono.getId(), bezeroTelefono.getIdBezero(), bezeroTelefono.getZenbakia()));
        }
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<BezeroTelefono> bezeroTelefonos = getAllBezeroTelefono();
        for (BezeroTelefono bezeroTelefono : bezeroTelefonos) {
            sb.append(bezeroTelefono.toString()).append("\n");
        }
        return sb.toString();
    }
}

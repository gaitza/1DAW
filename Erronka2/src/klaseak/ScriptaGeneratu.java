package klaseak;

import java.io.FileWriter;
import java.io.IOException;

public class ScriptaGeneratu {

    private static final String FILE_NAME = "Fitxategiak/update_langile.sql";

    public static void eremuaGehitu() {
        String scriptSQL = """
            -- Egiaztatu 'soldata' existitzen ez dela eta gehitu
            ALTER TABLE Langile ADD COLUMN soldata DECIMAL(10,2);
        """;

        idatziScript(scriptSQL);
    }

    public static void taulaEguneratu() {
        String scriptSQL = """
            -- Soldata eguneratzea
            UPDATE Langile
            SET soldata = 
                CASE 
                    WHEN lanpostua = 'Saltzailea' THEN 30000
                    WHEN lanpostua = 'Bulegaria' AND idLanpostua = 1 THEN 30000
                    WHEN lanpostua = 'Bulegaria' AND idLanpostua = 2 THEN 31000
                    WHEN lanpostua = 'Bulegaria' AND idLanpostua = 3 THEN 32000
                    ELSE soldata
                END;
        """;

        idatziScript(scriptSQL);
    }

    private static void idatziScript(String scriptSQL) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(scriptSQL);
            writer.write("\n");
            System.out.println("SQL script-a eguneratu da: " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Errorea fitxategia idaztean: " + e.getMessage());
        }
    }
}

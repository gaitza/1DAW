package ariketak;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ariketa05 {

    public static void main(String[] args) {
        // Erabiltzailearen inputa eskatzen dugu Scanner erabiliz
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu zure jaiotza-data (URTEA-HILABETEA-EGUNA formatuan): ");
        String inputData = sc.nextLine();
        
        // Jaiotza-data LocalDate formatura bihurtu
        DateTimeFormatter formatua = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate jaiotzaData = LocalDate.parse(inputData, formatua);
        
        // Gaurko data eskuratu
        LocalDate gaurkoData = LocalDate.now();
        
        // Period.between() erabiliz, jaiotza-dataren eta gaurko dataren arteko aldea kalkulatu
        Period aldia = Period.between(jaiotzaData, gaurkoData);
        
        // getYears() erabiliz, adina kalkulatu eta pantailan erakutsi
        int adina = aldia.getYears();
        System.out.println("Zure adina: " + adina + " urte");

        sc.close();
	}
}
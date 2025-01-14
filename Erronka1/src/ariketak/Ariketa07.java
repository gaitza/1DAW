package ariketak;

import java.util.Scanner;

public class Ariketa07 {

	public static void main(String[] args) {
        // Erabiltzailearen inputa eskatzen dugu Scanner erabiliz
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu zure izena:");
        String izena = sc.nextLine();
        System.out.print("Sartu zure adina: ");
        String adina = sc.nextLine();
        
        
        System.out.println("Zure izena: " + izena);
        System.out.println("Zure adina: " + adina);
        
        sc.close();
	}
}

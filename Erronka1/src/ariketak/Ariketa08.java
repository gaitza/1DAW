package ariketak;

import java.util.Scanner;

public class Ariketa08 {

	public static void main(String[] args) {
        // Erabiltzailearen inputa eskatzen dugu Scanner erabiliz
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu zure adina: ");
        int adina = sc.nextInt();
        
        if (adina >= 18) {
        	System.out.println("Adin Nagusia zara");
        } else {
        	System.out.println("Adin Txikikoa zara");
        }
        
        sc.close();
	}
}

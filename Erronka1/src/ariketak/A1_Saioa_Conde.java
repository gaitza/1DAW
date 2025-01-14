package ariketak;

import java.util.Scanner;

public class A1_Saioa_Conde {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu lehenengo zenbakia: ");
        int zbk1 = sc.nextInt();
        System.out.print("Sartu bigarren zenbakia: ");
        int zbk2 = sc.nextInt();

        eragiketak(zbk1, zbk2);
        
        sc.close();
	}
	
	public static void eragiketak(int zbk1, int zbk2) {
        // Bi zenbakien arteko biderketa kalkulatu
        int biderketa = zbk1 * zbk2;

        if (biderketa == 10) {
            System.out.println("Bi zenbakien arteko biderketa 10 da.");
        } else if (zbk1 < 0 && zbk2 < 0) {
        	int txikiena;
        	if (zbk1 < zbk2)
        		txikiena = zbk1;
        	else
        		txikiena = zbk2;
            System.out.println("Bi zenbakiak negatiboak dira, eta bi zenbakietatik txikiena " + txikiena + " da.");
        } else {
        	int txikiena;
        	if (zbk1 < zbk2)
        		txikiena = zbk1;
        	else
        		txikiena = zbk2;
            System.out.println("Zenbakirik txikiena gehi bost " + (txikiena + 5) + " da.");
        }
    }

}

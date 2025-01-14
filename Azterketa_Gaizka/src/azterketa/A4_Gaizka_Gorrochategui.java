package azterketa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A4_Gaizka_Gorrochategui {
	
	public static void main(String[] args) {
		EuskalHerria();
	}

	public static void EuskalHerria() {
		Scanner sc = new Scanner(System.in);
		try {
			FileReader fr = new FileReader("Fitxategiak/neskak.txt");
			BufferedReader br = new BufferedReader(fr);

			FileReader fr2 = new FileReader("Fitxategiak/sailkapena.txt");
			BufferedReader br2 = new BufferedReader(fr);
			
			

			String lerroa;
			lerroa = br.readLine();
			String lerroa2;
			lerroa2 = br.readLine();

			while ((lerroa = br.readLine()) != null) {
				String[] lerroZatiak = lerroa.split("\t");
				String izena = lerroZatiak[2];
				String abizenak = lerroZatiak[1];
				System.out.println("Sartu izen bat:");
				izena = sc.nextLine();
				System.out.println("Sartu abizenak:");
				abizenak = sc.nextLine();
				
				
					String[] lerroZatiak2 = lerroa2.split("\t");

					Integer postua = Integer.parseInt(lerroZatiak[1]);
					
					if (izena.equalsIgnoreCase(izena) && abizenak.equalsIgnoreCase(abizenak)) {
						System.out.println(
								izena + " " + abizenak + postua + " da.");
						break;
					}
				}
				
			

			br.close();
			fr.close();
			br2.close();
			fr2.close();

		} catch (FileNotFoundException e) {
			System.out.println("Errorea: Fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: Fitxategia irakurtzean arazo bat gertatu da.");
		}
		
		sc.close();

	}
}

package ariketak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class A3_Saioa_Conde {

	public static void main(String[] args) {
		kalkulatuBidaiarienGeneroa();
		nortasunAgiriZbkElizabethBonnell();
	}
	
	public static void kalkulatuBidaiarienGeneroa() {
		try {
			FileReader fr = new FileReader("Fitxategiak/titanic.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String lerroa;
			lerroa = br.readLine();
			
			ArrayList<String> emakumeak = new ArrayList<>();
			ArrayList<String> gizonak = new ArrayList<>();
			
			while ((lerroa = br.readLine()) != null) {
				String[] lerroZatiak = lerroa.split("\t");
				
				String izena = lerroZatiak[3];
				String generoa = lerroZatiak[4];
				
				if (generoa.equalsIgnoreCase("male")) {
                    gizonak.add(izena);
				} else {
                    emakumeak.add(izena);
                }
			}
			
	        if (gizonak.size() > emakumeak.size()) {
	            System.out.println("Titanic-eko gehiengoa gizonezkoek osatzen dute. " + gizonak.size() + " gizon > " + emakumeak.size() + " emakume");
	        } else if (emakumeak.size() > gizonak.size()) {
	            System.out.println("Titanic-eko gehiengoa emakumezkoek osatzen dute. " + emakumeak.size() + " emakume > " + gizonak.size() + "gizon");
	        } else {
	            System.out.println("Gizon eta emakume kopurua berdina da. " + gizonak.size());
	        }
			    
			br.close();
			fr.close();
			
		    } catch (FileNotFoundException e) {
					System.out.println("Errorea: Fitxategia ezin da aurkitu.");
			} catch (IOException e) {
					System.out.println("Errorea: Fitxategia irakurtzean arazo bat gertatu da.");
			}
				
			}

	public static void nortasunAgiriZbkElizabethBonnell() {
		try {
			FileReader fr = new FileReader("Fitxategiak/titanic.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String lerroa;
			lerroa = br.readLine();
			
			while ((lerroa = br.readLine()) != null) {
				String[] lerroZatiak = lerroa.split("\t");
				
				Integer id = Integer.parseInt(lerroZatiak[0]);
				String izena = lerroZatiak[3];
			
				if (izena.equalsIgnoreCase("Bonnell,Miss.Elizabeth")) {
					System.out.println("Miss. Elizabeth Bonnell Titanic-eko bidaiariaren nortasun-agiri zenbakia " + id + " da.");
					break;
				}
			}
			
			br.close();
			fr.close();
			
			
		    } catch (FileNotFoundException e) {
					System.out.println("Errorea: Fitxategia ezin da aurkitu.");
			} catch (IOException e) {
					System.out.println("Errorea: Fitxategia irakurtzean arazo bat gertatu da.");
			}
				
			}

	
}

package ariketak;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ariketa19 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Fitxategiak/ikasleak.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

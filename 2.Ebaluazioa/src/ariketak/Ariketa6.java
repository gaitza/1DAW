package ariketak;

import java.util.Scanner;

public class Ariketa6 {

	    public static int zenbatZenbaki() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Zenbat zenbaki sartu nahi dituzu? ");
	        return sc.nextInt();
	    }

	    public static int[] zenbakiakSartu(int kopurua) {
	        Scanner sc = new Scanner(System.in);
	        int[] zenbakiak = new int[kopurua];
	        System.out.println("Sartu zure zenbakiak:");
	        for (int i = 0; i < kopurua; i++) {
	            System.out.print((i + 1) + ". zenbakia: ");
	            zenbakiak[i] = sc.nextInt();
	        }
	        return zenbakiak;
	    }

	    public static void alderantzizBistaratu(int[] zenbakiak) {
	        System.out.println("Zenbakiak alderantzizko ordenean:");
	        for (int i = zenbakiak.length - 1; i >= 0; i--) {
	            System.out.println(zenbakiak[i]);
	        }
	    }

	    public static void main(String[] args) {
	        int kopurua = zenbatZenbaki();
	        int[] zenbakiak = zenbakiakSartu(kopurua);
	        alderantzizBistaratu(zenbakiak);
	    }
	}




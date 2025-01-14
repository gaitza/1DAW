package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class KontuKorrontea {


	    // Atributuak
	    private String nan;
	    private String titularra;
	    private double saldoEskuragarria;
	    private LocalDate sortzeData;

	    // Konstruktorra kontua sortzeko
	    public KontuKorrontea(String nan, String titularra) {
	        this.nan = nan;
	        this.titularra = titularra;
	        this.saldoEskuragarria = 0.0; // Hasierako saldoa 0
	        this.sortzeData = LocalDate.now(); // Sortze data gaurkoa
	    }

	    // Dirua ateratzeko metodoa
	    public boolean diruaAtera(double kopurua) {
	        if (kopurua > 0 && saldoEskuragarria >= kopurua) {
	            saldoEskuragarria -= kopurua;
	            return true; // Dirua ateratzea posible izan da
	        }
	        return false; // Ez da posible dirua ateratzea
	    }

	    // Dirua sartzeko metodoa
	    public void diruaSartu(double kopurua) {
	        if (kopurua > 0) {
	            saldoEskuragarria += kopurua;
	        }
	    }

	    // Kontuaren informazioa erakusteko metodoa
	    public void erakutsiInformazioa() {
	        System.out.println("NAN: " + nan);
	        System.out.println("Titularra: " + titularra);
	        System.out.println("Saldo eskuragarria: " + saldoEskuragarria + "€");
	        System.out.println("Sortze data: " + sortzeData);
	        System.out.println("-----------------------------");
	    }

	    // Kontuaren informazioa fitxategian idazteko metodoa
	    public String lortuInformazioaFitxategirako() {
	        return "NAN: " + nan + ", Titularra: " + titularra + ", Saldo: " + saldoEskuragarria + "€, Sortze data: " + sortzeData + "\n";
	    }
	}

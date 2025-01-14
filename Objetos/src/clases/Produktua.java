package clases;

public class Produktua {

	// Atributuak
	int prezioa;
	int beherapena;
	
	//Contructores
	public Produktua(int prezioa, int beherapena) {
		super();
		this.prezioa = prezioa;
		this.beherapena = beherapena;
	}
	
	public Produktua() {
		
	}
	
	//Getters & Setters
	public int getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}	

	public int getBeherapena() {
		return beherapena;
	}

	public void setBeherapena(int beherapena) {
		this.beherapena = beherapena;
	}	

	@Override
	public String toString() {
		return "Produktua [prezioa=" + prezioa + ", beherapena=" + beherapena + "]";
	}
	
	void mostrar() {
		double portzentaia;
        // Aseguramos que la división sea decimal
        portzentaia = ((prezioa - beherapena) / (double) prezioa) * 100;
        System.out.println("Hau da: " + portzentaia + "%");
	}

}

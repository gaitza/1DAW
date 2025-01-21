package klaseak;

public class Kategoria {
	private int id;
	private String izena;
	
	// Konstruktorea
	public Kategoria(int id, String izena) {
		super();
		this.id = id;
		this.izena = izena;
	}

	//Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	@Override
	public String toString() {
		return "Kategoria [id=" + id + ", izena=" + izena + "]";
	}
	
	

}

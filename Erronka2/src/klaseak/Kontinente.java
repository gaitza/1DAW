package klaseak;

public class Kontinente {
	private int id;
	private String izena;

	// Konstruktorea
	public Kontinente(int id, String izena) {
		super();
		this.id = id;
		this.izena = izena;
	}

	// Getters & Setters
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
		return "Kontinente [id=" + id + ", izena=" + izena + "]";
	}

}

package klaseak;

public class EskariEgoera {
	private int id;
	private String deskribapena;

	// Konstruktorea
	public EskariEgoera(int id, String deskribapena) {
		super();
		this.id = id;
		this.deskribapena = deskribapena;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeskribapena() {
		return deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

	@Override
	public String toString() {
		return "EskariEgoera [id=" + id + ", deskribapena=" + deskribapena + "]";
	}

}

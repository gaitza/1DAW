package klaseak;

public class Biltegi {
	private int id;
	private String izena;
	private int idKokaleku;

	// Konstruktorea
	public Biltegi(int id, String izena, int idKokaleku) {
		super();
		this.id = id;
		this.izena = izena;
		this.idKokaleku = idKokaleku;
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

	public int getIdKokaleku() {
		return idKokaleku;
	}

	public void setIdKokaleku(int idKokaleku) {
		this.idKokaleku = idKokaleku;
	}

	@Override
	public String toString() {
		return "Biltegi [id=" + id + ", izena=" + izena + ", idKokaleku=" + idKokaleku + "]";
	}

}

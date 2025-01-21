package klaseak;

public class Herrialde {
	private String id;
	private String izena;
	private int idKontinente;

	// Kontruktorea
	public Herrialde(String id, String izena, int idKontinente) {
		super();
		this.id = id;
		this.izena = izena;
		this.idKontinente = idKontinente;
	}

	// Getters & Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getIdKontinente() {
		return idKontinente;
	}

	public void setIdKontinente(int idKontinente) {
		this.idKontinente = idKontinente;
	}

	@Override
	public String toString() {
		return "Herrialde [id=" + id + ", izena=" + izena + ", idKontinente=" + idKontinente + "]";
	}

}

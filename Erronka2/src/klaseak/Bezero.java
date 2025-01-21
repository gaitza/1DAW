package klaseak;

public class Bezero {
	private int id;
	private String izena;
	private String abizena;
	private String helbidea;
	private String emaila;

	// Konstruktorea
	public Bezero(int id, String izena, String abizena, String helbidea, String emaila) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizena = abizena;
		this.helbidea = helbidea;
		this.emaila = emaila;
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

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public String getEmaila() {
		return emaila;
	}

	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}

	@Override
	public String toString() {
		return "Bezero [id=" + id + ", izena=" + izena + ", abizena=" + abizena + ", helbidea=" + helbidea + ", emaila="
				+ emaila + "]";
	}

}

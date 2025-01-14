package clases;

public class Ikaslea {

	// Atributuak
	private String izena;
	private String abizena;
	private double notaMedia;
	private String telefonoa;
	private String helbidea;

	// Konstruktorea

	public Ikaslea(String izena, String abizena, double notaMedia, String telefonoa, String helbidea) {
		super();
		this.izena = izena;
		this.abizena = abizena;
		this.notaMedia = notaMedia;
		this.telefonoa = telefonoa;
		this.helbidea = helbidea;
	}

	public Ikaslea() {

	}

	// Getters & Setters
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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getTelefonoa() {
		return telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	// toString
	@Override
	public String toString() {
		return "Izena: " + izena + ", Abizena: " + abizena + ", Nota Media: " + notaMedia + ", Telefonoa: " + telefonoa
				+ ", Helbidea: " + helbidea;
	}

}

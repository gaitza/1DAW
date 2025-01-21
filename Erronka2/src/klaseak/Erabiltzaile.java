package klaseak;

public class Erabiltzaile {
	private String izena;
	private String pasahitza;

	// Konstruktorea
	public Erabiltzaile(String izena, String pasahitza) {
		this.izena = izena;
		this.pasahitza = pasahitza;
	}

	// Getters & Setters
	public String getIzena() {
		return izena;
	}

	public String getPasahiza() {
		return pasahitza;
	}

	@Override
	public String toString() {
		return izena + ":" + pasahitza;
	}

}

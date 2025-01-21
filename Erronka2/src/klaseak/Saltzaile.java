package klaseak;

public class Saltzaile {
	private int id;
	private String ersbiltzaile;
	private String pasahitza;

	// Konstruktorea
	public Saltzaile(int id, String ersbiltzaile, String pasahitza) {
		super();
		this.id = id;
		this.ersbiltzaile = ersbiltzaile;
		this.pasahitza = pasahitza;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getErsbiltzaile() {
		return ersbiltzaile;
	}

	public void setErsbiltzaile(String ersbiltzaile) {
		this.ersbiltzaile = ersbiltzaile;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	@Override
	public String toString() {
		return "Saltzaile [id=" + id + ", ersbiltzaile=" + ersbiltzaile + ", pasahitza=" + pasahitza + "]";
	}

}

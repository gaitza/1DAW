package klaseak;

public class Bulegari {
	private int id;
	private int idLanpostu;

	// Konstruktorea
	public Bulegari(int id, int idLanpostu) {
		super();
		this.id = id;
		this.idLanpostu = idLanpostu;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdLanpostu() {
		return idLanpostu;
	}

	public void setIdLanpostu(int idLanpostu) {
		this.idLanpostu = idLanpostu;
	}

	@Override
	public String toString() {
		return "Bulegari [id=" + id + ", idLanpostu=" + idLanpostu + "]";
	}

}

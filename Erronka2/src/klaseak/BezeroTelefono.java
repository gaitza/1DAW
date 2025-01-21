package klaseak;

public class BezeroTelefono {
	private int id;
	private int idBezero;
	private int zenbakia;

	// Konstruktorea
	public BezeroTelefono(int id, int idBezero, int zenbakia) {
		super();
		this.id = id;
		this.idBezero = idBezero;
		this.zenbakia = zenbakia;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdBezero() {
		return idBezero;
	}

	public void setIdBezero(int idBezero) {
		this.idBezero = idBezero;
	}

	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}

	@Override
	public String toString() {
		return "BezeroTelefono [id=" + id + ", idBezero=" + idBezero + ", zenbakia=" + zenbakia + "]";
	}

}

package klaseak;

public class Kokaleku {
	private int id;
	private String helbidea;
	private int postakodea;
	private String udalerria;
	private String probintzia;
	private String idHerrialde;

	// Konstuktorea
	public Kokaleku(int id, String helbidea, int postakodea, String udalerria, String probintzia, String idHerrialde) {
		super();
		this.id = id;
		this.helbidea = helbidea;
		this.postakodea = postakodea;
		this.udalerria = udalerria;
		this.probintzia = probintzia;
		this.idHerrialde = idHerrialde;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public int getPostakodea() {
		return postakodea;
	}

	public void setPostakodea(int postakodea) {
		this.postakodea = postakodea;
	}

	public String getUdalerria() {
		return udalerria;
	}

	public void setUdalerria(String udalerria) {
		this.udalerria = udalerria;
	}

	public String getProbintzia() {
		return probintzia;
	}

	public void setProbintzia(String probintzia) {
		this.probintzia = probintzia;
	}

	public String getIdHerrialde() {
		return idHerrialde;
	}

	public void setIdHerrialde(String idHerrialde) {
		this.idHerrialde = idHerrialde;
	}

	@Override
	public String toString() {
		return "Kokaleku [id=" + id + ", helbidea=" + helbidea + ", postakodea=" + postakodea + ", udalerria="
				+ udalerria + ", probintzia=" + probintzia + ", idHerrialde=" + idHerrialde + "]";
	}

}

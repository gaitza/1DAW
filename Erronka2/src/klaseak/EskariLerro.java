package klaseak;

public class EskariLerro {
	private int idEskari;
	private int ideLerro;
	private int idProduktu;
	private int kopurua;
	private int salneurria;

	// Konstruktorea
	public EskariLerro(int idEskari, int ideLerro, int idProduktu, int kopurua, int salneurria) {
		super();
		this.idEskari = idEskari;
		this.ideLerro = ideLerro;
		this.idProduktu = idProduktu;
		this.kopurua = kopurua;
		this.salneurria = salneurria;
	}

	// Getters & Setters
	public int getIdEskari() {
		return idEskari;
	}

	public void setIdEskari(int idEskari) {
		this.idEskari = idEskari;
	}

	public int getIdeLerro() {
		return ideLerro;
	}

	public void setIdeLerro(int ideLerro) {
		this.ideLerro = ideLerro;
	}

	public int getIdProduktu() {
		return idProduktu;
	}

	public void setIdProduktu(int idProduktu) {
		this.idProduktu = idProduktu;
	}

	public int getKopurua() {
		return kopurua;
	}

	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}

	public int getSalneurria() {
		return salneurria;
	}

	public void setSalneurria(int salneurria) {
		this.salneurria = salneurria;
	}

	@Override
	public String toString() {
		return "EskariLerro [idEskari=" + idEskari + ", ideLerro=" + ideLerro + ", idProduktu=" + idProduktu
				+ ", kopurua=" + kopurua + ", salneurria=" + salneurria + "]";
	}

}

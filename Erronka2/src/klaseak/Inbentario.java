package klaseak;

public class Inbentario {
	private int idProduktu;
	private int idBiltegi;
	private int kopurua;

	// Konstruktorea
	public Inbentario(int idProduktu, int idBiltegi, int kopurua) {
		super();
		this.idProduktu = idProduktu;
		this.idBiltegi = idBiltegi;
		this.kopurua = kopurua;
	}

	// Getters & Setters
	public int getIdProduktu() {
		return idProduktu;
	}

	public void setIdProduktu(int idProduktu) {
		this.idProduktu = idProduktu;
	}

	public int getIdBiltegi() {
		return idBiltegi;
	}

	public void setIdBiltegi(int idBiltegi) {
		this.idBiltegi = idBiltegi;
	}

	public int getKopurua() {
		return kopurua;
	}

	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}

	@Override
	public String toString() {
		return "Inbentario [idProduktu=" + idProduktu + ", idBiltegi=" + idBiltegi + ", kopurua=" + kopurua + "]";
	}

}

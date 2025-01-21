package klaseak;

public class Produktu {
	private int id;
	private String izena;
	private String deskribapena;
	private int balioa;
	private int salneurria;
	private int idKategoria;

	// Konstruktorea
	public Produktu(int id, String izena, String deskribapena, int balioa, int salneurria, int idKategoria) {
		super();
		this.id = id;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.balioa = balioa;
		this.salneurria = salneurria;
		this.idKategoria = idKategoria;
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

	public String getDeskribapena() {
		return deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

	public int getBalioa() {
		return balioa;
	}

	public void setBalioa(int balioa) {
		this.balioa = balioa;
	}

	public int getSalneurria() {
		return salneurria;
	}

	public void setSalneurria(int salneurria) {
		this.salneurria = salneurria;
	}

	public int getIdKategoria() {
		return idKategoria;
	}

	public void setIdKategoria(int idKategoria) {
		this.idKategoria = idKategoria;
	}

	@Override
	public String toString() {
		return "Produktu [id=" + id + ", izena=" + izena + ", deskribapena=" + deskribapena + ", balioa=" + balioa
				+ ", salneurria=" + salneurria + ", idKategoria=" + idKategoria + "]";
	}

}

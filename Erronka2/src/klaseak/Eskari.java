package klaseak;

import java.time.LocalDate;

public class Eskari {
	private int id;
	private int idBezero;
	private int idEgoera;
	private int idSaltzaile;
	private LocalDate eskaeraData;

	// Konstruktorea
	public Eskari(int id, int idBezero, int idEgoera, int idSaltzaile, LocalDate eskaeraData) {
		super();
		this.id = id;
		this.idBezero = idBezero;
		this.idEgoera = idEgoera;
		this.idSaltzaile = idSaltzaile;
		this.eskaeraData = eskaeraData;
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

	public int getIdEgoera() {
		return idEgoera;
	}

	public void setIdEgoera(int idEgoera) {
		this.idEgoera = idEgoera;
	}

	public int getIdSaltzaile() {
		return idSaltzaile;
	}

	public void setIdSaltzaile(int idSaltzaile) {
		this.idSaltzaile = idSaltzaile;
	}

	public LocalDate getEskaeraData() {
		return eskaeraData;
	}

	public void setEskaeraData(LocalDate eskaeraData) {
		this.eskaeraData = eskaeraData;
	}

	@Override
	public String toString() {
		return "Eskari [id=" + id + ", idBezero=" + idBezero + ", idEgoera=" + idEgoera + ", idSaltzaile=" + idSaltzaile
				+ ", eskaeraData=" + eskaeraData + "]";
	}

}

package klaseak;

import java.time.LocalDate;

public class Langile {
    private int id;
    private String izena;
    private String abizenak;
    private String emaila;
    private String telefonoa;
    private LocalDate kontratazioData;
    private int idNagusia;
	
    
    //Konstruktorea
    
    public Langile(int id, String izena, String abizenak, String emaila, String telefonoa, LocalDate kontratazioData,
			int idNagusia) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizenak = abizenak;
		this.emaila = emaila;
		this.telefonoa = telefonoa;
		this.kontratazioData = kontratazioData;
		this.idNagusia = idNagusia;
	}


    //Getters & Setters
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


	public String getAbizenak() {
		return abizenak;
	}


	public void setAbizenak(String abizenak) {
		this.abizenak = abizenak;
	}


	public String getEmaila() {
		return emaila;
	}


	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}


	public String getTelefonoa() {
		return telefonoa;
	}


	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}


	public LocalDate getKontratazioData() {
		return kontratazioData;
	}


	public void setKontratazioData(LocalDate kontratazioData) {
		this.kontratazioData = kontratazioData;
	}


	public int getIdNagusia() {
		return idNagusia;
	}


	public void setIdNagusia(int idNagusia) {
		this.idNagusia = idNagusia;
	}


	@Override
	public String toString() {
		return "Langile [id=" + id + ", izena=" + izena + ", abizenak=" + abizenak + ", emaila=" + emaila
				+ ", telefonoa=" + telefonoa + ", kontratazioData=" + kontratazioData + ", idNagusia=" + idNagusia
				+ "]";
	}
    
	
	
    
    
}
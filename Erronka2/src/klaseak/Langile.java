package klaseak;

import java.time.LocalDate;

public class Langile extends Pertsona {
    private int id;
    private String emaila;
    private String telefonoa;
    private LocalDate kontratazioData;
    private int idNagusia;

    // Constructor
    public Langile(int id, String izena, String abizenak, String emaila, String telefonoa, LocalDate kontratazioData,
            int idNagusia) {
        super(izena, abizenak);  // Llamar al constructor de Pertsona
        this.id = id;
        this.emaila = emaila;
        this.telefonoa = telefonoa;
        this.kontratazioData = kontratazioData;
        this.idNagusia = idNagusia;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return super.toString() + ", ID: " + id + ", Emaila: " + emaila + ", Telefonoa: " + telefonoa
                + ", Kontratazio Data: " + kontratazioData + ", Id Nagusia: " + idNagusia;
    }
}

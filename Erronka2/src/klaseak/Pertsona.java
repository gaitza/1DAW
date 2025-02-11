package klaseak;

public class Pertsona {
    private String izena;
    private String abizenak;

    // Constructor
    public Pertsona(String izena, String abizenak) {
        this.izena = izena;
        this.abizenak = abizenak;
    }

    // Getters & Setters
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

    @Override
    public String toString() {
        return "Izena: " + izena + ", Abizenak: " + abizenak;
    }
}

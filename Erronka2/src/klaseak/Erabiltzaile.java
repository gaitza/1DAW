package klaseak;

public class Erabiltzaile extends Pertsona {
    private String pasahitza;

    // Constructor
    public Erabiltzaile(String izena, String abizenak, String pasahitza) {
        super(izena, abizenak);  
        this.pasahitza = pasahitza;
    }

    // Getter & Setter
    public String getPasahitza() {
        return pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

    // Modificación del método toString
    @Override
    public String toString() {
        return getIzena() + ":" + pasahitza;  
    }
}

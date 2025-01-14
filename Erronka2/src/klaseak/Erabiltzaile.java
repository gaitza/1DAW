package klaseak;

public class Erabiltzaile {
	    private String izena;
	    private String pasahitza;

	    public Erabiltzaile(String izena, String pasahitza) {
	        this.izena = izena;
	        this.pasahitza = pasahitza;
	    }

	    public String getIzena() {
	        return izena;
	    }

	    public String getPasahiza() {
	        return pasahitza;
	    }

	    @Override
	    public String toString() {
	        return izena + ":" + pasahitza;
	    }
	

}

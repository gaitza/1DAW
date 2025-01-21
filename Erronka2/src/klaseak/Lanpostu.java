package klaseak;

public class Lanpostu {
	private int id;
	private String Deskribapena;
	
	//Kontruktorea
	public Lanpostu(int id, String deskribapena) {
		super();
		this.id = id;
		Deskribapena = deskribapena;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeskribapena() {
		return Deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		Deskribapena = deskribapena;
	}

	@Override
	public String toString() {
		return "Lanpostu [id=" + id + ", Deskribapena=" + Deskribapena + "]";
	}
	
	

}

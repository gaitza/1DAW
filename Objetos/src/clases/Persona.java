package clases;

public class Persona {

	String Nombre;
	int edad;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad) {
		super();
		Nombre = nombre;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + "]";
	}
	
	void saludar() {
		System.out.println("Hola, mi nombre es: " + this.Nombre);;
	}


}

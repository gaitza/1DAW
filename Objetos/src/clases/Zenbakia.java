package clases;

import java.util.Scanner;

public class Zenbakia {

	// Atributo privado para almacenar el número 
	private int zenbakia;

	// Constructor por defecto (inicializa con 0)
	public Zenbakia() {
		this.zenbakia = 0;
	}

	// Constructor con un valor inicial
	public Zenbakia(int hasierakoZenbakia) {
		this.zenbakia = hasierakoZenbakia;
	}

	// Metodo para sumar un número al valor 
	public void batu(int zenbakiBat) {
		this.zenbakia += zenbakiBat;
	}

	// Metodo para restar un número al valor 
	public void kendu(int zenbakiBat) {
		this.zenbakia -= zenbakiBat;
	}

	// Metodo para obtener el valor 
	public int getBalioa() {
		return this.zenbakia;
	}

	// Metodo para obtener el doble del valor 
	public int getBikoitza() {
		return this.zenbakia * 2;
	}

	// Metodo para obtener el triple del valor 
	public int getHirukoitza() {
		return this.zenbakia * 3;
	}

	// Metodo para establecer un nuevo valor al número interno
	public void setBalioa(int balioBerria) {
		this.zenbakia = balioBerria;
	}

	
	public static void main(String[] args) {

		// Crear un objeto usando el constructor por defecto
		Zenbakia z1 = new Zenbakia();
		System.out.println("Hasierako balioa: " + z1.getBalioa()); // 0

		// Cambiar el valor interno
		z1.setBalioa(10);
		System.out.println("Balio berria: " + z1.getBalioa()); // 10

		// Sumar y restar valores
		z1.batu(5);
		System.out.println("Batu 5: " + z1.getBalioa()); // 15
		z1.kendu(3);
		System.out.println("Kendu 3: " + z1.getBalioa()); // 12

		// Obtener el doble y el triple del valor
		System.out.println("Bikoitza: " + z1.getBikoitza()); // 24
		System.out.println("Hirukoitza: " + z1.getHirukoitza()); // 36

		// Crear un objeto con un valor inicial
		Zenbakia z2 = new Zenbakia(20);
		System.out.println("Hasierako balioa bikoiztuta: " + z2.getBalioa()); // 20
	}

}

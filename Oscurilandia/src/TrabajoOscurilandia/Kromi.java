package TrabajoOscurilandia;

import javax.swing.JOptionPane;

public class Kromi extends Carro {

	public String anioFabricacion;
	public String marca;
	private int tamano;
	
	public Kromi(int ocupantes, String fechaIngreso, int posicion, int fila, int columna) {
		super(ocupantes, fechaIngreso, posicion, fila, columna);
		// TODO Auto-generated constructor stub
		
	}
	public Kromi(int ocupantes, String fechaIngreso, int posicion, int fila, int columna, String anioFabricacion,
			String marca, int tamano) {
		super(ocupantes, fechaIngreso, posicion, fila, columna);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
		this.tamano = tamano;
	}
	public String getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + ", tamano=" + tamano + "]";
	}

	public void imprimir() {
		System.out.println("Anio Fabricacion: " + getAnioFabricacion() + "\n Marca: " + getMarca() + "\nTamano: " + getTamano());
	}
	
	

}

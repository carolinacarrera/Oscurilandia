package TrabajoOscurilandia;

import javax.swing.JOptionPane;

public class Kromi extends Carro {

	public String anioFabricacion;
	public String marca;
	

	public Kromi(int ocupantes, String fechaIngreso, int tamano) {
		super(ocupantes, fechaIngreso, tamano);
		// TODO Auto-generated constructor stub
	}

	public Kromi(int ocupantes, String fechaIngreso, int tamano, String anioFabricacion, String marca) {
		super(ocupantes, fechaIngreso, tamano);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
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

	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + ", tamano=" + tamano + "]";
	}

	public void imprimir() {
		System.out.println("Anio Fabricacion: " + getAnioFabricacion() + "\n Marca: " + getMarca() + "\nTamano: " + getTamano());
	}
	
	

}

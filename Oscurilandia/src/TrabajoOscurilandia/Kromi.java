package TrabajoOscurilandia;

import javax.swing.JOptionPane;

public class Kromi extends Carro {

	public String anioFabricacion;
	public String marca;
	
	

	
	public Kromi(int ocupantes, String fechaIngreso, int x, int y, String anioFabricacion, String marca) {
		super(ocupantes, fechaIngreso, x, y);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}

	public Kromi(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	}

	public Kromi(int x, int y) {
		super(x, y);
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
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}

	public void imprimir() {
		System.out.println("Anio Fabricacion: " + getAnioFabricacion() + "\n Marca: " + getMarca());
	}
	


}

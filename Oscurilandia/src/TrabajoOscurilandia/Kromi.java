package TrabajoOscurilandia;

import javax.swing.JOptionPane;

public class Kromi extends Carro {

	public String anioFabricacion;
	public String marca;
	
	

	
	public Kromi(int ocupantes, String fechaIngreso, int x, int y, String anioFabricacion, String marca) {
		super(ocupantes, fechaIngreso, x, y);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	} //fin constructor

	public Kromi(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} //fin constructor2

	public Kromi(int x, int y) {
		super(x, y);
	} //fin constructor
	
	public String getAnioFabricacion() {
		return anioFabricacion;
	} //fin Getter AnioFabricacion

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	} //fin Setter AnioFabricacion

	public String getMarca() {
		return marca;
	} //fin Getter Marca

	public void setMarca(String marca) {
		this.marca = marca;
	} //fin Setter Marca

	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	} // fin toString

	public void imprimir() {
		System.out.println("Anio Fabricacion: " + getAnioFabricacion() + "\n Marca: " + getMarca());
	} // fin metodo imprimir
	


} //fin class

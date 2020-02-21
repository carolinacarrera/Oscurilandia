package TrabajoOscurilandia;

/**
 * 
 * Esta es la clase que representa a los carros Kromi
 * @author Nicolas Alarcón, Carolina Carrera
 * @version 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Kromi.java">Versión en Github</a>
 *
 */


public class Kromi extends Carro {

	//Atributos de la clase

	public String anioFabricacion;
	public String marca;
	
	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param anioFabricacion Año de fabricacion del kromi
	 * @param marca Marca
	 * @param ocupantes Ocupantes del kromi
	 * @param fechaIngreso Fecha de ingreso del kromi
	 * @param x Posicion fila de carros
	 * @param y Posicion columna de carros
	 */

	
	public Kromi(int ocupantes, String fechaIngreso, int x, int y, String anioFabricacion, String marca) {
		super(ocupantes, fechaIngreso, x, y);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	} //cierre del constructor

	public Kromi(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		
	} //cierre del constructor2

	public Kromi(int x, int y) {
		super(x, y);
	} //cierre del constructor
	
	public String getAnioFabricacion() {
		return anioFabricacion;
	} //cierre Getter AnioFabricacion

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	} //cierre Setter AnioFabricacion

	public String getMarca() {
		return marca;
	} //cierre Getter Marca

	public void setMarca(String marca) {
		this.marca = marca;
	} //cierre Setter Marca

	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	} //cierre toString

	
	/**
	 * Método que imprime en consola los datos básicos de la clase Kromi
	 */
	public void imprimir() {
		System.out.println("Anio Fabricacion: " + getAnioFabricacion() + "\n Marca: " + getMarca());
	} //cierre metodo imprimir
	


} //cierre class

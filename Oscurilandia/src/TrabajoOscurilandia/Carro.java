package TrabajoOscurilandia;
/**
 * 
 * Esta es la clase que representa a los clientes que se asociarán a los vendedores
 * @author Nicolas Alarcón, Carolina Carrera
 * @version: 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Carro.java">Versión en Github</a>
 *
 */
//import javax.swing.JOptionPane;

public class Carro {
	//Atributos de la clase

	private int ocupantes;
	protected String fechaIngreso;
	private int x;
	private int y;

	/**
	 *
	 * Constructores de la clase
	 * @param ocupantes Ocupantes del kromi
	 * @param fechaIngreso Fecha de ingreso del kromi
	 * @param x Posicion fila de carros
	 * @param y Posicion columna de carros
	 */

	public Carro(int ocupantes, String fechaIngreso, int x, int y) {
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		this.x = x;
		this.y = y;
	} //fin constructor
	
	
	public Carro(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	} //fin constructor2

	
	public int getOcupantes() {
		return ocupantes;
	} //fin Getter Ocupantes


	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	} //fin Setter Ocupantes


	public String getFechaIngreso() {
		return fechaIngreso;
	} // fin Getter FechaIngreso


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	} //fin setter FechaIngreso


	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + "]" ;
	} //fin toString

	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes());
	} //fin metodo imprimir

	public int getX() {
		return x;
	} //fin getter X

	public void setX(int x) {
		this.x = x;
	} //fin setter X

	public int getY() {
		return y;
	} //fin getter Y

	public void setY(int y) {
		this.y = y;
	} //fin setter Y


} // fin class

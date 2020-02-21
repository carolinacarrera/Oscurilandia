package TrabajoOscurilandia;

/**
 * 
 * Esta es la clase que representa a los carros Caguanos
 * @author Nicolas Alarcón, Carolina Carrera
 * @version 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Caguanos.java">Versión en Github</a>
 *
 */


public class Caguanos extends Carro{
	//Atributos de la clase

	private String tiro;
	private String colorConfeti;
	
	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param tiro Tiro de huevo de parte de Caguano
	 * @param colorConfeti Color de confeti de Caguano
	 * @param ocupantes Ocupantes del kromi
	 * @param fechaIngreso Fecha de ingreso del kromi
	 * @param x Posicion fila de carros
	 * @param y Posicion columna de carros
	 */
	
	public Caguanos(int ocupantes, String fechaIngreso, int x, int y, String tiro, String colorConfeti) {
		super(ocupantes, fechaIngreso, x, y);
		this.tiro = tiro;
		this.colorConfeti = colorConfeti;
	} //cierre constructor

	public Caguanos(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} //cierre constructor2

	public Caguanos(int x, int y) {
		super(x, y);
	} //cierre constructor por defecto

	public String getTiro() {
		return tiro;
	} //cierre Getter Tiro

	public void setTiro(String tiro) {
		this.tiro = tiro;
	} //cierre Setter Tiro

	public String getColorConfeti() {
		return colorConfeti;
	} //cierre Getter ColorConfeti

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	} //cierre Setter ColorConfeti

	@Override
	public String toString() {
		return "Caguanos [tiro=" + tiro + ", colorConfeti=" + colorConfeti +"]";
	} //cierre toString

	/**
	 * Método que imprime en consola los datos básicos de la clase Caguanos
	 */
	public void imprimir() {
		System.out.println("Tiro: " + getTiro() + "\nColor confeti: " + getColorConfeti());
	} //cierre metodo imprimir
	
} //cierre class

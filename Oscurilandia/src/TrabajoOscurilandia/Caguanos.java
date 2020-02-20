package TrabajoOscurilandia;

/**
 * 
 * Esta es la clase que representa a los clientes que se asociarán a los vendedores
 * @author Nicolas Alarcón, Carolina Carrera
 * @version: 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Caguanos.java">Versión en Github</a>
 *
 */


public class Caguanos extends Carro{
	//Atributos de la clase

	private String tiro;
	private String colorConfeti;
	
	/**
	 *
	 * Constructores de la clase
	 * @param tiro Tiro de huevo de parte de Caguano
	 * @param colorConfeti Color de confeti de Caguano
	 */
	
	public Caguanos(int ocupantes, String fechaIngreso, int x, int y, String tiro, String colorConfeti) {
		super(ocupantes, fechaIngreso, x, y);
		this.tiro = tiro;
		this.colorConfeti = colorConfeti;
	} //fin constructor

	public Caguanos(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} //fin constructor2

	public Caguanos(int x, int y) {
		super(x, y);
	} // fin constructor por defecto

	public String getTiro() {
		return tiro;
	} // fin Getter Tiro

	public void setTiro(String tiro) {
		this.tiro = tiro;
	} //fin Setter Tiro

	public String getColorConfeti() {
		return colorConfeti;
	} //fin Getter ColorConfeti

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	} //fin Setter ColorConfeti

	@Override
	public String toString() {
		return "Caguanos [tiro=" + tiro + ", colorConfeti=" + colorConfeti +"]";
	} // fin toString

	public void imprimir() {
		System.out.println("Tiro: " + getTiro() + "\nColor confeti: " + getColorConfeti());
	} //fin metodo imprimir
	
} //fin class

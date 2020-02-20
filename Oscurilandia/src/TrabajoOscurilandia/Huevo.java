package TrabajoOscurilandia;
/**
 * 
 * Esta es la clase que representa a los clientes que se asociarán a los vendedores
 * @author Nicolas Alarcón, Carolina Carrera
 * @version: 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Huevo.java">Versión en Github</a>
 *
 */
import java.util.ArrayList;





public class Huevo {
	//Atributos de la clase

	private int posicionFila;
	private int posicionColumna;
	private int puntaje;
	
	/**
	 *
	 * Constructores de la clase
	 * @param posicionFila Posicion fila del huevo
	 * @param posicionColumna Posicion columna del huevo
	 * @param x puntaje Puntaje de destruccion
	 */
	
	@Override
	public String toString() {
		return "Huevo [posicionFila=" + posicionFila + ", posicionColumna=" + posicionColumna + ", puntaje=" + puntaje
				+ "]";
	} //fin toString


	public int getPosicionFila() {
		return posicionFila;
	} //fin Getter POsicionFila


	public void setPosicionFila(int posicionFila) {
		this.posicionFila = posicionFila;
	}// fin Setter PosicionFila


	public int getPosicionColumna() {
		return posicionColumna;
	} // fin Getter PosicionColumna


	public void setPosicionColumna(int posicionColumna) {
		this.posicionColumna = posicionColumna;
	} // fin Setter PosicionColumna


	public int getPuntaje() {
		return puntaje;
	} // fin Getter Puntaje


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	} //fin Setter Puntaje


	/*public ArrayList<Huevo> getHuevos() {
		return Huevos;
	}


	public void setHuevos(ArrayList<Huevo> huevos) {
		Huevos = huevos;
	}*/


	public Huevo() {
		super();
		// TODO Auto-generated constructor stub
	} //fin constructor por defecto


	public Huevo(int posicionFila, int posicionColumna, int puntaje, ArrayList<Huevo> huevos) {
		super();
		this.posicionFila = posicionFila;
		this.posicionColumna = posicionColumna;
		this.puntaje = puntaje;
	} // fin constructor

	
	static void mostrarColumna() {
			
	} //fin metodo mostrarColumna
	
	
	static void mostrarPuntaje() {
		
	} // fin metodo mostrarPuntaje
	
	
	
} //fin class

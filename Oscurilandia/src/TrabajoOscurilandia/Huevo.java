package TrabajoOscurilandia;
import java.util.ArrayList;





public class Huevo {
	//Atributos de la clase

	private int posicionFila;
	private int posicionColumna;
	private int puntaje;
	
	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param posicionFila Posicion fila del huevo
	 * @param posicionColumna Posicion columna del huevo
	 * @param x puntaje Puntaje de destruccion
	 */
	
	
	@Override
	public String toString() {
		return "Huevo [posicionFila=" + posicionFila + ", posicionColumna=" + posicionColumna + ", puntaje=" + puntaje
				+ "]";
	} //cierre toString


	public int getPosicionFila() {
		return posicionFila;
	} //cierre Getter POsicionFila


	public void setPosicionFila(int posicionFila) {
		this.posicionFila = posicionFila;
	} //cierre Setter PosicionFila


	public int getPosicionColumna() {
		return posicionColumna;
	} //cierre Getter PosicionColumna


	public void setPosicionColumna(int posicionColumna) {
		this.posicionColumna = posicionColumna;
	} //cierre Setter PosicionColumna


	public int getPuntaje() {
		return puntaje;
	} //cierre Getter Puntaje


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	} //cierre Setter Puntaje



	public Huevo() {
		super();
		// TODO Auto-generated constructor stub
	} //cierre constructor por defecto


	public Huevo(int posicionFila, int posicionColumna, int puntaje, ArrayList<Huevo> huevos) {
		super();
		this.posicionFila = posicionFila;
		this.posicionColumna = posicionColumna;
		this.puntaje = puntaje;
	} //cierre constructor

	
	static void mostrarColumna() {
			
	} //cierre metodo mostrarColumna
	
	
	static void mostrarPuntaje() {
		
	} //cierre metodo mostrarPuntaje
	
	
	
} //cierre class

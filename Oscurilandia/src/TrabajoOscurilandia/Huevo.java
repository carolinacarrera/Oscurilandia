package TrabajoOscurilandia;

import java.util.ArrayList;



/**
 * @author Nicolas Alarcón, Carolina Carrera, Alejandro Rojas
 *
 */

public class Huevo {
	
	private int posicionFila;
	private int posicionColumna;
	private int puntaje;
	

	
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

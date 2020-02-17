package TrabajoOscurilandia;

import java.util.ArrayList;

public class Huevo {
	
	private int posicionFila;
	private int posicionColumna;
	private int puntaje;
	

	
	@Override
	public String toString() {
		return "Huevo [posicionFila=" + posicionFila + ", posicionColumna=" + posicionColumna + ", puntaje=" + puntaje
				+ "]";
	}


	public int getPosicionFila() {
		return posicionFila;
	}


	public void setPosicionFila(int posicionFila) {
		this.posicionFila = posicionFila;
	}


	public int getPosicionColumna() {
		return posicionColumna;
	}


	public void setPosicionColumna(int posicionColumna) {
		this.posicionColumna = posicionColumna;
	}


	public int getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}


	public ArrayList<Huevo> getHuevos() {
		return Huevos;
	}


	public void setHuevos(ArrayList<Huevo> huevos) {
		Huevos = huevos;
	}


	public Huevo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Huevo(int posicionFila, int posicionColumna, int puntaje, ArrayList<Huevo> huevos) {
		super();
		this.posicionFila = posicionFila;
		this.posicionColumna = posicionColumna;
		this.puntaje = puntaje;
	}

	
	static void mostarColumna() {
			
	}
	
	
	static void mostarPuntaje() {
		
	}
	
	
	
}

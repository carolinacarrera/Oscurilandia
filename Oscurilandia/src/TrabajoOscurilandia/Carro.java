package TrabajoOscurilandia;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Carro {
	
	private int ocupantes;
	private String fechaIngreso;
	private int posicion;
	private int fila;
	private int columna;
	public Carro(int ocupantes, String fechaIngreso, int posicion, int fila, int columna) {
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		this.posicion = posicion;
		this.fila = fila;
		this.columna = columna;
	}
	public int getOcupantes() {
		return ocupantes;
	}
	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + ", posicion=" + posicion + ", fila="
				+ fila + ", columna=" + columna + "]";
	}
	
	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes() + "\n Posicion: " + getPosicion());
	}
	
	
	
	public static void agregarCarro() {
	int tipoAnimal = JOptionPane.showInputDialog("AGREGAR TIPO DE CARRO:"
			+ "\n" + "1.- Kromis"
					+ "\n" + "2.- Caguano"
							+ "\n" + "3.- Trupalla").charAt(0);
	
	switch (tipoAnimal) {
	
	case '1':
			
		// nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
		
			
		}
	
	
}
}

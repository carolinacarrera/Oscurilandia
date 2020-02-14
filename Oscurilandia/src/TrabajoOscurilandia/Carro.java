package TrabajoOscurilandia;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Carro {

	private static int ocupantes;
	private static String fechaIngreso;
	private int posicion;

	public Carro(int ocupantes, String fechaIngreso, int posicion, int fila, int columna) {
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		

	}
	public static int getOcupantes() {
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
	

	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + "]" ;
	}

	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes());
	}



	

}

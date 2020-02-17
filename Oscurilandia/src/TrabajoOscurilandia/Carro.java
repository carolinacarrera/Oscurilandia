package TrabajoOscurilandia;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Carro {

	private static int ocupantes;
	private static String fechaIngreso;
	public int tamano;

	public Carro(int ocupantes, String fechaIngreso, int tamano) {
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		this.tamano = tamano;
	}
	

	public static int getOcupantes() {
		return ocupantes;
	}




	public static void setOcupantes(int ocupantes) {
		Carro.ocupantes = ocupantes;
	}




	public static String getFechaIngreso() {
		return fechaIngreso;
	}




	public static void setFechaIngreso(String fechaIngreso) {
		Carro.fechaIngreso = fechaIngreso;
	}




	public int getTamano() {
		return tamano;
	}




	public void setTamano(int tamano) {
		this.tamano = tamano;
	}




	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + "]" ;
	}

	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes());
	}



	

}

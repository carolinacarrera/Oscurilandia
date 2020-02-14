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
		this.posicion = posicion;

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

	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + ", posicion=" + posicion + "]";
	}

	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes() + "\n Posicion: " + getPosicion());
	}



	public static void agregarCarro() {


		int tipoCarro = JOptionPane.showInputDialog("AGREGAR TIPO DE CARRO:"
				+ "\n" + "1.- Kromis"
				+ "\n" + "2.- Caguano"
				+ "\n" + "3.- Trupalla").charAt(0);

		switch (tipoCarro) {

		case '1':
			
			for (int i = 0; i < 3; i++) {
				
			fechaIngreso = JOptionPane.showInputDialog("Ingrese Fecha Ingreso de Kromis: " + 1);
			String ocupantes = JOptionPane.showInputDialog("Ingrese Ocupantes de Kromis: ");
			break;
			
			}
		case '2':

			String distaciaTiro = JOptionPane.showInputDialog("Ingrese Distancia de Tiro de Caguano: ");
			String colorConfeti = JOptionPane.showInputDialog("Ingrese color de confeti de Caguano: ");
			break;

		case '3':

			String nivelArmadura = JOptionPane.showInputDialog("Ingrese Nivel Armadura Trupalla: ");
			break;

		default:
			break;
		}


	}


}

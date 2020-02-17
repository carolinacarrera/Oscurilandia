package TrabajoOscurilandia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Tablero {


	public static int numerosFila = 15;// numeros filas
	public static int numerosColumnas=15;// numeros columnas
	public int carrosJugador; //carros jugadores

	private static char [][] tablero = new char[numerosFila][numerosColumnas];//tamaño tablero

	public static List<Carro> Carros = new ArrayList <Carro>(); //debe tener un maximo de 18 objetos, carros.
	public List<Huevo> Huevos = new ArrayList <Huevo>(); //ilimitados

	Scanner lector = new Scanner(System.in);


	public int getNumerosFila() {
		return numerosFila;
	}


	public void setNumerosFila(int numerosFila) {
		this.numerosFila = numerosFila;
	}


	public int getNumerosColumnas() {
		return numerosColumnas;
	}


	public void setNumerosColumnas(int numerosColumnas) {
		this.numerosColumnas = numerosColumnas;
	}


	public int getCarrosJugador() {
		return carrosJugador;
	}


	public void setCarrosJugador(int carrosJugador) {
		this.carrosJugador = carrosJugador;
	}


	public char[][] getTablero() {
		return tablero;
	}


	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}


	public List<Carro> getCarros() {
		return Carros;
	}


	public void setCarros(List<Carro> carros) {
		Carros = carros;
	}


	public List<Huevo> getHuevos() {
		return Huevos;
	}


	public void setHuevos(List<Huevo> huevos) {
		Huevos = huevos;
	}


	public Scanner getLector() {
		return lector;
	}


	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	@Override
	public String toString() {
		return "Tablero [numerosFila=" + numerosFila + ", numerosColumnas=" + numerosColumnas + ", carrosJugador="
				+ carrosJugador + ", tablero=" + Arrays.toString(tablero) + ", Carros=" + Carros + ", Huevos=" + Huevos
				+ ", lector=" + lector + "]";
	}


	public Tablero(int numerosFila, int numerosColumnas, int carrosJugador, char[][] tablero, List<Carro> carros,
			List<Huevo> huevos, Scanner lector) {
		this.numerosFila = numerosFila;
		this.numerosColumnas = numerosColumnas;
		this.carrosJugador = carrosJugador;
		this.tablero = tablero;
		Carros = carros;
		Huevos = huevos;
		this.lector = lector;
	}


	public static void CrearCarro() {

		JOptionPane.showMessageDialog(null, "Ingresa informacion Carros");




		for (int i = 1; i < 4; i++) {

			String fechaIngreso = JOptionPane.showInputDialog("Ingrese Fecha Ingreso de Kromis: " + i);
			String ocupantes = JOptionPane.showInputDialog("Ingrese Ocupantes de Kromis: " + i);


		}

		for (int j = 1; j < 8; j++) {

			String distaciaTiro = JOptionPane.showInputDialog("Ingrese Distancia de Tiro de Caguano: " + j);
			String colorConfeti = JOptionPane.showInputDialog("Ingrese color de confeti de Caguano: " + j);

		}

		for (int k = 1; k < 11; k++) {

			String nivelArmadura = JOptionPane.showInputDialog("Ingrese Nivel Armadura Trupalla: " + k) ;

		}	

	}	


	public static void LanzarHuevo() {

	}


	public static void MostarMatriz() {
		for (int i = 0; i < 15; i++) {
			System.out.print("[ ]");
			for (int j = 0; j <15; j++) {

				System.out.print(tablero[i][j]+"[ ]");


			}
			System.out.println("");
		}

	}


	public static void CalcularPuntaje(){

	}

	public static void CrearKromi() {
	}

	public static void CrearCaguanos() {
	}

	public static void CrearTrupalla() {
	}


}


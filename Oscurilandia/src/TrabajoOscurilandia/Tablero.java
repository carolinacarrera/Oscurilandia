package TrabajoOscurilandia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Tablero {
	
	
	public int numerosFila = 15;// numeros filas
	public int numerosColumnas=15;// numeros columnas
	public int carrosJugador; //carros jugadores
	public String [][] tablero = new String[numerosFila][numerosColumnas];//tamaño tablero
	
	public List<Carro> Carros = new ArrayList <Carro>(); //debe tener un maximo de 18 objetos, carros.
	public List<Huevo> Huevos = new ArrayList <Huevo>(); //ilimitados
	
	Scanner lector = new Scanner(System.in);
	
	
	public static void CrearCarro() {
		
	}
	
	
	public static void LanzarHuevo() {
		
	}
	
	
	public static void MostarMatriz() {
		
	}
	
	
	public static void CalcularPuntaje(){
	
	}
	
	
}


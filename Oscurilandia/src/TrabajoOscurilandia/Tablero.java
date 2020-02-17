package TrabajoOscurilandia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Tablero {


	public static int numerosFila = 15;// numeros filas
	public static int numerosColumnas=15;// numeros columnas
	

	private static char [][] tablero = new char[numerosFila][numerosColumnas];//tamaño tablero

	private Carro carros[] = new Carro[18]; //debe tener un maximo de 18 objetos, carros.
	public ArrayList<Huevo> Huevos = new ArrayList <Huevo>(); //ilimitados
	Scanner lector = new Scanner(System.in);


	public static int getNumerosFila() {
		return numerosFila;
	}


	public static void setNumerosFila(int numerosFila) {
		Tablero.numerosFila = numerosFila;
	}


	public static int getNumerosColumnas() {
		return numerosColumnas;
	}


	public static void setNumerosColumnas(int numerosColumnas) {
		Tablero.numerosColumnas = numerosColumnas;
	}


	public static char[][] getTablero() {
		return tablero;
	}


	public static void setTablero(char[][] tablero) {
		Tablero.tablero = tablero;
	}


	public Carro[] getCarros() {
		return carros;
	}


	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}


	public List<Huevo> getHuevos() {
		return Huevos;
	}


	public Scanner getLector() {
		return lector;
	}


	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	


	
	/*public static void CrearCarro() {

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

	}*/	


	public void setHuevos(ArrayList<Huevo> huevos) {
		Huevos = huevos;
	}


	public Tablero() {
		// TODO Auto-generated constructor stub
	}


	public static void LanzarHuevo() {

	}


	public static void CalcularPuntaje(){

	}

	
	public void crearCarro() {
		
		carros[0] = CrearKromi();
		carros[1] = CrearKromi();
		carros[2] = CrearKromi();
		carros[3] = crearCaguano();
		carros[4] = crearCaguano();
		carros[5] = crearCaguano();
		carros[6] = crearCaguano();
		carros[7] = crearCaguano();
		carros[8] = crearTrupalla();
		carros[9] = crearTrupalla();
		carros[10] = crearTrupalla();
		carros[11] = crearTrupalla();
		carros[12] = crearTrupalla();
		carros[13] = crearTrupalla();
		carros[14] = crearTrupalla();
		carros[15] = crearTrupalla();
		carros[16] = crearTrupalla();
		carros[17] = crearTrupalla();
		
				
	}
	

	public Kromi CrearKromi() {
		int x;
		int y;
		
		boolean  posicionVacia= false;
		
		do {
			
			x=(int)(Math.random()*13);
			y=(int)(Math.random()*15);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
			
				if (tablero[x+1][y]!='T' && tablero[x+1][y]!='C' && tablero[x+1][y]!='K') {
					if (tablero[x+2][y]!='T' && tablero[x+2][y]!='C' && tablero[x+2][y]!='K') {
						posicionVacia = true ;
						tablero[x][y]='K';
						tablero[x+1][y]='K';
						tablero[x+2][y]='K';
						
					}
				}
			}
			
		}while(!posicionVacia);
		
		return new Kromi(x,y);
			
	}		
	

	public Caguanos crearCaguano() {

		int x;
		int y;
		
		boolean posicionVacio= false;
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*14);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
			
				if (tablero[x][y+1]!='T' && tablero[x][y+1]!='C' && tablero[x][y+1]!='K') {
					
						posicionVacio = true ;
						tablero[x][y]='C';
						tablero[x][y+1]='C';
				}
			}
			
		
		
		}while(!posicionVacio);
		
		return new Caguanos(x,y);
		
		
		
	}

	public Trupalla crearTrupalla() {
		int x;
		int y;
		
		boolean vacio= false;
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*15);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
	
						vacio = true ;
						tablero[x][y]='T';
			}

		}while(!vacio);
		
		return new Trupalla(x,y);
	}

	public static void MostarMatriz() {
		for (int i = 0; i < 15; i++) {
			System.out.print("|");
			for (int j = 0; j <15; j++) {
				System.out.print(tablero[i][j]+"|");


			}
			System.out.println("");
		}

	}
	
	
}


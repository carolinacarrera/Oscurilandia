package TrabajoOscurilandia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tablero {


	public static int numerosFila = 15;// numeros filas
	public static int numerosColumnas=15;// numeros columnas
	
	public static int puntaje = 0;
	public static char [][] tablero = new char[numerosFila][numerosColumnas];//tamaño tablero

	private Carro carros[] = new Carro[18]; //debe tener un maximo de 18 objetos, carros.
	public ArrayList<Huevo> Huevos = new ArrayList <Huevo>(); //ilimitados
	private static Scanner lector = new Scanner(System.in);


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

	
	public void setHuevos(ArrayList<Huevo> huevos) {
		Huevos = huevos;
	}


	public Tablero() {
		// TODO Auto-generated constructor stub
	}


	public static void LanzarHuevo() {
		String opcionFila;
		String opcionColumna;
		
		JOptionPane.showMessageDialog(null, "....Lanza tu huevo....");
		opcionFila = JOptionPane.showInputDialog("Ingresa fila: ");
				
		//System.out.println("Ingrese fila: ");
		//int fila = lector.nextInt();
		
		opcionColumna = JOptionPane.showInputDialog("Ingresa Columna: ");
		
		//System.out.println("Ingrese columna: ");
		//int columna = lector.nextInt();
		
		int fila;
		int columna;
		
		fila = Integer.parseInt(opcionFila);
		columna = Integer.parseInt(opcionColumna);
		
		
		
		if (tablero[fila][columna] == 'K') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 3;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		}
		else if (tablero[fila][columna] == 'C') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 2;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		}
		
		else if (tablero[fila][columna] == 'T') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 1;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		}
		
		else {
			
			tablero[fila][columna] = 'X';
			JOptionPane.showMessageDialog(null, "Fallaste");
		}
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
	
	public void calcularCarrosDestruidos() {
		
		for (int i=0; i<3;i++) {
			Carro kro = carros[i];
			int x = kro.getX();
			int y = kro.getY();
			if (tablero[x][y] == 'H' && tablero[x+1][y] == 'H' && tablero[x+2][y] == 'H') {
				puntaje += 10;
			}
		}
		
		for (int i=3; i<8;i++) {
			Carro cag = carros[i];
			int x = cag.getX();
			int y = cag.getY();
			if (tablero[x][y] == 'H' && tablero[x][y+1] == 'H') {
				puntaje += 7;
			}
		}	
	}
	

	public Kromi CrearKromi() {
		
		int x;
		int y;
		int ocupante;
		String fechaIngreso;
		String marca;
		String anioFabri;
		
		boolean  posicionVacia= false;
		
		
		ocupante = JOptionPane.showInputDialog("Ingresa cantidad de ocupantes: ").charAt(0);
		//System.out.println("Ingrese cantidad de ocupantes: ");
		//int ocupante = lector.nextInt();
		
		fechaIngreso = JOptionPane.showInputDialog("Fecha ingreso Kromis: ");
		
		//System.out.println("Ingrese Fecha Ingreso de Kromis: ");
		//String fechaIngreso = lector.next();
		
		marca = JOptionPane.showInputDialog("Ingrese marca de la Kromi: ");
		
		//System.out.println("Ingrese marca Kromi");
		//String marca = lector.next();
			
		anioFabri = JOptionPane.showInputDialog("Ingrese anio fabricacion: ");
		
		//System.out.println("Ingrese anio fabricacion: ");  
		//String anioFabri = lector.next(); 
	
			
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
		
		Kromi Kro = new Kromi(ocupante, fechaIngreso, x, y, anioFabri, marca);
			
		return Kro;
				
	}		
	
	public Caguanos crearCaguano() {

		int x;
		int y;
		int ocupantes;
		String fechaing;
		String tiro;
		String colorConfeti;
		
		boolean posicionVacio= false;
		
		JOptionPane.showMessageDialog(null, ".....Creando Caguanos.....");
		//System.out.println("... Creando Caguano ...");
		
		ocupantes = JOptionPane.showInputDialog("Ingrese cantidad de ocupantes: ").charAt(0);
		//System.out.println("Ingrese cantidad de ocupantes: ");
		//int ocupantes = lector.nextInt();
		
		fechaing = JOptionPane.showInputDialog("Ingrese fecha ingreso: ");
		
		//System.out.println("Ingrese fecha: ");
		//String fechaing = lector.next();
		
		tiro = JOptionPane.showInputDialog("Ingrese largo de tiro: ");
		
		//System.out.println("Ingrese tiro: ");
		//String tiro = lector.next();
		
		colorConfeti = JOptionPane.showInputDialog("Ingrese color confeti: ");
		
		//System.out.println("Color de Confetti: ");
		//String colorConfeti = lector.next();
		
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
		
		Caguanos cagua = new Caguanos (ocupantes,fechaing,x,y,tiro,colorConfeti);
		
		return cagua;
				
	}

	public Trupalla crearTrupalla() {
		int x;
		int y;
		
		boolean vacio= false;
		
		System.out.println("... Creando Trupalla ...");
		
		System.out.println("Ingrese cantidad de ocupantes: ");
		int ocupantes = lector.nextInt();

		System.out.println("Ingrese fecha: ");
		String fechaing = lector.next();
		
		System.out.println("Ingrese nivel de armadura: ");
		int NivelArmadura = lector.nextInt();
		

		
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*15);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
	
						vacio = true ;
						tablero[x][y]='T';
			}

		}while(!vacio);
		
		Trupalla trupa = new Trupalla (ocupantes,fechaing,x,y,NivelArmadura);
		
		return trupa;
	}
	
	public static void MostarMatriz() {
		
		System.out.println("---El tablero es el siguiente-- \n");
		for (int i = 0; i < 15; i++) {
			System.out.print("|");
			for (int j = 0; j <15; j++) {
				System.out.print(tablero[i][j]+"|");
			}
			System.out.println("");
		}
	}
	
	
}


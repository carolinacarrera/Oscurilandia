package TrabajoOscurilandia;

/**
 * 
 * Esta es la clase que representa al tablero
 * @author Nicolas Alarcón, Carolina Carrera
 * @version: 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Tablero.java">Versión en Github</a>
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tablero {


	public static int numerosFila = 15;// numeros filas
	public static int numerosColumnas=15;// numeros columnas
	
	public static int puntaje = 0;
	public static char [][] tablero = new char[numerosFila][numerosColumnas];//tamaño tablero

	private static Carro carros[] = new Carro[18]; //debe tener un maximo de 18 objetos, carros.
	public ArrayList<Huevo> Huevos = new ArrayList <Huevo>(); //ilimitados
	private static Scanner lector = new Scanner(System.in);

	

	public static int getNumerosFila() {
		return numerosFila;
	} //cierre Getter NumerosFila


	public static void setNumerosFila(int numerosFila) {
		Tablero.numerosFila = numerosFila;
	} //cierre Setter Numeros Fila


	public static int getNumerosColumnas() {
		return numerosColumnas;
	} //cierre Getter Numeros Columnas

	
	public static void setNumerosColumnas(int numerosColumnas) {
		Tablero.numerosColumnas = numerosColumnas;
	} //cierre Setter numeros columnas


	public static char[][] getTablero() {
		return tablero;
	} //cierre Getter Tablero array list


	public static void setTablero(char[][] tablero) {
		Tablero.tablero = tablero;
	} //cierre Setter Tablero array list


	public Carro[] getCarros() {
		return carros;
	} //cierre Getter Carros array list


	public void setCarros(Carro[] carros) {
		this.carros = carros;
	} //cierre Setter Carros array list


	public List<Huevo> getHuevos() {
		return Huevos;
	} //cierre Getter Huevos list

	
	public void setHuevos(ArrayList<Huevo> huevos) {
		Huevos = huevos;
	} //cierre Setter Huevos


	public Tablero() {	
	} //cierre constructor por defecto

	
	/**
	 *
	 * Constructor de la clase
	 * @param opcionFila Recoge posicion de ataque en las filas
	 * @param opcionColumna Recoge posicion de ataque en las columnas
	 */
	
	public static void LanzarHuevo() {
		String opcionFila;
		String opcionColumna;
		
		JOptionPane.showMessageDialog(null, "....Lanza tu huevo....");
		opcionFila = JOptionPane.showInputDialog("Ingresa fila: ");
		
		opcionColumna = JOptionPane.showInputDialog("Ingresa Columna: ");
		
		int fila;
		int columna;
		
		fila = Integer.parseInt(opcionFila);
		columna = Integer.parseInt(opcionColumna);
		
		if (tablero[fila][columna] == 'K') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 3;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		} //cierre if
		
		else if (tablero[fila][columna] == 'C') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 2;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		} //cierre if
		
		else if (tablero[fila][columna] == 'T') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 1;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		} //cierre if
		
		else if (tablero[fila][columna] == 'H') {
			tablero [fila][columna] = 'H';
			JOptionPane.showMessageDialog(null, "Ya golpeaste a un Carro en esta posicion");
		} //cierre if
		
		else if (tablero[fila][columna] == 'X')
			JOptionPane.showMessageDialog(null, "Ya ocupaste esta coordenadas");
		else {
			
			tablero[fila][columna] = 'X';
			JOptionPane.showMessageDialog(null, "Fallaste");
		} //cierre else
		
		for (int i=0; i<3;i++) {
			Carro kro = carros[i];
			int x = kro.getX();
			int y = kro.getY();
			if (tablero[x][y] == 'H' && tablero[x+1][y] == 'H' && tablero[x+2][y] == 'H') {
				puntaje += 10;
			}
		} //cierre for
		
		for (int i=3; i<8;i++) {
			Carro cag = carros[i];
			int x = cag.getX();
			int y = cag.getY();
			if (tablero[x][y] == 'H' && tablero[x][y+1] == 'H') {
				puntaje += 7;
			}
		} //cierre for
		
	} //cierre metodo lanzar huevo

	public static void CalcularPuntaje(){
		JOptionPane.showMessageDialog(null, "Tu puntaje es: " + puntaje);
	} // cierre metodo Calcular Puntaje

	
	public static int getPuntaje() {
		return puntaje;
	} //cierre Getter puntaje


	public static void setPuntaje(int puntaje) {
		Tablero.puntaje = puntaje;
	} //cierre Setter puntaje


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
	} //cierre lista carros array
	
	
	/**
	 *
	 * Constructor de la clase
	 * @param x Posicion aleatoria en la fila
	 * @param y Posicion aleatoria en las columnas
	 * @param marca Marca de Kromi
	 * @param anioFabri Año de fabricacion de Kromi

	 */
	
	public Kromi CrearKromi() {
		
		int x;
		int y;
		String fechaIngreso;
		String marca;
		String anioFabri;
		
		boolean  posicionVacia= false;
		
		
		String numOcupantes = JOptionPane.showInputDialog("Ingrese numero de ocupantes: ");
		
		int ocupante=Integer.parseInt(numOcupantes);
				
		fechaIngreso = JOptionPane.showInputDialog("Fecha ingreso Kromis: ");
				
		marca = JOptionPane.showInputDialog("Ingrese marca de la Kromi: ");
					
		anioFabri = JOptionPane.showInputDialog("Ingrese anio fabricacion: ");
					
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
				}//cierre if 
			} //cierre if 
		
		}while(!posicionVacia); //cierre ciclo do while
		
		
		Kromi Kro = new Kromi(ocupante, fechaIngreso, x, y, anioFabri, marca);
			
		return Kro;
				
	} //cierre constructor Crear Kromi
	
	
	/**
	 *
	 * Constructor de la clase
	 * @param x Posicion aleatoria en la fila
	 * @param y Posicion aleatoria en las columnas
	 * @param fechaing Fecha de ingreso de Caguano
	 * @param tiro tiro de Caguano
	 * @param colorConfeti Color de confeti de Caguano

	 */
	
	public Caguanos crearCaguano() {

		int x;
		int y;
		String fechaing;
		String tiro;
		String colorConfeti;
		
		boolean posicionVacio= false;
		
		JOptionPane.showMessageDialog(null, ".....Creando Caguanos.....");
				
		String numOcupantes = JOptionPane.showInputDialog("Ingrese numero de ocupantes: ");
		
		int ocupantes =Integer.parseInt(numOcupantes);
		
		
		fechaing = JOptionPane.showInputDialog("Ingrese fecha ingreso: ");
		
		tiro = JOptionPane.showInputDialog("Ingrese largo de tiro: ");
				
		colorConfeti = JOptionPane.showInputDialog("Ingrese color confeti: ");
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*14);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
			
				if (tablero[x][y+1]!='T' && tablero[x][y+1]!='C' && tablero[x][y+1]!='K') {
					
						posicionVacio = true ;
						tablero[x][y]='C';
						tablero[x][y+1]='C';
				}
			}//cierre if
			
		}while(!posicionVacio); //cierre ciclo do while
		
		Caguanos cagua = new Caguanos (ocupantes,fechaing,x,y,tiro,colorConfeti);
		
		return cagua;
				
	} //cierre constructor Crear Caguano

	
	/**
	 *
	 * Constructor de la clase
	 * @param x Posicion aleatoria en la fila
	 * @param y Posicion aleatoria en las columnas
	 * @param fechaing Fecha de ingreso de Trupalla
	 * @param nivelArm Nivel de armamento de Trupalla

	 */
	
	
	public Trupalla crearTrupalla() {
		int x;
		int y;
		String fechaing;
		String nivelArm;
		
		
		boolean vacio= false;
		
		String numOcupantes = JOptionPane.showInputDialog("Ingrese numero de ocupantes: ");
		
		int ocupantes =Integer.parseInt(numOcupantes);
		
		fechaing = JOptionPane.showInputDialog("Ingrese fecha ingreso: ");
		
		nivelArm = JOptionPane.showInputDialog("Ingresa armadura de Trupalla: ");
		
		int nivelArmadura = Integer.parseInt(nivelArm);
		
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*15);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
	
						vacio = true ;
						tablero[x][y]='T';
			} 

		}while(!vacio); //cierre cierre del ciclo do while
		
		Trupalla trupa = new Trupalla (ocupantes,fechaing,x,y,nivelArmadura);
		
		return trupa;
	} //cierre metodo crearTrupalla
	
	public static void MostarMatriz() {
		
		System.out.println("---El tablero es el siguiente-- \n");
		for (int i = 0; i < 15; i++) {
			System.out.print("|");
			for (int j = 0; j <15; j++) {
				System.out.print(tablero[i][j]+"|");
			} //cierre ciclo for
			System.out.println("");
		} //cierre ciclo for
	} //cierre metodo MostrarMatriz
	
	
} //cierre clase


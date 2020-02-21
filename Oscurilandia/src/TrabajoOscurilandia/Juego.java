package TrabajoOscurilandia;

/**
 * 
 * Inico de programa Oscurilandia, juego tipo Batalla Naval
 * @author Nicolas Alarcón, Carolina Carrera
 * @version 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Juego.java">Versión en Github</a>
 *
 */

import javax.swing.JOptionPane;


public class Juego {

	
	static Tablero tablero1= new Tablero(); //instancia tablero
	
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "BIENVENIDO A FIRSTLINE");
		int opcion;
		
		do { // ciclo menu
			
		opcion = JOptionPane.showInputDialog("\n ****MENU**** \na.- Crear Carros "
				+ "\nb.- Mostrar Matriz "
				+ "\nc.- Lanzar Huevos "
				+ "\nd.- Mostrar Puntaje"
				+ "\ne.- Salir"
				+ "\nIngresa Opcion: ").charAt(0);
		
			switch (opcion) {
			
			case 'a' :
				JOptionPane.showMessageDialog(null,"Ingresaremos los siguientes carros:\n"
						+ "\n3 Kromis" 
						+ "\n10 Trupallas"
						+ "\n5 Caguanos\n"
						+ "\n Despues de ello..\n"
						+ "\n COMENZARA LA REVELION"
						+ "\n ");
				tablero1.crearCarro();
				break;
				
			case 'b':
				Tablero.MostarMatriz();
				break;
			
			case 'c':	
				Tablero.LanzarHuevo();
				break;
				
			case 'd':
				Tablero.CalcularPuntaje();
				break;
				
			case 'e':
				JOptionPane.showMessageDialog(null, "Adios");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Ingrese opcion valida");
				break;
			} //cierre switch

			} while (opcion != 'e'); //fin of do

	} //cierre main
	} //cierre class

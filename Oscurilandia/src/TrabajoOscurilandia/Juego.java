package TrabajoOscurilandia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego {

	
	static Tablero tablero1= new Tablero();
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "BIENVENIDO A FIRSTLINE");
		int opcion;
		
		do { // apertura of do
			
		opcion = JOptionPane.showInputDialog("\n ****MENU**** \na.- Crear Carros "
				+ "\nb.- Mostrar Matriz "
				+ "\nc.- Lanzar Huevos "
				+ "\nd.- Salir \n"
				+ "\nIngresa Opcion: ").charAt(0);
		
			switch (opcion) {
			
			case 'a' :
				JOptionPane.showMessageDialog(null,"Ingresaremos los siguientes carros:\n"
						+ "\n3 Kromis" 
						+ "\n7 Tupallas"
						+ "\n8 Caguanos\n"
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
				JOptionPane.showMessageDialog(null, "Adios");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Ingrese opcion valida");
				return;
			} //fin switch
			
			} while (opcion != 'd'); //fin of do

	} // fin main
} // fin class

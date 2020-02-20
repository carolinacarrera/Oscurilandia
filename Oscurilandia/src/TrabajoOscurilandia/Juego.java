package TrabajoOscurilandia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego {

	
	static Tablero tablero1= new Tablero();
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "BIENVENIDO A FIRSTLINE");
		int opcion;
		do {
			
		opcion = JOptionPane.showInputDialog("\n ****MENU**** \na.- Crear carros "
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
			}
			
			} while (opcion != 'e');
		}
}

package TrabajoOscurilandia;

import javax.swing.JOptionPane;

public class Carro {

	private static int ocupantes;

	protected static String fechaIngreso;
	private static int x;
	private static int y;


	public Carro(int ocupantes, String fechaIngreso, int x, int y) {
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		this.x = x;
		this.y = y;
	}
	
	public Carro(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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


	
	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + "]" ;
	}

	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes());
	}



	

}

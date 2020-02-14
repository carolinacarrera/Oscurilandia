package TrabajoOscurilandia;

public class Trupalla extends Carro {

	private int NivelArmadura;
	private int tamano;
	public Trupalla(int ocupantes, String fechaIngreso, int posicion, int fila, int columna) {
		super(ocupantes, fechaIngreso, posicion, fila, columna);
		// TODO Auto-generated constructor stub
	}
	public Trupalla(int ocupantes, String fechaIngreso, int posicion, int fila, int columna, int nivelArmadura,
			int tamano) {
		super(ocupantes, fechaIngreso, posicion, fila, columna);
		NivelArmadura = nivelArmadura;
		this.tamano = tamano;
	}
	public int getNivelArmadura() {
		return NivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		NivelArmadura = nivelArmadura;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	
	
	
}

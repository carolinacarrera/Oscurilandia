package TrabajoOscurilandia;

public class Trupalla extends Carro { //apertura class

	private int NivelArmadura;

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y, int nivelArmadura) { //apertura constructor2
		super(ocupantes, fechaIngreso, x, y);
		NivelArmadura = nivelArmadura;
	} //fin constructor2

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y) { //apertura constructor2
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} //fin constructor2

	public Trupalla(int x, int y) { //apertura constructor por defecto
		super(x, y);
	} //fin constructor por defecto

	public int getNivelArmadura() { 
		return NivelArmadura;
	} //fin getter de NivelArmadura

	public void setNivelArmadura(int nivelArmadura) {
		NivelArmadura = nivelArmadura;
	}//fin setter de NivelArmadura
	
	
	
	
} //fin class

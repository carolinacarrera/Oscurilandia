package TrabajoOscurilandia;

public class Trupalla extends Carro {

	private int NivelArmadura;

	public Trupalla(int ocupantes, String fechaIngreso, int tamano, int nivelArmadura) {
		super(ocupantes, fechaIngreso, tamano);
		NivelArmadura = nivelArmadura;
	}

	public Trupalla(int ocupantes, String fechaIngreso, int tamano) {
		super(ocupantes, fechaIngreso, tamano);
		// TODO Auto-generated constructor stub
	}
	
	public Trupalla(int x, int y) {
		super(x, fechaIngreso, y);
	}

	public int getNivelArmadura() {
		return NivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		NivelArmadura = nivelArmadura;
	}
	
	
	
	
}

package TrabajoOscurilandia;

public class Trupalla extends Carro {

	private int NivelArmadura;

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y, int nivelArmadura) {
		super(ocupantes, fechaIngreso, x, y);
		NivelArmadura = nivelArmadura;
	}

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	}

	public Trupalla(int x, int y) {
		super(x, y);
	}

	public int getNivelArmadura() {
		return NivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		NivelArmadura = nivelArmadura;
	}
	
	
	
	
}

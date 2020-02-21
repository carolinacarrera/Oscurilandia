package TrabajoOscurilandia;

/**
 * 
 * Esta es la clase que representa a los carros Trupalla
 * @author Nicolas Alarcón, Carolina Carrera
 * @version: 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Trupalla.java">Versión en Github</a>
 *
 */

public class Trupalla extends Carro { //apertura class
	//Atributos de la clase

	private int NivelArmadura;

	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param NivelArmadura Nivel de la armadura
	 */

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y, int nivelArmadura) { //apertura constructor2
		super(ocupantes, fechaIngreso, x, y);
		NivelArmadura = nivelArmadura;
	} //cierre del constructor

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y) { //apertura constructor2
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} //cierre del constructor

	public Trupalla(int x, int y) { //apertura constructor por defecto
		super(x, y);
	} //cierre del constructor por defecto

	public int getNivelArmadura() { 
		return NivelArmadura;
	} //cierre getter de NivelArmadura

	public void setNivelArmadura(int nivelArmadura) {
		NivelArmadura = nivelArmadura;
	}//cierre setter de NivelArmadura




} //cierre class

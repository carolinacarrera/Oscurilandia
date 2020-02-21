package TrabajoOscurilandia;

/**
 * 
 * Esta es la clase que representa a los carros Trupalla
 * @author Nicolas Alarcón, Carolina Carrera
 * @version 20/02/2020
 * @see <a href="https://github.com/carolinacarrera/Oscurilandia/blob/master/Oscurilandia/src/TrabajoOscurilandia/Trupalla.java">Versión en Github</a>
 *
 */

public class Trupalla extends Carro { 
	//Atributos de la clase

	private int NivelArmadura;

	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param nivelArmadura Nivel de la armadura
	 * @param ocupantes Ocupantes del kromi
	 * @param fechaIngreso Fecha de ingreso del kromi
	 * @param x Posicion fila de carros
	 * @param y Posicion columna de carros
	 */

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y, int nivelArmadura) { 
		super(ocupantes, fechaIngreso, x, y);
		NivelArmadura = nivelArmadura;
	} //cierre del constructor

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y) { 
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} //cierre del constructor

	public Trupalla(int x, int y) { 
		super(x, y);
	} //cierre del constructor por defecto

	public int getNivelArmadura() { 
		return NivelArmadura;
	} //cierre getter de NivelArmadura

	public void setNivelArmadura(int nivelArmadura) {
		NivelArmadura = nivelArmadura;
	}//cierre setter de NivelArmadura




} //cierre class

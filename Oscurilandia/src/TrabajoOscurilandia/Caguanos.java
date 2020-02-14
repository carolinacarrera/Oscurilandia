package TrabajoOscurilandia;

public class Caguanos extends Carro{

	private String tiro;
	private String colorConfeti;
	private int tamano;
	public Caguanos(int ocupantes, String fechaIngreso, int posicion, int fila, int columna) {
		super(ocupantes, fechaIngreso, posicion, fila, columna);
		// TODO Auto-generated constructor stub
	}
	public Caguanos(int ocupantes, String fechaIngreso, int posicion, int fila, int columna, String tiro,
			String colorConfeti, int tamano) {
		super(ocupantes, fechaIngreso, posicion, fila, columna);
		this.tiro = tiro;
		this.colorConfeti = colorConfeti;
		this.tamano = tamano;
	}
	public String getTiro() {
		return tiro;
	}
	public void setTiro(String tiro) {
		this.tiro = tiro;
	}
	public String getColorConfeti() {
		return colorConfeti;
	}
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	@Override
	public String toString() {
		return "Caguanos [tiro=" + tiro + ", colorConfeti=" + colorConfeti + ", tamano=" + tamano + "]";
	}

	public void imprimir() {
		System.out.println("Tiro: " + getTiro() + "\nColor confeti: " + getColorConfeti() + "\nTamano: " + getTamano());
	}
	
}

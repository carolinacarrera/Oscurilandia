package TrabajoOscurilandia;

public class Caguanos extends Carro{

	private String tiro;
	private String colorConfeti;
	
	
	public Caguanos(int ocupantes, String fechaIngreso, int x, int y, String tiro, String colorConfeti) {
		super(ocupantes, fechaIngreso, x, y);
		this.tiro = tiro;
		this.colorConfeti = colorConfeti;
	}

	public Caguanos(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	}

	public Caguanos(int x, int y) {
		super(x, y);
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

	@Override
	public String toString() {
		return "Caguanos [tiro=" + tiro + ", colorConfeti=" + colorConfeti +"]";
	}

	public void imprimir() {
		System.out.println("Tiro: " + getTiro() + "\nColor confeti: " + getColorConfeti());
	}
	
}

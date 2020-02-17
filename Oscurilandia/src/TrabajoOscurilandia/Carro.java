package TrabajoOscurilandia;

//import javax.swing.JOptionPane;

public class Carro {

	private int ocupantes;

	protected String fechaIngreso;
	private int x;
	private int y;


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

	public int getOcupantes() {
		return ocupantes;
	}




	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}




	public String getFechaIngreso() {
		return fechaIngreso;
	}




	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	
	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + "]" ;
	}

	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


}

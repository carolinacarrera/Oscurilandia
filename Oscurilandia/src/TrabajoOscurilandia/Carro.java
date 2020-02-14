package TrabajoOscurilandia;

public class Carro {
	
	private int ocupantes;
	private String fechaIngreso;
	private int posicion;

	public Carro(int ocupantes, String fechaIngreso, int posicion, int fila, int columna) {
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		this.posicion = posicion;
	
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
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fechaIngreso=" + fechaIngreso + ", posicion=" + posicion + "]";
	}
	
	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes() + "\n Posicion: " + getPosicion());
	}
	
	
}

package tienda;

public class Cliente {
	String nombre;
	int[] compra;
	
	public Cliente () {
		
	}
	
	public Cliente(String nombre, int[] compra) {
		this.nombre = nombre;
		this.compra = compra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCompra() {
		return compra;
	}

	public void setCompra(int[] compra) {
		this.compra = compra;
	}
	
}

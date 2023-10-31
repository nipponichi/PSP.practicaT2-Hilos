package tienda;

public class Dependienta extends Thread {
	
	String nombre;
	Cliente cliente;
	long tiempo;

	Dependienta(String nombre){
		this.nombre = nombre;
	}
	
	public void run() {
		System.out.println("DEPENDIENTA: "+nombre+" atendiendo a:"+ cliente.nombre);
		
		for(int i=0; i<cliente.getCompra().length; i++) {
			try {
				//
				Thread.sleep(cliente.getCompra()[i]);
				//
				System.out.println("PRODUCTO" + (i+1) + " para " + cliente.nombre +
						" pasa por caja en " + (System.currentTimeMillis() - tiempo) + "ms");
			}catch (InterruptedException ex) {
				//
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("\nCOMPRA DEL CLIENTE " +cliente.nombre+ " PROCESADA EN: " + (System.currentTimeMillis() - tiempo) + "ms");
	}
	
		
	public void registrarCompra(Cliente cliente, long tiempo) {
		this.cliente = cliente;
		this.tiempo = tiempo;
	}
		
}

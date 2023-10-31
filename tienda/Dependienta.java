package tienda;

public class Dependienta {
	
	String nombre;

	Dependienta(String nombre){
		this.nombre = nombre;
	}
	
	public void registrarCompra(Cliente cliente, long tiempo) {
		System.out.println("DEPENDIENTA: "+nombre+" atendiendo a:"+ cliente.nombre);
		
		for(int i=0; i<cliente.getCompra().length; i++) {
			try {
				//
				Thread.sleep(cliente.getCompra()[i]);
				
				//
				System.out.println("PRODUCTO"+ (i+1)+" "+
						"pasa por caja en"+ (System.currentTimeMillis()-tiempo)+"ms");
			}catch (InterruptedException ex) {
				//
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("\nCOMPRA DEL CLIENTE PROCESADA EN: "+(System.currentTimeMillis()-tiempo)+"ms");
	}
}

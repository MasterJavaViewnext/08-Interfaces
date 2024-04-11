package es.rodal.interfaces;

/**
 * Clase factura que imlementa la interfaz imprimible 
 * tiene un constructor al que se le han de pasar los 2 atributos
 * @author Admin
 *
 */
public class Factura implements Imprimible{
	private int nFactura;
	private int codigoCliente;
	
	public Factura(int nFactura, int codigoCliente) {
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}
	
	@Override
	public void informeLargo() {
		System.out.println("Numero de facturas: "+ nFactura +", codigo de cliente: "+codigoCliente);
		
	}
	@Override
	public void informeCorto() {
		System.out.println("Numero de factura: "+nFactura);
		
	}
	
}

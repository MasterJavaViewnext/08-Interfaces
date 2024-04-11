package es.rodal.interfaces;

public interface Imprimible {
	
	default public void informeLargo() {
		System.out.println("Informe no implementado");
	}
	public void informeCorto();

}

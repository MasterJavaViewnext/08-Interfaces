package es.rodal.interfaces;

/**
 * Clase pagina que imlementa la interfaz imprimible 
 * tiene un constructor al que se le han de pasar los 2 atributos
 * @author Admin
 *
 */
public class Pagina implements Imprimible{

	private int nPagina;
	private int nLineas;
	
	public Pagina(int nPagina, int nLineas) {
		this.nPagina = nPagina;
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("Numero de paginas: "+ nPagina +", numero de lineas: "+ nLineas);
		
	}
	@Override
	public void informeCorto() {
		System.out.println("Numero de pagina: "+nPagina);
		
	}
	
}

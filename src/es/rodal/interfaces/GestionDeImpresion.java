package es.rodal.interfaces;

/**
 * Clase que crea una instancia de Pagina y otra de factura
 * y comprueba el correcto funcionamientos de sus metodos
 * @author Admin
 *
 */
public class GestionDeImpresion {
	public static void main(String[] args) {
		
		Imprimible[] imprimibles = {new Pagina(10, 100), new Factura(5, 50)};
		
		for (Imprimible imprimible : imprimibles) {
			imprimible.informeCorto();
			imprimible.informeLargo();
		}
	}
}

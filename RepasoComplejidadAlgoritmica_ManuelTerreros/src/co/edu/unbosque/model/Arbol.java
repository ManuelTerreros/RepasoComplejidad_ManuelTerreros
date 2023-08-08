package co.edu.unbosque.model;


/**
 * Clase que se destinará para
 * el desarrollo del segundo ejercicio.
 * @author Manue
 *
 */
public class Arbol {
	
	private Raiz nodo;

	
	/**
	 * Metodo constructor de la clase arbol.
	 */
	public Arbol() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Metodo que creará los hijos y los 
	 * siguientes hijos en el arbol
	 * @param raiz
	 * @param hijo
	 */
	public void agregarSiguiente(Raiz raiz, Raiz hijo) {
		if(raiz.getOriginario()==null) {
			raiz.setOriginario(hijo);
		}else {
			hijo.setSiguiente(raiz.getOriginario());
			raiz.setOriginario(hijo);
		}
	}
}

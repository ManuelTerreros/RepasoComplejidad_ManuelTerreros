package co.edu.unbosque.model;

/**
 * Clase que serán los nodos en la lista y almacenará a personas
 * @author Manue
 *
 */
public class Nodo {
	
	private Persona persona;
	private Nodo cabeza, cola;
	private int elemento;
	
	
	/**
	 * Método contructor de la clase
	 * @param persona
	 */
	public Nodo(Persona persona) {
		
		super();
		this.persona = persona;
		cabeza = null;
		cola = null;
		elemento = 1;
	}

	/**
	 * Obtiene la persona asociada a este nodo.
	 *
	 * @return La persona asociada a este nodo.
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Establece la persona asociada a este nodo.
	 *
	 * @param persona La nueva persona asociada a este nodo.
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * Obtiene el nodo cabeza de este nodo.
	 *
	 * @return El nodo cabeza de este nodo.
	 */
	public Nodo getCabeza() {
		return cabeza;
	}

	/**
	 * Establece el nodo cabeza de este nodo.
	 *
	 * @param cabeza El nuevo nodo cabeza de este nodo.
	 */
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}

	/**
	 * Obtiene el nodo cola de este nodo.
	 *
	 * @return El nodo cola de este nodo.
	 */
	public Nodo getCola() {
		return cola;
	}

	/**
	 * Establece el nodo cola de este nodo.
	 *
	 * @param cola El nuevo nodo cola de este nodo.
	 */
	public void setCola(Nodo cola) {
		this.cola = cola;
	}
	
	
	
	

}

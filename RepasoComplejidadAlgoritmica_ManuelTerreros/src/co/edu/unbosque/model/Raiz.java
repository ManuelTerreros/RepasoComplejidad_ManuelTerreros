package co.edu.unbosque.model;


/**
 * Clase que mantendrá la raíz del
 * arbol N-Ario
 * @author Manue
 *
 */
public class Raiz {
	
	private Raiz originario;
	private Raiz siguiente;
	private Persona persona;
	
	
	/**
	 * Metodo Contructor de la clase Raiz
	 * @param originario
	 * @param siguiente
	 * @param persona
	 */
	public Raiz(Raiz originario, Raiz siguiente, Persona persona) {
		super();
		this.originario = originario;
		this.siguiente = siguiente;
		this.persona = persona;
	}


	/**
     * Obtiene el nodo raíz originario.
     * @return El nodo raíz originario.
     */
    public Raiz getOriginario() {
        return originario;
    }

    /**
     * Establece el nodo raíz originario del nodo.
     * @param originario El nodo raíz originario.
     */
    public void setOriginario(Raiz originario) {
        this.originario = originario;
    }

    /**
     * Obtiene el siguiente nodo raíz en la secuencia.
     * @return El siguiente nodo raíz.
     */
    public Raiz getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo raíz.
     * @param siguiente El siguiente nodo raíz.
     */
    public void setSiguiente(Raiz siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene la persona asociada a este nodo.
     * @return La persona asociada.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona asociada.
     * @param persona La persona a asociar.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
	
	
	
	
}

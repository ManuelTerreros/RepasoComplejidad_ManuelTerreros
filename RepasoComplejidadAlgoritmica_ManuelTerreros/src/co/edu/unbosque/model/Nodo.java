package co.edu.unbosque.model;

public class Nodo {
	
	private Persona persona;
	private Nodo cabeza, cola;
	private int elemento;
	
	public Nodo(Persona persona) {
		
		super();
		this.persona = persona;
		cabeza = null;
		cola = null;
		elemento = 1;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Nodo getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}

	public Nodo getCola() {
		return cola;
	}

	public void setCola(Nodo cola) {
		this.cola = cola;
	}
	
	
	
	

}

package co.edu.unbosque.model;

import java.util.Date;
import java.util.Random;

/**
 * Modelo que se almacenará en los nodos de la lista
 * @author Manue
 *
 */
public class Persona {
	
	private String nombre, fechaNacimiento;
	private int id;
	
	
	/**
	 * Método constructor de la clase.
	 * @param nombre Va a ser un parámetro de tipo string el cual 
	 * el usuario deberá ingresarlo.
	 * @param fechaNacimiento Va a ser un parametro de tipo string el cual el 
	 * usuario deberá ingresarlo y seguirá el formato (yyyy/MM/dd)
	 * @param i Parámetro de tipo entero que será generado de manera automática
	 */
	public Persona(String nombre, String fechaNacimiento, int i) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.id = i;
	}
	
	/**
	 * Obtiene el nombre de la persona.
	 *
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la persona.
	 *
	 * @param nombre El nuevo nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la fecha de nacimiento de la persona.
	 *
	 * @return La fecha de nacimiento de la persona.
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento de la persona.
	 *
	 * @param fechaNacimiento La nueva fecha de nacimiento de la persona en formato "AAAA/MM/DD".
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Obtiene el ID de la persona.
	 *
	 * @return El ID de la persona.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el ID de la persona.
	 *
	 * @param id El nuevo ID de la persona.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
}

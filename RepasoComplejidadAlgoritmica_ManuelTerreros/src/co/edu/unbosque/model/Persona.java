package co.edu.unbosque.model;

import java.util.Date;
import java.util.Random;

public class Persona {
	
	private String nombre, fechaNacimiento;
	private int id;
	
	public Persona(String nombre, String fechaNacimiento, int i) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.id = i;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

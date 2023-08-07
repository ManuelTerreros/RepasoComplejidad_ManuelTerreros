package co.edu.unbosque.controller;

import java.util.Random;

import co.edu.unbosque.model.Lista;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Recursividad;
import co.edu.unbosque.view.Vista;

public class Controller {
	private Vista view = new Vista();;
	private Recursividad recur = new Recursividad();
	private Lista lista = new Lista();
	
	public Controller() {
		//ejecutarRecursividad();
		//crearLista();
		registrarPersona();
		//ejecutarNumeroMayor();
	}
	
	private void ejecutarNumeroMayor() {
		lista.retornarNumeroMayor();
		
	}

	public void ejecutarRecursividad() {
		double num;
		view.message("Ingrese la cantidad de frutas disponibles");
		num = view.insertarDouble();
		//return recur.comerFruta(num);
		view.message(recur.mostrarRecorrido(num));
	}
	
	public void crearLista() {
		lista.registrarTabla();
		lista.listarPersonas();
		//lista.retornarNumeroMayor();
	}
	
	public void registrarPersona() {
		
		Random rd = new Random();
		String nombre, fechas;
		int numerAleatoio = rd.nextInt(100)+1;
		
		lista.registrarTabla();
		
		view.message("Ingrese el nombre de la persona: ");
		nombre = view.insertarString();
		
		view.message("Ingrese su fecha de nacimiento (AAAA/MM/DD)");
		fechas = view.insertarString();
		
        lista.guardarPersona(new Persona(nombre, fechas, 80));
		lista.listarPersonas();
		
		
		
	}
	
	
	

}

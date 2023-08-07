package co.edu.unbosque.controller;

import java.util.Random;

import co.edu.unbosque.model.Lista;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Recursividad;
import co.edu.unbosque.view.Prueba;
import co.edu.unbosque.view.Vista;

public class Controller {
	private Vista view;
	private Recursividad recur = new Recursividad();
	private Lista lista = new Lista();
	
	public Controller() {
		//ejecutarRecursividad();
		//registrarPersona();
		//view = new Vista();
		//ventana();
		probarOrdenamiento();
	}

	public void ejecutarRecursividad() {
		double num;
		view.message("Ingrese la cantidad de frutas disponibles");
		num = view.insertarDouble();
		//return recur.comerFruta(num);
		view.message(recur.mostrarRecorrido(num));
	}
	
	public void registrarPersona() {
		
		Random rd = new Random();
		String nombre, fechas;
		int numerAleatorio = rd.nextInt(100)+1;
		
		lista.registrarTabla();
		
		view.message("Ingrese el nombre de la persona: ");
		nombre = view.insertarString();
		
		view.message("Ingrese su fecha de nacimiento (AAAA/MM/DD)");
		fechas = view.insertarString();
		
        lista.guardarPersona(new Persona(nombre, fechas, 32));
		lista.listarPersonas();
	}
	
	public void ventana() {
		Prueba pruebis = new Prueba();
		pruebis.setVisible(true);
	}

	public void probarOrdenamiento() {
		lista.registrarTabla();
		lista.ordenarLista();
	}
	

}

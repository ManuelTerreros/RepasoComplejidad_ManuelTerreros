package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import co.edu.unbosque.controller.utils.Validations;
import co.edu.unbosque.model.Lista;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Recursividad;
import co.edu.unbosque.view.View;

/**
 * Clase controller que respetara el patron mvc y 
 * conectara a la vista con la logica del negocio sin que se conozcan.
 * 
 * Implementa ActionListener
 * @author Manue
 *
 */
public class Controller implements ActionListener {

	private Recursividad recur = new Recursividad();
	private Lista lista = new Lista();
	private View vista = new View(this);
	private Random rd = new Random();
	private int numerAleatorio;
	private Validations validaciones = new Validations();
	
	
	
	
	/**
	 * Controlador de la clase Controller
	 */
	public Controller() {
		iniciarComponentes();
		
	}
	
	
	/**
	 * Ejecuta el menu para realizar
	 * interacciones entre los ejercicios.
	 */
	public void iniciarComponentes() {
		try {
		int opcion = vista.pedirInt("1. Listado de personas"+"\n"+
									  "2. Arboles"+"\n"+
									  "3. Recursividad"+"\n"+
									  "0. Salir" );
			switch (opcion) {
			case 1: 
				vista.setVisible(true);
				lista.registrarTabla();
				break;
			case 2:
				vista.mostrarResultados("Si le soy sincero profe, no "
						+ "logré desarrollar nada de árboles"+"\n"+
						"Me gustaría tomar una tutoria para repasarlos...");
				break;
			case 3: 
				ejecutarRecursividad();
				break;
			case 0:
				vista.mostrarResultados("Hasta luego, Buen día");
				break;
			default:
				vista.mostrarResultados("Opción no válida");
			}
		}catch(NumberFormatException e) {
			vista.mostrarResultados("Formato incorrecto, Bye!");
		}
	}

	/**
	 * Ejecuta el metodo recursivo de modelo
	 */
	public void ejecutarRecursividad() {
		double num;
		try {
			num = vista.pedirDouble("Ingrese fruta disponible");
			vista.mostrarResultados(recur.mostrarRecorrido(num));
		}catch(Exception e) {
			vista.mostrarResultados("Error de dato ingresado");
			iniciarComponentes();
		}
		iniciarComponentes();
		
	}
	
	
	/**
	 *Metodo que permite realizar las acciones necesarias,
	 *conecta algunos metodos del modelo con la vista y 
	 *verifca las operaciones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals(vista.AGREGAR)) {
			numerAleatorio = rd.nextInt(101);
			String comprobar = vista.getNacimientoArea().getText();
			if(validaciones.validarNacimiento(comprobar)) {
				lista.guardarPersona(new Persona(vista.getNombreArea().getText(), vista.getNacimientoArea().getText(), numerAleatorio));
			}else {
				vista.mostrarResultados("Formato de fecha incorrecto");
			}
			 
		}
		else if(e.getActionCommand().equals(vista.SALIR)) {
			vista.setVisible(false);
			iniciarComponentes();
			
		}
		
		else if(e.getActionCommand().equals(vista.ORDENAR)) {
			
			try {
				vista.getListaAux().setText(lista.ordenarLista());
			}catch(Exception e1) {
				vista.mostrarResultados("Error, formato de fecha Incorrecto");
			}
			
		}
		else if(e.getActionCommand().equals(vista.LISTAR)) {
			vista.getListaNormal().setText(lista.listarPersonas());
		}
		
	}
	

}

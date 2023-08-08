package co.edu.unbosque.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

/**
 * Clase que respeta el patrón Facade y mantendrá las operaciones necesarias
 * para luego compartirlas con el controlador. 
 * Esta clase se enfoca en el primer punto
 * @author Manue
 *
 */
public class Lista {
	
	private Persona persona;
	private Nodo inicio, fin;
	private String resultado;
	
	/**
	 * Constructor de la clase Lista.
	 */
	public Lista() {
		// TODO Auto-generated constructor stub
		inicio = null;
		fin = null;
		resultado = "";
	}
	
	
	/**
	 * Método que creará la tabla estipulada por el docente,
	 * se realizó a parte para tener más control de los datos 
	 * que seran registrados por el usuario.
	 * 
	 * @param persona Que sera guardada en la lista.
	 */
	public void guardarTabla(Persona persona) {
		Nodo nuevoNodo = new Nodo(persona);
			if(inicio == null ) {
				inicio = nuevoNodo;
				fin = nuevoNodo;	
			}else {
				fin.setCola(nuevoNodo);
				nuevoNodo.setCabeza(fin);	
				fin = nuevoNodo;	
			}		
	}
	
	/**
	 * Metodo que registrará los datos asignados por 
	 * el docente y los enviará al método respectivo.
	 */
	public void registrarTabla() {
		
		Persona persona1 = new Persona("Luis Pérez","1991/12/04",10);
		Persona persona2 = new Persona("Andres Cruz","1967/10/12",25 );
		Persona persona3 = new Persona("Miguel Paz","1981/03/22",12);
		Persona persona4 = new Persona("Wilson Ruiz","1975/06/10",46);
		Persona persona5 = new Persona("Jorge Baez","2000/08/20",55);
		Persona persona6 = new Persona("Ana Sarmiento","1998/01/23",9);
		Persona persona7 = new Persona("Maria Gómez", "1988/03/15",34);
		Persona persona8 = new Persona("Luis Poveda", "1995/11/29",45);
		Persona persona9 = new Persona("Sandra Ruiz", "1970/12/24",2);
		Persona persona10 = new Persona("Marcos Solano", "2001/06/25",47);
		
		guardarTabla(persona1);
		guardarTabla(persona2);
		guardarTabla(persona3);
		guardarTabla(persona4);
		guardarTabla(persona5);
		guardarTabla(persona6);
		guardarTabla(persona7);
		guardarTabla(persona8);
		guardarTabla(persona9);
		guardarTabla(persona10);
	}
	
	
	/**
	 * Metodo que guardará a las personas que seran registradas por el 
	 * usuario.
	 * @param persona Parametro de entrada que luego se 
	 * guardará en un nodo nuevo.
	 */
	public void guardarPersona(Persona persona) {
		
		Nodo nuevoNodo = new Nodo(persona);
		int numeroMayor = retornarNumeroMayor();
		int numeroNuevo = persona.getId();
		String aviso = persona.getFechaNacimiento();
		
		if(!aviso.isEmpty()) {
			if(numeroNuevo > numeroMayor) {
				System.out.println("Funcionooooo");
				eliminarNodo(numeroMayor);
				System.out.println("Eliminado el nodo");
				
				Nodo nodoDerecha = new Nodo(persona);
				nodoDerecha.setCola(inicio);
		        inicio.setCabeza(nodoDerecha);
		        inicio = nodoDerecha;
				
			}else {
				fin.setCola(nuevoNodo);
				nuevoNodo.setCabeza(fin);	
				fin = nuevoNodo;	
			}
		}
	}
	
	
	
	/**
	 * Método que listará todos los nodos que existan dentro de la
	 * lista simple enlazada. El bucle while irá hasta dónde el 
	 * ultimo nodo apunte a nulo
	 * @return Una cadena de caracteres que representará los
	 * atributos de persona
	 */
	public String  listarPersonas() {
		int contador = 1;
		Nodo aux = inicio;
		String resultado = "";
		while(aux != null) {
			   resultado += "Elemento No.: "+contador + ". Nombre: " + aux.getPersona().getNombre() +
	                    ", Fecha de Nacimiento: " + aux.getPersona().getFechaNacimiento() +
	                    ", ID: " + aux.getPersona().getId()+ "\n";

	            aux = aux.getCola();
	            contador++;
		}
		return resultado;
	}
	
	
	/**
	 * Metodo que buscará el numero mayor de la lista
	 * @return Una variable de tipo entero
	 */
	public int retornarNumeroMayor() {
		Nodo nodoActual = inicio;
		int numMayor = -1;
		while(nodoActual != null) {
			int aux = nodoActual.getPersona().getId();
			if(aux  > numMayor) {
				numMayor = aux;
			}
			nodoActual = nodoActual.getCola();
		}
		System.out.println(numMayor);
		return numMayor;
	}
	
	
	
	/**
	 * Metodo que eliminará el nodo correspondiente usando su Id.
	 * Ese nodo que se eliminará es el que tendrá el id más 
	 * alto de toda la lista.
	 * @param id Es el id mayor de la lista, y que luego se eliminará.
	 */
	public void eliminarNodo(int id) {
		Nodo nodoAux = inicio;	
		
		while(nodoAux != null) {
			if (nodoAux.getPersona().getId() == id) {
				if (nodoAux == inicio) {
					inicio = inicio.getCola();
					inicio.setCabeza(null);
				}else if(nodoAux == fin) {
					fin = fin.getCabeza();
					fin.setCola(null);
				}else {
					Nodo inicial = nodoAux.getCabeza();
					Nodo siguiente = nodoAux.getCola();
					inicial.setCola(siguiente);
					siguiente.setCabeza(inicial);
				}
				break;
			}
			nodoAux = nodoAux.getCola();
		}	
	}
	
	/**
	 * Método basado en el burble sort, el cual tomará el formato
	 * yyyy/MM/dd y lo comparará con los demás nodos existentes en la lista.
	 * La lista se organizará de manera descendente. 
	 * 
	 * @return Una cadena de personas organizadas de manera descendente.
	 */
	public String ordenarLista() {
		Nodo actual = inicio;
	    Nodo siguiente;
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");

	    if (inicio != null) {
	        while (actual != null) {
	            siguiente = actual.getCola();

	            while (siguiente != null) {
	                LocalDate fechaNac1 = LocalDate.parse(actual.getPersona().getFechaNacimiento(), formato);
	                LocalDate fechaNac2 = LocalDate.parse(siguiente.getPersona().getFechaNacimiento(), formato);

	                if (fechaNac1.isAfter(fechaNac2)) {
	                    intercambiarNodos(actual, siguiente);
	                }

	                siguiente = siguiente.getCola();
	            }

	            actual = actual.getCola();
	        }
	        
	        int contador = 1;
			Nodo aux = inicio;
			
			while(aux != null) {
				   resultado += "Elemento No.: "+contador + ". Nombre: " + aux.getPersona().getNombre() +
		                    ", Fecha de Nacimiento: " + aux.getPersona().getFechaNacimiento() +
		                    ", ID: " + aux.getPersona().getId()+ "\n";

		            aux = aux.getCola();
		            contador++;
			}
			
		}
		return resultado;
	  }
	

	/**
	 * Metodo que será usado en el ordenamiento de la lista y 
	 * se destinará a realizar el cambio de nodos según el orden requerido.
	 * 
	 * @param nodo1 Es el nodo actual, por el momento el nodo con fecha 
	 * de nacimiento clasificado como mayor.
	 * @param nodo2 Es el nodo siguiente, el cual se comparará con el nodo mayor
	 * para ser organizado dada cierta condición.
	 */
	public void intercambiarNodos(Nodo nodo1, Nodo nodo2) {
	    Persona tempPersona = nodo1.getPersona();
	    nodo1.setPersona(nodo2.getPersona());
	    nodo2.setPersona(tempPersona);
	}
		
		
	}
	
	 
	


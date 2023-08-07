package co.edu.unbosque.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Lista {
	
	private Persona persona;
	private Nodo inicio, fin;
	private Nodo alternoI, alternoF;
	
	public Lista() {
		// TODO Auto-generated constructor stub
		inicio = null;
		fin = null;
	}
	
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
	
	public void guardarPersona(Persona persona) {
		Nodo nuevoNodo = new Nodo(persona);
		int numeroMayor = retornarNumeroMayor();
		int numeroNuevo = persona.getId();
		
		if(numeroNuevo > numeroMayor) {
			System.out.println("Funcionooooo");
			eliminarNodo(numeroMayor);
			System.out.println("Eliminado el nodo");
		}else {
			fin.setCola(nuevoNodo);
			nuevoNodo.setCabeza(fin);	
			fin = nuevoNodo;	
		}
	}
	
	public void listarPersonas() {
		int contador = 1;
		Nodo aux = inicio;
		
		while(aux != null) {
			   System.out.println("Elemento No.: "+contador + ". Nombre: " + aux.getPersona().getNombre() +
	                    ", Fecha de Nacimiento: " + aux.getPersona().getFechaNacimiento() +
	                    ", ID: " + aux.getPersona().getId());

	            aux = aux.getCola();
	            contador++;
		}
	}
	//---------------------------------------------------------------
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
	
	public void ordenarLista() {
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
				   System.out.println("Elemento No.: "+contador + ". Nombre: " + aux.getPersona().getNombre() +
		                    ", Fecha de Nacimiento: " + aux.getPersona().getFechaNacimiento() +
		                    ", ID: " + aux.getPersona().getId());

		            aux = aux.getCola();
		            contador++;
			}
	    }
	}

	public void intercambiarNodos(Nodo nodo1, Nodo nodo2) {
	    Persona tempPersona = nodo1.getPersona();
	    nodo1.setPersona(nodo2.getPersona());
	    nodo2.setPersona(tempPersona);
	}
		
		
	}
	
	 
	


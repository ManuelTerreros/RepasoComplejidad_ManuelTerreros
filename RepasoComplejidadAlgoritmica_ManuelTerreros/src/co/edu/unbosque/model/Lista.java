package co.edu.unbosque.model;

import java.util.Date;
import java.util.Random;

public class Lista {
	
	private Persona persona;
//	private Random numAle;
	private Nodo inicio, fin;
	
	public Lista() {
		// TODO Auto-generated constructor stub
		//persona = new Persona(null, null, 0);
		inicio = null;
		fin = null;
		//registrarTabla();
	}
	
	public void guardarPersona(Persona persona) {
		Nodo nuevoNodo = new Nodo(persona);
		
		if(inicio == null ) {
			
	//		System.out.println("Entro aca");
			inicio = nuevoNodo;
			fin = nuevoNodo;
			
					
		}else {
	//		System.out.println("Entro a crear uno adicional");
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
		
		guardarPersona(persona1);
		guardarPersona(persona2);
		guardarPersona(persona3);
		guardarPersona(persona4);
		guardarPersona(persona5);
		guardarPersona(persona6);
		guardarPersona(persona7);
		guardarPersona(persona8);
		guardarPersona(persona9);
		guardarPersona(persona10);
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
	
	public int retornarNumeroMayor() {
		// Como obtengo el numero mayor?
		// listarPersonas(); -> Esto no me serviria ya que llamo la lista, y pa que?
		int aux = inicio.getPersona().getId();
		//int nodoActual = 
		
		
		
		
		return 0;
	}
	
}

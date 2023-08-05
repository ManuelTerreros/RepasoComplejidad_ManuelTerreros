package co.edu.unbosque.model;

public class Recursividad {
	
	private double localidades;
	private double porcion = 0.5;
	
	public double comerFruta(double fruta) {
		if(fruta <= 0) {
			return 0;
		}else {
			//System.out.println("ola");
			double frutaDisponible = fruta/2;
			double frutaConsumida =  frutaDisponible - porcion;
			//System.out.println("Se ha recorrido"+comerFruta(frutaConsumida)+"Localidad/es");
			
			return 1 + comerFruta(frutaConsumida); // Por qué no me mvota el numero y lo saca como cero?

		}// Como hago para que me resuelva el problema pa mostrar?
		
//		while(fruta > 0) {
//			localidades ++;
//			double aux = 0;
//			aux = fruta - reserva;
//
//			comerFruta(aux);
//			
//		}	
	}
	public String mostrarRecorrido(double fruta) {
		localidades = comerFruta(fruta);
		return "Se han recorrido "+localidades+" Localidades ";
		
	}
}

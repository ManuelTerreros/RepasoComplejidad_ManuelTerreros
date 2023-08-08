package co.edu.unbosque.model;



/**
 * Clase que contiene métodos relacionados con los cálculos recursivos.
 * @author Manue
 * 
 */
public class Recursividad {
	
	private double localidades;
	private double porcion = 0.5;
	
	/**
	 * Método recursivo encargado de calcular cuántas frutas se consumirán y continuará hasta que se llegue a cero.
	 *
	 * @param fruta Cantidad de fruta a consumir.
	 * @return Cantidad total de frutas consumidas, incluyendo las porciones y llamadas recursivas, el +1
	 * es usado como manera de concatenacióon para el método.
	 */
	public double comerFruta(double fruta) {
		if(fruta <= 0) {
			return 0;
		}else {
			
			double frutaDisponible = fruta/2;
			double frutaConsumida =  frutaDisponible - porcion;
			
			
			return 1 + comerFruta(frutaConsumida); 

		}	
	}
	
	/**
	 * Método que calcula y muestra el resultado del recorrido basado en el consumo de frutas.
	 *
	 * @param fruta Cantidad de fruta a consumir.
	 * @return Mensaje que indica la cantidad de localidades recorridas.
	 */
	public String mostrarRecorrido(double fruta) {
		localidades = comerFruta(fruta);
		return "Se han recorrido "+localidades+" Localidades ";
		
	}
}

package co.edu.unbosque.controller.utils;

import java.text.SimpleDateFormat;

/**
 * Clase dedicada a la validación de datos  
 * y métodos peculiares.
 * @author Manue
 *
 */
public class Validations {
	
	
	/**
	 * Este método verificara la fidelidad de 
	 * la fecha ingresada por el usurio
	 * hacia el formato establecido.
	 * @param i String que representará el valor de la
	 * fecha de nacimiento ingresada por el usuario.
	 * @return tipo de dato booleano.
	 */
	public boolean validarNacimiento(String i) {
		try {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
			formato.parse(i);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}

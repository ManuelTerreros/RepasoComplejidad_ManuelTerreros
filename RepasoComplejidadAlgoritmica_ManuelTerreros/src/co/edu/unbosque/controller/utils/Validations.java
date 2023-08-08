package co.edu.unbosque.controller.utils;

import java.text.SimpleDateFormat;

/**
 * Clase dedicada a la validacion de datos  
 * y metodos peculiares.
 * @author Manue
 *
 */
public class Validations {
	
	
	/**
	 * Este metodo verificara la fidelidad de 
	 * la fecha ingresada por el usurio
	 * hacia el formato establecido.
	 * @param i String que representara el valor de la
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

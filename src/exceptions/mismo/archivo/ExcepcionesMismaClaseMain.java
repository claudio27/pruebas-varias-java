package exceptions.mismo.archivo;

import java.io.IOException;

public class ExcepcionesMismaClaseMain {
	
	
	
	public static void main(String[] a) {

		ExcepcionesMismaClaseMain ex = new ExcepcionesMismaClaseMain();
	
		ex.lanzaExcepcion();

	}
	
	
	public void lanzaExcepcion(){
		
		try {
			throw new IOException();
		} catch (IOException e) {			
			System.out.println("asdfadsf");
		}
	}
	
}

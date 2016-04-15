package exceptions.mismo.archivo;

import java.io.IOException;

public class ExcepcionesMismaClaseMain {
	
	
	
	public static void main(String[] a) {

		ExcepcionesMismaClaseMain ex = new ExcepcionesMismaClaseMain();
	
		ex.lanzaExcepcion();
		System.out.println("ExcepcionesMismaClaseMain.main()");

	}
	
	
	public void lanzaExcepcion(){
		int a = 0;
		String b="0b";
		System.out.println(a);
		try {
			throw new IOException();
		} catch (IOException e) {			
			System.out.println("asdfadsf");
//			e.printStackTrace();
		}
		
		System.out.println(b);
		
	}
	
}

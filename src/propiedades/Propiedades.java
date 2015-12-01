package propiedades;

import java.util.ResourceBundle;

public class Propiedades {
		//poner el nombre del paquete, en proyecto captaciones la carpeta de propiedades esta en el primer nivel
		// en esta la carpeta de propiedades esta en segundo nivel, dentro de un paquete.
	private static ResourceBundle rb = ResourceBundle.getBundle("propiedades.props/lasprops");
	
	public static String getParametros(String param){
		
		return rb.getString(param);
	}
	
	public static void main(String[] args) {
	
		System.out.println(Propiedades.getParametros("variable2"));
	
	}

}

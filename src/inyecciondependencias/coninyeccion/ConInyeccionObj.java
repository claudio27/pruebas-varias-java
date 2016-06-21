package inyecciondependencias.coninyeccion;
/**
 * 
 * http://codecriticon.com/inyeccion-de-dependencias/
 * 
 * */
public class ConInyeccionObj {

	/**
	 * @param args
	 */
	public static void init() {
	    ObjetoCerraduraLlave llave =new ObjetoCerraduraLlave();
	      ObjetoPuerta puerta = new ObjetoPuerta(llave);
	      puerta.usar();
	 
	      ObjetoCerraduraCodigo codigo = new ObjetoCerraduraCodigo();
	      puerta = new ObjetoPuerta(codigo);
	      puerta.usar();
	}

}

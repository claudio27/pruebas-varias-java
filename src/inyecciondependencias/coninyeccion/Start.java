package inyecciondependencias.coninyeccion;
/**
 * 
 * http://codecriticon.com/inyeccion-de-dependencias/
 * 
 * */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    ObjetoCerraduraLlave llave =new ObjetoCerraduraLlave();
	      ObjetoPuerta puerta = new ObjetoPuerta(llave);
	      puerta.usar();
	 
	      ObjetoCerraduraCodigo codigo = new ObjetoCerraduraCodigo();
	      puerta = new ObjetoPuerta(codigo);
	      puerta.usar();
	}

}

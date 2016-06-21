package inyecciondependencias.sininyeccion;

public class SininyeccionObj {

	/**
	 * @param args
	 */
	public static void init() {
		// Usamos una puerta con cerradura de llave
		ObjetoPuertaLlave puertaLlave = new ObjetoPuertaLlave();
		puertaLlave.abrir();

		// Usamos una puerta con cerradura de codigo
		ObjetoPuertaCodigo puertaCodigo = new ObjetoPuertaCodigo();
		puertaCodigo.abrir();
	}
}

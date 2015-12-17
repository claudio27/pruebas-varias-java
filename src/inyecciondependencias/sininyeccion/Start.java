package inyecciondependencias.sininyeccion;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Usamos una puerta con cerradura de llave
		ObjetoPuertaLlave puertaLlave = new ObjetoPuertaLlave();
		puertaLlave.abrir();

		// Usamos una puerta con cerradura de codigo
		ObjetoPuertaCodigo puertaCodigo = new ObjetoPuertaCodigo();
		puertaCodigo.abrir();
	}
}

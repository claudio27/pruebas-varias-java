package inyecciondependencias.coninyeccion;

public class ObjetoCerraduraLlave implements CerraduraInterface {

	@Override
	public void accionar() {
		System.out.println("Cerradura con Llave");
	}

}

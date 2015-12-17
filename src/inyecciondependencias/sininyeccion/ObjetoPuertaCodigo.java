package inyecciondependencias.sininyeccion;

public class ObjetoPuertaCodigo {

	private ObjetoCerraduraCodigo cerradura;

	public ObjetoPuertaCodigo() {
		cerradura = new ObjetoCerraduraCodigo();
	}

	public void abrir() {
		cerradura.accionar();
	}
}

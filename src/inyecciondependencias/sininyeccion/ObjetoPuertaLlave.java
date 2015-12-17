package inyecciondependencias.sininyeccion;

public class ObjetoPuertaLlave {
	  private ObjetoCerraduraLlave cerradura;
	  
	   public ObjetoPuertaLlave(){
	      cerradura = new ObjetoCerraduraLlave();
	   }
	 
	   public void abrir(){
	      cerradura.accionar();
	   }
}

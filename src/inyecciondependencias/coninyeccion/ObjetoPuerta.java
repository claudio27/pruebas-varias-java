package inyecciondependencias.coninyeccion;

public class ObjetoPuerta {
	
	 private CerraduraInterface cerradura;
	 
	   public ObjetoPuerta(CerraduraInterface cerraduraGeneric){
	      cerradura = cerraduraGeneric;
	   }
	 
	   public void usar(){
	      cerradura.accionar();
	      }
}

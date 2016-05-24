package listas;

public class Persona {

	long rut;
	String nombre;
	String apellido;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int rut, String nombre, String apellido) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public long getRut() {
		return rut;
	}
	public void setRut(long rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		
		return "(" +this.rut + "_" + this.apellido + "." + this.nombre + ")";
	
	}
	
	
}

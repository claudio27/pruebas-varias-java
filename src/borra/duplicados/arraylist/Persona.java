package borra.duplicados.arraylist;

import java.lang.reflect.Field;

public class Persona {
	
	private String nombre;
	private String id;
	
	public Persona(String nombre, String id){
		this.nombre = nombre;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	/***
	 *  Imprime todos los atributos declarados en esta clase.
	 * 
	 * */
	@Override 
	public String toString() {
		StringBuilder result = new StringBuilder();
		String newLine = System.getProperty("line.separator");

		result.append(this.getClass().getName());
		result.append(" Object {");
		result.append(newLine);

		//determine fields declared in this class only (no fields of superclass)
		Field[] fields = this.getClass().getDeclaredFields();

		//print field names paired with their values
		for (Field field : fields) {
			result.append("  ");
			try {
				result.append(field.getName());
				result.append(": ");
				//requires access to private field:
				result.append(field.get(this));
			}
			catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
			result.append(newLine);
		}
		result.append("}");

		return result.toString();

	}
	
	
	@Override
	public boolean equals(Object arg0) {
			
		if(arg0 instanceof Persona){
			Persona pTemp = (Persona) arg0;
			if(this.id.equals(pTemp.id)){ // && this.nombre.equals(pTemp.nombre)
				System.out.println("e: esta");
				return true;
			}else{
				System.out.println("e: no esta");
				return false;	
			}
			
		}else{
			System.out.println("e: no esta");
			return false;
		}
		
	}

}

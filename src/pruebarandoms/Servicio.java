package pruebarandoms;

import java.lang.reflect.Field;

public class Servicio {

	private final int SEMILLA; // da lo mismo si es final o no, al ser final no es necesario tener metodo set
	private String name;
	
	public Servicio() {
		this.SEMILLA = (int) (Math.random() * 1000000) + 1; 
	}
	
	
	public Servicio(String name) {
		this.SEMILLA = (int) (Math.random() * 1000000) + 1;
		this.name = name;
	}
	

	public int getSEMILLA() {
		return SEMILLA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
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

	
	
	
	
}

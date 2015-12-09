package clonando;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona p1 = new Persona();
		
		p1.setNombre("nombre 1");
		p1.setApellido("Apellido 1");
		
		System.out.println(p1.toString());
		
		Persona p2 = p1;
		Persona p3 = new Persona();
		try {
			 p3 = (Persona)p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(p2.toString());
		
		p2.setNombre("nombre 2");
		System.out.println("Cambio en p2 \n");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("Clonado p1 \n");
		System.out.println(p3.toString());
	}

}

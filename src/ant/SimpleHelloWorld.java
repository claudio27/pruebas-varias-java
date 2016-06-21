package ant;

public class SimpleHelloWorld {

	/**
	 * @param args esta es una prueba de javadoc
	 */
	public static void init() {

                System.out.println(new SimpleHelloWorld().laClase());
	}
	
	public String laClase(){ return this.getClass().toString();}

}

package cadenas;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "3123456789";
		
		if(true){
			System.out.println(a.substring(1, 2));
		}
		else if(true){ // No se ejecuta si el if anterior es true
			System.out.println("else if");
		}else if(true){ // No se ejecuta si el if anterior es true
			System.out.println("else if 2");
		}
		
		
		if(true){
			System.out.println(a.substring(1, 2));
		}
		 if(true){
			System.out.println("else if");
		}
		 if(true){
			System.out.println("else if 2");
		}
		
		
	}

}

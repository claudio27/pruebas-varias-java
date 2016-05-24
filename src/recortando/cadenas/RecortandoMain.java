package recortando.cadenas;

public class RecortandoMain {

	public static void main(String[] args) {

		String a = "171542535";
		
		char[] b = a.toCharArray(); 
		
		System.out.println(b[b.length - 1] + " ---- " + b.length);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(i +" - [" +b[i] + "]");
		}
	}

}

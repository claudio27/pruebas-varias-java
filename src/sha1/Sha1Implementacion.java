package sha1;

public class Sha1Implementacion {
	
	private String str;
	
	
	public static void init() {
		Sha1Implementacion sha = new Sha1Implementacion();
		sha.str = "a";
		
		System.out.println(sha.str.getBytes());
	}

}

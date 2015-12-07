package pruebas_string;

public class PruebasStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "Fijo - BIA";
		String str2 = "Fijo";		
		
		try{
		System.out.println(str.length());
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(0, 4).length());
		System.out.println(str2.concat(" - BIA"));
		System.out.println(str2 + " - BIA");
		}catch(Exception e){
			System.err.println("Ocurrio un error de tipo "+ e);
//			e.printStackTrace();
		}
	}

}

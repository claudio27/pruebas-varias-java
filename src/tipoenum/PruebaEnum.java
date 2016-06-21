package tipoenum;

public class PruebaEnum {
	
	public static void init(){
		
		System.out.println("Enum : " + Enumerador.ALTO);
		System.out.println("Enum cantidad : " + Enumerador.values().length);
		
		for(Enumerador enu : Enumerador.values()){
			System.out.println("Enum : " + enu);		
		}
		
				
	}

}

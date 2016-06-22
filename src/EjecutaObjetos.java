import hilos.AdministradorDeHilos;

public class EjecutaObjetos {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Main exec");
		AdministradorDeHilos.init();
		
	}


	
	@Deprecated
	public static String eliminaCerosRut(String rutString) {
		String resultado = "";
		String dv = "";
		int rut;
		System.out.println(rutString.length());
		System.out.println(rutString.substring(0, rutString.length() - 1));
		System.out.println(rutString.substring(rutString.length() - 1 , rutString.length() ));
		
		try {

			rut = Integer.parseInt(rutString);
			resultado = String.valueOf(rut);

			return resultado;
			
		} catch (NumberFormatException nfex) { // Cuando es guion K
			
			dv = rutString.substring(rutString.length() - 1, rutString.length()); 
 			resultado = rutString.substring(0, rutString.length() - 1); // Sin dv
			rut = Integer.parseInt(resultado); 
			resultado = String.valueOf(rut) + dv;
			
			return resultado;
		}
	}

//{
//		
//		int a = 7;
//		int b = 5;
//		
//		int c = b / a;
//		double d =  (double) b / a ;
//		
////		System.out.println(c);
////		System.out.println(d);
//		
//		
//		/**
//		 * Ir al archivo, click derecho,run as, run configurations, =arguments, VM arguments
//		 * 
//		 * -Duser.timezone=America/Santiago
//		 * 
//		 * */
//		
//		Calendar now = Calendar.getInstance();
//		
//		
////		System.out.println(now.getTimeZone());
////		System.out.println(now.getTime());
//		System.out.println(EjecutaObjetos.eliminaCerosRut("000143124140K"));
//	}


}

package pruebas_string;

public class PruebasStr {

	/**
	 * @param args
	 */
	public void init() {

		String str = "Fijo - BIA";
		@SuppressWarnings("unused")
		String str2 = " INFO  - cl.bice.inversiones.view.bean.funciones.ejecutivo.EliminaMarcaCmaBeans - class cl.bice.inversiones.view.bean.funciones.ejecutivo.EliminaMarcaCmaBeans  INFO  - cl.bice.inversiones.view.bean.funciones.ejecutivo.EliminaMarcaCmaBeans - class cl.bice.inversiones.view.bean.funciones.ejecutivo.EliminaMarcaCmaBeans";		
		
//		try{
//		System.out.println(str.length());
//		System.out.println(str.substring(0, 4));
//		System.out.println(str.substring(0, 4).length());
//		System.out.println(str2.concat(" - BIA"));
//		System.out.println(str2 + " - BIA");
//		}catch(Exception e){
//			System.err.println("Ocurrio un error de tipo "+ e);
////			e.printStackTrace();
		//		}
		if(str.length() >= 245)
			System.out.println(str.substring(0, 245) + "...");
		else
			System.out.println(str);
		
		
	}

}

package propiedades.sistema;

public class PropiedadesSistema {

	/**
	 * @param args
	 */
	public  void init() {
		// TODO Auto-generated method stub
		
		PropiedadesSistema ob = new PropiedadesSistema();
		ob.printProps();
		ob.printLibrary("java.library.path");
		ob.printReflextion();

	}
	
	public void printProps(){
		
		System.out.println("Imprimiendo propiedades del sistema \n");
		
		String[] props = System.getProperties().toString().split(",");
			
		for (int i = 0 ; i < props.length ; i++) {
			
			System.out.println(props[i]);
		}
	
		System.out.println();
		
		
	}
	
	
	public void printLibrary(String arg0){
		System.out.println("Especifica  " + arg0 + " \n");
		
		String[] datas = System.getProperty(arg0).split(";");
		
		for (int i = 0 ; i < datas.length ; i++) {
			
			System.out.println(datas[i]);
		}
		
		System.out.println();
	}
	
	public void printReflextion(){
        System.out.println(PropiedadesSistema.class.getName());
        System.out.println(int[].class.getName()); 
        System.out.println(PropiedadesSistema[].class.getName());      
        System.out.println(PropiedadesSistema.class.getPackage()); 
	}
	
	
	
	

}

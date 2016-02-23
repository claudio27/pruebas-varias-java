package primer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main ob = new Main();
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
        System.out.println(Main.class.getName());
        System.out.println(int[].class.getName()); 
        System.out.println(Main[].class.getName());      
        System.out.println(Main.class.getPackage()); 
	}
	
	
	
	

}

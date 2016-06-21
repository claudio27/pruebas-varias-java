package returns;

public class ReturnMain {

	String a = "B";
	
	public void init(){
		
		ReturnMain obj = new ReturnMain();
		obj.metodo1();
		
	}
	
	public void metodo1(){
		System.out.println("metodo1");
		
		if( "A".equals(this.a))
			System.out.println("metodo2");
		else
			return; // Termina la funcion
		
		System.out.println("metodo3");
		
	}
}


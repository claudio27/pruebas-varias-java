package pruebarandoms;

public class Randoms {

	/**
	 * @param args
	 */
	public void init() {
		
		Servicio obj1 = new Servicio();
		Servicio obj2 = new Servicio();
		Servicio obj3 = new Servicio("primero");
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj1 : " + obj1);
		
		obj2.setName("soy el objeto 2");
		
		System.out.println("obj2 : " + obj2);
		
	}

}

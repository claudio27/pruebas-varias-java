package encoding;

import java.lang.reflect.Method;

public class Encoding implements Interface{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "a";
		Encoding e = new Encoding();
		
		Method[] metodos = Encoding.class.getMethods();
		
		for(Method m : metodos){
			System.out.println(m);
		}
		
		System.out.println("" + Encoding.class);
		System.out.println("" + e.getClass().getName());
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}
	
	

}
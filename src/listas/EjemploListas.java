package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploListas {
	
	List<String> lista1 ;
	
	public List<String> getLista1() {
		return lista1;
	}

	public void setLista1(List<String> lista1) {
		this.lista1 = lista1;
	}


	/**
	 * @param args
	 */
	public static void init() {
		
		EjemploListas p = new EjemploListas();
		List<String> list = null;
		int b = -1;
		
		p.lista1 = new ArrayList<String>();
		Persona per = new Persona(1,"Solid", "Snake");
		Persona per1 = new Persona(2,"Aya", "Brea");
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(per);
		listaPersonas.add(per1);
		
		System.out.println(listaPersonas + "\t" + b);
		
//		p.setLista1(null);
		
		if(p.lista1 == null)
			System.out.println("lista nula " );
		else
			System.out.println("no nula " + p.lista1.size());
				
		p.lista1.add("asdf");
		p.lista1.add("123132");
		p.lista1.add("lalala");
		
		System.out.println(p.getLista1().size());

		System.out.println(p.getLista1());
		
		list = p.getLista1(); // list se le esta agregando una referencia a la lista1 del objeto p, si cambia tambien cambia list
//		list.addAll(p.lista1); //list esta null, y no se le puede agregar nada
//		p.lista1.clear();
		
		System.out.println(p.getLista1().size());
		
		System.out.println("------------");
		System.out.println("lista 1");
		Iterator<String> i = p.getLista1().iterator();
		while (i.hasNext()) {
			String elem = (String) i.next();
			System.out.println(elem);
		}	
		System.out.println("------------");
		
		System.out.println("lista 2");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String elem = (String) it.next();
			System.out.println(elem);
		}
		System.out.println("------------");

	}

}

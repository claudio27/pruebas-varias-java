package borra.duplicados.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	
	public static void main(String[] args) {
		
		List<Persona> list = new ArrayList<Persona>();
		
		// Persona(nombre, id)
		Persona p1 = new Persona("p1","123455");
		Persona p2 = new Persona("p1","123455");
		Persona p3 = new Persona("p2","1255");
		Persona p4 = new Persona("p4","123455");
		Persona p5 = new Persona("p1","123455");
		Persona p7 = new Persona("123455fasdf","123455");
		
		List<String> lstr = new ArrayList<String>();
		
		lstr.add(new String("uno"));
		lstr.add(new String("uno"));
		lstr.add(new String("uno"));
		lstr.add(new String("uno"));
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		 
		HashSet<String> hset = new HashSet<String>(lstr);
		lstr.clear();
		lstr.addAll(hset);
		
		Set<Persona> linkedHashSet = new LinkedHashSet<Persona>();
		linkedHashSet.addAll(list);	
		list.clear();
		list.addAll(linkedHashSet);
		
		Iterator<Persona> it = list.iterator();
		while(it.hasNext()){
			
			System.out.println((Persona)it.next());
		}
		
		if(list.contains(p7))
			System.out.println("Si");
		else
			System.out.println("No");
		
		
		System.out.println("\nLista sin dublicados\n");
		// Con los duplicados fuera
		for(String i : lstr){
			System.out.println(i);
		}
		
	}
}

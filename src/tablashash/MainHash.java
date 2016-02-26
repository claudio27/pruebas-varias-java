package tablashash;

import java.util.Enumeration;
import java.util.Hashtable;

public class MainHash {
	
	
	Hashtable<String, String> tabla = new Hashtable<String, String>();
	
	
	public static void main(String[] ars){
		
		MainHash obj = new MainHash();
		obj.crearData();
		obj.mostrarContenido();
		obj.mostrarClaves();
		
		// mostrar la enumeracion de todas las claves
		System.out.println("Enumeracion de todas las claves " + obj.tabla.keys());
		
		// buscar una clave especifica
		System.out.println(obj.tabla.get("dos"));
		
		// el tamaño
		System.out.println(obj.tabla.size());
		
		// si esta
		System.out.println(obj.tabla.contains("1")); // misma funcionalidad
		System.out.println(obj.tabla.containsValue("1")); // misma funcionalidad
		System.out.println(obj.tabla.containsKey("tres"));
		
	
		
		
	}
	
	
	public void crearData(){
		
		tabla.put("uno", "1");
		tabla.put("dos", "2");
		tabla.put("tres", "3");
		tabla.put("cuatro", "4");
		tabla.put("cinco", "5");
		
	}
	
	public void mostrarContenido(){
		Enumeration<String> enume = tabla.elements();
		
		while(enume.hasMoreElements()){
			System.out.println("valores : " + enume.nextElement());
		}
		
	}
	
	public void mostrarClaves(){
		Enumeration<String> claves = tabla.keys();
		
		while (claves.hasMoreElements()) {
//			String string = (String) claves.nextElement();
			System.out.println("llaves : " + claves.nextElement());
			
		}
	}

}

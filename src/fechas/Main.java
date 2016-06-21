package fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

	public static void main2(String []aaa){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = new Date();
		
		System.out.println(d1);
		
		System.out.println(sdf.format(d1));
		
		
		String s = "Claudia Natalia Cornejo Rodriguez";
		String s2 = "Sandra Figueroa";
		
		@SuppressWarnings("unused")
		String s1s[];
		String s2s[];
		
		s1s = s.split(" ");
		s2s = s2.split(" ");
		
		
		char primeraLetra = s2s[0].charAt(0);
		String primerApellido = s2s[1].substring(0, 7);
		
		String todo = primeraLetra + primerApellido;
		
		System.out.println( todo.toLowerCase());
		
		for(String a : s2s){
			System.out.println(a);
			System.out.println(a.charAt(0));
			
		}
		
		String test = "Claudio Serrano asfafd fasfasf ";
		
		try
		{
			System.out.println(Main.convierteUser(test));
		}
		catch(Exception e){
			System.err.println("Un error " + e);
			e.printStackTrace();
		}

	}
	
	public static String convierteUser(String nombre){
		
		String []a = nombre.split(" ");
		
		if(a.length == 2){
			char primeraLetra = a[0].charAt(0);
			String primerApellido = a[1].substring(0, 7);

			String concatenado = (primeraLetra + primerApellido).toLowerCase();

			return concatenado;
		}else{ // por si tiene segundo nombre

			char primeraLetra = a[0].charAt(0);
			String primerApellido = a[2].substring(0, 7);

			String concatenado = (primeraLetra + primerApellido).toLowerCase();

			return concatenado;    			
		}
	}
	
	
	public static void init(){
		
	//	Main.comparandoFechasDistintas();
		Main.fechaHoy();
//		Date d = new Date();
//		System.out.println(d);
	}
	
	
	/**
	 * 
	 * Ejemplo de comparación de fechas.
	 * 
	 * Compara fechas por medio de los objetos Date y String
	 * 
	 */
	public static void comparandoFechasDistintas(){
		

		Date d1 = new Date();
		Date d2 = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 02, 28);
		
		d2 = cal.getTime();
		
		
		// Comparando fechas, no van a ser iguales nunca porque compara el numero de milisegundos
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.getTime()); // Numero de milisegundos desde el 1/01/1970 00:00
		System.out.println(d2.getTime()); 		
		System.out.println((d1.getTime() == d2.getTime())? "iguales" : "diferentes");
		System.out.println((d1.equals(d2) )? "iguales" : "diferentes");
		
		
		// Transformarlas a String
		
		String f1 = sdf.format(d1);
		String f2 = sdf.format(d2);
		
		System.out.println(f1 + " ----- " + f2);
		// Comparando distintos tipos, equals(Object), compara objetos
		System.out.println((f1.equals(d2) )? "iguales" : "diferentes");
		
		System.out.println((f1.equals(f2) )? "iguales" : "diferentes");
		
		
	}
	
	
	public static void fechaHoy(){
//		FormatUtil.formatearFecha( objetoConsulta.getFecTomaDAP(), "yyyyMMdd")
		
		Date date = new Date();
//		date.setHours(0);
//		date.setMinutes(0);
//		date.setSeconds(0);
		
		System.out.println(date);
		try{
			
			System.out.println(Main.formatearFecha(date, "yyyyMMdd"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
    public static String formatearFecha(Date fechaIn, String formatoOut) {
        SimpleDateFormat df1 = new java.text.SimpleDateFormat(formatoOut);
        return df1.format(fechaIn);
	}

	
	
	
}

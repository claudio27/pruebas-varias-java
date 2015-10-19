package fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String []aaa){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = new Date();
		
		System.out.println(d1);
		
		System.out.println(sdf.format(d1));
		
		
		String s = "Claudia Natalia Cornejo Rodriguez";
		String s2 = "Sandra Figueroa";
		
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
}

package archivos;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ArchivosMain {
	


	public static void main(String []args){

		BasicasArchivo ba = new BasicasArchivo();
//		ArchivosMain.imprimeRutaEjecucion();
//		ArchivosMain.printVmProperties();
		
//		ba.lanzarSelector();
		ba.escribirArchivo();

	}
	
	
	/**
	 * Imprime la ruta donde se buscan los archivos para leer
	 * 
	 */
	public static void imprimeRutaEjecucion(){
		
		File dir = new File("");
		
		System.out.println("Ruta \n" + dir.getAbsolutePath());
		
		try {
			System.out.println("dir.getCanonicalPath() : " + dir.getCanonicalPath());
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

		 
	 public static void printVmProperties(){
		 Properties props = System.getProperties();
		 Enumeration<?> keys = props.keys();
		 
		 while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String valor = (String) props.get(key);
			System.out.println(key +" : "+ valor);
			
		}
		 
	 }
	 


	

}

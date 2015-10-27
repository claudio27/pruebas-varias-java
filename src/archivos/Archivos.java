package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

	public static void main(String []args){

		File dir = new File("");
		System.out.println("Ruta \n" + dir.getAbsolutePath());
		try {
			System.out.println("dir.getCanonicalPath() : " + dir.getCanonicalPath());
			System.out.println("dir.getParent() 	   : " + dir.getParent());
			System.out.println("dir.getPath()   	   : " + dir.getPath());			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		Archivos archivo = new Archivos();
		archivo.openFile(dir);

	}

	public void openFile(File ruta){
		try {
			// constructor may throw FileNotFoundException
			FileReader reader = new FileReader(ruta + "hola.java");
			System.out.println(reader.getEncoding());
			int i=0;
			while(i != -1){
				//reader.read() may throw IOException
				i = reader.read(); 
				System.out.print((char) i ); // no println para que sea línea por línea
			}
			reader.close();
			System.out.println("--- File End ---");
		} catch (FileNotFoundException e) {
			//do something clever with the exception
		} catch (IOException e) {
			//do something clever with the exception
		}
	}
}

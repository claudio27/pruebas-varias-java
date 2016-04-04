package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class BasicasArchivo {
	
	public void openFile(File ruta){
		try {
			// constructor may throw FileNotFoundException
			FileReader reader = new FileReader(ruta + "hola.java");
			System.out.println(reader.getEncoding());
			int i=0;
			while(i != -1){
				//reader.read() may throw IOException
				i = reader.read(); 
				System.out.print((char) i ); // no println para que sea l�nea por l�nea
			}
			reader.close();
			System.out.println("--- File End ---");
		} catch (FileNotFoundException e) {
			//do something clever with the exception
		} catch (IOException e) {
			//do something clever with the exception
		}
	}
	

	 
	 /**
	  * Devuelve el texto de la nota en la ruta pasada como argumento, ejemplo:
	  * "C:\Documentos\nota.txt"
	  * @param ruta - La ruta del archivo.
	  * @return - El texto dentro de la nota.
	  */
	public static String leerTexto(String ruta){
		//Representa el texto dentro de la nota, por ahora, vac�o.
		String texto = "";

		//El archivo de donde sacamos el texto.
		File archivo = new File(ruta);

		try {
			//Le ponemos al lector de archivo 'fr' el atributo 'archivo' en su constructor para leerlo despu�s.
			FileReader fr = new FileReader(archivo);

			//Esta parte ayuda a la eficiencia de la lectura.
			BufferedReader buffer = new BufferedReader(fr);

			//Nos indica cuando es el fin del archivo.
			boolean fin = false;

			//B�fer para guardar las l�neas de texto.
			StringBuffer sbf = new StringBuffer();

			//Salto de l�nea para que el texto salga en l�neas separadas (opcional)
			String nl = System.getProperty("line.separator");

			//Mientras no sea el fin del archivo:
			while(fin == false){

				//Leemos una l�nea del archivo.
				String linea = buffer.readLine();

				//Si la l�nea no est� vac�a...
				if(linea != null){
					//Agregamos al b�fer la l�nea y el salto de l�nea 'nl' (opcional)
					sbf.append(linea + nl);
				}
				else{
					//De lo contrario damos fin al ciclo while.
					fin = true;
				}
			}

			//Asignamos a 'texto' lo que se agreg� al b�fer:
			texto = sbf.toString();

		} 
		catch (FileNotFoundException e) {
			//Esto se ejecuta si el archivo no fue encontrado.
			e.printStackTrace();
		}
		catch (IOException e) {
			//Esto se ejecuta hay un error en la lectura del archivo.
			e.printStackTrace();
		}

		//Devolvemos el texto.
		return texto;
	}
	 
	 /**
	  * Lanza JFileChooser para manejar la selecci�n de la ruta del archivo que vamos a leer.
	  */
	 public  void lanzarSelector() {
		 // Ruta del archivo a leer.
		 String ruta = "";

		 // Carpeta de inicio (opcional).
		 File carpetaInicio = new File(System.getProperty("user.home"));

		 // Selector de archivo (carpetaIncio opcional).
		 JFileChooser jfc = new JFileChooser(carpetaInicio.toString());

		 // Asignamos al atributo 'resultado' el valor de la selecci�n del
		 // usuario:
		 int resultado = jfc.showOpenDialog(null);

		 // Le damos un t�tulo al dialogo (opcional)
		 jfc.setDialogTitle("Seleccione un archivo para leer: ");

		 // Si se ha seleccionado un archivo:
		 if (resultado == JFileChooser.APPROVE_OPTION) {

			 // Asignamos a 'ruta' la direcci�n de archivo seleccionado:
			 ruta = jfc.getSelectedFile().toString();

			 // Si la ruta no es nula:
			 if (ruta != null) {
				 // Leemos el archivo y lo mostramos en consola.
				 System.out.println(leerTexto(ruta));
			 } else {
				 // De lo contrario, no leemos el archivo:
				 System.err.println("Selecci�n nula");
			 }

		 }
	 }
	 
	 
	 public void escribirArchivo(){
		 FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("c:/prueba.txt");	            
	            pw = new PrintWriter(fichero);

	            System.out.println("Escribiendo archivo en c:/prueba.txt");
	            for (int i = 0; i < 10; i++)
	                pw.println("Linea " + i);

	            System.out.println("Listo");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	 }


}

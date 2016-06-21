package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones {

	/**
	 * @param args
	 * @throws BadNumberException 
	 */
	public static void init(){


		Excepciones ex = new Excepciones();
		try{
		ex.callDivide();
		ex.openFile();
		}catch (BadNumberException e) {

			System.err.println("Exception catching " + e.getMessage());
		}
	}

	public int divide(int numberToDivide, int numberToDivideBy)	throws BadNumberException {
		if (numberToDivideBy == 0) {
			throw new BadNumberException("Cannot divide by 0"); 
		}
		return numberToDivide / numberToDivideBy;
	}

	public void callDivide()throws BadNumberException {

		int result = 0;
		try {
			result = divide(4,0);
			System.out.println("Se imprime si todo va bien");
		} catch (BadNumberException e) {
			System.out.println("No se puede dividir por cero\t" + e);
//			e.printStackTrace();
			/* si no lanza la excepcion y se queda aca, se ejecuta la funcion que sigue cuando se llama a callDivide() */
			throw new BadNumberException("Cannot divide by 0 x2"); 
			
		}	
		System.out.println(result);

	}

	public void openFile(){
		FileReader reader = null;
		try {
			// constructor may throw FileNotFoundException
			reader = new FileReader("uno.txt");
			int i=0;
			while(i != -1){
				//reader.read() may throw IOException
				i = reader.read();
				System.out.println((char) i );
			}
			reader.close();
			System.out.println("--- File End ---");
		} catch (FileNotFoundException e) {
			//do something clever with the exception
			System.out.println("File Not Found Exception ejecutada");
		} catch (IOException e) {
			//do something clever with the exception
			System.out.println("IO Exception ejecutada");
		} finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					//do something clever with the exception
				}
			}
			System.out.println("--- File End ---");
		}
	}

	public void openFile2()throws IOException{
		FileReader reader = null;
		try {
			// constructor may throw FileNotFoundException
			reader = new FileReader("uno.txt");
			int i=0;
			while(i != -1){
				//reader.read() may throw IOException
				i = reader.read();
				System.out.println((char) i );
			}
		}  finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					//do something clever with the exception
				}
			}
			System.out.println("--- File End ---");
		}
	}
}


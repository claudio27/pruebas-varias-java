package excepciones;

public class Excepciones {

	/**
	 * @param args
	 * @throws BadNumberException 
	 */
	public static void main(String[] args){
	

		Excepciones ex = new Excepciones();
		ex.callDivide();
	}
	
	public int divide(int numberToDivide, int numberToDivideBy)	throws BadNumberException {
		if (numberToDivideBy == 0) {
			throw new BadNumberException("Cannot divide by 0"); 
		}
		return numberToDivide / numberToDivideBy;
	}
	
	public void callDivide(){
		
		int result = 0;
		try {
			result = divide(4,2);
			System.out.println("Se imprime si todo va bien");
		} catch (BadNumberException e) {
			System.out.println("No se puede dividir por cero");
			//e.printStackTrace();
		}	
		System.out.println(result);
		
	}

}

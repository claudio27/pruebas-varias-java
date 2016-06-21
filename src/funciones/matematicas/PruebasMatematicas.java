package funciones.matematicas;

public class PruebasMatematicas {

	/**
	 * @param args
	 */
	public static void init() {

		
		// funcion Double.compare(Double), fijarse que es el Wrapper de double
		//  1 a > b
		// -1 a < b
		//  0 a = b
		
		Double a = 12.3;
		Double b = 45.2;
		double c = 23.3;
		double d = 23.23;
		
		
		System.out.println(a.compareTo(b));
		System.out.println(((Double) c).compareTo( ((Double) d)) );
		
		/**
		 *  Uso de Math.rint
		 *  Aproxima al float siguiente dependiendo de los decimales
		 *  PCDI32.bice.local
		 *  
double java.lang.Math.rint(double a)
Returns the double value that is closest in value to the argument and is equal to a mathematical integer. If two double values that are mathematical integers are equally close, the result is the integer value that is even. Special cases: 

If the argument value is already equal to a mathematical integer, then the result is the same as the argument. 
If the argument is NaN or an infinity or positive zero or negative zero, then the result is the same as the argument.
Parameters:
a a double value.
Returns:
the closest floating-point value to a that is equal to a mathematical integer.
		 * **/
		
		System.out.println(Math.rint(34.4433));
		System.out.println(Math.rint(34.9));
		System.out.println(Math.rint(34.6));
		System.out.println(Math.rint(34.599999));
		

	}

}

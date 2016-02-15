import java.util.Calendar;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 7;
		int b = 5;
		
		int c = b / a;
		double d =  (double) b / a ;
		
		System.out.println(c);
		System.out.println(d);
		
		
		/**
		 * Ir al archivo, click derecho,run as, run configurations, =arguments, VM arguments
		 * 
		 * -Duser.timezone=America/Santiago
		 * 
		 * */
		Calendar now = Calendar.getInstance();
		
		
		System.out.println(now.getTimeZone());
		System.out.println(now.getTime());
	}

}

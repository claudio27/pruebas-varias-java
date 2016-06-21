package simple.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateMain {

	public static void init() {
		Date d1 = new Date();
		Date d2 = null;
		
		System.out.println(d1 + " :Date");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String fechaFormateada = sdf.format(d1);
		
		System.out.println(fechaFormateada + " :String");
		
		
		try {
			// String tiene que tener mismo formato que se pone en el constructor de SimpleDateFormat
			d2 = sdf.parse(fechaFormateada); 
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		System.out.println(d2 + " :Date");
		
		
	}
}

/**
 * 
	Wed Jun 08 18:26:06 GMT 2016 :Date
	2016-06-08 :String
	Wed Jun 08 00:00:00 GMT 2016 :Date
 * */

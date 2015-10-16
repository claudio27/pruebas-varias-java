package fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String []aaa){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = new Date();
		
		System.out.println(d1);
		
		System.out.println(sdf.format(d1));
		
	}
}

package calendario.timezone;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

	
	
	  public String s = "America/Santiago";
      public Calendar hoy = new GregorianCalendar(TimeZone.getTimeZone(s));
      public Date trialTime = new Date();
      
//      hoy.setTime(trialTime);
	
	public static void init() {
		
		Main ob = new Main();
		ob.hoy.setTime(ob.trialTime);
		
		
		
		System.out.println(ob.hoy);
		System.out.println(ob.hoy.getTimeZone());
		System.out.println(ob.hoy.getFirstDayOfWeek());
		System.out.println(ob.hoy.getTime());

	}
	
	

}

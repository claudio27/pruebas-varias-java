package barraprogreso;

import java.io.IOException;

public class BarraProgresoTexto {
	
	public void animacionProgreso(){
		   String anim= "|/-\\";
           
		   for (int x =0 ; x < 100 ; x++){
			   String data = "\r" + anim.charAt(x % anim.length())  + " " + x ;
	
			   try {
				
				   System.out.write(data.getBytes());
				   Thread.sleep(100);

			   } catch (IOException e) {
				   e.printStackTrace();
			   }catch (InterruptedException e) {
				   e.printStackTrace();
			   }
			   
		   }
	}

}

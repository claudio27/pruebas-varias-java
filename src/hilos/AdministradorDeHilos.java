package hilos;

public class AdministradorDeHilos {
	
	public static void init(){
		
		Hilo hilo1 = new Hilo("Subproceso 1");
		Hilo hilo2 = new Hilo("Subproceso 2");
		Hilo hilo3 = new Hilo("Subproceso 3");
		
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		HiloRunnable h1 = new HiloRunnable("Sub Runn 1");
		HiloRunnable h2 = new HiloRunnable("Sub Runn 2");
		HiloRunnable h3 = new HiloRunnable("Sub Runn 3");
		
		
		(new Thread(h1)).start();
		(new Thread(h2)).start();
		(new Thread(h3)).start();
		
		
		
//		try {
//			System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}

}

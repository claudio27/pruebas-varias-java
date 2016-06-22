package hilos;

public class Hilo extends Thread {

	
	public Hilo(String nombre) {
		super(nombre);
	}
	
	@Override
	public void run() {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " : " + i);
			
			try {
				sleep(1000); // Espera 3 segundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println();
		System.out.println("Proceso muerto : " + getName() );
		super.finalize();
		
	}
}

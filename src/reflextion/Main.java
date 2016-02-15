package reflextion;

public class Main {

	public static void main(String[] args){
		Perro p = new Perro("nombre",12,"comida");
		System.out.println(p);
		
		Main obj = new Main();
		obj.whats();
	}
	
	// llama al metodo toString(), si se sobre escribe se muestra otro resultado
	public void whats(){ System.out.println(this);}
	
	@Override
	public String toString(){return "toString @Override";}
	
}

package reflextion;

public class Reflextion {

	public void init(){
		Perro p = new Perro("nombre",12,"comida");
		System.out.println(p);
		
		Reflextion obj = new Reflextion();
		obj.whats();
	}
	
	// llama al metodo toString(), si se sobre escribe se muestra otro resultado
	public void whats(){ System.out.println(this);}
	
	@Override
	public String toString(){return "toString @Override";}
	
}

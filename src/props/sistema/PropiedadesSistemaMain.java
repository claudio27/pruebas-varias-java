package props.sistema;


public class PropiedadesSistemaMain {

	public void init() {
		
		String[] props = System.getProperties().toString().split(",");
		
		for(String idx: props)
			System.out.println(idx);

	}

}

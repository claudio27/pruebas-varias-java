package props.sistema;


public class PropiedadesSistemaMain {

	public static void main(String[] args) {
		
		String[] props = System.getProperties().toString().split(",");
		
		for(String idx: props)
			System.out.println(idx);

	}

}

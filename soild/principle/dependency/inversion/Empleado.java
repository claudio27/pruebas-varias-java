package principle.dependency.inversion;

public class Empleado {
	
	
	private float salario;
	
	public Empleado() {
		this.salario = (float) (( Math.random() * 100000 ) + 1);
	}
	
	
	public float getSalario() {
		return salario;
	}



	public void setSalario(float salario) {
		this.salario = salario;
	}



	public float calculaSalario(CalculadoraSueldoEmpleado calculadoraSueldoEmpleado){
		System.out.println("Empleado.calculaSalario() " + calculadoraSueldoEmpleado.getSueldo(this) );
		return calculadoraSueldoEmpleado.getSueldo(this);
	}
	
	
	
	
	

}

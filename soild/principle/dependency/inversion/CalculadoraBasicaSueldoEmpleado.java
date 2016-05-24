package principle.dependency.inversion;

public class CalculadoraBasicaSueldoEmpleado implements CalculadoraSueldoEmpleado {
	
	@Override
	public float getSueldo(Empleado empleado) {
		
		return empleado.getSalario();
	}

}

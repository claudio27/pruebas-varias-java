package principle.dependency.inversion;

public class CalculadoraPagoExtraSueldoEmpleado implements
		CalculadoraSueldoEmpleado {

	@Override
	public float getSueldo(Empleado empleado) {
		
		return empleado.getSalario() * 2;
	}

}

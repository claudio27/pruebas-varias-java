package principle.dependency.inversion;

public class MainPrinciple {

	/**
	 * @param args
	 */
	public static void init() {
		
		CalculadoraSueldoEmpleado calculoBasico = new CalculadoraBasicaSueldoEmpleado();
		CalculadoraSueldoEmpleado calculoExtra = new CalculadoraPagoExtraSueldoEmpleado();
		
		Empleado empleado = new Empleado();
		
		empleado.calculaSalario(calculoBasico);
		empleado.calculaSalario(calculoExtra);
		
	}

}
